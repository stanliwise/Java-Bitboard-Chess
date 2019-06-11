package piece;
import piece.contract.*;

public class Queen extends Piece implements Killable {

    public Queen(long start_position, int color){
        super(start_position, color);
    }

	@Override
	public long move_mask() {
		return 0;
	}

	/**
     * kill the piece
     * 
     * @return void
     */
    public void die(){
        this.state = Piece.DEAD; 
    }

    /**
     * revive the piece
     * 
     * @return void
     */
    public void resurrect(){
        this.state = Piece.ALIVE;
    }

    public boolean isDead(){
        if(this.state == Piece.ALIVE)
            return false;

        return true;
    }

}