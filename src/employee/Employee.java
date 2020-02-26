package employee;

import java.util.*;

public class Employee {
    private double salary;
    private String name;
    private double age;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Double.compare(employee.age, age) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Nikhil");
        employee.setAge(20);
        employee.setSalary(4.5);
        Employee employee1 =new Employee();
        employee1.setSalary(5.5);
        employee1.setAge(30);
        employee1.setName("Saurabh");
        Employee employee2 = new Employee();
        employee2.setName("Vishal");
        employee2.setName("Vishal");
        employee2.setSalary(0.5);
        List<Employee> list = new ArrayList<Employee>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()>o2.getSalary()){
                    return   -1;
                }
                else if(o1.getSalary()<o2.getSalary()){
                    return 1;
                }
                return  0;
            }
        });
        System.out.println("Sorted List");
        for(Employee e1:list){
            System.out.println(e1.getName()+" Having Salary:"+e1.getSalary());
        }
    }
}
