public class SortestPath {
    public static float getshortestpath(String Path) {                              //O(n)      -- Time Complixity
        
        int x=0, y=0;

        for(int i = 0; i < Path.length(); i++) {
            
            char dir = Path.charAt(i);
            
            //North
            if (dir == 'N') {
                y++;
            }

            //South
            else if (dir == 'S') {
                y--;
            }

            //West
            else if (dir == 'W') {
                x--;
            }

            //East
            else if (dir == 'E') {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(getshortestpath(Path));
    }
}