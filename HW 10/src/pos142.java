import java.util.Scanner;
public class pos142 {
    public static void main(String args[]) {
        int maxl=0, min=0, max=0,  i = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int p = in.nextInt();
            if (i==p) {
                min = 1;
                max = 1;
            }
            if (p>i) {
                max++;
                min = 1;
            }
            if (p<i){
                min++;
                max =1;
            }
            if (max>maxl) {
                maxl = max;
            }
            if (min>maxl) {
                maxl = min;
            }
            i=p;
        }
        System.out.println("Максимальная длина монотонной последовательности: " + maxl);
    }
}