class diamondstar{
    public static void main(String[] args){
        int N = 5;
        int intialstar = 1;
        for (int rows = 1 ; rows <= N ; rows++){
             for ( int stars = intialstar ; stars >= 1 ; stars--){
                System.out.print("*");
             }
                intialstar += 2;
                System.out.println(" ");
        }
        intialstar -= 4;
        for (int rows = N-1; rows >= 1 ; rows--){
             for ( int stars = intialstar ; stars >= 1 ; stars--){
                System.out.print("*");
             }
                intialstar -= 2;
                System.out.println(" ");
        }
      
    }
}