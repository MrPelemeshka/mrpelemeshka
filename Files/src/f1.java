import java.io.*;
        import java.io.IOException;

public class f1 {

    public static void main(String[] args) throws FileNotFoundException {
        int sum=0;
        try(FileReader reader = new FileReader("C://Users//klimo//OneDrive//Desktop//Java//Files//src//Press f to pay respect.txt")) {
            int c;
            while((c=reader.read())!=-1){
                if ((char)c == 'r')sum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } ;
        System.out.println(sum);
    }
}