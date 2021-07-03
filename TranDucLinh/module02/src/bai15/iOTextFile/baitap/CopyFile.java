package bai15.iOTextFile.baitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class CopyFile {
    public static void readFileText() {
        try {
            FileReader fileReader = new FileReader("D:\\TranDucLinh\\module02\\src\\CopyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        readFileText();
    }
}
