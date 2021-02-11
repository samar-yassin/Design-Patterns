public class creditCard implements  paymentMethod {
    @Override
    public String pay() {
        return "Payment via credit card";
    }
}
