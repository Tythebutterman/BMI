import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        //write your code here
    /*BMI= kg/m*m
     M=inch*(0.025meters/inch)
     inch=M*(inch/0.025meters)
     */
        Scanner keyboard;
        double userHeight, userWeight, total, userMeter, userKilo;
        keyboard=new Scanner(System.in);

        keyboard = new Scanner(System.in);

        System.out.println("your height in inches");
        userHeight=keyboard.nextInt();

        userMeter=(userHeight*(0.0254/1));


        System.out.println("enter your weight in pounds");
        userWeight=keyboard.nextInt();

        userKilo=(.45*userWeight);

        total=(userKilo/(userMeter*userMeter));

        System.out.println(total);





    }




}
