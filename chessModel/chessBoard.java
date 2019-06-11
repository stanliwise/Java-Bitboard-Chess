package chessModel;

import java.util.ArrayList;

import piece.*;

public class chessBoard {
    public final static int WHITE = 1;
    public final static int BLACK = 2;
    protected boolean en_passant = false;
    protected ArrayList<Piece> blackPieces;
    protected ArrayList<Piece> whitePieces;
    protected long whiteBit;
    protected long Boardbit; 
    protected int whosTurn;

    public chessBoard(){

    }

    public static void main(String[] args) {
        
    }

    public long getBlackBit(){
        return 0;
    }

    /*return bitState of white player*/
    public long getWhiteBit(){
        return 0;
    }

    /* return the bitstate of the current board*/
    public long getBoardBit(){

        return 0;
    }

    public void switchTurn(){
       whosTurn = (whosTurn == chessBoard.WHITE) ? chessBoard.BLACK : chessBoard.WHITE;
    }

    public boolean isCheck(){
        return false;
    }

    protected void init(){
        long[] white_start_position = new long[16];
        long[] black_start_position = new long[16];

        for(int i=0; i < 17; i++){
            white_start_position[i] =  i;
        }

        for(int j = 48, k = 0; j < 64 &&  k < 16; j++, k++){
            black_start_position[k] = j;
        }

        //initialize both white piece and black piece
        createPiece(whitePieces, chessBoard.WHITE, white_start_position);
        createPiece(blackPieces, chessBoard.BLACK, black_start_position);
        
        //set player turn
        whosTurn = chessBoard.WHITE;
    }

    public void createPiece(ArrayList<Piece> container, int color, long[] positions){
            //create the back place of the board
            container.add(new Rook(positions[0], color));
            container.add(new Knight(positions[1], color));
            container.add(new Bishop(positions[2], color));
            container.add(new King(positions[3], color));
            container.add(new Queen(positions[4], color));
            container.add(new Bishop(positions[5], color));
            container.add(new Knight(positions[6], color));
            container.add(new Rook(positions[7], color));

            //create the pawn
            for(int i = 8; i < 16; i++ ){
                container.add(new Pawn(positions[i], color));
            }
    }

    public boolean isOccupied(){
        return false;
    }

}