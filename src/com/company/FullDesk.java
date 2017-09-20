package com.company;

import java.util.ArrayList;

public class FullDesk {
    private ArrayList<ArrayList<ArrayList<Character>>> desk = new ArrayList<>(960);
    private ArrayList<ArrayList<Character>> deskLength = new ArrayList<>(8);
    private ArrayList<Character> deskWight = new ArrayList<>(8);

    FullDesk(InitialChessDesk chessDesk) {

        for (ChessDesk i : chessDesk.getAllBeginings()) {
            for (int q = 0; q < 8; q++) {
                deskLength.add(new ArrayList<>(deskWight));
            }
            for (int j = 0; j < 8; j++) {
                deskLength.get(0).add(i.getChessFigur((byte) j));
                deskLength.get(1).add('P');
                deskLength.get(2).add('e');
                deskLength.get(3).add('e');
                deskLength.get(4).add('e');
                deskLength.get(5).add('e');
                deskLength.get(6).add('P');
                deskLength.get(7).add(i.getChessFigur((byte) j));
            }
            desk.add(new ArrayList<>(deskLength));
            deskLength.clear();
            deskWight.clear();
        }
    }

    public ArrayList<ArrayList<ArrayList<Character>>> getDesk() {
        return desk;
    }

    public ArrayList<ArrayList<Character>> getDeskLength() {
        return deskLength;
    }

    public ArrayList<Character> getDeskWight() {
        return deskWight;
    }

    public void setDesk(ArrayList<ArrayList<ArrayList<Character>>> desk) {
        this.desk = desk;
    }

    public void setDeskLength(ArrayList<ArrayList<Character>> deskLength) {
        this.deskLength = deskLength;
    }

    public void setDeskWight(ArrayList<Character> deskWight) {
        this.deskWight = deskWight;
    }

    public void setFigure(int deskNumber, byte a, byte b, char figure) {
        desk.get(deskNumber).get(a).set(b, figure);
    }

    public char getFigure(int deskNumber, byte a, byte b) {
        return desk.get(deskNumber).get(a).get(b);
    }

    public void show(int deskNumber) {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += desk.get(deskNumber).get(i) + "\n";
        }
        System.out.println(result);
    }
}
