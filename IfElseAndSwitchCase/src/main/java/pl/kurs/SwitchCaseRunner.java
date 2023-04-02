package pl.kurs;

import pl.kurs.homework.model.Car;

public class SwitchCaseRunner {

    public static void main(String[] args) {
        final String manager1 = "Robert";
        final String manager2 = "Jakub";
        final String councilMember = "Michał";
        final String accountant = "Justyna";

        String login = "Justyna";

        //klasyczny switch
//        switch (login) {
//            //case "Jakub":
//            case manager1, manager2:
//                System.out.println("Witamy Pana kierownika");
//                break;
//            case councilMember:
//                System.out.println("Witamy członka nierządu");
//                break;
//            case accountant:
//                System.out.println("Witamy Panią księgową");
//                System.out.println("Pięknie Pani dziś wygląda");
//                break;//na końcu nie musi byc brejka
//            default:
//                System.out.println("Nieznajomi wypierdalać xd");
//        }


        //switch z javy 13/14
        switch (login) {
            case manager1, manager2 -> System.out.println("Witamy Pana kierownika");
            case councilMember -> System.out.println("Witamy członka nierządu");
            case accountant -> {
                System.out.println("Witamy Panią księgową");
                System.out.println("Pięknie Pani dziś wygląda");
            }
            default -> System.out.println("Nieznajomi wypierdalać xd");
        }




        int chosenOption = 1;
        Car myCar = switch (chosenOption) {
            case 1 -> new Car("Audi", "S3", true, true);
            case 2 -> new Car("BMW", "M5", false, false);
            default -> null;
        };

        System.out.println(myCar);

    }
}
