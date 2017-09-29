package com.company;

import java.util.ArrayList;

public class FullDesk {
    private ArrayList<ArrayList<ArrayList<String>>> desk = new ArrayList<>(960);
    private ArrayList<ArrayList<String>> deskLength = new ArrayList<>(8);
    private ArrayList<String> deskWight = new ArrayList<>(8);

    private String figure = "";

    FullDesk(InitialChessDesk chessDesk) {

        for (ChessDesk i : chessDesk.getAllBeginings()) {
            for (int q = 0; q < 8; q++) {
                deskLength.add(new ArrayList<>(deskWight));
            }
            for (int j = 0; j < 8; j++) {
                figure = "w" + i.getChessFigur((byte) j);
                deskLength.get(0).add(figure);
                deskLength.get(1).add("wP");
                deskLength.get(2).add("e");
                deskLength.get(3).add("e");
                deskLength.get(4).add("e");
                deskLength.get(5).add("e");
                deskLength.get(6).add("bP");
                figure = new String();
                figure += "b" + i.getChessFigur((byte) j);
                deskLength.get(7).add(figure);
            }
            desk.add(new ArrayList<>(deskLength));
            figure = "";
            deskLength.clear();
            deskWight.clear();
        }
    }

    public ArrayList<ArrayList<ArrayList<String>>> getDesk() {
        return desk;
    }

    public ArrayList<ArrayList<String>> getDeskLength() {
        return deskLength;
    }

    public ArrayList<String> getDeskWight() {
        return deskWight;
    }

    public void setDesk(ArrayList<ArrayList<ArrayList<String>>> desk) {
        this.desk = desk;
    }

    public void setDeskLength(ArrayList<ArrayList<String>> deskLength) {
        this.deskLength = deskLength;
    }

    public void setDeskWight(ArrayList<String> deskWight) {
        this.deskWight = deskWight;
    }

    public void setFigure(int deskNumber, byte a, byte b, String figure) {
        desk.get(deskNumber).get(a).set(b, figure);
    }

    public String getFigure(int deskNumber, byte a, byte b) {
        return desk.get(deskNumber).get(a).get(b);
    }

    public void removeFigure(ArrayList<ArrayList<String>> desk, int a, int b, int i, int j){
        desk.get(i).set(j, desk.get(a).get(b));
        desk.get(a).set(b, "e");
    }

    public void hitFigure(ArrayList<ArrayList<String>> desk, int a, int b, int i, int j){
        desk.get(i).set(j, desk.get(a).get(b));
        desk.get(a).set(b, "e");
    }

    public void show(int deskNumber) {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += desk.get(deskNumber).get(i) + "\n";
        }
        System.out.println(result);
    }
}
