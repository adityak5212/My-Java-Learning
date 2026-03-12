import java.util.Scanner;
public class main{
    public static void main(String[] argc){

        // circumference = 2* Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/ 3.0) * Math.pow(radius,3)

        Scanner scanner = new Scanner (System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2* Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/ 3.0) * Math.pow(radius,3);

        System.out.println("the circumference is: " + circumference + "cm");
        System.out.println("the area is: " + area + "cm^2");
        System.out.println("the volume is: " + volume + "cm^3");

        scanner.close();




    }
}