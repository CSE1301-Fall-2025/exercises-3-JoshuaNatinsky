package module08._04super;

public class OnlineCustomer extends Customer {
    private String email;

    public OnlineCustomer(String n, String a, String e) {
        super(n, a);
        email = e;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmail: " + email;
    }
}
