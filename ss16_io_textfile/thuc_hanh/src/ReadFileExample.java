import java.io.*;
import java.nio.Buffer;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadFileExample {
    public void readFile(String filePath) {
        try {
            // đọc file theo hướng dẫn
            File file = new File(filePath);

            //kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // hiển thị ra màn hình tổng các số nguyên dương trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoăc nội dung file có lỗi thì sẽ thông báo lỗi
            System.err.println("File không tồn taị hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileExa = new ReadFileExample();
        readFileExa.readFile(path);
    }
}
