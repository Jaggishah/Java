import java.util.Scanner;

class controlflow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        int marks = sc.nextInt();
        System.out.println("Enter Second Marks:");
        int second  = sc.nextInt();

        if ( marks > second) System.out.println("First one is large");
        else System.out.println("Second is large");

        // if(marks < 10){
        //     System.out.println("You Are failed");
        // }else{
        //     System.out.println("You are Passs");
        // }

        // // tenary operator

        // char result = marks < 10 ? 'F' : 'P' ;

        // System.out.print(result);

        sc.close();
    }
}