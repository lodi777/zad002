package pl.kurs.homework;

public class MyObjects {
    public static void main(String[] args) {
        Book nawykiWarteMiliony = new Book();

        nawykiWarteMiliony.author = "Brian Tracy";
        nawykiWarteMiliony.isbn = 9788328352278L;
        nawykiWarteMiliony.publisher = "Helion SA";
        nawykiWarteMiliony.tittle = "Nawyki Warte Miliony";
        nawykiWarteMiliony.publishYear = 2020;

        System.out.println(nawykiWarteMiliony.author);
        System.out.println(nawykiWarteMiliony.isbn);
        System.out.println(nawykiWarteMiliony.publisher);
        System.out.println(nawykiWarteMiliony.tittle);
        System.out.println(nawykiWarteMiliony.publishYear);
        System.out.println();

        Student krzysztof = new Student();

        krzysztof.firstName = "Krzysztof";
        krzysztof.lastName = "Golik";
        krzysztof.indexNumber = "005213";
        krzysztof.department = "Politechnika Śląska";
        krzysztof.direction = "Automatyka i Robotyka";
        krzysztof.yearOfStudy = 2;

        System.out.println(krzysztof.firstName);
        System.out.println(krzysztof.lastName);
        System.out.println(krzysztof.indexNumber);
        System.out.println(krzysztof.department);
        System.out.println(krzysztof.direction);
        System.out.println(krzysztof.yearOfStudy);
        System.out.println();

        Company gemi = new Company();

        gemi.name = "GEMI";
        gemi.creationDate = "19.08.2020";
        gemi.address = "Koniaków 1062, 43-474 Koniaków";
        gemi.management = "Krzysztof Golik";
        gemi.legalForm = "Działalność jednoosobowa";
        gemi.pkdCode = "47.91.Z";

        System.out.println(gemi.name);
        System.out.println(gemi.creationDate);
        System.out.println(gemi.address);
        System.out.println(gemi.management);
        System.out.println(gemi.legalForm);
        System.out.println(gemi.pkdCode);
        System.out.println();

        Invoice faktura = new Invoice();

        faktura.number = "2022/12/12";
        faktura.issueDate = "20.12.2022";
        faktura.product = "Lego Technic";
        faktura.totalPrice = "229.99";

        System.out.println(faktura.number);
        System.out.println(faktura.issueDate);
        System.out.println(faktura.product);
        System.out.println(faktura.totalPrice);
    }
}
