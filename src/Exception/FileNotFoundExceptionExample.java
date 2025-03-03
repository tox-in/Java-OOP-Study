package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("myfile.txt"));
            String data = null;
            while((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
