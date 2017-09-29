package com.company;

import java.util.ArrayList;

import static com.company.Movement.*;


public class Tree {
    private ArrayList<ArrayList<ArrayList<String>>> allMoves = new ArrayList<>();
    private ArrayList<ArrayList<String>> mainDesk = new ArrayList<>();  //desk which is current(taken)
    private ArrayList<ArrayList<String>> currentDesk = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
    private ArrayList<ArrayList<String>> nextDesk = new ArrayList<>();  //desk which will be next(transmite)

    private boolean isMate = true;
    private ArrayList<ArrayList<String>> getMainDesk(){return mainDesk;}
    public boolean getIsMate(){return isMate;}

    Tree(ArrayList<ArrayList<String>> desk) {
        this.mainDesk = desk;
        this.currentDesk = desk;
    }


    public void firstMoveWhite() {             //first white move
        for (int i = 0; i < 2; i++) {                                               //check figure in first 2 lines
            for (int j = 0; j < 8; j++) {                                           //check every figure in lines
                moves = new ArrayList<>(possibleMoves(new ArrayList<>(mainDesk), i, j));             //check possible moves for every figur
                if (!moves.isEmpty()) {                                             // if moves mot empty
                    for (ArrayList<Integer> move : moves) {                         //for all move in moves
                        if (move.size() == 1) {  //castling                         //make castling
                            if (move.get(0) == 23) {                                //short castling
                                currentDesk.get(i).set(j, "wR");                    //set wR
                                currentDesk.get(i).set(2, "wK");                    //set wK
                                firstMoveBlack(new ArrayList<ArrayList<String>>(currentDesk)); //go to the another metod whith next move
                                currentDesk = mainDesk;
//                                if (!isMate) continue;
                            }
                            if (move.get(0) == 56) {
                                currentDesk.get(i).set(j, "wR");
                                currentDesk.get(i).set(5, "wK");
                                firstMoveBlack(new ArrayList<ArrayList<String>>(currentDesk));
                                currentDesk = mainDesk;
//                                if (!isMate) continue;
                            }
                        }
                        if (move.size() == 2) {                  //remove
                            currentDesk.get(move.get(0)).set(move.get(1), currentDesk.get(i).get(j));
                            currentDesk.get(i).set(j, "e");
                            firstMoveBlack(new ArrayList<ArrayList<String>>(currentDesk));
                            currentDesk = mainDesk;
//                            if (!isMate) continue;
                        }
                        if (move.size() == 3) {                  //hit
                            currentDesk.get(move.get(0)).set(move.get(1), currentDesk.get(i).get(j));
                            currentDesk.get(i).set(j, "e");
                            firstMoveBlack(new ArrayList<ArrayList<String>>(currentDesk));
                            currentDesk = mainDesk;
//                            if (!isMate) continue;
                        }
                    }
                }
                currentDesk = mainDesk;
            }
        }
    }

    private void firstMoveBlack(ArrayList<ArrayList<String>> deskfirst) {
        ArrayList<ArrayList<String>> firstMoveDesk = new ArrayList<>(deskfirst);
        ArrayList<ArrayList<String>> firstMoveDeskBackup = new ArrayList<>(deskfirst);
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ArrayList<ArrayList<Integer>> moves = new ArrayList<>(possibleMoves(deskfirst, i, j));
                if (!moves.isEmpty()) {
                    for (ArrayList<Integer> move : moves) {
                        if (moves.size() == 1) {                  //castling
                            System.out.println("something going wrong");
//                        if (moves.get(0) == 23) {
//                            currentDesk.get(i).set(j, "wR");
//                            currentDesk.get(i).set(2, "wK");
//                            firstMoveBlack(new ArrayList<ArrayList<String>>(currentDesk));
//                        }
//                        if (moves.get(0) == 56) {
//                            currentDesk.get(i).set(j, "wR");
//                            currentDesk.get(i).set(5, "wK");
//                            firstMoveBlack(new ArrayList<ArrayList<String>>(currentDesk));
//                        }
                        }
                        if (move.size() == 2) {                  //remove
                            firstMoveDesk.get(move.get(0)).set(move.get(1), firstMoveDesk.get(i).get(j));
                            firstMoveDesk.get(i).set(j, "e");
                            secondMoveWhite(new ArrayList<ArrayList<String>>(firstMoveDesk));
                            firstMoveDesk = firstMoveDeskBackup;
//                            if (isMate) return;
                        }
                        if (move.size() == 3) {                  //hit
                            firstMoveDesk.get(move.get(0)).set(move.get(1), firstMoveDesk.get(i).get(j));
                            firstMoveDesk.get(i).set(j, "e");
                            secondMoveWhite(new ArrayList<ArrayList<String>>(firstMoveDesk));
                            firstMoveDesk = firstMoveDeskBackup;
//                            if (isMate) return;
                        }
                    }
                }
                firstMoveDesk = firstMoveDeskBackup;
            }
        }
    }

    private void secondMoveWhite(ArrayList<ArrayList<String>> deskSecond) {
        ArrayList<ArrayList<String>> seconMoveWhiteDesk = new ArrayList<>(deskSecond);
        ArrayList<ArrayList<String>> seconMoveWhiteDeskBackup = new ArrayList<>(deskSecond);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                ArrayList<ArrayList<Integer>> moves = new ArrayList<>(possibleMoves(deskSecond, i, j));
                if (!moves.isEmpty()) {
                    for (ArrayList<Integer> move : moves) {
                        if (move.size() == 1) {  //castling
                            if (move.get(0) == 23) {
                                seconMoveWhiteDesk.get(i).set(j, "wR");
                                seconMoveWhiteDesk.get(i).set(2, "wK");
                                secondMoveBlack(new ArrayList<ArrayList<String>>(seconMoveWhiteDesk));
                                seconMoveWhiteDesk = seconMoveWhiteDeskBackup;
//                                if (!isMate) return;
                            }
                            if (move.get(0) == 56) {
                                seconMoveWhiteDesk.get(i).set(j, "wR");
                                seconMoveWhiteDesk.get(i).set(5, "wK");
                                secondMoveBlack(new ArrayList<ArrayList<String>>(seconMoveWhiteDesk));
                                seconMoveWhiteDesk = seconMoveWhiteDeskBackup;
//                                if (!isMate) return;
                            }
                        }
                        if (move.size() == 2) {                  //remove
                            seconMoveWhiteDesk.get(move.get(0)).set(move.get(1), seconMoveWhiteDesk.get(i).get(j));
                            seconMoveWhiteDesk.get(i).set(j, "e");
                            secondMoveBlack(new ArrayList<ArrayList<String>>(seconMoveWhiteDesk));
                            seconMoveWhiteDesk = seconMoveWhiteDeskBackup;
//                            if (!isMate) return;
                        }
                        if (move.size() == 3) {                  //hit
                            seconMoveWhiteDesk.get(move.get(0)).set(move.get(1), seconMoveWhiteDesk.get(i).get(j));
                            seconMoveWhiteDesk.get(i).set(j, "e");
                            secondMoveBlack(new ArrayList<ArrayList<String>>(seconMoveWhiteDesk));
                            seconMoveWhiteDesk = seconMoveWhiteDeskBackup;
//                            if (!isMate) return;
                        }
                    }
                }
                seconMoveWhiteDesk = seconMoveWhiteDeskBackup;
            }
        }

    }

    private void secondMoveBlack(ArrayList<ArrayList<String>> deskSeconBlack) {
        ArrayList<ArrayList<String>> seconMoveBlackDesk = new ArrayList<>(deskSeconBlack);
        ArrayList<ArrayList<String>> seconMoveBlackBeckup = new ArrayList<>(deskSeconBlack);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (deskSeconBlack.get(i).get(j).contains("b")) {
                    ArrayList<ArrayList<Integer>> moves = new ArrayList<>(possibleMoves(deskSeconBlack, i, j));
                    if (!moves.isEmpty()) {
                        for (ArrayList<Integer> move : moves) {
                            if (move.size() == 1) {  //castling
                                System.out.println("something going wrong");
//                                if (move.get(0) == 23) {
//                                    seconMoveWhiteDesk.get(i).set(j, "wR");
//                                    seconMoveWhiteDesk.get(i).set(2, "wK");
//                                    secondMoveBlack(new ArrayList<ArrayList<String>>(seconMoveWhiteDesk));
//                                }
//                                if (move.get(0) == 56) {
//                                    seconMoveWhiteDesk.get(i).set(j, "wR");
//                                    seconMoveWhiteDesk.get(i).set(5, "wK");
//                                    secondMoveBlack(new ArrayList<ArrayList<String>>(seconMoveWhiteDesk));
//                                }
                            }
                            if (move.size() == 2) {                  //remove
                                seconMoveBlackDesk.get(move.get(0)).set(move.get(1), seconMoveBlackDesk.get(i).get(j));
                                seconMoveBlackDesk.get(i).set(j, "e");
                                isMate = isMate(new ArrayList<ArrayList<String>>(seconMoveBlackDesk));
                                seconMoveBlackDesk = seconMoveBlackBeckup;
                                //if(!isMate) continue;
                            }
                            if (move.size() == 3) {                  //hit
                                seconMoveBlackDesk.get(move.get(0)).set(move.get(1), seconMoveBlackDesk.get(i).get(j));
                                seconMoveBlackDesk.get(i).set(j, "e");
                                isMate = isMate(new ArrayList<ArrayList<String>>(seconMoveBlackDesk));
                                seconMoveBlackDesk = seconMoveBlackBeckup;
                               // if (!isMate) continue;
                            }
                        }
                    }
                }
                seconMoveBlackDesk = seconMoveBlackBeckup;
            }
        }
    }

    private boolean isMate(ArrayList<ArrayList<String>> deskMate) {
        ArrayList<Integer> kingPosition = new ArrayList<>(2);
        ArrayList<ArrayList<Integer>> moves;
        ArrayList<ArrayList<Integer>> forMoves;
        String figure = "";


        //Where is King?
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (deskMate.get(i).get(j).equals("wK")) {
                    kingPosition.add(i);
                    kingPosition.add(j);
                }

            }
        }
        if (kingPosition.isEmpty()){
            System.out.println(getMainDesk());
            System.out.println("something wrong with king");
        }
        if (!possibleMoves(deskMate, kingPosition.get(0), kingPosition.get(1)).isEmpty()) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (deskMate.get(i).get(j).contains("b")) {
                        moves = new ArrayList<>(possibleMoves(deskMate, i, j));
                        forMoves = new ArrayList<>(moves);
                        for (ArrayList<Integer> move : forMoves) {
                            if (move.size() == 3) {
                                if (move.get(0).equals(kingPosition.get(0))) {
                                    if (move.get(1).equals(kingPosition.get(1))) {

                                        ArrayList<Integer> figurPosition = new ArrayList<>();
                                        figurPosition.add(i);
                                        figurPosition.add(j);
                                        figure = deskMate.get(i).get(j);
                                        if (figure.equals("bB")) {
                                            for (ArrayList<Integer> someMoves : forMoves) {

                                                if (someMoves.get(0) > figurPosition.get(0)) {  //upper then bishop
                                                    moves.remove(someMoves);
                                                }
                                                if (figurPosition.get(1) < kingPosition.get(1)) { //left from king
                                                    if (someMoves.get(1) < figurPosition.get(1)) {
                                                        moves.remove(someMoves);
                                                    }
                                                }
                                                if (figurPosition.get(1) > kingPosition.get(1)) { //right from king
                                                    if (someMoves.get(1) > figurPosition.get(1)) {
                                                        moves.remove(someMoves);
                                                    }
                                                }
                                            }
                                            //now we have moves to mate for Bishop
                                            for (int q = 0; q < 8; q++) {
                                                for (int w = 0; w < 8; w++) {
                                                    if (deskMate.get(i).get(j).contains("w")) {
                                                        ArrayList<ArrayList<Integer>> movesForWhite = new ArrayList<>(possibleMoves(deskMate, i, j));
                                                        for (ArrayList<Integer> movesFor : movesForWhite) {
                                                            for (ArrayList<Integer> mov : moves) {
                                                                if (movesFor.get(0).equals(mov.get(0)) && movesFor.get(1).equals(mov.get(1))) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (figure.equals("bQ")) {
                                            for (ArrayList<Integer> someMoves : moves) {
                                                if (someMoves.get(0) > figurPosition.get(0)) {  //upper then bishop
                                                    moves.remove(someMoves);
                                                }
                                                if (figurPosition.get(0) != kingPosition.get(0)) {
                                                    if (someMoves.get(0) == figurPosition.get(0)) {
                                                        moves.remove(someMoves);
                                                    }
                                                }
                                                if (figurPosition.get(1) != kingPosition.get(1)) {
                                                    if (someMoves.get(1) == figurPosition.get(1)) {
                                                        moves.remove(someMoves);
                                                    }
                                                }
                                                if (figurPosition.get(1) < kingPosition.get(1)) { //left from king
                                                    if (someMoves.get(1) < figurPosition.get(1)) {
                                                        moves.remove(someMoves);
                                                    }
                                                }
                                                if (figurPosition.get(1) > kingPosition.get(1)) { //right from king
                                                    if (someMoves.get(1) > figurPosition.get(1)) {
                                                        moves.remove(someMoves);
                                                    }
                                                }
                                            }
                                            //now we have moves to mate for Bishop
                                            for (int q = 0; q < 8; q++) {
                                                for (int w = 0; w < 8; w++) {
                                                    if (deskMate.get(i).get(j).contains("w")) {
                                                        ArrayList<ArrayList<Integer>> movesForWhite = new ArrayList<>(possibleMoves(deskMate, i, j));
                                                        for (ArrayList<Integer> movesFor : movesForWhite) {
                                                            for (ArrayList<Integer> mov : moves) {
                                                                if (movesFor.get(0).equals(mov.get(0)) && movesFor.get(1).equals(mov.get(1))) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        if (!figure.equals("bQ") && !figure.equals("bB")) {
                                            System.out.println(figure + "something going wrong whith chacking figure");
                                        }


                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

//    public ArrayList<ArrayList<Integer>> movesToMate(ArrayList<ArrayList<String>> desk, ArrayList<ArrayList<Integer>> moves, String figure, ArrayList<Integer> figurePosition) {
//        ArrayList<ArrayList<Integer>> movesToMate = new ArrayList<>();
//
//        if (figure.equals("bB")) {
//            for (ArrayList<Integer> move : moves) {
//                if (move.get(0) > figurePosition.get(0)) {  //upper then bishop
//                    moves.remove(move);
//            }
//                if (figurePosition.get(1) < k)
//        }
//
//        return movesToMate;
//    }
}
