// count the digits

import java.util.Scanner;

class Practice{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (;total > 0 ; total /= 10){
            sum += total % 10;
            count++;
        }
        System.out.println("Total Number of digit: " + count);
        System.out.println("Total Number of digit Sum: " + sum);
    }

}