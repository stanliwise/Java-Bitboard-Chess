package piece;

public class Pawn extends Piece {
	public boolean can_move_two;

	public Pawn(int type, int position) {
		super(type, position);
		can_move_two = true;
	}

	@Override
	public long move_mask() {
		return 0;
	}
}