/**
 * Maze represents a maze of characters. The goal is to get from the
 * top left corner to the bottom right, following a path of 1's.
 *
 * @author Dr. Chase
 * @author Dr. Lewis
 * @version 1.0, 8/18/08
 */

package recursividad;

public class Maze2
{
   private final int TRIED = 3;
   private final int PATH = 7;

   private int[][] grid = { {1,1,1,0,1,1,0,0,0,1,1,1,1},
                            {1,0,1,1,1,0,1,1,1,1,0,0,1},
                            {0,0,0,0,1,0,1,0,1,0,1,0,0},
                            {1,1,1,0,1,1,1,0,1,0,1,1,1},
                            {1,0,1,0,0,0,0,1,1,1,0,0,1},
                            {1,0,1,1,1,1,1,1,0,1,1,1,1},
                            {1,0,0,0,0,0,0,0,0,0,0,0,0},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1} };
//private int[][] grid = { {1,1,1},
//                         {1,0,1},
//                         {0,0,1} };
   /**
    * Attempts to recursively traverse the maze. Inserts special
    * characters indicating locations that have been tried and that
    * eventually become part of the solution.
    *
    * @param row     the integer value of the row
    * @param column  the integer value of the column
    * @return        true if the maze has been solved
    */
   public boolean traverse (int row, int column)
   {
      boolean done = false;
      
      if (valid (row, column))
      {
         grid[row][column] = TRIED;  // this cell has been tried

         if (row == grid.length-1 && column == grid[0].length-1)
            done = true;  // the maze is solved
         else
         {
            done = traverse (row+1, column);     // down
            if (!done)
               done = traverse (row, column+1);  // right
            if (!done)
               done = traverse (row-1, column);  // up
            if (!done)
               done = traverse (row, column-1);  // left
         }

         if (done)  // this location is part of the final path
            grid[row][column] = PATH;
      }
//      if (row >= 0 && row < grid.length &&
//          column >= 0 && column < grid[row].length)
//       System.out.println("row:"+row+ " col:"+column+" val:"+grid[row][column]);
      return done;
   }

   /**
    * Determines if a specific location is valid.
    *
    * @param row     the column to be checked
    * @param column  the column to be checked
    * @return        true if the location is valid    
    */
   private boolean valid (int row, int column)
   {
      boolean result = false;
 
      /** check if cell is in the bounds of the matrix */
      if (row >= 0 && row < grid.length &&
          column >= 0 && column < grid[row].length)

         /**  check if cell is not blocked and not previously tried */
         if (grid[row][column] == 1)
            result = true;

      return result;
   }

   /**
    * Returns the maze as a string.
    * 
    * @return  a string representation of the maze
    */
   public String toString ()
   {
      String result = "\n";

      for (int row=0; row < grid.length; row++)
      {
         for (int column=0; column < grid[row].length; column++)
            result += grid[row][column] + "";
         result += "\n";
      }

      return result;
   }
}
