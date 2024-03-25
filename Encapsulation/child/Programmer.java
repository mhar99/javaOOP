package child;
import parent.Person;

public class Programmer extends Person {
    private String technology;

    public Programmer(){
        
    }

    public Programmer(String name, String address, String technology){
        super(name, address);
        this.technology = technology;
    }

    public void hacking(){
        System.out.println("I can hacking a website");
    }

    public void coding(){
        System.out.println("I can create a application using technology : "+technology+".");
    }

    //override method
    public void greeting(){
        super.greeting(); //mengakses method parent (Person class)
        System.out.println("My job is a "+ technology + " programmer.");
    }

    public String getTechnology(){
        return this.technology;
    }

    public void setTechnology(String technology){
        this.technology = technology;
    }
    
}
