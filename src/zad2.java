import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        int d,m,r;
        Scanner dane = new Scanner(System.in);
        System.out.println("Wprowadz dzien");
        d = dane.nextInt();
        System.out.println("Wprowadz miesiac");
        m = dane.nextInt();
        System.out.println("Wprowadz 2 ostatnie cyfry roku");
        r = dane.nextInt();
        int a=d*m;
        if(a==r){
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}