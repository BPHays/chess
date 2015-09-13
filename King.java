public class King {
    int xLocation;
    int yLocation;
    Board b;
    
    /*
     * default constructor for King
     *
     * @param white sets whether the piece is a white piece or a black piece
     * @param board is the game board
     */
    public King(boolean white, Board board) {
        this.b = board;
        if (white == true) {
            this.yLocation = Const.W_KING_Y;
            this.xLocation = Const.W_KING_X;
            b.board[xLocation][yLocation] = Const.W_KING_CHAR;
        } else {
            this.yLocation = Const.B_KING_Y;
            this.xLocation = Const.B_KING_X;
            b.board[xLocation][yLocation] = Const.B_KING_CHAR;
        }
    }
    
    /*
     * makes sure that the new location is one square away in either the x or y direction, or both
     * also checks that the newLocation is a valid location on the board. If both conditions are met then it uses
     * the move method of the board class to change the pieces location
     * 
     * @param newX is the new X location for the piece
     * @param newY is the new Y location for the piece
     */
    public void move(int newX, int newY) {
        char buf;
        
        if ((newX == xLocation + 1 || newX == xLocation - 1 || newY == yLocation + 1 || newY == yLocation - 1) && 
        b.isOnBoard(newX, newY)) {
            b.move(xLocation, yLocation, newX, newY);
            b.print();
        } else {
            System.out.println("invalid move");
            b.print();
        }
    }
}
