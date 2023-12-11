package sap_xep_Comparable_Comparator;

import java.rmi.StubNotFoundException;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private String address;

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student {" + "name = " + name + '\'' + '}';
    }
    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    public static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }else if(o1.getAge() == o2.getAge()){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
