
class Payment{
    void pay(double amount){
        System.out.println("payment: "+ amount);
    }
}
class CashPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Pay "+ amount +" by cash");
    }
}
class CardPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Pay "+ amount +" by card");
    }
}
class QRCodePayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Pay "+ amount +" by QRcode");
    }
}

public class Java_4 {

    static void processPayment(Payment payment, double amount) { 
        payment.pay(amount);
    } 
    public static void main(String[] args) {
        processPayment(new CardPayment(), 100);
        processPayment(new CardPayment(), 200);
        processPayment(new QRCodePayment(), 300);
    }
    
}
