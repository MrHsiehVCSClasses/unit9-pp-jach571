package u9pp.Chess;

public class Knight extends ChessPiece{
    public Knight(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col){
        if(super.canMoveTo(row, col) == false){
            return false;
        } else if(knightJump(row, col) == false){
            return false;
        } else{
            return true;
        }
    }

    public boolean knightJump(int row, int col){
        int rowDiff = Math.abs(this.row - row);
        int colDiff = Math.abs(this.col - col);
    
        if(rowDiff == 1){
            if(colDiff == 2){
                return true;
            } else{
                return false;
            }
        } else if(rowDiff == 2){
            if(colDiff == 1){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
    public void doMove(int row, int col){
        super.doMove(row, col);
    }


    public String toString(){
        if(isWhite == true){
            return "N";
        } else if(isWhite == false){
            return "n";
        }

        return null;
    }

    public boolean isWhite(){
        return isWhite;
    }
}