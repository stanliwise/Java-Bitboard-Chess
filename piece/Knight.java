package piece;
import piece.contract.*;

public class Knight extends Piece implements Killable {

    public Knight(long start_position){
        super(start_position);
    }

    public long move_mask(){
        return 0;
    }

    public long capture_mask(){
        return 0;
    }

    public boolean die(){
        return true;
    }

    public boolean isValid(long value){
        return true;
    }

    @Override
    public boolean move(long from, long to) {
        return false;
    }

    @Override
    public boolean isValid() {
        return false;
    }
    
}