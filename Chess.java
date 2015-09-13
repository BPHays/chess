public class Chess{
    Board board; 
    ChessPieces white;
    ChessPieces black;

    /**
     * Constructor which makes a new game board and populates a set of pieces for both white and black
     */
    public Chess() {
        board = new Board();
        white = new ChessPieces(true, board);
        black = new ChessPieces(false, board);
    }
    
    public static void main(String[] args) {
        Chess c = new Chess();
    }
}
