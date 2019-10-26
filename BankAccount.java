public class BankAccount{
    public String name, accno;
    public double balance;

    public BankAccount(String a , String b, double c){
        this.name = a;
        this.accno = b;
        this.balance = c;
    }

    public void Deposit(double x){
        c += x;
    }
    public void Withdraw(double x){
        c -= x;
    }

    public  void Amount(){
        System.out.println(a, b, c);
    }

    public static void main(String[] args){
        BankAccount b = new BankAccount("Moyosore Olaleye", "0032001954", 30000000);
            b.Deposit(1000000.00);
            b.Withdraw(1000000.00);
            b.Amount();

    }
}