package piece;

public class Knight extends Piece {

    public Knight(int color, int position) {
        super(color, position);
    }

    @Override
    public long move_mask() {
        return 0;
    }

    @Override
    public int get_type() {
        return KNIGHT;
    }

}