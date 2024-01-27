class power{
    public static void main(String[] args){
        int a = 512;

        while (a%2 == 0)
            a /= 2;

        if (a==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}