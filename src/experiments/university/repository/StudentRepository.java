package experiments.university.repository;

import experiments.university.model.address.Address;
import experiments.university.model.human.student.Degree;
import experiments.university.model.human.student.Student;

import java.util.List;

public interface StudentRepository {
    void add(Student student);

    Student deleteBy(int id);

    List<Student> deleteAll();

    List<Student> getAll();

    List<Student> getAllBy(String firstName);

    List<Student> getAllBy(String firstName, String lastName);

    List<Student> getAllBy(Degree degree);

    Student getBy(int id);

    List<Address> getAddressListBy(int id);
}
