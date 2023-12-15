import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file : ");
        String sourceFile = sc.nextLine();
        System.out.print("Enter target file : ");
        String targetFile = sc.nextLine();

        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);

            File file = new File(targetFile);
            if ((file.exists())){
                System.out.println("Target file already exists !!!");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            int totalByte = 0  ;
            int byteRead ;
            while ((byteRead = fileInputStream.read()) != -1 ){
                fileOutputStream.write(byteRead);
                totalByte++ ;
            }
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("Copy success . ");
            System.out.println("total byte : " + totalByte);
        }catch (FileNotFoundException e ) {
            System.out.println("file dose not exists !");
        }catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
