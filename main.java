public class main {
    public static void main (String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 75;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        int hours = 13;
        String timeOfDay =(hours < 12) ?"A.M." : "P.M.";
        int income = 30000;
        double taxRate = (income >= 20000) ? 5.8 : 9.8;
        System.out.println(taxRate);

        if(score >= 60){
            System.out.println("Pass");
       }
        else{System.out.println("Fail");
       }

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);

     }
}