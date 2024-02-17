public class Bank {
    private String agency;
    private String account;
    private String name;
    private String id;
    private Double initialBalance;
    private boolean isVip;
    private Double income;

    public Bank(String agency, String account, String name, String id,
            double initialBalance, boolean isVip, double income) {
        this.agency = agency;
        this.account = account;
        this.name = name;
        this.id = id;
        this.initialBalance = initialBalance;
        this.isVip = isVip;
        this.income = income;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }

    public Double getIncome() {
        return income;
    }

    public double deposit(double amount) {
        try {
            if (amount > 0) {
                initialBalance += amount;
            }
        } catch (Exception e) {
            System.out.println("Your amount canott be negative");
        }

        return initialBalance;
    }

    public void withdraw(double amount) {
        if (isVip() == true && income > 5000) {
            initialBalance -= amount;
        }
        if (initialBalance >= amount) {
            initialBalance -= amount;
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }

    @Override
    public String toString() {
        return "Bank [Balance=" + initialBalance + "]";
    }

}