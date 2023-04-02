package pl.kurs.homework.service;

import pl.kurs.homework.model.Student;

public class SchoolService {

    private Student[] array;
    private int counter;

    public SchoolService(int quantityOfStudents) {
        this.array = new Student[quantityOfStudents];
    }

    public void addStudent(Student student) {
        if (student == null) {
            System.out.println("Nie podano studenta!");
        } else {
            if (counter < array.length) {
                array[counter] = student;
                counter++;
                System.out.println("Dodano studenta: " + student);
            } else {
                System.out.println("Niema już kurwo dla ciebie miejsca");
            }
        }

    }

    public void deleteLastStudent() {
        if (counter == 0) {
            System.out.println("Lista już jest pusta");
        } else {
            System.out.println("Usunięto studenta: " + array[--counter]);
            array[counter] = null;
        }
    }


}
