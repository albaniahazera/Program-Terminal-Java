import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgramUtama {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menghapusOutput();
        pilihanUtama();
    }
    public static void pilihanUtama() {
        System.out.println("==========================================================");
        System.out.println("|Main Menu|\n");
        System.out.println("1.Calculation");
        System.out.println("2.Cek os info");
        System.out.println("0.Exit");
        System.out.println("==========================================================");
        System.out.println("\nChoose a number !");
        System.out.print("===> ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                menghapusOutput();
                menuPenghitung();
            }else if (inputUser == 2) {
                menghapusOutput();
                cekOS();
            }else if (inputUser == 0) {
                System.exit(0);
            }else {
                menghapusOutput();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                pilihanUtama();
                menghapusOutput();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pilihanUtama();
            menghapusOutput();
        }
    }
    public static void menuPenghitung() {
        System.out.println("==========================================================");
        System.out.println("|Calculation|\n");
        System.out.println("1.Increase");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Multiplication table");
        System.out.println("0.Back to main menu");
        System.out.println("==========================================================");
        System.out.println("\nChoose a number !");
        System.out.print("===> ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                menghapusOutput();
                pertambahan();
            }else if (inputUser == 2) {
                menghapusOutput();
                pengurangan();
            }else if (inputUser == 3) {
                menghapusOutput();
                pembagian();
            }else if (inputUser == 4) {
                menghapusOutput();
                perkalian();
            }else if (inputUser == 5) {
                menghapusOutput();
                tabelPerkalian();
            }else if (inputUser == 0) {
                menghapusOutput();
                pilihanUtama();
            }else {
                menghapusOutput();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                menuPenghitung();
                menghapusOutput();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
            menghapusOutput();
        }
    }
    public static void pertambahan() {
        try {
            System.out.println("----------------------------------------------------------");
            System.out.println("\t\t/Increase/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A + B ;
            System.out.println("Result: " + hasil);
            System.out.println("----------------------------------------------------------");
            pilihankedua();
            menghapusOutput();
        }catch (InputMismatchException e) {
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
        }
    }
    public static void pengurangan() {
        try {
            System.out.println("----------------------------------------------------------");
            System.out.println("\t\t/Subtraction/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A - B ;
            System.out.println("Result: " + hasil);
            System.out.println("----------------------------------------------------------");
            pilihankedua();
            menghapusOutput();
        }catch (InputMismatchException e) {
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
        }
    }
    public static void pembagian() {
        try {
            System.out.println("----------------------------------------------------------");
            System.out.println("\t\t/Division/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A / B ;
            System.out.println("Result: " + hasil);
            System.out.println("----------------------------------------------------------");
            pilihankedua();
            menghapusOutput();
        }catch (InputMismatchException e) {
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
        }
    }
    public static void perkalian() {
        try {
            System.out.println("----------------------------------------------------------");
            System.out.println("\t\t/Multiplication/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A * B ;
            System.out.println("Result: " + hasil);
            System.out.println("----------------------------------------------------------");
            pilihankedua();
            menghapusOutput();
        }catch (InputMismatchException e) {
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
        }
    }
    public static void tabelPerkalian() {
        try {
            System.out.println("----------------------------------------------------------");
            System.out.println("\t\t/Multiplication table/\n");
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("\nResult !\n");
            for (int i = 1; i <= 12; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("----------------------------------------------------------");
            pilihankedua();
            menghapusOutput();
        }catch (InputMismatchException e) {
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
        }
    }
    public static void cekOS() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");

        System.out.println("==========================================================");
        System.out.println("\t\t|OS INFO|\n");
        System.out.println("OS Name: " + osName);
        System.out.println("OS Version: " + osVersion);
        System.out.println("OS Architecture: " + osArch);
        System.out.println("==========================================================\n");
        System.out.println("\n==========================================================");
        System.out.println("\t\t|User Info|\n");
        System.out.println("User Name: " + userName);
        System.out.println("Home User: " + userHome);
        System.out.println("==========================================================\n");
        System.out.println("\n==========================================================");
        System.out.println("\t\t|Java Info|\n");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Java Vendor: " + javaVendor);
        System.out.println("==========================================================\n");
        System.out.println("\nPress 0 to back at main menu !");
        System.out.print("===> ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 0) {
                menghapusOutput();
                pilihanUtama();
            }else {
                menghapusOutput();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                cekOS();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            cekOS();
        }
    }
    public static void pilihankedua() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t[Choice]");
        System.out.println("\n1.Enter to Increase");
        System.out.println("2.Enter to Subtraction");
        System.out.println("3.Enter to Division");
        System.out.println("4.Enter to Multiplication");
        System.out.println("5.Enter to Multiplication Table");
        System.out.println("0.Back to main menu\n");
        System.out.println("----------------------------------------------------------");
        System.out.println("\nChoose a number !");
        System.out.print("===> ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                menghapusOutput();
                pertambahan();
            }else if (inputUser == 2) {
                menghapusOutput();
                pengurangan();
            }else if (inputUser == 3) {
                menghapusOutput();
                pembagian();
            }else if (inputUser == 4) {
                menghapusOutput();
                perkalian();
            }else if (inputUser == 5) {
                menghapusOutput();
                tabelPerkalian();
            }else if (inputUser == 0) {
                menghapusOutput();
                menuPenghitung();
            }else {
                menghapusOutput();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                pilihankedua();
                menghapusOutput();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pilihankedua();
            menghapusOutput();
        }
    }
    public static void menghapusOutput() {
        try {
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




