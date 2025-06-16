class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    double  withdraw(double amount) throws InsufficientFundsException{
        if (amount>balance){
            throw new InsufficientFundsException();
        }
        else{
            return balance-amount;
        }

    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount(12345, 1500000);

        try{
            System.out.println(b.withdraw(135));
            System.out.println(b.withdraw(135000000));
        }
        catch(InsufficientFundsException e){
            System.out.println("Exception Handled");
        }
    }
}