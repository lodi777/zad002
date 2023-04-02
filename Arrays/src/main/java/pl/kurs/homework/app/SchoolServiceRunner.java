package pl.kurs.homework.app;

import pl.kurs.homework.model.Student;
import pl.kurs.homework.service.SchoolService;

import java.util.Arrays;

public class SchoolServiceRunner {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService(2);
        Student student1 = new Student("Arnold ", "Kurwa Szwarceneger ", " Koziegłowy 15, 45-342 Gnójnik");
        Student student2 = new Student("Zbigniew ", "Fiut ", "Obora 10, 42-431 Wygniew");
        Student student3 = new Student("Arek ", " Szparek", " Szłania 4, Wicherowo");
        Student studnet4 = null;

        schoolService.addStudent(studnet4);
        schoolService.addStudent(student2);
        schoolService.addStudent(student3);

        schoolService.deleteLastStudent();
        schoolService.deleteLastStudent();
        schoolService.deleteLastStudent();

        schoolService.addStudent(student1);
        schoolService.addStudent(student2);

        schoolService.addStudent(student3);


    }
}
