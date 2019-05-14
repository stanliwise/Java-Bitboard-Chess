abstract public class Piece{
    
    //The piece type
    public String type;

    //piece name shortcode
    public String type_shortname;

    //current position
    public long position;

    //if piece is still alive of not
    public boolean state;

    //constructor
    public  Piece(long start_position){
        this.position = start_position;
    }

    //move piece
    abstract boolean move(long from, long to);

    /**
     * return move mask of piece from current position
     */
    abstract long move_mask();

    /**
     * return capture mask of piece from current position
     */
    abstract long capture_mask();

    /**
     * check if a move is valid
     * 
     * @return true|false
     */
    abstract boolean isValid();
}