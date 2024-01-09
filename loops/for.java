import java.util.Scanner;

class practiceFor{
    public static void main(String[] args){

        // for (int i = 0 ; i < 2 ; i++){
        //     System.out.println("Looops!");
        // }

        Scanner sc = new Scanner(System.in);

        int iteration = sc.nextInt();

        for ( int i = 0 ; i <= iteration ; i++){
            System.out.println(i);
        }
    }
}