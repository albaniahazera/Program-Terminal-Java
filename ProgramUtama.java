import java.util.Scanner;

public class ProgramUtama {

    // objek Scanner untuk membaca input dari konsol
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menghapusOutput();
        pilihanUtama();
    }
    public static void pilihanUtama() {
        menghapusOutput();
        System.out.println("|Penghitung|\n");
        System.out.println("1.Pertambahan");
        System.out.println("0.Keluar");
        System.out.print("\nPilih: ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                pertambahan();
            }else if (inputUser == 0) {
                System.exit(0);
            }else {
                menghapusOutput();
                System.out.println("\tInvalid Input !");
                menghapusOutput();
                pilihanUtama();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("\tInvalid Input !");
            menghapusOutput();
            pilihanUtama();
        }
    }
    public static void pertambahan() {
        menghapusOutput();
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("\t/Pertambahan/\n");
        System.out.print("Masukkan angka: ");
        int A = scanner.nextInt();
        System.out.print("Masukkan angka: ");
        int B = scanner.nextInt();
        int hasil = A + B ;
        System.out.println("Hasil: " + hasil);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        pilihankedua();
        menghapusOutput();
    }
    public static void pilihankedua() {
        System.out.println("1.Kembali");
        System.out.println("0.Keluar");
        System.out.print("Pilih: ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                pertambahan();
            }else if (inputUser == 0) {
                pilihanUtama();
            }else {
                menghapusOutput();
                System.out.println("\tInvalid Input !");
                menghapusOutput();
                pilihankedua();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("\tInvalid Input !");
            menghapusOutput();
            pilihankedua();
        }
    }
    public static void menghapusOutput() {
        try {
            // memeriksa nama sistem operasi yang sedang dijalankan oleh program, mendapatkan nama sistem operasi dari properti sistem.
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}



// class ProgramKedua { <= ini adalah class 
// public static void programKedua() {  <= ini adalah function
//         System.out.println("Ini adalah Program Kedua."); <= ini section print
//     }
// }

// // input bertype text
// System.out.print("Masukkan nama anda: ");
// String nama = scanner.nextLine();
// // input bertype integer
// System.out.print("Masukkan umur anda: ");
// int umur = scanner.nextInt();
// // print output nama dan umur
// System.out.println("Nama kamu " + nama + ", Umur kamu " + umur + " Tahun.");