import java.util.Scanner;
public class CurrencyConverter{
    public static void  main (String[] args){
        Scanner keyboard=new Scanner(System.in);
        float weight,height,bmi;
        System.out.println("Please enter your weight(in kg): ");
        weight=keyboard.nextFloat();
        System.out.println("Please enter your height(in meters): ");
        height=keyboard.nextFloat();
        bmi=weight/(height*height);
        System.out.println("Your BMI is: " +bmi);



    }



}








