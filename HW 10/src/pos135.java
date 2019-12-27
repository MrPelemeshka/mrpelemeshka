import java.util.Scanner;
public class pos135 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        double sum = n.nextDouble();
        double k = 1;
        double p;
        while (n.hasNextDouble()) {
            p = n.nextDouble();
            sum = sum + p;
            k += 1;
        }
        System.out.println(sum / k);
        n.close();
    }
}
