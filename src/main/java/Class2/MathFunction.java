package Class2;

import java.util.Random;

public class MathFunction {
    public static void main(String[] args) {
        double number1= 9.00;
        double number2= 4.00;
        double value= 20.49;

        //math function

        System.out.println("Square root value is " +Math.sqrt(number1));
        System.out.println("Maximum value is " +Math.max(number1, number2));
        System.out.println("Minimum value is " +Math.min(number1, number2));
        System.out.println("Round value is " +Math.round(value));
        System.out.println("Ceil value is " +Math.ceil(value));

        //random number generate
        System.out.println("Random value is " +Math.random()*100);
        System.out.println("Random value is " +Math.round(Math.random()*100));

        //random number generate
        Random randNumber = new Random();
        String prefixNumber = "018552";
                int generateNumber = randNumber.nextInt(9999)+1111;
                String mobileNumber= (prefixNumber+generateNumber);
        System.out.println("Mobile number is "+mobileNumber);




    }
}
