import Bank.Current_account;
import Bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount(9000,240);
        SavingsAccount sv1 = new SavingsAccount(25000,240);
        sv.consign(250);
        sv1.consign(250);
        sv1.withdraw(200);
        sv1.consign(100);
        sv1.withdraw(380);
        sv1.withdraw(380);
        sv1.withdraw(380);
        sv1.withdraw(380);
        sv1.withdraw(20000);
        sv1.show_by_screen();
        System.out.println("______________");
        Current_account ca = new Current_account(100,240);
        ca.withdraw(150);
        ca.show_by_screen();
        System.out.println("______________");
        ca.consign(20);
        ca.show_by_screen();
        System.out.println("______________");
        ca.consign(300);
        ca.show_by_screen();
        System.out.println("______________");
        ca.withdraw(1000);
        ca.show_by_screen();
        System.out.println("______________");
        ca.withdraw(250);
        ca.show_by_screen();
        System.out.println("______________");
        ca.consign(3000);
        ca.show_by_screen();
        System.out.println("______________");
    }
}
