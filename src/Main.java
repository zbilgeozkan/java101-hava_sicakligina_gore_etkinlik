import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        temperature = input.nextDouble();

        if (temperature < 5) {
            System.out.println("Kayak yapılabilir.");
        }
        if (temperature >= 5 && temperature < 15) {
            System.out.println("Sinemaya gidilebilir.");
        }
        if (temperature >= 15 && temperature < 25) {
            System.out.println("Pikniğe gidilebilir.");
        }
        if (temperature > 25) {
            System.out.println("Yüzmeye gidilebilir.");
        }

    }
}