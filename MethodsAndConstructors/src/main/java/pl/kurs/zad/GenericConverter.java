package pl.kurs.zad;

public class GenericConverter {
   static double convertMilesToKilometers(double miles){
        return miles * 1.6;
    }
    static double convertKPaToPsi(double kPa){
        return kPa * 0.145038;
    }
    static double feetToInch(double feet){
        return feet * 12;
    }
    static double convertCelsiusToFahrenheit(double celcius){
        return celcius * 1.8 + 32;
    }
    static double convertPsiToBar(double psi){
        return psi * 0.06895;
    }
}
