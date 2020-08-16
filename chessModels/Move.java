package chessModels;

/**
 * This class is an abstraction of the a Move in a chessboard
 */
public class Move {
    protected int from;
    protected int to;

    public Move(int from){
        this.to = 0;
        
        setFrom(from);
    }

    public void setFrom(int from){

    }

    public int getFrom(){
        return 0;
    }

    public void setTo(){

    }

    public int getTo(){
        return 0;
    }

    /**
     * This function helps to validate the move even before board validate the move is validated by the board
     */
    public boolean isPossible(){
        return false;
    }
}