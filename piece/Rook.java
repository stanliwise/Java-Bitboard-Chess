package piece;

public class Rook extends Piece {
    public boolean castle_candidate;

    public Rook(int color, int position) {
        super(color, position);
        castle_candidate = true;
    }

    @Override
    public long move_mask() {
        return 0;
    }

    @Override
    public int get_type() {
        return ROOK;
    }

}