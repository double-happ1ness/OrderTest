
public class CashOrder extends Order {

    private Boolean discountApplied;

    // self assessment 1 add code here
    // constructor takes in number, value and discount applied as parameters
    public CashOrder(Integer number, Integer value, Boolean discountApplied) {
        super(number);
        this.number = number;
        this.value = value;
        this.discountApplied = false;
        this.refunded = true;
    }

    public String toString() {
        String cashOrderDetails = new String();
        cashOrderDetails += super.toString();
        cashOrderDetails += "\tpasses: " + this.discountApplied;
        return cashOrderDetails;
    }

    // self assessment 3 add code here
    public void refund() {
        this.refunded = true;
    }
}
