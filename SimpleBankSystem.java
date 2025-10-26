class Bank {
    long[] balance;
    int n;
    public Bank(long[] balance) {
         this.balance = balance;
         n = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1<=n && account2<=n)
        {
            long transferMoney = balance[account1-1];
            if(transferMoney>=money)
            {
                balance[account1-1]-=money;
                balance[account2-1]+=money;
                return true;
            }
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account<=n)
        {
            balance[account-1]+=money;
            return true;
        }
       return false; 
    }
    
    public boolean withdraw(int account, long money) {
        if(account<=n)
        {
           long accountBalance = balance[account-1];
            if(accountBalance>=money)
             {
                balance[account-1]-=money;
                return true;
             }
        }
        return false;
    }
}
