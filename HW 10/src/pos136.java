import java.util.Scanner;
public class pos136 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pr1;
        int pr;
        int posMax = 1;
        int p1 = sc.nextInt();
        int pos2 = 0;
        int p2 = sc.nextInt();
        if (p2 == p1) {
            posMax+=1;
        }
        else {
            pos2+=1;
        }
        while (sc.hasNextInt()) {
            pr = sc.nextInt();
            if (pr == p1) {
                posMax+=1;
            }
            else if (pr==p2){
                p2 = pr;
                pos2+=1;
            }
            else {
                p2 = pr;
                pos2=1;
            }
            if (pos2 == posMax) {
                p1 = pr;
                pos2 = 0;
            }
        }
        sc.close();
        System.out.println("Максимальное количество введённых подряд чисел " + posMax);
    }
}
