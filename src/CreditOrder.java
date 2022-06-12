
public class CreditOrder extends Order {

    private Boolean paid;

    // self assessment 1 add code here
    // constructor takes number and value as parameters, sets paid to false
    public CreditOrder(Integer number, Integer value) {
        super(number);
        this.number = number;
        this.value = value;
        this.paid = false;
        if (this.paid = true) {
            this.refunded = false;
        }
    }

    public String toString() {
        String creditOrderDetails = new String();
        creditOrderDetails += super.toString();
        creditOrderDetails += "\tpasses: " + this.paid;
        return creditOrderDetails;
    }

    // self assessment 2 add code here
    public void pay() {
        this.paid = true;
    }
    // self assessment 3 add code here

    public void refund() {
        this.refunded = true;
    }
}
