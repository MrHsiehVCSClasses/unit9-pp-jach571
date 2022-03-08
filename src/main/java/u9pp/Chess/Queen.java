package u9pp.Chess;

public class Queen extends ChessPiece{
    public Queen(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col){
        if(super.canMoveTo(row, col) == false){
            return false;
        } else if(super.rookCanMove(row, col) == true){
            return true;
        } else if(super.bishopCanMove(row, col) == true){
            return true;
        } else{
            return false;
        }
    }

    public void doMove(int row, int col){
        super.doMove(row, col);
    }

    public String toString(){
        if(isWhite == true){
            return "Q";
        } else if(isWhite == false){
            return "q";
        }

        return null;
    }

    public boolean isWhite(){
        return isWhite;
    }
}