public class AppMain {
    public static void main(String[] args){
    //ex1
    //    Person person1 = new Programmer("Rizki", "Bandung", ".Net Core");
    //    person1.greeting();

    //    System.out.println(person1.technology)//ini error

    //harus dikonversi ke tipe data proggramer seperti ini
    // System.out.println(((Programmer)person1).technology);

    //ex2
    Person person1 = new Programmer("rizki", "Bandung", ".Net Core");
    Person person2 = new Teacher("joko", "Tegal", "Matematika");
    Person person3 = new Doctor("Eko", "Surabaya", "Pedistrician");

    sayHello(person1);
    sayHello(person2);
    sayHello(person3);
    }
    
    static void sayHello (Person person) {
        String message;
        if (person instanceof Programmer) {
        Programmer programmer = (Programmer) person;
        message = "Hello, " + programmer.name + ". Seorang Programmer "+ programmer.technology + ".";
        }else if (person instanceof Teacher) {
        Teacher teacher = (Teacher) person;
        message = "Hello, " + teacher.name + ". Seorang Guru" + teacher.subject + ".";
        }else if (person instanceof Doctor) {
        Doctor doctor = (Doctor) person;
        message = "Hello, "+ doctor.name + ". Seorang Dokter "+ doctor.specialist + ".";
        }else {
        message = "Hello, "+ person.name + ".";
        } System.out.println(message);
    }
}
