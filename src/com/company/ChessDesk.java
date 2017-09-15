package com.company;

import java.util.Arrays;

public class ChessDesk {
    private char[] ChessLine = new char[8]; // king(K), queen(Q),rook(R), knight(N), bishop(B)

    ChessDesk() {
        for (int i = 0; i < 8; i++) ChessLine[i] = 'e';
    }

    ChessDesk(char[] a) {
        ChessLine[0] = a[0];
        ChessLine[1] = a[1];
        ChessLine[2] = a[2];
        ChessLine[3] = a[3];
        ChessLine[4] = a[4];
        ChessLine[5] = a[5];
        ChessLine[6] = a[6];
        ChessLine[7] = a[7];
    }

    ChessDesk(ChessDesk chessDesk) {
        this.ChessLine[0] = chessDesk.ChessLine[0];
        this.ChessLine[1] = chessDesk.ChessLine[1];
        this.ChessLine[2] = chessDesk.ChessLine[2];
        this.ChessLine[3] = chessDesk.ChessLine[3];
        this.ChessLine[4] = chessDesk.ChessLine[4];
        this.ChessLine[5] = chessDesk.ChessLine[5];
        this.ChessLine[6] = chessDesk.ChessLine[6];
        this.ChessLine[7] = chessDesk.ChessLine[7];
    }

    public char[] getChessLine() {
        return ChessLine;
    }

    public char getChessFigur(byte place) {
        return ChessLine[place];
    }

    public void setChessFigur(char figur, byte place) {
        if (ChessLine[place] == 'e') ChessLine[place] = figur;
    }

    public void cleanChessDesk() {
        for (int i = 0; i < 8; i++) ChessLine[i] = 'e';
    }

    public void cleanKingRooKnight() {
        for (byte i = 0; i < 8; i++)
            if (getChessFigur(i) == 'K' || getChessFigur(i) == 'R' || getChessFigur(i) == 'N') ChessLine[i] = 'e';
    }

    public void cleanQueen() {
        for (byte i = 0; i < 8; i++) if (getChessFigur(i) == 'Q') ChessLine[i] = 'e';
    }

    public void cleanSecondBishop(byte place) {
        ChessLine[place] = 'e';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (this.hashCode() == o.hashCode()) return true;

        ChessDesk chessDesk = (ChessDesk) o;

        return Arrays.equals(ChessLine, chessDesk.ChessLine);
    }

//    @Override
//    public int hashCode() {
//        return (int) ChessLine[0] * 2 + (int) ChessLine[1] * 13 + (int) ChessLine[2] * 127 + (int) ChessLine[3] * 331 + (int) ChessLine[4] * 479
//                + (int) ChessLine[5] * 2083 + (int) ChessLine[6] * 2999 + (int) ChessLine[7] * 3571;
//    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(ChessLine);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += ChessLine[i];
        }
        return result;
    }


}
