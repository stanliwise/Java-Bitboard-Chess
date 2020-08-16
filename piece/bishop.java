package piece;

public class Bishop extends Piece {


    public Bishop(int color, int position) {
        super(color, position);
    }

    @Override
    public long move_mask() {
        return 0;
    }

    @Override
    public int get_type() {
        return BISHOP;
    }


}