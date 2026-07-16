class Fib {

    public static int fib(int n){
        if(n <= 1) return n;

        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int prev1 = 0;
        int prev2 = 1;
        int current = 0;
        
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        
        return current;
    }
    public static void main(String[] args) {
        String text = "   Hello World   ";
        String result = text.trim(); 
        System.out.println("'" + result + "'");
        System.out.println(fib(8)); // 0, 1, 1, 2, 3, 5, 8, 13, 21...
        System.out.println(getFibonacci(8));
    }
}