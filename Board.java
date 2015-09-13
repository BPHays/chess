/**
 * class that generates a game board with a specified height and width if no dimensions are specified defaults to 8x8
 * includes a method to print the game board to the screen and one to fill the board with _ chars
 */
public class Board {
    char board[][];
    int height;
    int width;

    /**
     * Default constructor creates an 8x8 board and fills the spaces using the fillBoard() method
     */
    public Board() {
        this.height = Const.BOARD_WIDTH;
        this.width = Const.BOARD_HEIGHT;
        this.board = new char[width][height];
        fillBoard();
    }

    /**
     * Constructor creates a board of specified size and fills it with _ characters
     * 
     * @param height is the height of the board
     * @param width is the width of the board
     */
    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        board = new char[width][height];
        fillBoard();
    }

    /**
     * method that loops through the height and width coordinates to fill the board with _ chars
     */
    public void fillBoard() {
        for (int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                board[j][i] = '_';
            }
        }
    }

    /**
     * method that loops through the height and width coordinates to print the board to the screen
     */
    public void print() {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(board[j][i]);
            }
            System.out.println();
        }
    }
    
    /**
     * method that tests if the coordinates fall on the current game board and returns a boolean value
     *
     * @param x is the x coordiante being evaluated
     * @param y is the y coordinate being evaluated
     */
    public boolean isOnBoard(int x, int y) {
        if (x < width && x >= 0 && y < height && y >= 0)
            return true;
        else
            return false;
    }
    
    /**
     * method that moves a piece from one location on the board to another
     *
     * @param x is the original x location
     * @param y is the original y location
     * @param newX is the new x location
     * @param newY is the new y location
     * @param b is the current gameboard
     */
    public void move(int x, int y, int newX, int newY) {
        char buf;
 
        buf = this.board[x][y];
        this.board[x][y] = ' ';
        x = newX;
        y = newY;
        System.out.println(x + ", " + y);
        this.board[newX][newY] = buf;
    }
 
    public static void main(String[] args) {
        Board b = new Board();
        b.print();
    }
}
