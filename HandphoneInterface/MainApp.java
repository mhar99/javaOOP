import java.util.Scanner;
import interfaces.Phone;

public class MainApp {
    public static void main(String[] args) {
        //membuat object phone menggunakan instansiasi dari class Xiaomi
        Phone redmiNote10 = new Xiaomi();

        //membuat object PhoneUser
        PhoneUser rani = new PhoneUser(redmiNote10);

        //Nyalakan dulu HP
        rani.turnOnThePhone();

        //Membuat Tampilan 
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do {
            System.out.println("====Aplikasi Interface====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Besarkan Volume HP");
            System.out.println("[4] Kecilkan Volume HP");
            System.out.println("[0] Keluar");
            System.out.println("==========================");
        
            System.out.println("Pilih Aksi : ");
            aksi = input.next();

            if(aksi.equalsIgnoreCase("1")){
                rani.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                rani.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                rani.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                rani.makePhoneSilent();
            }else{
                System.out.println("Aksi yang anda pilih tidak terssedia");
                System.out.println("Silakan pilih aksi kembali");
            }

        }while(isLooping);

    }
    
}
