public class chess {
    public static void main(String[] args) {
        //chessBoard model = new chessBoard();
        //Knight knight= new Knight(62, 1);
        //System.out.println(knight.move_mask())
        for (int i = 64; i > 0; i--) {
            System.out.print(i + " ");
            if(i % 8 == 0)
                System.out.println();
        }
    }

    /***
     * This is just a dump test of knightBit move logic
     * @return
     */
    public static long[] generateKnightMoves(){
        long[] moves = new long[64];
        long first_two_columns = 0xFCFCFCFC_FCFCFCFCL;
        long last_two_columns = 0x3F3F3F3F_3F3F3F3FL;
        
        //now start a for loop
        for(int i = 1; i < 65; i++){
            long j = 1;
            int k = i-1;
            if(i > 1)
                j = (1L << k);
            //generate move for each position
            moves[k] = (j << 6) | (j << 10) | (j << 15) | (j << 17) | (j >> 6) | ( j >> 10) | (j >> 15)| (j >> 17) ;
            if( ((i % 8) == 1) || ((i % 8) == 2) )
                moves[k] &= last_two_columns;
            else if( ((i % 8 ) == 0) || ((i % 8) == 7) )
                moves[k] &= first_two_columns;
        }

        return moves;
    }
}