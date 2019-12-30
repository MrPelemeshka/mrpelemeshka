import java.io.*;
import java.io.IOException;

public class f2 {

    public static void main(String[] args) throws FileNotFoundException {
        int sum=0;
        int et=0;
        int f=0;
        try(FileReader reader = new FileReader("C://Users//klimo//OneDrive//Desktop//Java//Files//src//Press f to pay respect.txt")) {
            int c;
            while((c=reader.read())!=-1){
                if ((char)c == ' ' || (char)c == '\n'){
                    sum=0;
                    f=0;
                }
                if ((char)c == 'r'){
                    sum++;
                }
                if (sum >= 3 && f==0) {
                    et++;
                    f=1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } ;
        System.out.println(et);
    }
}