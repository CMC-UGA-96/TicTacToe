/**                                                                                                                                                                                        
     * Returns {@code true} if the provided character value is found                                                                                                                           
     * in three consecutive spaces (including diagonals) in the provided                                                                                                                       
     * game board.                                                                                                                                                                             
     *                                                                                                                                                                                         
     * @return {@code true} if the character is found in three consecutive spots                                                                                                               
     * and {@code false} otherwise.                                                                                                                                                            
     * @param board the board to check                                                                                                                                                         
     * @param ch the character to check                                                                                                                                                        
     */
    public static boolean isWinner(String board, char ch) {
        //check rows                                                                                                                                                                           
        for (int i = 0; i < board.length(); i += 3) {
            if (board.charAt(i) == ch && board.charAt(i + 1) == ch && board.charAt(i + 2) == ch) {
                return true;
            } // if                                                                                                                                                                            
        } // for                                                                                                                                                                               

        //check cols                                                                                                                                                                           
        for (int i = 0; i < 3; i += 1) {
            if (board.charAt(i) == ch && board.charAt(i + 3) == ch && board.charAt(i + 6) == ch) {
                return true;
            } // if                                                                                                                                                                            
        } // for                                                                                                                                                                               

        //check diagonals                                                                                                                                                                      
        if (board.charAt(0) == ch && board.charAt(4) == ch && board.charAt(8) == ch) {
            return true;
        }
        return board.charAt(2) == ch && board.charAt(4) == ch && board.charAt(6) == ch;
    } // isWinner                                                                                                                                                                              

} // TTTSolver 
