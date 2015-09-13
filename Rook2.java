import java.lang.Math.abs();

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
    public Rook(boolean white, int num, Board board) {
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

    public void move(int newX, int newY) {
        if ((Math.abs(newX - xLocation) == Math.abs(newY - yLocation)) && b.isOnBoard(newX, newY)) {
            char buf = b.board[xLocation][yLocation];
            
            b.board[xLocation][yLocation] = ' ';
            xLocation = newX;
            yLocation = newY;
            System.out.println(xLocation + ", " + yLocation);
            b.board[newX][newY] = buf;
            b.print();
        } else {
            System.out.println("invalid move");
            b.print();
        }
    }
}
