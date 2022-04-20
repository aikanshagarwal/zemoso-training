package LDPJava1;

import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        rungame();
    }

    public static void rungame()
    {
        String winner = "";
        boolean xTurn = true;
        int row = 0;
        int col = 0;
        String[][] gameBoard = new String[3][3];

        initialiseGameBoard(gameBoard);
        printBoard(gameBoard);

        while(winner.equals(""))
        {
            if(xTurn)
            {
                System.out.println("It is X's turn");
            }
            else
            {
                System.out.println("It is O's turn");
            }

            getUserInput(xTurn, gameBoard);
            System.out.println();

            printBoard(gameBoard);
            winner = getWinner(gameBoard);
            xTurn = !xTurn;

            if(winner.equals("") && isBoardFull(gameBoard))
            {
                winner = "C";
            }
            
        }
        System.out.println();

        if(winner.equals("C"))
        {
            System.out.println("It was the cat's game!");
        }
        else
        {
            System.out.println("The winner is: " + winner);
        }


    }

    private static boolean isBoardFull(String[][] gameboard)
    {
        int count=0;
        for(int i=0;i<gameboard.length;i++)
        {
            for(int j=0;j<gameboard[i].length;j++)
            {
                if(!gameboard[i][j].equals(" "))
                {
                    count++;
                }
            }
        }
        return count==9;
    }

    private static void getUserInput(boolean xTurn, String[][] gameBoard)
    {
        Scanner sc = new Scanner(System.in);
        int row = -1;
        int col = -1;
        boolean keepAsking = true;

        while(keepAsking)
        {
            System.out.println("Please enter the row and the column");
            row = sc.nextInt();
            col = sc.nextInt();
            sc.nextLine();

            if(row>=0 && row<=2 && col>=0 && col<=2)
            {
                if(cellOccupied(row , col , gameBoard))
                {
                    System.out.println("The cell is already occupied.");

                }
                else
                {
                    keepAsking = false;
                }
            }
        }

        if(xTurn)
        {
            gameBoard[row][col] = "X";
        }
        else
        {
            gameBoard[row][col] = "O";
        }
    }

    private static boolean cellOccupied(int row, int col, String[][] gameBoard)
    {
        if(gameBoard[row][col]== " ")
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    private static String getWinner(String[][] gameBoard)
    {
        for(int i = 0; i< gameBoard.length; i++)
        {
            if(!gameBoard[i][0].equals(" ") && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2]) )
            {
                return gameBoard[i][0];
            }
        }

        for(int i = 0; i< gameBoard[0].length; i++)
        {
            if(!gameBoard[0][i].equals(" ") && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i]) )
            {
                return gameBoard[1][i];
            }
        }

        if(!gameBoard[0][0].equals(" ") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]) )
        {
            return gameBoard[1][1];
        }

        if(!gameBoard[2][0].equals(" ") && gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2]) )
        {
            return gameBoard[1][1];
        }

        return "";
    }

    public static void initialiseGameBoard(String[][] gameBoard)
    {
        for(int i = 0; i< gameBoard.length; i++)
        {
            for(int j = 0; j< gameBoard[i].length; j++)
            {
                gameBoard[i][j]=" ";
            }
        }
    }

    public static void printBoard(String[][] gameBoard)
    {
        for(int i = 0; i< gameBoard.length; i++)
        {
            for(int j = 0; j< gameBoard[i].length; j++)
            {
                System.out.print(gameBoard[i][j]);
                if(j<2)
                {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<2)
            {
                System.out.print("- - - - -");
            }
            System.out.println();
        }
    }
}
