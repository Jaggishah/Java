/* Online Java Compiler and Editor */
import java.io.*;
public class HelloWorld{
    
    static void print2smallest(int arr[]){
        
        int first = Integer.MAX_VALUE; 
        int second  = Integer.MAX_VALUE; 
        if ( arr.length < 2){
            System.out.println("Invalid Value");
            return;
        }
            
        
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first){
                second  = arr[i];
            }
        }
        
        System.out.println("First element is " + first );
        System.out.println("Second element is " + second );
            
    }
     public static void main(String []args){
        int arr[] = { 12, 13, 1, 10, 34, 1 }; 
        print2smallest(arr);
            
     }
}
