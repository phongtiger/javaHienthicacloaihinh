import java.util.Scanner;

public class showShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chon hinh hien thi");
            System.out.println("1 hinh chu nhat rectangle");
            System.out.println("2 hinh tam giac vuong duoi");
            System.out.println("3 hinh tam giac vuong tren");
            System.out.println("4 hinh tam giac can");
            System.out.println("0 to exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shape1();
                    break;
                case 2:
                    shape2();
                    break;
                case 3:
                    shape3();
                    break;
                case 4:
                    shape4();
                    break;
                default:
                    System.out.println("");
                    break;
            }
        } while (choice != 0);
    }

    public static void shape1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void shape2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i ;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void shape3() {
        for (int i = 7; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void shape4() {
        int dem =1;
        for (int i=7;(0<i&&i<=7) ; i--){
            for (int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=dem*2; k++){
                System.out.print("*");
            }
            dem++;
            System.out.print("\n");
        }
    }

}
