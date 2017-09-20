package com.company;

public class Main {

    public static void main(String[] args) {
        InitialChessDesk chessDesk = new InitialChessDesk();
        FullDesk fullDesk = new FullDesk(chessDesk);
    }
}
