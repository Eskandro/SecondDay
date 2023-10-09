import java.util.Scanner;

public class SecondExerciseWhile {
    public static void main(String [] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int i = a + 1;
        while(i > a && i < b){
            if(i % 5 == 0 && i % 10 !=0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
