import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        str = sc.nextLine();
        int length = str.length();
        int max = 0;
        int count = 0;
        for(int i=0;i<length;i++) {
            if (str.charAt(i) != ' ') {
                count++;
                str2.append(str.charAt(i));
                if (count>=max && i==length-1){
                    str3=str2;
                }
            }
            else if (count>=max ) {
                count = 0;
                str3=str2;
                str2 = new StringBuilder();
            } else {
                count = 0;
                str2 = new StringBuilder();
            }
        }
        System.out.println(str3);
    }
}