import java.util.Stack;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String stringInput = scanner.nextLine();
        stringInput = stringInput.toLowerCase();
        System.out.println("Chuỗi đã nhập: " + stringInput);

        String[] array = stringInput.split(" ");
        ArrayList<String> listString = new ArrayList();
        for (String key : array) {
            listString.add(key);
        }
        System.out.println(listString);

        TreeMap<String, Integer> stringMap = new TreeMap<>();
        for (String string : listString) {
            if (stringMap.containsKey(string)) {
                stringMap.put(string, stringMap.get(string) + 1);
            } else {
                stringMap.put(string, 1);
            }
        }

//        //test
//        Set<String> stringSet = stringMap.keySet();
//        for (String string : stringSet) {
//            System.out.println(string + ": " + stringMap.get(string));
//        }

        for (String key : stringMap.keySet()) {
            Integer value = stringMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}



























//        Set<Map.Entry<Student,Integer>> entries = studentMap.entrySet();
//        for (Map.Entry<Student,Integer> entry: entries) {
//            System.out.println("học viên : "+ entry.getKey() + " vắng nghỉ : " + entry.getValue() );