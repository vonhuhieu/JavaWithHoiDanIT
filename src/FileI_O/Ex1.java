package FileI_O;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            // inputStream = new FileReader("D:\\HocJava\\hoidanit\\src\\FileI_O\\testFile.txt");
            inputStream = new FileReader("./src/FileI_O/testFile.txt");
            outputStream = new FileWriter("characteroutput.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            System.out.println("end");
        }
    }
}
