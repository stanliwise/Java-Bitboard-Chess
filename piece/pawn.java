package piece;
import piece.contract.*;

public class Pawn extends Piece implements Killable {

    public Pawn(long start_position, int color){
		super(start_position, color);

		if((start_position < 8) || (start_position > 55) && color == 1){
			//throw new Exception(" Invalid start position for white pawn");
		}
    
    }

	@Override
	public long move_mask() {
		int intPos = (int) this.position + 1;
		long bitPosition = 1L << this.position;
		if(this.color == 1){
			bitPosition = (bitPosition << 9) | (bitPosition << 7) | (bitPosition << 8);
			
			//pawn can move first two square on start up.
			if(intPos > 8 && intPos < 17)
				bitPosition |= (1L << this.position) << 16;
		}else{
			//same pattern for black
			bitPosition = (bitPosition >> 9) | (bitPosition >> 7) | (bitPosition >> 8);

			//pawn can move from two step upward
			if(intPos > 48 && intPos < 57 )
				bitPosition |= (1L >> this.position) >> 16; 
		}

		if((intPos % 8 == 1))
			bitPosition &= 0x7F7F7F7F_7F7F7F7FL;

		if(intPos % 8 == 0 )
			bitPosition &= 0xFEFEFEFE_FEFEFEFEL;

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

	//check if the piece is dead
    public boolean isDead(){
        if(this.state == Piece.ALIVE)
            return false;

        return true;
    }
}