package Lect50_OOPs;

public class PaymentMethod extends BankAccount{

    @Override
    public boolean payment() {
        return false;
    }

    public static void main(String[] args) {
        PaymentMethod pp = new PaymentMethod();
    }
}
