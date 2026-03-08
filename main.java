public class main {

    public static void main(String[] args){
        int age = 21;
        int year = 2026;
        double price = 17672;
        char currency = '$';
         boolean isStudent = true;
         boolean forSale = false;

        String name = "Aditya";
        String food = "daal chawal";
        String email = "adtyak5212@gmail.com";
        String car = "mustang";
        String color = "blue";

        System.out.println("Hello " +name);
        System.out.println("your favorite food is: " + food);
        System.out.println("your email is " + email);
        System.out.println("your choice is " + color + " " +year+ " " +car );
        System.out.println("the price is: " +currency + " " +price);

        if(forSale) {
            System.out.println("there is a " + car + " for sale");
        }
        else{
            System.out.println("the " + car + "is not for sale");
        }




    }
}
