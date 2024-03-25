package Bank;

public class Current_account extends Account{
   private float overdraft;

    public Current_account(float balance, float annualRate) {
        super(balance, annualRate);
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(float amount) {
        if (amount < balance){
            super.withdraw(amount);
        }else {
            float new_balance = amount- balance;
            overdraft +=new_balance;
            balance = 0;
            numberWithdrawals++;
        }
    }

    @Override
    public void consign(float amount) {
        if(overdraft==0) {
            super.consign(amount);
        }else {
            if (amount<=overdraft){
                overdraft -= amount;
                numberConsignments++;
            }else {
                float new_amount = amount - overdraft;
                balance+=new_amount;
                overdraft=0;
                numberConsignments++;
            }
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }
    public void show_by_screen(){
        System.out.println("El balance es: "+balance);
        System.out.println("La comicion mensual es: "+monthlyCommission);
        System.out.println("la cantidad de transacciones echas son: " + (numberWithdrawals+numberConsignments));
        System.out.println("el sobregiro es de -"+overdraft);
    }
}
