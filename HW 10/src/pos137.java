import java.util.Scanner;
public class pos137 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int max = n.nextInt();
        int p = max;
        int num1 = 1;
        int num2 = 1;
        int num = 1;
        while(n.hasNextInt()){
            p = n.nextInt();
            num++;
            if(p==max){
                num2 = num;
            }
            else{
                if(p>max) {
                    max = p;
                    num2 = num;
                    num1 = num;
                }
            }
        }
        n.close();
        System.out.println(num1);
        System.out.println(num2);
    }
}
