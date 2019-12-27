import java.util.Scanner;
public class pos143 {
    public static void main(String args[]) {
        int i = 0, p = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();

            if (n<0 || n>1) break;
            if (n == 1 & i == 0) p++;
            i=n;

            System.out.println("Кол-во единичных групп, разделенных нулями: " + p);
        }
        System.out.println("Кол-во единичных групп, разделенных нулями: " + p);
    }
}