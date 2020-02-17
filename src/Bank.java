public class Bank {
    double rate_of_interest;
    String branch;

    public double getRate_of_interest() {
        return rate_of_interest;
    }

    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public static void main(String args[]){
        Bank bank = new Bank();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        BOI boi = new BOI();
        bank.setBranch("Main Branch");
        bank.setRate_of_interest(6.5);
        sbi.setBranch("New Delhi");
        sbi.setRate_of_interest(7.6);
        icici.setBranch("Kolkata");
        icici.setRate_of_interest(8.9);
        boi.setBranch("Indore");
        boi.setRate_of_interest(6.9);
        System.out.println("Bank Details Of Bank:");
        System.out.println("Branch Name:"+bank.getBranch()+" Rate of Interest:"+bank.getRate_of_interest());
        System.out.println("Bank Details Of SBI:");
        System.out.println("Branch Name:"+sbi.getBranch()+" Rate of Interest:"+sbi.getRate_of_interest());
        System.out.println("Bank Details Of ICICI:");
        System.out.println("Branch name:"+icici.getBranch()+" Rate of Interest:"+icici.getRate_of_interest());
        System.out.println("Bank Details Of BOI:");
        System.out.println("Branch Name:"+boi.getBranch()+" Rate of Interest:"+boi.getRate_of_interest());


    }
}
