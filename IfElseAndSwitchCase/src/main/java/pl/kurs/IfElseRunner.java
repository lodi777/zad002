package pl.kurs;

public class IfElseRunner {
    public static void main(String[] args) {
        boolean statement = 1 > 2;

        if (!statement) {
            System.out.println("Warunek spełniony");
        } else {
            System.out.println("Warunek niespełniony");
        }

        System.out.println("Jakieś dalsze instrukcje");


        String wordOne = "koty!!";
        String wordTwo = "pies!!";

        if (wordOne.length() > wordTwo.length()) {
            System.out.println("Pierwsze słowo jest dłuższe!");
        } else if (wordOne.length() < wordTwo.length()) {
            System.out.println("Drugie słowo jest dłuższe!");
        } else {
            System.out.println("Oba słowa są równe!");
            if (wordOne.length() > 5) {
                System.out.println("Oba słowa mają ponat 5 znaków");
            }
        }
        //---------------------------------------------------------------------------
        //róznica pomiędzy dwoma nieżależnymi ifami a if-else if- else
        System.out.println("--------------------------------------------------------");
        String example = "Samochód sportowy";

        if (example.contains("chód")) {
            System.out.println("Zdanie zawiera słowo \"chód\"");
        }
        if (example.contains("sport")) {
            System.out.println("Zdanie zawiera słowo \"sport\"");
        }

        System.out.println("--------------------------------------------------------");
        String example2 = "Samochód sportowy";

        if (example2.contains("chód")) { //tutal wyswietli sie tylko pierwszy prawdziwy mimo ze kolejny tez jest prawdziwy
            System.out.println("Zdanie zawiera słowo \"chód\"");
        } else if (example2.contains("sport")) {
            System.out.println("Zdanie zawiera słowo \"sport\"");
        } else {
            System.out.println("Zdanie nie zawiera ani \"chód\", ani \"sport\"");
        }


        //--------------------------------------------------------------------------
        //pomijanie nawiasów klamrowych

        if (true) {
            System.out.println("Prawda1");
        }


        if (false)
            System.out.println("Prawda2");
        System.out.println("Prawda2,5");

        if (true) System.out.println("Prawda3");

    }
}
