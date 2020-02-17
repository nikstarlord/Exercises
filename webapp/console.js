let ob1={
'name':['Nikhil Sharma','Yash Gupta','Tushar Bansal','Sharad Mishra','Md. Sahil'],
'age':[20,22,31,52,42],
'salary':[40000,40000,400,100,5000],
'dob':['10-10-1999','07-10-1997','20-08-1998','02-03-1997','20-10-1997']
};

console.log("salary greater than 5000:");
for(var i=0;i<ob1.salary.length;i++){
	if(ob1.salary[i]>5000)
		console.log(ob1.name[i]);
}
console.log(" Salary less than 1000 and age greater than 20:")
for(var i=0;i<ob1.salary.length;i++){
	if(ob1.salary[i]<1000 && ob1.age[i]>20){
		console.log(ob1.name[i]);
		ob1.salary[i]=ob1.salary[i]*5;
	}
}
console.log("Increased Salary"+ob1.salary);
console.log("Employees having age in range 20 to 30")
for(var i=0;i<ob1.age.length;i++){
	if(ob1.age[i]>=20 && ob1.age[i]<=30)
		console.log(ob1.name[i]);
}
console.log("Employees having age in between 31 to 60")
for(var i=0;i<ob1.age.length;i++){
	if(ob1.age[i]>30 && ob1.age[i]<=60)
		console.log(ob1.name[i]);
}
