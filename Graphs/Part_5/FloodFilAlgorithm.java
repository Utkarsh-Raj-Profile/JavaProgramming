import java.util.Arrays;

public class FloodFilAlgorithm {
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        //left
        helper(image, sr, sc-1, color, vis, orgCol);

        //right
        helper(image, sr, sc+1, color, vis, orgCol);

        //up
        helper(image, sr-1, sc, color, vis, orgCol);

        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }

    //LeetCode 733 number problem
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        FloodFilAlgorithm sol = new FloodFilAlgorithm();

        // Example input
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;

        // Perform flood fill
        int[][] result = sol.floodFill(image, sr, sc, color);

        // Print the output
        System.out.println("Modified Image:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
