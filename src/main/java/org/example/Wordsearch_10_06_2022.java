package dailycodingproblems;
//Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by
// going left-to-right, or up-to-down.
//For example, given the following matrix:
//[['F', 'A', 'C', 'I'],
// ['O', 'B', 'Q', 'P'],
// ['A', 'N', 'O', 'B'],
// ['M', 'A', 'S', 'S']]
//and the target word 'FOAM', you should return true,
public class Wordsearch_10_06_2022 {
    // Function to check if a word exists in a grid
// starting from the first match in the grid
// level: index till which pattern is matched
// x, y: current position in 2D array
    static boolean findmatch(char mat[][], String pat, int x, int y,
                             int nrow, int ncol, int level)
    {
        int l = pat.length();

        // Pattern matched
        if (level == l)
            return true;

        // Out of Boundary
        if (x < 0 || y < 0 || x >= nrow || y >= ncol)
            return false;

        // If grid matches with a letter while
        // recursion
        if (mat[x][y] == pat.charAt(level))
        {

            // Marking this cell as visited
            char temp = mat[x][y];
            mat[x][y] = '#';

            // finding subpattern in 4 directions
            boolean res = findmatch(mat, pat, x - 1, y, nrow, ncol, level + 1) |
                    findmatch(mat, pat, x + 1, y, nrow, ncol, level + 1) |
                    findmatch(mat, pat, x, y - 1, nrow, ncol, level + 1) |
                    findmatch(mat, pat, x, y + 1, nrow, ncol, level + 1);

            // marking this cell
            // as unvisited again
            mat[x][y] = temp;
            return res;
        }
        else // Not matching then false
            return false;
    }

    // Function to check if the word exists in the grid or not
    static boolean checkMatch(char mat[][], String pat, int nrow, int ncol)
    {

        int l = pat.length();

        // if total characters in matrix is
        // less then pattern length
        if (l > nrow * ncol)
            return false;

        // Traverse in the grid
        for (int i = 0; i < nrow; i++)
        {
            for (int j = 0; j < ncol; j++)
            {

                // If first letter matches, then recur and check
                if (mat[i][j] == pat.charAt(0))
                    if (findmatch(mat, pat, i, j, nrow, ncol, 0))
                        return true;
            }
        }
        return false;
    }

}
