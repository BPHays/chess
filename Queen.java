public class Queen {
    int xLocation;
    int yLocation;
    Board b;
    
    /*
     * default constructor for Queen
     *
     * @param white sets whether the piece is a white piece or a black piece
     * @param board is the game board
     */
    public Queen(boolean white, Board board) {
        this.b = board;
        if (white == true) {
            this.yLocation = Const.W_QUEEN_Y;
            this.xLocation = Const.W_QUEEN_X;
            b.board[xLocation][yLocation] = Const.W_QUEEN_CHAR;
        } else {
            this.yLocation = Const.B_QUEEN_Y;
            this.xLocation = Const.B_QUEEN_X;
            b.board[xLocation][yLocation] = Const.B_QUEEN_CHAR;
        }
    }
    
    /*
     *
     * @param newX is the new X location for the piece
     * @param newY is the new Y location for the piece
     */
    public void move(int newX, int newY) {
        char buf;
        
        if (((newX != xLocation && newY == yLocation) || (newY != yLocation && newX == xLocation) || 
        (Math.abs(newX - xLocation) == Math.abs(newY - yLocation))) && b.isOnBoard(newX, newY)) {
            b.move(xLocation, yLocation, newX, newY);
            b.print();
        } else {
            System.out.println("invalid move");
            b.print();
        }
    }
}
