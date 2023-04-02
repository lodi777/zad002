package pl.kurs.zad;

public class ConverterRunners {
    public static void main(String[] args) {
       // GenericConverter genericConverter = new GenericConverter();

        double convertMiles = GenericConverter.convertMilesToKilometers(5);
        System.out.println(convertMiles);

        double convertKpa = GenericConverter.convertKPaToPsi(100);
        System.out.println(convertKpa);

        double convertPsi = GenericConverter.convertPsiToBar(45);
        System.out.println(convertPsi);

        double convertFeet = GenericConverter.feetToInch(14);
        System.out.println(convertFeet);

        double convertCelsius = GenericConverter.convertCelsiusToFahrenheit(3);
        System.out.println(convertCelsius);

        System.out.println();
        System.out.println("Czas");

        TimeConverter tc = new TimeConverter();

        long convertHours = tc.convertHoursToMinutes(10L);
        System.out.println(convertHours);

        long convertMinutes = tc.convertMinutesToSeconds(4L);
        System.out.println(convertMinutes);

        long convertSeconds = tc.convertSecondsToMilliseconds(45L);
        System.out.println(convertSeconds);


        long result = tc.convertSecondsToMilliseconds(tc.convertMinutesToSeconds(tc.convertHoursToMinutes(8L)));
        System.out.println(result);
    }
}
