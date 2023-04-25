interface RestaurantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();
}

//Segregated
interface OrderInterface extends OnlineOrderInterface {
    public void takeTelephoneOrder();
}

interface OnlineOrderInterface {
    public void acceptOnlineOrder();
}

interface PaymentInterface extends OnlinePaymentInterface {
    public void walkInCustomerOrder();
    public void payInPerson();
}

interface OnlinePaymentInterface {
    public void payOnline();
}

class OnlineClientImpl implements OnlineOrderInterface, OnlinePaymentInterface {

    @Override
    public void acceptOnlineOrder() {
        //logic for placing online order
    }

    @Override
    public void payOnline() {
        //logic for paying online
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}