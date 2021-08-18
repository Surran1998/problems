import java.util.*;
class Bubblesort{
    public static void main(String agrs[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the Length:");
        int length = sc.nextInt();
        int arr[] = new int [length];
        for( int i =0; i<arr.length; i++){
            System.out.println("Enter the value of n:");
            arr[i] = sc.nextInt();
        }
        int j=1;
        while(j<arr.length){
            int i =0;
            while(i<arr.length-j){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                i++;
            }
            j++;
        }
        System.out.println("sorted value of n:");
        for(int k =0; k< arr.length; k++){
            
            System.out.println(arr[k]);
        }
}


}