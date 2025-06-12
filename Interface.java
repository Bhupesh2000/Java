interface PaymentMethod{
    void pay(double amount);
} 

class CreditCardPayment implements PaymentMethod{
    String CardNumber;

    CreditCardPayment(String CardNumber){
        this.CardNumber = CardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println("Credit Card Number " + CardNumber + " used for PaymentMethod of amount " + amount);
    }
}

class UPIPayment implements PaymentMethod{
    String UPIID;

    UPIPayment(String UPIID){
        this.UPIID = UPIID;
    }

    @Override
    public void pay(double amount){
        System.out.println("UPI ID " + UPIID + " used for PaymentMethod of amount " + amount);
    }
}

public class Interface {
    public static void main(String[] args) {
        PaymentMethod method1 = new CreditCardPayment("ABCD123456");
        UPIPayment method2 = new UPIPayment("1234@abcd");

        method1.pay(40000);
        method2.pay(60000);
    }
}