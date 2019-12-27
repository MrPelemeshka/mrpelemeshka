import java.util.Scanner;
public class pos133 {
    public static void main(String args[])  {
        Scanner n = new Scanner(System.in);
        int max = n.nextInt();
        int p = max;
        int k=1;
        while (n.hasNextInt()) {
            p = n.nextInt();
            if (p==max) {
                k+=1;
            }
            if (p>max) {
                max = p;
                k = 1;
            }

        }
        System.out.println("Максимальных чисел: "+ k);
        n.close();
    }
}