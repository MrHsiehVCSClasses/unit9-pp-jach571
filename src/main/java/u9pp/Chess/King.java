package u9pp.Chess;

public class King extends ChessPiece{
    public King(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col){
         if(super.canMoveTo(row, col) == false){
            return false;
        } else if((this.row - row > 1 || this.row - row < -1) || (this.col - col > 1 || this.col - col < -1)){
            return false;
        } else if(isNextToKing(row, col) == true){
            return false;
        } else{
            return true;
        }
    }

    //Need to do thing that makes it not go out of bounds
    public boolean isNextToKing(int row, int col){
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = col - 1; j <= col + 1; j++){
                if((i == this.row && j == this.col) == false){
                    if(super.isInBounds(i, j) == true){
                        if(board[i][j] instanceof King){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void doMove(int row, int col){
        super.doMove(row, col);
    }

    public String toString(){
        if(isWhite == true){
            return "K";
        } else if(isWhite == false){
            return "k";
        }

        return null;
    }

    public boolean isWhite(){
        return isWhite;
    }
}