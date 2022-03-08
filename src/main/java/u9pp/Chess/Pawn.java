package u9pp.Chess;

public class Pawn extends ChessPiece{
    private int count = 0;

    public Pawn(ChessPiece[][] board, int row, int col, boolean isWhite){
        super(board, row, col, isWhite);
    }

    public boolean canMoveTo(int row, int col){
        if(super.canMoveTo(row, col) == false){
            return false;
        } else if(isEatingPiece(row, col) == true){
            count++;
            return true;
        } else if(movingOneSpace(row, col) == true){
            count++;
            return true;
        } else if(isFirstTurn(row, col) == true){
            count++;
            return true;
        } else{
            return false;
        }
    }

    public boolean movingOneSpace(int row, int col){
        if(col == this.col){
            if(Math.abs(row - this.row) == 1){
                if(board[this.row][this.col].isWhite() == true){
                    if(row >= this.row){
                        return false;
                    } else if(board[row][col] == null){
                        return true;
                    }
                } else if(board[this.row][this.col].isWhite() == false){
                    System.out.println(row + " " + this.row);
                    if(row <= this.row){
                        return false;
                    } else if(board[row][col] == null){
                        return true;
                    }
                } 
            } else{
                return false;
            }
        }
        return false;
    }

    public boolean isEatingPiece(int row, int col){
        if(isInBounds(row, col) == true && this.col != col){
            if(board[row][col] == null){
                return false;
            }

            if(board[this.row][this.col].isWhite() == true){
                if(this.row == row + 1 && this.col == col + 1){
                    if(board[row][col].isWhite() == board[this.row][this.col].isWhite()){
                        return false;
                    }
                } else if(this.row == row + 1 && this.col == col - 1){
                    if(board[row][col].isWhite() == board[this.row][this.col].isWhite()){
                        return false;
                    }
                }
            } else if(board[this.row][this.col].isWhite() == false){
                if(this.row == row - 1 && this.col == col + 1){
                    if(board[row][col].isWhite() == board[this.row][this.col].isWhite()){
                        return false;
                    }
                } else if(this.row == row - 1 && this.col == col - 1){
                    if(board[row][col].isWhite() == board[this.row][this.col].isWhite()){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isFirstTurn(int row, int col){
        if(count == 0 && Math.abs(row - this.row) == 2){
            count++;
            return true;
        }

        return false;
    }

    public void doMove(int row, int col){
        super.doMove(row, col);
    }

    public String toString(){
        if(isWhite == true){
            return "P";
        } else if(isWhite == false){
            return "p";
        }

        return null;
    }

    public boolean isWhite(){
        return isWhite;
    }
}