public class RainWater {
    public static int TrappedRainWater(int height[]) {                      //Time Complixity Of This Code is = O(n)
        int n = height.length;
        //Calculate LeftMax Boundry  - array
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i =1; i<n;i++) {
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }
        //Calculate RightMax Boundry   -array
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }
        int TrappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            //WaterLevel = min(LeftMax Boundry , RightMax Boundry)
            int waterleverl = Math.min(LeftMax[i], RightMax[i]);
             //Trapped Water = WaterLevel - height[i]
            TrappedWater += waterleverl - height[i];
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
        System.out.println("Total TrappedRainWater is : " + TrappedRainWater(height));
    }
}
