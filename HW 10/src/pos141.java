import java.util.Scanner;
public class pos141 {
    public static void main(String args[]) {
        int n = 0, z = 0, sch = 0, x = 0, y = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            sch++;
            if (sch % 3 == 0) {
                z = a;
                n = n + 3;
            }
            if (sch - n == 1) x = a;
            if (sch - n == 2) y = a;
            if (x * y == z) System.out.println("x = " + x + " y = "  + y + " z = " + z);
            else  if (x * z == y) System.out.println("x = " + x + " y = "  + z + " z = " + y);
            else  if (y * z == x) System.out.println("x = " + y + " y = "  + z + " z = " + x);
        }
        System.out.println(" x = " + x + " y = " + y + " z = " + z);
    }
}