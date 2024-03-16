import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message1,message2,message3,message4,message5;
        double height,weight,result;

        message1 = "Welcome to the body mass index measurement program";
        message2 = "Please enter your height : ";
        message3 = "Please enter your weight : ";
        message4 = "Calculating please wait";
        message5 = "Body mass index : ";


        System.out.print(message1 + "\n" + message2 );
        height = input.nextDouble();
        System.out.print(message2 );
        weight = input.nextDouble();
        System.out.println(message4);

        result = weight / (height * height);

        System.out.println(message5 + result);



    }
}
