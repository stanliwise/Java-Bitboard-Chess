package piece;
import piece.contract.*;

public class Knight extends Piece implements Killable {

    public Knight(long start_position, int color){
        super(start_position, color);
    }

    public long move_mask(){
        long first_two_columns = 0xFCFCFCFC_FCFCFCFCL;
        long last_two_columns = 0x3F3F3F3F_3F3F3F3FL;
        int pos = (int) this.position;
        int i = (int) pos + 1;
        long bitPosition = 1L << pos;
        bitPosition = (bitPosition >> 6) | (bitPosition >> 10) | (bitPosition >> 15) | (bitPosition >> 17) 
                    | (bitPosition << 6) | (bitPosition << 10) | (bitPosition << 15) | (bitPosition << 17);
        if( ((i % 8) == 1) || ((i % 8) == 2) )
            bitPosition &= last_two_columns;
        else if( ((i % 8 ) == 0) || ((i % 8) == 7) )
            bitPosition &= first_two_columns;
        
        return bitPosition;
    }

    /**
     * kill the piece
     * 
     * @return void
     */
    public void die(){
        this.state = Piece.DEAD; 
    }

    /**
     * revive the piece
     * 
     * @return void
     */
    public void resurrect(){
        this.state = Piece.ALIVE;
    }

    public boolean isDead(){
        if(this.state == Piece.ALIVE)
            return false;

        return true;
    }
    
}