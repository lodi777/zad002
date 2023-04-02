package pl.kurs;

public class App {
    public void drawHourglass(int height) {

        int middle = height / 2;


        for (int i = 0; i < height; i++) {
            int space = Math.abs(middle - i);
            int stars = height / 2 - space;

            for (int j = 0; j <= stars; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * space; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        App app = new App();
        app.drawHourglass(9);
        System.out.println();

    }
}
