import java.util.Scanner;
public class main {
    public static void main (String[] args) {

        // if statement =  performs  block of code if its condition is true

        Scanner scanner = new Scanner (System.in);
        String name;
        int age = 50;
        boolean isStudent;
        System.out.println("enter your name: 😊");
        name = scanner.nextLine();
        System.out.println("enter your age: 😒");
        age = scanner.nextInt();
        System.out.println("are you a student (true /false): 👍");
        isStudent = scanner.nextBoolean();
        if(name.isEmpty()){
            System.out.println("you didn't enter your name 🙌");
        }
        else{
            System.out.println("hello " + name + "!");
        }

        if(age >= 65){
            System.out.println("you are a senior! 👴");
        }
        else if(age >=18){
            System.out.println("you are an adult! 🧑‍🦰");
        }
        else if(age > 0){
            System.out.println("you haven't been born yet! ❤️");
        }
        else if (age== 0) {
            System.out.println("you are a baby! 👶");
        }
        else{
            System.out.println("you are a child! 👼");
        }
        if(isStudent){
            System.out.println("you are a student! 🧑‍🎓");
        }
        else{
            System.out.println("you are not a student 🧑‍🎓");
        }
        scanner.close();

    }
}
