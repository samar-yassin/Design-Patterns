import java.util.ArrayList;

public class ActiveObserver implements Observer {
    String name;

    ActiveObserver(String name){
        this.name = name;
    }

    @Override
    public void update(ArrayList<Company> companies) {
        for(Company c : companies){
            System.out.println("Company: "+c.name+" ,stock price : "+c.stockPrice+" ,CEO :"+c.CEO);
        }
    }
}
