import java.util.Scanner;
public class main{
    public static void main(String[] argc){

        //Hypotenuse c = Math.sqrt(a2+ b2)

        Scanner scanner = new Scanner (System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        double result;
        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(8);
        result = Math.round(3.9);
        result = Math.ceil(2.6);
        result = Math.floor(6.3);
        result = Math.max(10,20);
        result = Math.min(10,20);
        System.out.println(result);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse (side c) is: " +c + "cm");

        scanner.close();


    }
}