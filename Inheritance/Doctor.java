public class Doctor extends Person {
    String specialist;

    public Doctor(){
        
    }

    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    void sugery(){
        System.out.println("I can sugery opration Patients");
    }
    
    void greeting(){
        System.out.println("Hello my name is "+ name + ".");
        System.out.println(" I come from "+address +"");
        System.out.println("My Occupation is a "+ specialist + " doctor.");
    }
}
