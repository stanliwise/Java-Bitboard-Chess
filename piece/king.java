package piece;

public class King extends Piece{
    public King(long start_position, int Color){
        super(start_position, Color);
    }

    @Override
    public long move_mask() {
        int intPos = (int) this.position + 1;
		long bitPosition = 1L << this.position;
            bitPosition = (bitPosition << 9) | (bitPosition << 7) | (bitPosition << 8) 
                        | (bitPosition >> 9) | (bitPosition >> 7) | (bitPosition >> 8) 
                        | (bitPosition >> 1) | (bitPosition << 1);
        
        //validate move if piece is at the egde; 
        if((intPos % 8 == 1))
			bitPosition &= 0x7F7F7F7F_7F7F7F7FL;

		if(intPos % 8 == 0 )
			bitPosition &= 0xFEFEFEFE_FEFEFEFEL;

            return bitPosition;
    }
}