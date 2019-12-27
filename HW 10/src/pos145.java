import java.util.Scanner;
public class pos145 {
    public static void main(String args[]) {
        int p1=0, p2=0, et=0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            if (n==1 && p1==p2) p1++;
            else if(n==1 && p1>p2){
                p1=1;
                p2=0;
            }
            if(n==2 && p1-1==p2)p2++;
            else if (n==2 && p1==p2){
                p2=0;
                p1=0;
            }
            if (p1==3 && p2==3){
                et++;
                p1--;
                p2--;
            }
            if(n!=1 && n!=2){
                p1=0;
                p2=0;
            }
        }
        System.out.println("Количество входящих в последовательность фрагмента 1,2,1,2,1,2: " + et);
    }
}