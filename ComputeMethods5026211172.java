import java.util.*;
import java.lang.*;

public class ComputeMethods5026211172 {

        //Convert given temperature in Fahrenheit to Celsius

    public static double fToC ( double degreeF){
            double Celcius;
            Celcius = 5.0/9 * (degreeF - 32);
            System.out.println("Nilai suhu dalam celcius yang anda dapatkan adalah "+Celcius);
            return Celcius;
    }

        //Compute the hypotenuse lenght of a triangle given its side lenght
    public static double hypotenuse(int a, int b){
            double hypotenuse;
            hypotenuse = Math.sqrt(a*a + b*b);
            System.out.println("Nilai sisi miring yang anda cari adalah "+hypotenuse);
            return hypotenuse;
    }

        //Simulate the rolling of two 6 sided dice and display their sum
    public static int roll(){
        Random randomNumber = new Random();
        int dice1 = randomNumber.nextInt(6)+1;
        int dice2 = randomNumber.nextInt(6)+1;
        int total = dice1 + dice2;
        System.out.println("Jumlah angka dadu yang anda dapatkan adalah "+ total);
        return total;
    }
}
