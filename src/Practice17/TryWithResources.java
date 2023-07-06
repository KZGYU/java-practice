package Practice17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        String inFilePath = "D:\\A.txt";
        String outFilePath = "D:\\C.txt";

        try (FileInputStream in = new FileInputStream(inFilePath);//ファイル読み込み
                FileOutputStream out = new FileOutputStream(outFilePath)) {//ファイル書き込み
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