
public class main{
    public static void main(String[] argc){

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 2;

        if(isStudent){
            if(isSenior){
                System.out.println("you get a student discount of 10%");
                System.out.println("you get a senior discont of 30%");
                price = price - (price * 0.30);
            }
            else{
                System.out.println("you get a student discount 10%");
                price = price - (price * 0.10);
            }

        }
        else{
            if(isSenior){
                System.out.println("you get a senior discount of 30%");
                price = price - (price * 0.30);
            }
        }
        System.out.printf("the price of ticket is: %f", price);





    }
}