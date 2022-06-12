
public class OrderTest {

    public static void main(String[] args) {
        CashOrder cash = new CashOrder(1, 1000, true);
        CreditOrder credit = new CreditOrder(2, 500);

        Order order = new CreditOrder(3, 250);

        System.out.println("after initial set up");
        System.out.println("\t" + cash);
        System.out.println("\t" + credit);

        System.out.println("\t" + order);

        cash.deliver();
        credit.deliver();

        order.deliver();

        System.out.println("after deliver");
        System.out.println("\t" + cash);
        System.out.println("\t" + credit);

        System.out.println("\t" + order);

        cash.refund();
        credit.refund();

        order.refund();

        System.out.println("after refund");
        System.out.println("\t" + cash);
        System.out.println("\t" + credit);

        System.out.println("\t" + order);

        credit.pay();

        order.pay();

        System.out.println("after credit pay");
        System.out.println("\t" + credit);

        System.out.println("\t" + order);

        credit.refund();
        System.out.println("after credit refund");
        System.out.println("\t" + credit);

        order.refund();
        System.out.println("\t" + order);

    }
}
