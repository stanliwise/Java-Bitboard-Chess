package piece;

public abstract class Piece {

    public final static int ALIVE = 1;
    public final static int DEAD = 0;
    
    //The piece type
    public String name;

    //color of string
    public int color;

    //piece name shortcode
    public String shortname;

    //current position
    public long position;

    //if piece is still alive of not
    public int state;

    //constructor
    public Piece(long start_position, int color){
        //if(this.position > 0 ||)
        this.position = (long)start_position;
        this.color = color;
        this.state = Piece.ALIVE;
    }

    //move piece
    public void move(long to){
        if((to > 0) || (to < 64))
            this.position = to;
    }

    /**
     * return move mask of piece from current position
     */
    abstract public long move_mask();
}