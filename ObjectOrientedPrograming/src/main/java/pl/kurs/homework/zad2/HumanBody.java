package pl.kurs.homework.zad2;

public class HumanBody {
    public static void main(String[] args) {
        Body human1Body = new Body();
        human1Body.age = 38;


        Muscles human1Muscles = new Muscles();
        human1Muscles.speed = 10;
        human1Muscles.strength = 10;
        human1Body.muscles = human1Muscles;

        Lungs human1Lungs = new Lungs();
        human1Lungs.capacityMl = 4500;
        human1Lungs.fillingEfficiency = 0.9;
        human1Body.lungs = human1Lungs;

        Liver human1Liver = new Liver();
        human1Liver.altLevel = 31;
        human1Liver.astLevel = 31;
        human1Body.liver = human1Liver;

        Heart human1Heart = new Heart();
        human1Heart.bloodGroup = "ARH-";
        human1Heart.maximumHeartRate = 220 - human1Body.age;
        human1Heart.restingHeartRate = 80;
        human1Body.heart = human1Heart;

        Brain human1Brain = new Brain();
        human1Brain.iqLevel = 100;
        human1Brain.weightGrams = 900;
        human1Body.brain = human1Brain;



    }
}
