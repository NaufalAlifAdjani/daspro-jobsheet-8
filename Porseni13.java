import java.util.Scanner;
public class Porseni13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int badminton=1, tenisMeja, basket, bolaVoly;
        String allNames="";
        
        System.out.println("Masukkan nama atlet badminton: ");

        
        while (badminton <= 5) {
            System.out.print("Atlet " + badminton + ": ");
            String namaAtlet = sc.nextLine();
            allNames += "Atlet " + badminton + ": " + namaAtlet + "\n";
            badminton++;
        }

        System.out.println("\nDaftar nama atlet badminton: ");
        System.out.print(allNames);
    }
}