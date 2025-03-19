public class WrappedRainWater {
    public static int wrappedRainWater(int height[]) {
        int n = height.length;
        // calculate left max boundary for array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // calculate right max boundary for array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // calculate trapped water
        int waterLevel = 0;
        for (int i = 0; i < n; i++) {
            waterLevel += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return waterLevel;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(wrappedRainWater(height));
    }
}
