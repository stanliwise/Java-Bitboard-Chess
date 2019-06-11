import piece.*;
public class chess {
    public static void main(String[] args) {
        //Knight knight= new Knight(62, 1);
        //System.out.println(knight.move_mask());

        King king = new King(9, 1);
        System.out.println(king.move_mask());
    }

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