import java.util.Scanner;
public class main{
    public static void main(String[] argc) {
        Scanner scanner = new Scanner(System.in);

        // && = And
        // || = OR
        // ! = NOT

        double temp =-10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("IT is Sunny outside☀️");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("IT is cloudy outside🌦️");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad 😑");
        }

        // username must be between 4-12 character
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username must not contain spaces or underscores");
        }
        else{
            System.out.println("welcome " + username);
        }
        scanner.close();

    }
}