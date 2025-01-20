class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color)
            return image;

        int og = image[sr][sc];
        
        dfs(image,sr,sc,color,og);

        return image;
    }

    public void dfs(int[][] image, int x, int y, int color, int og){

        if(x < 0 || y < 0 || y >= image[0].length || x>=image.length || image[x][y]!=og)
            return;
        
        image[x][y] = color;

        dfs(image,x-1,y,color,og);     
        dfs(image,x+1,y,color,og);   
        dfs(image,x,y-1,color,og);   
        dfs(image,x,y+1,color,og);   

    }
}