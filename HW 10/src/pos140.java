import java.util.Scanner;
public class pos140 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int vtr = 0, max = 0;
        while (in.hasNextInt()) {
            int p = in.nextInt();
            if (p>max) {
                vtr = max;
                max = p;
            }
            if (p>vtr & p<max) vtr = p;
            System.out.println("Второе число в последовательности: "+vtr);
        }
        if (vtr == 0) System.out.println("No");
        else System.out.println(vtr);
    }
}