import java.util.*;
class greatest1{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Enter the no1:");
        number1=a.nextInt();
        System.out.println("Enter the no2:");
        number2=a.nextInt();
        System.out.println("Enter the no3:");
        number3=a.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.println("the greatest number is:"+number1);
        }
        else if(number2 > number3 && number2 > number1){
            System.out.println("the greatest number is:"+number2);
        }
        else if(number3 > number1 && number3 > number2){
            System.out.println("the greatest number is:" + number3);
        }
        else{
            System.out.println("all numbers are equal");
        }
    }
}