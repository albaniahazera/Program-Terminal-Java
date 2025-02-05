import java.util.Scanner;

public class ProgramUtama {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menghapusOutput();
        pilihanUtama();
    }
    public static void pilihanUtama() {
        System.out.println("\t\t\nMain Menu\n");
        System.out.println("1.Calculation");
        System.out.println("2.Coming soon");
        System.out.println("0.Exit");
        System.out.print("\nChoose: ");
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
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                pilihanUtama();
                menghapusOutput();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pilihanUtama();
            menghapusOutput();
        }
    }
    public static void menuPenghitung() {
        System.out.println("\n|Calculation|\n");
        System.out.println("1.Increase");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("0.Back to main menu");
        System.out.print("\nChoose: ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                pertambahan();
            }else if (inputUser == 2) {
                pengurangan();
            }else if (inputUser == 3) {
                pembagian();
            }else if (inputUser == 0) {
                menghapusOutput();
                pilihanUtama();
            }else {
                menghapusOutput();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                menuPenghitung();
                menghapusOutput();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            menuPenghitung();
            menghapusOutput();
        }
    }
    public static void pertambahan() {
        menghapusOutput();
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\t/Increase/\n");
        System.out.print("Enter a number: ");
        int A = scanner.nextInt();
        System.out.print("Enter a number: ");
        int B = scanner.nextInt();
        int hasil = A + B ;
        System.out.println("Result: " + hasil);
        System.out.println("-----------------------------------------------------\n");
        pilihankedua();
        menghapusOutput();
    }
    public static void pengurangan() {
        menghapusOutput();
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\t/Subtraction/\n");
        System.out.print("Enter a number: ");
        int A = scanner.nextInt();
        System.out.print("Enter a number: ");
        int B = scanner.nextInt();
        int hasil = A - B ;
        System.out.println("Result: " + hasil);
        System.out.println("-----------------------------------------------------\n");
        pilihankedua();
        menghapusOutput();
    }
    public static void pembagian() {
        menghapusOutput();
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\t/Division/\n");
        System.out.print("Enter a number: ");
        int A = scanner.nextInt();
        System.out.print("Enter a number: ");
        int B = scanner.nextInt();
        int hasil = A / B ;
        System.out.println("Result: " + hasil);
        System.out.println("-----------------------------------------------------\n");
        pilihankedua();
        menghapusOutput();
    }
    public static void pilihankedua() {
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\t\t[Choice]");
        System.out.println("\n1.Enter to Increase");
        System.out.println("2.Enter to Subtraction");
        System.out.println("3.Enter to Division");
        System.out.println("0.Back to main menu\n");
        System.out.println("-----------------------------------------------------");
        System.out.print("\nChoose: ");
        if (scanner.hasNextInt()) {
            int inputUser = scanner.nextInt();
            scanner.nextLine();
            if (inputUser == 1) {
                pertambahan();
            }else if (inputUser == 2) {
                pengurangan();
            }else if (inputUser == 3) {
                pembagian();
            }else if (inputUser == 0) {
                menghapusOutput();
                menuPenghitung();
            }else {
                menghapusOutput();
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("\t\tInvalid Input !");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                pilihankedua();
                menghapusOutput();
            }
        }else {
            scanner.nextLine();
            menghapusOutput();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\tInvalid Input !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
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




