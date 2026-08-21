class IsBalancedEvenOdd {
    public boolean isBalanced(String num) {
        if (num == null || num.isEmpty()) {
            return true;
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }

            int digit = ch - '0';
            if (i % 2 == 0) {
                oddSum += digit;
            } else {
                evenSum += digit;
            }
        }

        return evenSum == oddSum;
    }

    public static void main(String[] args) {
        IsBalancedEvenOdd obj = new IsBalancedEvenOdd();
        System.out.println(obj.isBalanced("123456")); // 1+3+5=9, 2+4+6=12 => false
        System.out.println(obj.isBalanced("123321")); // 1+3+2=6, 2+3+1=6 => true
        System.out.println(obj.isBalanced("")); // true
    }
}