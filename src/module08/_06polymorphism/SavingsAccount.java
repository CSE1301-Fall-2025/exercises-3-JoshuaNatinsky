package module08._06polymorphism;

public class SavingsAccount extends Account {

    private double yield;

    public SavingsAccount(String name, double balance, double yield){
        super(name, balance);
        this.yield = yield;
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount[name=%s, balance=%.2f, yield=%.2f]", name, balance, yield);
    }

    public void print(){
        System.out.println(this);
    }
}
