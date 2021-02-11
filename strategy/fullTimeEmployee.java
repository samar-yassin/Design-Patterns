public class fullTimeEmployee extends employee{
    fullTimeEmployee(){
        super();
        this.myPaymentMethod = new bankSystem();
    }
}
