package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try{
            inputStream = new FileReader("inputChar.txt");
            outputStream = new FileReader("inputChar.txt");
        }
    }
}
