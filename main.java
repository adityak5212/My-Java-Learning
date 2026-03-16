import java.util.Scanner;
import java.util.Scanner;
public class main {
    public static void main (String[] args){

        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the day of a week ");

        String day = scanner.nextLine();

        switch (day){
            case "Monday" -> System.out.println("It is a weekday😑");
            case "Tuesday" -> System.out.println("It is a weekday🤦");
            case "Wednesday" -> System.out.println("It is a weekday😑");
            case "Thursday" -> System.out.println("It is a weekday🤦");
            case "Friday" -> System.out.println("It is a weekday😑");
            case "saturday" -> System.out.println("It is a weekday😊");
            case "Sunday" -> System.out.println("It is a weekday😊");
            default -> System.out.println(day + " is not a day");



        }

     }
}