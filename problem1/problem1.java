// Problem: The greatest of 2 numbers
import java.util.Scanner;
class greater{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter the no1:");
        number1= a.nextInt();
        System.out.println("Enter the no2:");
        number2= a.nextInt();
        if(number1>number2){
            System.out.println("the greater no is:" + number1);
        }else{
            System.out.println("the greater no is:" + number2);
        }

    }
}
// Sample input: 
// Sample output:

