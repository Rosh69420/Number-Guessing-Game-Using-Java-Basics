import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num = 0,guess = 101,attempts = 0;
        boolean play = true;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Number Guessing Game.IO");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();


        while(play){

            num = rand.nextInt(1,101);
            attempts = 0;

            while(true) {
                System.out.print("Guess The Number: ");
                guess = sc.nextInt();
                attempts++;
                if (guess == num) {
                    System.out.println("Congratulations You Won!!");
                    System.out.println("The number was " + num);
                    System.out.println("Yo needed " + attempts + " attempts");
                    break;
                } else if (guess > num) {
                    System.out.println("Go Lower.");
                } else if (guess < num) {
                    System.out.println("Go Higher.");
                } else {
                    System.out.println("Invalid Number.");
                }
            }
            System.out.println("Want to play again Press Y if not Press N.");
            String choice = sc.next();
            if(choice.charAt(0) == 'N'|| choice.charAt(0) == 'n'){
                play = false;
                System.out.println("Thanks For Playing Come Again!!!");

            }

        }

    }
}