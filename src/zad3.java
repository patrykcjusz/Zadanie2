import java.util.Scanner;
public class zad3   {
    public static void main(String[] args) {
        float wzrost, waga;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz wzrost:" );
        wzrost = dane.nextFloat();
        System.out.println("Wprowadz wage:");
        waga = dane.nextInt();
        float a=wzrost*wzrost;
        double bmi = waga/a;
        if (bmi > 25) {
            System.out.println("Masz nadwage.");
        } else if (bmi <18.5) {
            System.out.println("Masz niedowage");
        } else {
            System.out.println("W normie");
        }
    }
}
