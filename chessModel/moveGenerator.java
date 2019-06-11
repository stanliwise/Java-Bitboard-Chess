package chessModel;
import piece.*;

public class moveGenerator{
    protected chessBoard chessboard;

    public moveGenerator(chessBoard board){
        this.chessboard = board;
    }

    public long getMove(Piece piece){
        long moveBit = 0;
        if(piece instanceof Knight){
            moveBit = this.getKnightMoves((Knight) piece);
        }
        
        if(piece instanceof Queen){
            moveBit = this.getQueenMoves((Queen) piece);
        }

        if(piece instanceof Bishop){
            moveBit = this.getBishopMoves((Bishop) piece);
        }

        if(piece instanceof King){
            moveBit = this.getKingMoves((King) piece);
        }

        if(piece instanceof Pawn){
            moveBit = this.getPawnMoves((Pawn) piece);
        }

        if(piece instanceof Rook){
            moveBit = this.getRookMoves((Rook) piece);
        }

        return moveBit;
    }

    protected long getBishopMoves(Bishop piece) {
        return 0;
    }

    protected long getQueenMoves(Queen queen){
        return 0;
    }

    protected long getRookMoves(Rook rook){
        return 0;
    }

    protected long getPawnMoves(Pawn pawn) {
        return 0;
    }

    protected long getKingMoves(King king){
        return 0;
    }

    protected long getKnightMoves(Knight knight){
        return 0;
    }

    public void setBoard(chessBoard board){
        this.chessboard = board;
    }

    public boolean isCheck(){
        return false;
    }
}