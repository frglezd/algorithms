public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Validation: Must have at least two elements
        if (arr == null || arr.length < 2) {
            return -1; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            // Case 1: Found a new largest element
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            // Case 2: Found a number between largest and second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Return -1 if all elements were identical (no true second largest exists)
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest: " + getSecondLargest(numbers)); // Outputs 34
    }
}