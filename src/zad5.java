import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        float masa;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz mase " );
        masa = dane.nextFloat();
        double ciezar=masa*9.8;
        if(ciezar>1000){
            System.out.println("Zbyt ciezki");
        } else if (ciezar<10) {
            System.out.println("Zbyt lekki");
        }

    }
}