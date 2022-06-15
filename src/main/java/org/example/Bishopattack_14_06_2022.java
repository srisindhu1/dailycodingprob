package dailycodingproblems;
//On our special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another 
// bishop located between them, i.e. bishops can attack through pieces.
//
//You are given N bishops, represented as (row, column) tuples on a M by M chessboard. 
// Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: 
// (1, 2) is considered the same as (2, 1).
public class Bishopattack_14_06_2022 {
        static int [][]board = new int[20][20];

        static int findattack(int N, int[][] bishops)
        {

            // Set all the bits
            // having bishop to 1
            for (int i = 0; i < bishops.length; i++) {
                board[bishops[i][0]][bishops[i][1]] = 1;
            }

            // Stores the final answer
            int attack = 0;

            // Loop to traverse the matrix
            // diagonally in left direction
            for (int s = 2; s <= 2 * N; s++) {

                // Stores count of bishop
                // in the current diagonal
                int count = 0;

                for (int i = 1, j = s - i;
                     Math.max(i, j) <= Math.min(N, s - 1)&&i-j>0; i++, j--) {
                    if (board[j][i - j] == 1)


                        count++;
                }

                // Update the answer
                if (count > 1)
                    attack += ((count + 1) * count) / 2;
            }

            // Loop to traverse the matrix
            // diagonally in right direction
            for (int s = 2; s <= 2 * N; s++) {

                // Stores count of bishop
                // in the current diagonal
                int cnt = 0;

                for (int i = 1, j = s - i;
                     Math.max(i, j) <= Math.min(N, s - 1); i++, j--) {
                    if (board[i][N - j + 1] == 1)

                        // Update cnt
                        cnt++;
                }

                // Update the answer
                if (cnt > 1)
                    attack += ((cnt + 1) * cnt) / 2;
            }

            // Return answer
            return attack;
        }
}
