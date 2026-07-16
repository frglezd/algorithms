class MinFlips{
    public int minFlips(String pwd){
        int count = 0;

        for(int i=0; i < pwd.length()-1; i+=2){
            if (pwd.charAt(i) != pwd.charAt(i+1))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        //String pwd = "101011";//2
        String pwd2 = "100110";//3
        MinFlips solution =  new MinFlips();
        int result = solution.minFlips(pwd2);
        System.out.println(result);
    }
}