package docfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    static final String PATH_FILE = "D:\\C0723l1-jv105_Tran_Duc_Anh_module2\\ss16_io_textfile\\bai_tap\\src\\docfile\\demo.txt";

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int input = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        List<Country> countryList = new ArrayList<>();

        for (Country o : countryList) {
            stringList.add(o.toString());
        }
        stringList.add(new Country(input, code, name).toString());

        writeToFile(stringList, true);
        readFromFile();
    }

    public static void writeToFile(List<String> stringList, boolean append) {
        File file = new File(PATH_FILE);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static void readFromFile() {
        List<Country> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country country : list) {
            System.out.println(country);
        }
    }
}