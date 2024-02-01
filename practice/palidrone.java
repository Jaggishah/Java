class Palidrone {
    public static void main(String[] args){
        String pali = "racecar";

        int i = 0;
        int j = pali.length() - 1;
        Boolean is = false;

        while( i < j) {
            if (pali.charAt(i) != pali.charAt(j)){
                System.out.println("Not a palidrone");
                is = true;
                break;
            }
            i++;
            j--;
        }
        if (!is)
            System.out.println("its a palidrone");
    }
}