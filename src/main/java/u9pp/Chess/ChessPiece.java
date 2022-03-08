package u9pp.Chess;

import javax.xml.namespace.QName;

public abstract class ChessPiece{
    ChessPiece[][] board; 
    int row; 
    int col; 
    boolean isWhite;
    boolean result;

    public ChessPiece(ChessPiece[][] board, int row, int col, boolean isWhite){
        this.board = board;
        this.row = row;
        this.col = col;
        this.isWhite = isWhite;
    }

    //Can't move if same color in space, out of the board, moving on to the same space
    public boolean canMoveTo(int row, int col){
        if(row > 7 || col > 7 || row < 0 || col < 0){
            result = false;
        } else if(board[row][col] != null && board[row][col].isWhite() == this.isWhite){
            result = false;
        } else if(row == this.row && col == this.col){
            result = false;
        } else{
            result = true;
        }
        return result;
    }

    public void doMove(int row, int col){
        board[row][col] = board[this.row][this.col];
        board[this.row][this.col] = null;
    }

    public boolean isInBounds(int row, int col){
        if(row > 7 || col > 7 || row < 0 || col < 0){
                return false;
        } else{
            return true;
        }
    }

    public abstract String toString();

    public boolean isWhite(){
        return isWhite;
    }

    public boolean rookCanMove(int row, int col){
        if(isInBounds(row, col) == true){
            if(row == this.row){
                if(this.col < col){
                    for(int i = this.col + 1; i < col; i++){
                        if(board[row][i] != null){
                            return false;
                        }
                    }
                } else if(this.col > col){
                    for(int i = col + 1; i < this.col; i++){
                        if(board[row][i] != null){
                            return false;
                        }
                    }
                }
            } else if(col == this.col){
                if(this.row < row){
                    for(int i = this.row + 1; i < row; i++){
                        if(board[i][col] != null){
                            return false;
                        }
                    }
                } else if(this.row > row){
                    for(int i = row + 1; i < this.row; i++){
                        if(board[i][col] != null){
                            return false;
                        }
                    }
                }
            } else{
                return false;
            }
    
            return true;
        }
        return false;
    }

    public boolean bishopCanMove(int row, int col){
        if(isInBounds(row, col) == true){
            //Bottom left
            if(row < this.row && col < this.col){
                for(int i = row + 1; i < this.row; i++){
                    for(int j = col + 1; j < this.col; j++){
                        if(board[i][j] != null){
                            return false;
                        }
                    }
                }
            } //Top left
            else if(row > this.row && col < this.col){
                for(int i = this.row + 1; i < row; i++){
                    for(int j = col + 1; j < this.col; j++){
                        if(board[i][j] != null){
                            return false;
                        }
                    }
                }
            } //Top right
            else if(row > this.row && col > this.col){
                for(int i = this.row + 1; i < row; i++){
                    for(int j = this.col + 1; j < col; j++){
                        if(board[i][j] != null){
                            return false;
                        }
                    }
                }
            } // Bottom right
            else if(row < this.row && col > this.col){
                for(int i = row + 1; i < this.row; i++){
                    for(int j = this.col + 1; j < col; j++){
                        if(board[i][j] != null){
                            return false;
                        }
                    }
                }
            } else{
                return false;
            }

            return true;
        }
        return false; 
    }
}