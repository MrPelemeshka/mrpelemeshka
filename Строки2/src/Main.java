import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        int length = str.length();
        int count = 0;
        int number = 0;
        int l=0;
        for(int i=0;i<length;i++) {
            if (str.charAt(i) != ' ') {
                count++;
                if (count == 3 && i==length-1){
                    number++;
                    l++;
                    System.out.println(number);
                }
            }
            else if (count == 3 ) {
                count = 0;
                number++;
                l++;
                System.out.println(number);
            } else {
                count = 0;
                number++;
            }
        }
        if(l == 0)System.out.println("Таких нет");
    }
}