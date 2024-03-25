package Bank;

public class SavingsAccount extends Account {
    private boolean active_account;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance < 10000){
            this.active_account = false;
            System.out.println("la cuenta no esta activa");
        } else if(balance >= 10000){
            this.active_account = true;
            System.out.println("la cuenta esta activa");
        }
    }

    public boolean isActive_account() {
        return active_account;
    }

    public void setActive_account(boolean active_account) {
        this.active_account = active_account;
    }

    @Override
    public void consign(float amount) {
        if (active_account) {
            super.consign(amount);
        } else {
            System.out.println("la cuenta no esta activa");
        }

    }

    @Override
    public void withdraw(float amount) {
        if (active_account){
            if (numberWithdrawals > 4){
                System.out.println("se le cobrara un adicional de $1000 por retirar mas de 4 veces.");
                balance-=1000;
                super.withdraw(amount);
                if (balance < 10000){
                    this.active_account = false;
                    System.out.println("la cuenta no esta activa");
                } else if(balance >= 10000){
                    this.active_account = true;
                    System.out.println("la cuenta esta activa");
                }
            }else {
                super.withdraw(amount);
                if (balance < 10000){
                    this.active_account = false;
                    System.out.println("la cuenta no esta activa");
                } else if(balance >= 10000){
                    this.active_account = true;
                    System.out.println("la cuenta esta activa");
                }
            }


        }else {
            System.out.println("la cuenta no esta activa");
        }

    }
    public void show_by_screen(){
        System.out.println("El balance es: "+balance);
        System.out.println("La comicion mensual es: "+monthlyCommission);
        System.out.println("la cantidad de transacciones echas son: " + (numberWithdrawals+numberConsignments));
    }
}
