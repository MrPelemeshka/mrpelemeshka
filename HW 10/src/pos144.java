import java.util.Scanner;
public class pos144 {
    public static void main(String args[]) {
        int i=0, p=0, s=0, e=0, c=0, r=0, et=0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            if (n==1 && i==1){
                p=0;
                s=0;
                e=0;
                c=0;
            }
            else if(n==1 && i==0){
                i=1;
            }
            if (n==2 && p==2){
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
            else if(n==2 && p==0){
                p=2;
            }
            if (n==3 && s==3){
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
            else if(n==3 && s==0){
                s=3;
            }
            if (n==4 && e==4){
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
            else if(n==4 && e==0){
                e=4;
            }
            if (n==5 && c==5){
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
            else if(n==5 && c==0){
                c=5;
            }
            if (n==6 && i==1 && p==2 && s==3 && e==4 && c==5) {
                et++;
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
        }
        System.out.println("Количество входящих в последовательность фрагмента 1,2,3,4,5,6: " + et);
    }
}