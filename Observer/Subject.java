import java.util.ArrayList;

public class Subject {
    ArrayList<Observer> observers;
    ArrayList<Company> companies;

    public void subscribe(Observer o){
        observers.add(o);
    }

    public void unsubscribe(Observer o){
        observers.remove(o);
    }

    public void spreadInfo(){
        for(Observer o : observers){
            o.update(companies);
        }
    }

    public void setInfo(String name , double stockPrice , String CEO){
        for(Company c : companies){
            if(c.name == name){
                c.CEO = CEO;
                c.stockPrice=stockPrice;
            }
        }
        spreadInfo();
    }

}
