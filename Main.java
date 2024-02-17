public class Main{
    
    public static void main(String[] args) {
        
        Bank bank = new Bank(null, null, null, null, 
        0,false, 10000);


        bank.deposit(500);
        bank.withdraw(600);

        System.out.println(bank.toString());
    }
}