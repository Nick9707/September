package com.company;

import java.util.Arrays;

public class ChessDesk {
    private char[] ChessLine = new char[8]; // king(K), queen(Q),rook(R), knight(N), bishop(B)

    ChessDesk(char[] a){
        ChessLine[0] = a[0];
        ChessLine[1] = a[1];
        ChessLine[2] = a[2];
        ChessLine[3] = a[3];
        ChessLine[4] = a[4];
        ChessLine[5] = a[5];
        ChessLine[6] = a[6];
        ChessLine[7] = a[7];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(this.hashCode() == o.hashCode()) return true;

        ChessDesk chessDesk = (ChessDesk) o;

        return Arrays.equals(ChessLine, chessDesk.ChessLine);
    }

    @Override
    public int hashCode() {
        return (int)ChessLine[0]*1+(int)ChessLine[1]*2+(int)ChessLine[2]*3+(int)ChessLine[3]*4+(int)ChessLine[4]*5
                +(int)ChessLine[5]*6+(int)ChessLine[6]*7+(int)ChessLine[7]*8;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < 8; i++){
            result += ChessLine[i];
        }
        return result;
    }
}
