package sep132022;

public class Customer {
    private String id;
    private String name;
    private String dob;
    private String address;
    private String email;
    private String mob;
    private String account;

    private double balance;
    public String getId() {
        return id;
    }
    public void setId(String var) {
        this.id = var;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMob() {
        return mob;
    }
    public void setMob(String mob) {
        this.mob = mob;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Customer [account=" + account + ", address=" + address + ", balance=" + balance + ", dob=" + dob
                + ", email=" + email + ", id=" + id + ", mob=" + mob + ", name=" + name + "]";
    }
    
    
    
}
