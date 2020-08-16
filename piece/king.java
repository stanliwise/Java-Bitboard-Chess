package piece;

public class King extends Piece{
    public boolean castle_candiate;

    public King(int color, int position) {
        super(color, position);
        castle_candiate  = true;
    }

    @Override
    public long move_mask() {
        return 0;
    }

    @Override
    public int get_type() {
        return KING;
    }
    
}