package piece;

public abstract class Piece {

    public static final int KING = 1;
    public static final int QUEEN = 2;
    public static final int ROOK = 3;
    public static final int BISHOP = 4;
    public static final int KNIGHT = 5;
    public static final int PAWN = 6;

    public int type;
    public int position;

    public Piece(int type, int position){
        this.type = type;
        this.position = position;
    }

    /**
     * return move mask of piece from current position
     */
    abstract public long move_mask();
}