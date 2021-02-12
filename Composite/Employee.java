public class Employee extends CompanyComponent {
    String name ;
    double salary;


    public Employee(String n ,double s){
        this.name= n;
        this.salary= s;
    }


    @Override
    public void printInfo() {
        System.out.println("Employee \""+this.name+"\" , salary = "+this.salary);
    }
}
