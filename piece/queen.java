package piece;

public class Queen extends Piece {

    public Queen(int color, int position) {
        super(color, position);
    }

    @Override
    public long move_mask() {
        return 0;
    }

    @Override
    public int get_type() {
        return QUEEN;
    }
}