import parent.Person;
import child.Doctor;
import child.Programmer;
import child.Teacher;

public class AppMain {
    public static void main(String[] args){
    //ex1
    //    Person person1 = new Programmer("Rizki", "Bandung", ".Net Core");
    //    person1.greeting();

    //    System.out.println(person1.technology)//ini error

    //harus dikonversi ke tipe data proggramer seperti ini
    // System.out.println(((Programmer)person1).technology);

    //ex2
    // Person person1 = new Programmer("rizki", "Bandung", ".Net Core");
    // Person person2 = new Teacher("joko", "Tegal", "Matematika");
    // Person person3 = new Doctor("Eko", "Surabaya", "Pedistrician");

    // sayHello(person1);
    // sayHello(person2);
    // sayHello(person3);

    //penggunaan setter dan getter untuk inisiasi objek
    Person person1 = new Person();
    person1.setName("Rizki");
    person1.setAddress("Ciereng");
    System.out.println(person1.getName());
    System.out.println(person1.getAddress());
    }
    
    static void sayHello (Person person) {
        String message;
        if (person instanceof Programmer) {
        Programmer programmer = (Programmer) person;
        message = "Hello, " + programmer.getName() + ". Seorang Programmer "+ programmer.getTechnology() + ".";
        }else if (person instanceof Teacher) {
        Teacher teacher = (Teacher) person;
        message = "Hello, " + teacher.getName() + ". Seorang Guru" + teacher.getSubject() + ".";
        }else if (person instanceof Doctor) {
        Doctor doctor = (Doctor) person;
        message = "Hello, "+ doctor.getName() + ". Seorang Dokter "+ doctor.getSpecialist() + ".";
        }else {
        message = "Hello, "+ person.getName() + ".";
        } System.out.println(message);
    }
}
