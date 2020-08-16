package chessModels;

import piece.*;

/**
 * This is an abstraction of the chessboard, it uses bitboard logic to calculate and manipualate the games
 */
public class chessBoard {
    public final static int WHITE = 1;
    public final static int BLACK = 2;
    protected DeathBag deathBag;
    protected boolean en_passant;
    protected int whose_turn;
    protected Piece[] piece_map;

    /**
     * Initialize our variables
     */
    public chessBoard(){
        deathBag = new DeathBag();
        en_passant = false;
        whose_turn = WHITE;
        piece_map = new Piece[64];

        //add white pawns
        for (int i = 8; i < 16; i++) {
            piece_map[i] = new Pawn(i + 1, WHITE);
        }

        //looop and add white pieces
    }

    /**
     * Help us detect a check on the board, true for player whose is not their turn
     */
    public boolean is_check(){
        return false;
    }

    /**
     * Check if the game has been won
     * The player whose turn is next is loosing and the other player is the winner
     * @return
     */
    public boolean is_checkmate(){
        return false;
    }

    /**
     * Check if a game is on stalemate
     * @return
     */
    public boolean stalemate(){
        return false;
    }

    /**
     * This helps to check if a king and rook and castle of either white or black
     */
    public boolean can_castle(int castle_type, int color){
        return false;
    }

    /**
     * The player whose turn is to play
     */
    public int whose_turn(){
        return 0;
    }

    /**
     * Find the type of piece at a position, return null if no piece
     */
    public Piece get_piece(int position){
        return null;
    }

    /**
     * Remove  from board
     * 
     * @param position
     * @return
     */
    protected void remove(Piece piece){
        //add to deathBa
        //check it contains in array and remove
    }

    /**
     * This help to check for the type of piece at a given position
     */
    public int get_piece_type(int position){
        return 0;
    }

    /**
     * Reset the chess games to start a new game
     */
    public void reset(){

    }

    /**
     * Return the complete bitmask of the board
     * @return
     */
    public long get_board_bitmask(){
        return get_white_bitmask() & get_black_bitmask();
    }

    /**
     * Get the bitmask of white
     */
    public long get_white_bitmask(){
        return 0;
    }

    /**
     * Get the bitmask of black
     */
    public long get_black_bitmask(){
        return 0;
    }

    /**
     * This helps to make a move
     */
    public void make_move(Move move){

    }
}