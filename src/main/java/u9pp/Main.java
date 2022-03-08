package u9pp;

import java.util.*;

import u9pp.MonsterFighter.MonsterFighterGame;
import u9pp.Chess.*;

public class Main 
{
    public static void main( String[] args ) {

        // Scanner scanner = new Scanner(System.in);

        // String prompt = "Welcome to u9pp :)\nAvailable games:\n"
        //     + "1: Monster Fighter\n"
        //     + "2: Chess\n"
        //     + "Select a game: ";
        // int gameSelection = InputHelper.getValidNumberInput(scanner, prompt, 1, 2);

        // if(gameSelection == 1) 
        // {
        //     MonsterFighterGame game = new MonsterFighterGame();
        //     game.play(scanner);
        // } 
        // else if (gameSelection == 2) 
        // {
        //     Chess chess = new Chess();
        //     chess.play(scanner);
        // }
        
        // scanner.close();

        ChessPiece[][] board = new ChessPiece[8][8];
        board[0][0] = new Pawn(board, 0, 0, false);
        board[7][0] = new Pawn(board, 7, 0, true);
        board[1][0] = new Pawn(board, 1, 0, true);
        board[6][0] = new Pawn(board, 6, 0, true);
        
        System.out.println("black forward " + board[0][0].canMoveTo(1, 0));
        System.out.println("white forward " + board[7][0].canMoveTo(6, 0));
    }
}