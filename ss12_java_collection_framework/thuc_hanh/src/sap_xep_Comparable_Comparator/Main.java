package sap_xep_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anh", 19, "DN");
        Student student1 = new Student("Huy", 40, "HT");
        Student student2 = new Student("Tâm", 38, "TN");
        Student student3 = new Student("Trang", 17, "HN");
        Student student4 = new Student("Giáp", 9, "SG");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        Student.AgeComparator ageComparator = new Student.AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}