package com.company;


import java.util.ArrayList;

import static com.company.Movement.*;

public class Main {

    public static void main(String[] args) {
        InitialChessDesk chessDesk = new InitialChessDesk();
        FullDesk fullDesk = new FullDesk(chessDesk);
        //System.out.println(fullDesk.getDesk().get(0));
        Tree tree = new Tree(fullDesk.getDesk().get(0));
        tree.firstMoveWhite();
        System.out.println(tree.getIsMate());
//        WorkWithUnicDesks workWithUnicDesks = new WorkWithUnicDesks(fullDesk);
//        fullDesk.show(0);
//        System.out.println(possibleMoves(fullDesk.getDesk().get(0), 0,0));

    }

}
