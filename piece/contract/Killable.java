/**
 * Any class that inherit the interface must be able to die
 * The king piece does not inherit this interface
 */
package piece.contract;

public interface Killable {
    //remove a piece from the board
    public void die();

    //place piece back on the board;
    public void resurrect();

    //check if the piece is dead
    public boolean isDead();
}