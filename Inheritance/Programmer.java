public class Programmer extends Person {
    String technology;

    void hacking(){
        System.out.println("I can hacking a website");
    }

    void coding(){
        System.out.println("I can create a application using technology : "+technology+".");
    }

    //override method
    void greeting(){
        super.greeting(); //mengakses method parent (Person class)
        System.out.println("My job is a "+ technology + " programmer.");
    }
    
}
