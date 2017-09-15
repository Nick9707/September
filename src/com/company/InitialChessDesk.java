package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.*;
import java.util.Iterator;
import java.util.logging.*;
import java.util.ArrayList;


public class InitialChessDesk {
    private ArrayList<ChessDesk> AllBeginings = new ArrayList<>();
    private ChessDesk chessDesk = new ChessDesk();

    InitialChessDesk() {
        byte numberOfQueen = 0;
        byte numberOfKnight1 = 0;
        byte numberOfKnight2 = 0;
        byte numberOfRook = 0;
        byte numberOfKing = 0;


        for (int i = 0; i < 4; i++) {   // bishop 1
            chessDesk.setChessFigur('B', (byte) (i * 2));
            for (int j = 0; j < 4; j++) {  //bishop 2
                chessDesk.setChessFigur('B', (byte) (j * 2 + 1));
                for (int k = 0; k < 6; k++) { // queen

                    while (chessDesk.getChessFigur(numberOfQueen) != 'e') numberOfQueen++;
                    chessDesk.setChessFigur('Q', (numberOfQueen));

                    for (int q = 0; q < 10; q++) { //2 knight + king + 2 rook
                        while (chessDesk.getChessFigur(numberOfKnight1) != 'e') numberOfKnight1++;
                        chessDesk.setChessFigur('N', numberOfKnight1);

                        while (chessDesk.getChessFigur(numberOfKnight2) != 'e') numberOfKnight2++;

                        chessDesk.setChessFigur('N', numberOfKnight2);

                        while (chessDesk.getChessFigur(numberOfRook) != 'e') numberOfRook++;
                        chessDesk.setChessFigur('R', numberOfRook);

                        while (chessDesk.getChessFigur(numberOfKing) != 'e') numberOfKing++;
                        chessDesk.setChessFigur('K', numberOfKing);

                        while (chessDesk.getChessFigur(numberOfRook) != 'e') numberOfRook++;
                        chessDesk.setChessFigur('R', numberOfRook);

                        AllBeginings.add(new ChessDesk(chessDesk));
                        numberOfKing = numberOfRook = 0;
                        chessDesk.cleanKingRooKnight();
                        if (q == 3 || q == 6 || q == 8) {
                            numberOfKnight1++;
                            numberOfKnight2 = numberOfKnight1;
                        }
                        numberOfKnight2++;

                    }
                    numberOfQueen++;
                    chessDesk.cleanQueen();
                    numberOfKnight1 = numberOfKnight2 = 0;
                }
                chessDesk.cleanSecondBishop((byte) (j * 2 + 1));
                numberOfQueen = 0;
            }
            chessDesk.cleanChessDesk();
        }
    }

    public ChessDesk getChessDesk(int i) {
        return AllBeginings.get(i);
    }

    public void setChessDesk(ChessDesk chessDesk) {
        AllBeginings.add(chessDesk);
    }

    public boolean isUniqu() {
        for (int i = 0; i < AllBeginings.size(); i++) {
            for (int j = i + 1; j < 960; j++)
                if (AllBeginings.get(i).equals(AllBeginings.get(j))) {
                    System.out.println(AllBeginings.get(i).hashCode());
                    System.out.println(AllBeginings.get(j).hashCode());
                    System.out.println(i + " " + j);
                    System.out.println(AllBeginings.get(i));
                    System.out.println(AllBeginings.get(j));
                    return false;
                }
        }
        return true;
    }

    public static void pushToBD() {

    }
}


