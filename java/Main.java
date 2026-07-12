class Main {
    public static int maxArea(int[] height) {
        int rectLength = height.length-1;
        int startIndex = 0;
        int endIndex = height.length-1;
        int rectHeight = Math.min(height[startIndex], height[endIndex]);
        int maxArea = 0;
        while(endIndex > startIndex){
            
            int currArea = rectLength * rectHeight;
            System.out.println("currArea is: length " + rectLength + "height " + rectHeight 
            + "= " +currArea);
            if(currArea > maxArea){
                maxArea = currArea;
                System.out.println(maxArea);
            }if (height[startIndex] < height[endIndex]){
                startIndex++;
            }else{
                endIndex--;
            }
            
            rectLength = endIndex - startIndex;
            rectHeight = Math.min(height[startIndex], height[endIndex]);
        }

        return maxArea;
    }

    public static void main(String[] args){
        int[] height = {8,7,2,1};
        int result = maxArea(height);
        System.out.println("result is " +result);
    }
}

