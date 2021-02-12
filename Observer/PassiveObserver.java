import java.util.ArrayList;

public class PassiveObserver implements Observer {
    String name;
    PassiveObserver(String name){
        this.name = name;
    }
    @Override
    public void update(ArrayList<Company> companies) {
        for(Company c : companies){
            System.out.println("Company: "+c.name+" ,stock price : "+c.stockPrice+" ,CEO :"+c.CEO);
        }
    }
}
