import java.util.ArrayList;

public class Department extends CompanyComponent {
    String name;
    ArrayList<CompanyComponent>employees =new ArrayList<>();

    public Department(String n){
        this.name = n ;
    }

    public  void add(CompanyComponent c){
        this.employees.add(c);
    }
    @Override
    public void printInfo(){
        System.out.println("Department \""+this.name+"\" ,Employees :{" );
        for(CompanyComponent c : employees){
            c.printInfo();
        }

    }
}
