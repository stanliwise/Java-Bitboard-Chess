package piece;

public class Pawn extends Piece {
	public boolean can_move_two;

	public Pawn(int color, int position) {
		super(color, position);
		can_move_two = true;
	}

	@Override
	public long move_mask() {
		return 0;
	}

	@Override
	public int get_type() {
		return PAWN;
	}
}