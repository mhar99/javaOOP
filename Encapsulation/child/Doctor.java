package child;
import parent.Person;

public class Doctor extends Person {
    private String specialist;

    public Doctor(){
        
    }

    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    public void sugery(){
        System.out.println("I can sugery opration Patients");
    }
    
    public void greeting(){
        System.out.println("Hello my name is "+ getName() + ".");
        System.out.println(" I come from "+getAddress() +"");
        System.out.println("My Occupation is a "+ specialist + " doctor.");
    }

    public String getSpecialist(){
        return this.specialist;
    }

    public void setSpecialist(String specialist){
        this.specialist = specialist;
    }
}
