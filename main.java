import java.util.Scanner;
public class main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = scanner.nextLine();
        System.out.print("enter your age; ");
        int age = scanner.nextInt();
        System.out.print(" what is your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.print(" are you a student? (true/fale) ");
        boolean isStudent = scanner.nextBoolean();
        System.out.print("hello " + name);
        System.out.print(" you are " + age  +  " years old");
        System.out.print(" Your gpa is " + gpa);
        if(isStudent) {
            System.out.print(" you are enrolled as a student");
        }
        else{
            System.out.println("you are not enrolled");
        }



        scanner.close();


    }
}
