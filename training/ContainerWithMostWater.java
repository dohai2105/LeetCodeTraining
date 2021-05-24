

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int leftIndex = 0, righIndex = height.length - 1;
        int maxWater = 0;

        while(leftIndex < righIndex){
 
            if(height[leftIndex] < height[righIndex]) {
                maxWater = Math.max(maxWater, (righIndex - leftIndex ) * height[leftIndex]);
                leftIndex++;
            } else {
                maxWater = Math.max(maxWater, (righIndex - leftIndex ) * height[righIndex]);
                righIndex--;
            }
        }
        return maxWater;
    }

    public static void main(String[]args) {
        int max = maxArea(new int[]{4,3,2,1,4});
        System.out.println(max);
    }
}
