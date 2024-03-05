package inheritance;

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee(){

        //explicit call can be made to superclass' constructors from one of subclass' constructor using super()
        //explicit call to the superclass' constructor must be first statement in subclass' constructor
        //If superclass doesn't have default constructor, subclass must explicitly call one of superclass' constructor
        super("John Doe");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
