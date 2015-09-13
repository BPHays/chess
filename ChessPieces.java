public class ChessPieces {
    King king;
    Rook rook1;
    Rook rook2;
    Bishop bishop1;
    Bishop bishop2;
    Queen queen;
    
    /**
     * Default constructor for the ChessPieces class which makes a set of chess pieces that is either black or white
     *
     * @param white is a boolean where true is white
     * @param board is the current game's board
     */
    public ChessPieces(boolean white, Board board) {
        this.king = new King(white, board);
        this.queen = new Queen(white, board);
        this.rook1 = new Rook(white, 1, board);
        this.rook2 = new Rook(white, 2, board);
        this.bishop1 = new Bishop(white, 1, board);
        this.bishop2 = new Bishop(white, 2, board);
    }
}
