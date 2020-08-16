package piece;

public class King extends Piece{
    public boolean castle_candiate;

    public King(int type, int position) {
        super(type, position);
        castle_candiate  = true;
    }

    @Override
    public long move_mask() {
        return 0;
    }
    
}