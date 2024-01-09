import java.util.Scanner;

class practiceSwitch {

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Plz Enter the day name:");
         int days = sc.nextInt();

         switch (days){
            case 1 :
                System.out.println("This is the day one");
                break;
            default:
                System.out.println("This is the Other day");
         }
         sc.close();
    }
}
