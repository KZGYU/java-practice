package Practice15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        String inFilePath = "D://A.txt";
        String outFilePath = "D://C.txt";

        try (FileInputStream in = new FileInputStream(inFilePath);
                FileOutputStream out = new FileOutputStream(outFilePath)) {
            int c;

            // データをコピーする
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

