import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter any input:");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        // two ways for just do directly
        int ascii = (int) input;
       
        // check small and capital letters.
        if (input >= 48 && input <= 57) 
            System.out.println("Digit ");  
  
        // Check digit
        else if ((input >= 65 && input <= 90) 
            || (input >= 97 && input <= 122)) 
            System.out.println("Alphabet "); 
  
        // Else Special character
        else
            System.out.println("Special Character "); 
    }
}