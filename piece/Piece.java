package piece;

public abstract class Piece {

    public static final int KING = 1;
    public static final int QUEEN = 2;
    public static final int ROOK = 3;
    public static final int BISHOP = 4;
    public static final int KNIGHT = 5;
    public static final int PAWN = 6;

    public int position;
    protected int color;

    public Piece(int color, int position){
        this.position = position;
        this.color = color;
    }

    public void change_position(int position){
        this.position = position;
    }

    public int get_position(){
        return position;
    }

    /**
     * This type of piece
     * @return
     */
    abstract public int get_type();

    /**
     * return move mask of piece from current position
     */
    abstract public long move_mask();
}