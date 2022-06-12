
public abstract class Order {

    protected Integer number;
    protected Integer value;
    protected Boolean delivered;
    protected Boolean refunded;
    private Boolean paid;

    // self assessment 1 add code here
    // constructor takes in number and value as parameters
    // sets delivered and refunded to be false
    public Order(Integer number) {
        this.number = number;
        this.value = value;
        this.delivered = false;
        this.refunded = false;
    }

    public String toString() {
        String orderDetails = new String();
        orderDetails += "number: " + this.number + "\tvalue: " + this.value;
        return orderDetails;
    }

    // self assessment 2 add code here
    
        public void deliver() {
        this.delivered = true;
    }
    // self assessment 3 add code here
        public abstract void refund();
        
            public void pay() {
        this.paid = true;
    }
}
