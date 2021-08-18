import java.util.Scanner;
class SearchArray{ 
    public static void main (String args[]){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elements you want to store:");
        n= scan.nextInt();
        // Create an array
        int[] array= new int[10];
        System.out.println("Enter the value of array:");

        for( int i=0;i < n; i++)
         {
            array[i]=scan.nextInt();
         }
        //  System.out.println("The array are:");
        //  for( int i=0;i<array.length;i++){
        //     System.out.println(array[i]);
        //  }
        int elementToBeFound;
        System.out.println("Enter the element to be found:");
        elementToBeFound = scan.nextInt();
        int index =-1;
        boolean foundElement = false;

        for(int i=0;i<array.length;i++)
        {
            if(array[i] == elementToBeFound)
            {
                index = i;
            foundElement=true;
                
                break;

            }
            else{
                foundElement= false;

                
            }
                
            
        }
        if(foundElement==true){
            System.out.println("the element "+elementToBeFound+"indexof "+index);
        }
        else{
            System.out.println("Element not found");
        }
        
    }
    //      public static int  findIndex (int[] my_array, int t) {
    //     if (my_array == null) {
    //     return -1;
    //     }
    //     int len = my_array.length;
    //     int i = 0;
    //     while (i < len) {
    //         if (my_array[i] == t) 
    //         {
    //             return i;
    //         }
    //         else i=i+1;
    //     }
    //     return -1;
    // }
    
}