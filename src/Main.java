import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner MyInt = new Scanner(System.in);
        int c = MyInt.nextInt();
        if(c >= 1 && c <= 4)
        {
            System.out.println("Малоэтажный дом");
        }
        if(c >= 5 && c <= 8)
        {
            System.out.println("Среднеэтажный дом");
        }
        if(c >= 9) {
            System.out.println("Многоэтажный дом");
        }
        if(c <= 0) {
            System.out.println("Ошибка ввода");
        }
    }
}