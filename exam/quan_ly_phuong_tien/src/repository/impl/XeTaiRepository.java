package repository.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;

import java.util.List;

public interface XeTaiRepository {
    void addOto(Oto oto);
    void addXeTai(XeTai xeTai);
    void addXeMay(XeMay xeMay);

    List<Oto> getListOto();
    List<XeTai> getListXeTai();
    List<XeMay> getListXeMay();

    void deletePhuongTienByBienKiemSoat(String bienKiemSoat);




//    List<Student> getListStudent();
//    List<Student> searchByName(String searchName);
//    List<Student> sortByClassName();
//    void addStudent(Student student);
//    void edit(int id, Student newStudent);
//    void deleteStudentById(int id);
//    Student findById(int id);
}
