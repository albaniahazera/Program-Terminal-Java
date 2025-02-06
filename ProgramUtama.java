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
        System.out.println("2.Coming soon");
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
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\t/Increase/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A + B ;
            System.out.println("Result: " + hasil);
            System.out.println("-----------------------------------------------------\n");
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
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\t/Subtraction/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A - B ;
            System.out.println("Result: " + hasil);
            System.out.println("-----------------------------------------------------\n");
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
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\t/Division/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A / B ;
            System.out.println("Result: " + hasil);
            System.out.println("-----------------------------------------------------\n");
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
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\t/Multiplication/\n");
            System.out.print("Enter a number: ");
            double A = scanner.nextInt();
            System.out.print("Enter a number: ");
            double B = scanner.nextInt();
            double hasil = 0;
            hasil = A * B ;
            System.out.println("Result: " + hasil);
            System.out.println("-----------------------------------------------------\n");
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
            System.out.println("-----------------------------------------------------");
            System.out.println("\t\t/Multiplication table/\n");
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            for (int i = 1; i <= 12; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("-----------------------------------------------------\n");
            pilihankedua();
            menghapusOutput();
        }catch (InputMismatchException e) {
            System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
        }
    }
    public static void pilihankedua() {
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\t\t[Choice]");
        System.out.println("\n1.Enter to Increase");
        System.out.println("2.Enter to Subtraction");
        System.out.println("3.Enter to Division");
        System.out.println("4.Enter to Multiplication");
        System.out.println("5.Enter to Multiplication Table");
        System.out.println("0.Back to main menu\n");
        System.out.println("-----------------------------------------------------");
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




