import java.util.Arrays;

public class GridPath {
    private int[][] grid;

    public GridPath(int[][] grid) {
        this.grid = grid;
    }

    // PART A (uncomment first)
    public Location getNextLoc(int row, int col) {
        if (row < 4 && col < 4) {
            if (grid[row + 1][col] < grid[row][col + 1]) {
                return new Location(row + 1, col);
            } else {
                return new Location(row, col + 1);
            }
        } else if (col < 4) {
            return new Location(row, col + 1);
        } else if (row < 4) {
            return new Location(row + 1, col);
        } else {
            return null;
        }
    }

    
    // PART B
    public int sumPath(int row, int col) {
        int sum = 0;
        
        while (row != grid[0].length && col != grid.length) {
            sum += grid[row][col];
            Location l = getNextLoc(row, col);
            row = l.getRow();
            col = l.getCol();
        }
        
        return sum + grid[grid.length - 1][grid[0].length - 1];
    }

    // added to see the array on screen 
    public String toString() {
        return Arrays.deepToString(grid);
    }
    
}
