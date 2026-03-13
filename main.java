
public class main{
    public static void main(String[] argc){

        // printf() = is a method used to format outou
        // %[flags] [width][.precision] [specifier-character]

        String name = "Ayush";
        char firstLetter = 'A';
        int age = 22;
        double height = 178.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("your name start with a %c\n", firstLetter);
        System.out.printf("you are %d yers old\n", age);
        System.out.printf("you are %fcm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        double price1 = 27.3;
        double price2 =32;
        double price3 =23.3;

        System.out.printf("% 2f\n", price1);
        System.out.printf("% 2f\n", price2);
        System.out.printf("2%f\n", price3);




    }
}