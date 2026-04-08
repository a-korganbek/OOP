package lab2.Task2;
public class Knight extends Piece {

    public Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int r = Math.abs(a.row - b.row);
        int c = Math.abs(a.col - b.col);
        return (r == 2 && c == 1) || (r == 1 && c == 2);
    }
}