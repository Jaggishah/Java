class primenumber{
    public static void main(String[] args){
        int upto = 20;

        for (int i = 2 ; i <= upto ; i++){
            boolean flag =  false;
            for (int j = 2 ; j < i ; j++){
                if( i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i + " Its is a prime number");
            }

        }
    }
}