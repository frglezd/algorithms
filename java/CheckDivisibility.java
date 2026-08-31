class CheckDivisibility {
    public boolean checkDivisibility(int n) {
        int num = n;
        int digitSum = 0;
        int digitProduct = 1;
        while(n>= 1){
            int digit = n % 10;
            digitSum += digit;
            digitProduct *= digit;
            n /= 10;
        }
        return num % digitSum == 0 && digitProduct != 0 && num % digitProduct == 0;
    }

    public static void main(String[] args) {
        CheckDivisibility cd = new CheckDivisibility();
        int n = 99;
        boolean result = cd.checkDivisibility(n);
        System.out.println(result);
    }
}