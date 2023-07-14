import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {

        //Formül ---  Kilo (kg) / Boy(m) * Boy(m)

        Scanner input = new Scanner(System.in);

        double boy, kilo, indeks;

        System.out.print("Boyunuzu Giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        indeks = (kilo) / (boy * boy);
        System.out.print("Vücut Kitle İndeksi: " + indeks);



    }
}
