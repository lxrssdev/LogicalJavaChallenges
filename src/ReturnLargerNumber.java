/*  Write a java program that receive numbers one by one
    Program will end when user type 0
    The program will return the number with more digits in it
    how many digits it had
    how many numbers user type in (exclude 0)
    ----- Restrictions -------
    Cannot convert number to String
    Must use do, do-while or for
    Must function with number < 0
    If there's a tie, keep the first one
*/
import java.util.Scanner;

public class ReturnLargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0, digitsCount = 0, counterHelper, maxNumber = 0, numbersTyped = 0, largerNumberDigits = 0;
        do{
            System.out.print("Type a number: ");
            number = sc.nextInt();
            if(number == 0){
                continue;
            }
            if(number < 0){
                number *= -1;
            }
            numbersTyped++;
            counterHelper = digitsCount;
            digitsCount = (int) Math.log10(number) + 1;
            if(digitsCount > counterHelper){
                maxNumber = number;
                largerNumberDigits = digitsCount;
            }

        }while(number != 0);

        System.out.printf("Larger number typed was: %d\n", maxNumber);
        System.out.printf("It has: %d digits\n", largerNumberDigits);
        System.out.printf("You typed %d numbers\n", numbersTyped);
    
    }
}
