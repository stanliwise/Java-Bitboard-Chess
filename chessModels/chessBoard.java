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
        //initalize gameboard
        init();
    }

    /**
     * This function is very needed because it would be called often to restarted the game
     */
    protected void init(){
        //set all variables
        deathBag = new DeathBag();
        en_passant = false;
        whose_turn = WHITE;
        piece_map = new Piece[64];

        //add white pawns
        for (int i = 8; i < 16; i++) {
            piece_map[i] = new Pawn(WHITE, (i + 1));
        }

        //add black pawn
        for(int j = 56; j > 48; j-- ){
            piece_map[j] = new Pawn(BLACK, (j + 1));
        }

        //setup Rooks
        piece_map[63] = new Rook(BLACK, 64);
        piece_map[56] = new Rook(BLACK, 57);
        piece_map[7] = new Rook(WHITE, 8);
        piece_map[0] = new Rook(WHITE, 1);

        //setup Knight
        piece_map[62] = new Knight(BLACK, 63);
        piece_map[57] = new Knight(BLACK, 58);
        piece_map[6] = new Knight(WHITE, 7);
        piece_map[1] = new Knight(WHITE, 2);

        //setup Bishop
        piece_map[61] = new Bishop(BLACK, 62);
        piece_map[58] = new Bishop(BLACK, 59);
        piece_map[5] = new Bishop(WHITE, 6);
        piece_map[2] = new Bishop(WHITE, 3);

        //setup Queen
        piece_map[60] = new Queen(BLACK, 61);
        piece_map[4] = new Queen(WHITE, 5);

        //setup King
        piece_map[59] = new King(BLACK, 60);
        piece_map[3] = new King(WHITE, 4);
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

    /***
     * Switch turn to the next player
     * @return
     */
    protected void switch_turn(){
        whose_turn = (whose_turn == WHITE) ? BLACK : WHITE;
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
        return piece_map[position];
    }

    /**
     * Remove  from board
     * 
     * @param position
     * @return
     */
    protected void remove(int position){
        piece_map[position] = null;
    }

    /**
     * This help to check for the type of piece at a given position
     */
    public int get_piece_type(int position){
        return (piece_map[position]).get_type();
    }

    /**
     * Reset the chess games to start a new game
     */
    public void reset(){
        init();
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
     * @return This is true if the move was successful else false;
     */
    public boolean make_move(Move move){
        //Where the main logic happens
        //move to a new square 
        return false;
    }
}