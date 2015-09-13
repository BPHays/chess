import java.lang.Math;

public class Bishop {
    int xLocation;
    int yLocation;
    Board b;
    
    /*
     * default constructor for Bishop
     *
     * @param white sets whether the piece is a white piece or a black piece
     * @param num is which rook is being constructed
     * @param board is the game baord
     */
    public Bishop(boolean white, int num, Board board) {
        this.b = board;
        if (white == true) {
            if (num == 1) {
                this.yLocation = Const.W_1_BISHOP_Y;
                this.xLocation = Const.W_1_BISHOP_X;
                b.board[xLocation][yLocation] = Const.W_1_BISHOP_CHAR;
            } else {
                this.yLocation = Const.W_2_BISHOP_Y;
                this.xLocation = Const.W_2_BISHOP_X;
                b.board[xLocation][yLocation] = Const.W_2_BISHOP_CHAR;
            }
        } else {
            if (num == 1) {
                this.yLocation = Const.B_1_BISHOP_Y;
                this.xLocation = Const.B_1_BISHOP_X;
                b.board[xLocation][yLocation] = Const.B_2_BISHOP_CHAR;
            } else {
                this.yLocation = Const.B_2_BISHOP_Y;
                this.xLocation = Const.B_2_BISHOP_X;
                b.board[xLocation][yLocation] = Const.B_2_BISHOP_CHAR;
            }
        }
    }

    /**
     * checks that the absolute value of the rise is equal to the absolute value of the run or more simply that the
     * angle the piece moves is diagonal and that the new location is on the gameboard. If both conditions are true
     * then the piece is moved to the new location
     *
     * @param newX is the new X location for the piece
     * @param newY is the new Y location for the piece
     */
    public void move(int newX, int newY) {
        if ((Math.abs(newX - xLocation) == Math.abs(newY - yLocation)) && b.isOnBoard(newX, newY)) {
            char buf = b.board[xLocation][yLocation];
            b.move(xLocation, yLocation, newX, newY); 
            b.print();
        } else {
            System.out.println("invalid move");
            b.print();
        }
    }
}
