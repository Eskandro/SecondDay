import java.util.Scanner;

public class SecondExercise {
    public static void main(String [] args) {
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        int a = first.nextInt();
        int b = second.nextInt();
        for(int i = a + 1; i > a && i < b; i++)
        {
            if(i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
