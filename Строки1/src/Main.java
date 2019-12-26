import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        int length = str.length();
        int count = 0;
        str = str.toLowerCase();
        if(str.charAt(0) =='а' || str.charAt(0) =='е' || str.charAt(0) =='ё' || str.charAt(0) =='и' || str.charAt(0) =='о' || str.charAt(0) =='у' || str.charAt(0) =='ы' || str.charAt(0) =='э' || str.charAt(0) =='ю' || str.charAt(0) =='я')count=1;
        for(int i=1;i<length;i++){
            if(str.charAt(i-1)==' '&&(str.charAt(i) =='а' || str.charAt(i) =='е' || str.charAt(i) =='ё' || str.charAt(i) =='и' || str.charAt(i) =='о' || str.charAt(i) =='у' || str.charAt(i) =='ы' || str.charAt(i) =='э' || str.charAt(i) =='ю' || str.charAt(i) =='я')) count++;
        }
        System.out.println(count);
    }
}
