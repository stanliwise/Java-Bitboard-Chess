/**
 * Any class that inherit the interface must be able to die
 * The king piece does not inherit this interface
 */
package piece.contract;

public interface Killable {
    //remove a piece from the board
    public boolean die();
}