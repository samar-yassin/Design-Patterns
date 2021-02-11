public class bankSystem implements paymentMethod {

    @Override
    public String pay() {
        return "Payment via bank system";
    }
}