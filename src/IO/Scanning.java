package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) throws IOException {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("rca.txt")));
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
        } finally {
            if(s != null) {
                s.close();
            }
        }
    }
}
