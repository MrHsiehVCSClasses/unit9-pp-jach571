package u9pp.Chess;

public class Bishop extends ChessPiece{
    public Bishop(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col){
        if(super.canMoveTo(row, col) == false){
            return false;
        } else if(super.bishopCanMove(row, col) == false){
            return false;
        } else{
            return true;
        }
    }

    public void doMove(int row, int col){
        super.doMove(row, col);
    }

    public String toString(){
        if(isWhite == true){
            return "B";
        } else if(isWhite == false){
            return "b";
        }

        return null;
    }

    public boolean isWhite(){
        return isWhite;
    }
}