class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int count=0;
        int left =0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left] == val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                count++;
                right--;
            } else {
                left++;
            }

        }
        
        return count;
        
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int count = re.removeElement(nums, val);
        System.out.println("Count of elements removed: " + count);
        System.out.print("Modified array: ");
        for (int i = 0; i < nums.length - count; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}