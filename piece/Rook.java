package piece;

public class Rook extends Piece {
    public boolean castle_candidate;

    public Rook(int type, int position) {
        super(type, position);
        castle_candidate = true;
    }

    @Override
    public long move_mask() {
        return 0;
    }

}