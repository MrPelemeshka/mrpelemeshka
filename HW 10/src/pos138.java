import java.util.Scanner;
public class pos138 {
    public static void main(String args[]) {                                             //138
        Scanner n = new Scanner(System.in);
        boolean first = false;
        int Number = 0;
        int p = n.nextInt();
        int num = 1;
        while (n.hasNextInt()) {
            p = n.nextInt();
            num += 1;
            if (p == 0) {
                System.out.println("Номер нулевого элемента: " + num);
                first = true;
                Number = num;
            }
        }
        if (!first) {
            System.out.println("0");
        } else {
            System.out.println(Number);
        }
    }
}