import java.util.Random;
public class main{
    public static void main(String[] argc){

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number;
        boolean isHeads;


        number1 = random.nextInt(1,86);
        number2 = random.nextInt(1,432);
        number3 = random.nextInt(1,435);
        number = random.nextDouble(1,765);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number);

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("tails");
        }


    }
}