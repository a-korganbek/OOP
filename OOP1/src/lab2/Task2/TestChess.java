package lab2.Task2;
public class TestChess {

    public static void main(String[] args) {

        Piece rook = new Rook(new Position(0,0));
        System.out.println("Rook move: " + rook.isLegalMove(new Position(0,5)));

        Piece king = new King(new Position(4,4));
        System.out.println("King move: " + king.isLegalMove(new Position(5,5)));

        Piece queen = new Queen(new Position(3,3));
        System.out.println("Queen move: " + queen.isLegalMove(new Position(6,6)));

        Piece bishop = new Bishop(new Position(2,2));
        System.out.println("Bishop move: " + bishop.isLegalMove(new Position(5,5)));

        Piece knight = new Knight(new Position(1,1));
        System.out.println("Knight move: " + knight.isLegalMove(new Position(2,3)));

        Piece pawn = new Pawn(new Position(1,1));
        System.out.println("Pawn move: " + pawn.isLegalMove(new Position(2,1)));
        Piece pawn1 = new Pawn(new Position(1,2));
        System.out.println("Pawn move: " + pawn1.isLegalMove(new Position(1,3)));
    }
}