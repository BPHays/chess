public class Rook {
    int xLocation;
    int yLocation;
    Board b;
    
    /**
     * default constructor for Rook
     *
     * @param white sets whether the piece is a white piece or a black piece
     * @param num is which rook is being constructed
     * @param board is the game baord
     */
    public Rook(boolean white, int num, Board board) {
        this.b = board;
        if (white == true) {
            if (num == 1) {
                this.yLocation = Const.W_1_ROOK_Y;
                this.xLocation = Const.W_1_ROOK_X;
                b.board[xLocation][yLocation] = Const.W_1_ROOK_CHAR;
            } else {
                this.yLocation = Const.W_2_ROOK_Y;
                this.xLocation = Const.W_2_ROOK_X;
                b.board[xLocation][yLocation] = Const.W_2_ROOK_CHAR;
            }
        } else {
            if (num == 1) {
                this.yLocation = Const.B_1_ROOK_Y;
                this.xLocation = Const.B_1_ROOK_X;
                b.board[xLocation][yLocation] = Const.B_2_ROOK_CHAR;
            } else {
                this.yLocation = Const.B_2_ROOK_Y;
                this.xLocation = Const.B_2_ROOK_X;
                b.board[xLocation][yLocation] = Const.B_2_ROOK_CHAR;
            }
        }
    }

    /**
     * Tests that either the x coordinate or the coordinate was changed and that the other coordinate has remained
     * constant and that the piece is still on the board. If both conditions are met then it sets the piece's new
     * location to the new X and Y coordinates
     *
     * @param newX is the new X location for the piece
     * @param newY is the new Y location for the piece
     */
    public void move(int newX, int newY) {
        if (((newX != xLocation && newY == yLocation) || (newY != yLocation && newX == xLocation)) && 
        b.isOnBoard(newX, newY)) {
            b.move(xLocation, yLocation, newX, newY);
            b.print(); 
        } else {
            System.out.println("invalid move");
            b.print();
        }
    }
}
