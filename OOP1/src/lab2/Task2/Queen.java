package lab2.Task2;
public class Queen extends Piece {

    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int r = Math.abs(a.row - b.row);
        int c = Math.abs(a.col - b.col);
        return r == c || a.row == b.row || a.col == b.col;
    }
}