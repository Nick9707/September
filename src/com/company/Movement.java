package com.company;

import java.util.ArrayList;


public class Movement {

    public static ArrayList<ArrayList<Integer>> possibleMoves(ArrayList<ArrayList<String>> desk, int a, int b) {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        ArrayList<Integer> move = new ArrayList<>();
        String figur = desk.get(a).get(b);

        int i = a;
        int j = b;


        //move for Bishop
        if (figur.equals("wB") || figur.equals(("bB"))) {
            if (i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).equals("e")) {
                while (i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).equals("e")) {
                    i++;
                    j++;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wB") && i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).contains("b")) {
                    move.add(i + 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bB") && i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).contains("w")) {
                    move.add(i + 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                i = a;
                j = b;
            }
            if (i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).equals("e")) {
                while (i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).equals("e")) {
                    i++;
                    j--;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wB") && i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).contains("b")) {
                    move.add(i + 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bB") && i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).contains("w")) {
                    move.add(i + 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                i = a;
                j = b;
            }
            if (i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).equals("e")) {
                while (i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).equals("e")) {
                    i--;
                    j--;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wB") && i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).contains("b")) {
                    move.add(i - 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bB") && i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).contains("w")) {
                    move.add(i - 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                i = a;
                j = b;
            }
            if (i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).equals("e")) {
                while (i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).equals("e")) {
                    i--;
                    j++;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wB") && i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).contains("b")) {
                    move.add(i - 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bB") && i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).contains("w")) {
                    move.add(i - 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
            }
            if (figur.equals("wB") && a + 1 < 8 && b + 1 < 8 && desk.get(a + 1).get(b + 1).contains("b")) {
                move.add(a + 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bB") && a + 1 < 8 && b + 1 < 8 && desk.get(a + 1).get(b + 1).contains("w")) {
                move.add(a + 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wB") && a + 1 < 8 && b - 1 >= 0 && desk.get(a + 1).get(b - 1).contains("b")) {
                move.add(a + 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bB") && a + 1 < 8 && b - 1 >= 0 && desk.get(a + 1).get(b - 1).contains("w")) {
                move.add(a + 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wB") && a - 1 >= 0 && b + 1 < 8 && desk.get(a - 1).get(b + 1).contains("b")) {
                move.add(a - 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bB") && a - 1 >= 0 && b + 1 < 8 && desk.get(a - 1).get(b + 1).contains("w")) {
                move.add(a - 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wB") && a - 1 >= 0 && b - 1 >= 0 && desk.get(a - 1).get(b - 1).contains("b")) {
                move.add(a - 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bB") && a - 1 >= 0 && b - 1 >= 0 && desk.get(a - 1).get(b - 1).contains("w")) {
                move.add(a - 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
        }

        // Paws moves
        if (figur.equals("wP")) {
            if (desk.get(i + 1).get(j).equals("e")) {
                move.add(i + 1);
                move.add(j);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if ((i == 1) && desk.get(i + 2).get(j).equals("e")) {
                move.add(i + 2);
                move.add(j);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
        }
        if (figur.equals("bP")) {
            if (i - 1 >= 0 && desk.get(i - 1).get(j).equals("e")) {
                move.add(i - 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if ((i == 6) && desk.get(i - 2).get(j).equals("e")) {
                move.add(i - 2);
                move.add(j);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
        }

        // Knight moves
        if (figur.equals("wN") || figur.equals("bN")) {
            //forward and right
            if (i + 2 < 8 && j + 1 < 8 && desk.get(i + 2).get(j + 1).equals("e")) {
                move.add(i + 2);
                move.add(j + 1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i + 2 < 8 && j + 1 < 8 && desk.get(i + 2).get(j + 1).contains("b")) {
                move.add(i + 2);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i + 2 < 8 && j + 1 < 8 && desk.get(i + 2).get(j + 1).contains("w")) {
                move.add(i + 2);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            //forward and left
            if (i + 2 < 8 && j - 1 >= 0 && desk.get(i + 2).get(j - 1).equals("e")) {
                move.add(i + 2);
                move.add(j - 1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i + 2 < 8 && j - 1 >= 0 && desk.get(i + 2).get(j - 1).contains("b")) {
                move.add(i + 2);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i + 2 < 8 && j - 1 >= 0 && desk.get(i + 2).get(j - 1).contains("w")) {
                move.add(i + 2);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }

            //left and right
            if (i + 1 < 8 && j - 2 >= 0 && desk.get(i + 1).get(j - 2).equals("e")) {
                move.add(i + 1);
                move.add(j - 2);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i + 1 < 8 && j - 2 >= 0 && desk.get(i + 1).get(j - 2).contains("b")) {
                move.add(i + 1);
                move.add(j - 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i + 1 < 8 && j - 2 >= 0 && desk.get(i + 1).get(j - 2).contains("w")) {
                move.add(i + 1);
                move.add(j - 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }

            //left and left
            if (i - 1 >= 0 && j - 2 >= 0 && desk.get(i - 1).get(j - 2).equals("e")) {
                move.add(i - 1);
                move.add(j - 2);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i - 1 >= 0 && j - 2 >= 0 && desk.get(i - 1).get(j - 2).contains("b")) {
                move.add(i - 1);
                move.add(j - 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i - 1 >= 0 && j - 2 >= 0 && desk.get(i - 1).get(j - 2).contains("w")) {
                move.add(i - 1);
                move.add(j - 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }

            //down and left
            if (i - 2 >= 0 && j - 1 >= 0 && desk.get(i - 2).get(j - 1).equals("e")) {
                move.add(i - 2);
                move.add(j - 1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i - 2 >= 0 && j - 1 >= 0 && desk.get(i - 2).get(j - 1).contains("b")) {
                move.add(i - 2);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i - 2 >= 0 && j - 1 >= 0 && desk.get(i - 2).get(j - 1).contains("w")) {
                move.add(i - 2);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }

            //down and right
            if (i - 2 >= 0 && j + 1 < 8 && desk.get(i - 2).get(j + 1).equals("e")) {
                move.add(i - 2);
                move.add(j + 1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i - 2 >= 0 && j + 1 < 8 && desk.get(i - 2).get(j + 1).contains("b")) {
                move.add(i - 2);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i - 2 >= 0 && j + 1 < 8 && desk.get(i - 2).get(j + 1).contains("w")) {
                move.add(i - 2);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }

            //right and down
            if (i - 1 >= 0 && j + 2 < 8 && desk.get(i - 1).get(j + 2).equals("e")) {
                move.add(i - 1);
                move.add(j + 2);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i - 1 >= 0 && j + 2 < 8 && desk.get(i - 1).get(j + 2).contains("b")) {
                move.add(i - 1);
                move.add(j + 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i - 1 >= 0 && j + 2 < 8 && desk.get(i - 1).get(j + 2).contains("w")) {
                move.add(i - 1);
                move.add(j + 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }

            //right and forward
            if (i + 1 < 8 && j + 2 < 8 && desk.get(i + 1).get(j + 2).equals("e")) {
                move.add(i + 1);
                move.add(j + 2);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wN") && i + 1 < 8 && j + 2 < 8 && desk.get(i + 1).get(j + 2).contains("b")) {
                move.add(i + 1);
                move.add(j + 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bN") && i + 1 < 8 && j + 2 < 8 && desk.get(i + 1).get(j + 2).contains("w")) {
                move.add(i + 1);
                move.add(j + 2);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
        }

// moves for Rook
        if (figur.equals("wR") || figur.equals("bR")) {
            //moving up
            while (i + 1 < 8 && desk.get(i + 1).get(j).equals("e")) {
                move.add(i + 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
                i++;
            }
            if (i + 1 < 8 && figur.equals("wR") && desk.get(i + 1).get(j).contains("b")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i + 1 < 8 && figur.equals("bR") && desk.get(i + 1).get(j).contains("w")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            i = a;

            //moveing down
            while (i - 1 >= 0 && desk.get(i - 1).get(j).equals("e")) {
                move.add(i - 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
                i--;
            }
            if (i - 1 >= 0 && figur.equals("wR") && desk.get(i - 1).get(j).contains("b")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i - 1 >= 0 && figur.equals("bR") && desk.get(i - 1).get(j).contains("w")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            i = a;

            //moving right
            while (j + 1 < 8 && desk.get(i).get(j + 1).equals("e")) {
                move.add(i);
                move.add(j + 1);
                moves.add(new ArrayList<>(move));
                move.clear();
                j++;
            }
            if (j + 1 < 8 && figur.equals("wR") && desk.get(i).get(j + 1).contains("b")) {
                move.add(i);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }
            if (j + 1 < 8 && figur.equals("bR") && desk.get(i).get(j + 1).contains("w")) {
                move.add(i);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }
            j = b;

            //moving left
            while (j - 1 >= 0 && desk.get(i).get(j - 1).equals("e")) {
                move.add(i);
                move.add(j - 1);
                moves.add(new ArrayList<>(move));
                move.clear();
                j--;
            }
            if (j - 1 >= 0 && figur.equals("wR") && desk.get(i).get(j - 1).contains("b")) {
                move.add(i);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }
            if (j - 1 >= 0 && figur.equals("bR") && desk.get(i).get(j - 1).contains("w")) {
                move.add(i);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }

        }
        // i++ j++  //i++ j // i++ j--
        //i j++ //ij        // i j--
        //i-- j++ //i-- j   // i-- j--
        //moves for king
        if (figur.equals("wK") || figur.equals("bK")) {
            if (i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).equals("e")) {
                move.add(i + 1);
                move.add(j + 1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i + 1 < 8 && desk.get(i + 1).get(j).equals("e")) {
                move.add(i + 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).equals("e")) {
                move.add(i + 1);
                move.add(j - 1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (j + 1 < 8 && desk.get(i).get(j + 1).equals("e")) {
                move.add(i);
                move.add(j + 1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (j - 1 >= 0 && desk.get(i).get(j - 1).equals("e")) {
                move.add(i);
                move.add(j - 1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }

            if (i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j + 1).equals("e")) {
                move.add(i - 1);
                move.add(j + 1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i - 1 >= 0 && desk.get(i - 1).get(j).equals("e")) {
                move.add(i - 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).equals("e")) {
                move.add(i - 1);
                move.add(j - 1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            //Castling
            if (a == 0 && b == 3 && desk.get(0).get(2).equals("wR")) {
                move.add(23);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (a == 0 && b == 5 && desk.get(0).get(6).equals("wR")) {
                move.add(56);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
        }

        // queen

        if (figur.equals("wQ") || figur.equals("bQ")) {
            //moving up
            while (i + 1 < 8 && desk.get(i + 1).get(j).equals("e")) {
                move.add(i + 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
                i++;
            }
            if (i + 1 < 8 && figur.equals("wQ") && desk.get(i + 1).get(j).contains("b")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i + 1 < 8 && figur.equals("bQ") && desk.get(i + 1).get(j).contains("w")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            i = a;

            //moveing down
            while (i - 1 >= 0 && desk.get(i - 1).get(j).equals("e")) {
                move.add(i - 1);
                move.add(j);
                moves.add(new ArrayList<>(move));
                move.clear();
                i--;
            }
            if (i - 1 >= 0 && figur.equals("wQ") && desk.get(i - 1).get(j).contains("b")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            if (i - 1 >= 0 && figur.equals("bQ") && desk.get(i - 1).get(j).contains("w")) {
                move.add(i + 1);
                move.add(j);
                move.add(-1);
                moves.add(new ArrayList<>(move));
                move.clear();
            }
            i = a;

            //moving right
            while (j + 1 < 8 && desk.get(i).get(j + 1).equals("e")) {
                move.add(i);
                move.add(j + 1);
                moves.add(new ArrayList<>(move));
                move.clear();
                j++;
            }
            if (j + 1 < 8 && figur.equals("wQ") && desk.get(i).get(j + 1).contains("b")) {
                move.add(i);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }
            if (j + 1 < 8 && figur.equals("bQ") && desk.get(i).get(j + 1).contains("w")) {
                move.add(i);
                move.add(j + 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }
            j = b;

            //moving left
            while (j - 1 >= 0 && desk.get(i).get(j - 1).equals("e")) {
                move.add(i);
                move.add(j - 1);
                moves.add(new ArrayList<>(move));
                move.clear();
                j--;
            }
            if (j - 1 >= 0 && figur.equals("wQ") && desk.get(i).get(j + 1).contains("b")) {
                move.add(i);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }
            if (j - 1 >= 0 && figur.equals("bQ") && desk.get(i).get(j + 1).contains("w")) {
                move.add(i);
                move.add(j - 1);
                move.add(-1);
                moves.add(new ArrayList<>(move));
            }

            if (i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).equals("e")) {
                while (i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).equals("e")) {
                    i++;
                    j++;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wQ") && i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).contains("b")) {
                    move.add(i + 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bQ") && i + 1 < 8 && j + 1 < 8 && desk.get(i + 1).get(j + 1).contains("w")) {
                    move.add(i + 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                i = a;
                j = b;
            }
            if (i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).equals("e")) {
                while (i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).equals("e")) {
                    i++;
                    j--;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wQ") && i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).contains("b")) {
                    move.add(i + 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bQ") && i + 1 < 8 && j - 1 >= 0 && desk.get(i + 1).get(j - 1).contains("w")) {
                    move.add(i + 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                i = a;
                j = b;
            }
            if (i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).equals("e")) {
                while (i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).equals("e")) {
                    i--;
                    j--;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wQ") && i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).contains("b")) {
                    move.add(i - 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bQ") && i - 1 >= 0 && j - 1 >= 0 && desk.get(i - 1).get(j - 1).contains("w")) {
                    move.add(i - 1);
                    move.add(j - 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                i = a;
                j = b;
            }
            if (i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).equals("e")) {
                while (i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).equals("e")) {
                    i--;
                    j++;
                    move.add(i);
                    move.add(j);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("wQ") && i - 1 >= 0 && j + 1 <= 8 && desk.get(i - 1).get(j + 1).contains("b")) {
                    move.add(i - 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
                if (figur.equals("bQ") && i - 1 >= 0 && j + 1 < 8 && desk.get(i - 1).get(j + 1).contains("w")) {
                    move.add(i - 1);
                    move.add(j + 1);
                    move.add(-1);
                    moves.add(new ArrayList<Integer>(move));
                    move.clear();
                }
            }
            if (figur.equals("wQ") && a + 1 < 8 && b + 1 < 8 && desk.get(a + 1).get(b + 1).contains("b")) {
                move.add(a + 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bQ") && a + 1 < 8 && b + 1 < 8 && desk.get(a + 1).get(b + 1).contains("w")) {
                move.add(a + 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wQ") && a + 1 < 8 && b - 1 >= 0 && desk.get(a + 1).get(b - 1).contains("b")) {
                move.add(a + 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bQ") && a + 1 < 8 && b - 1 >= 0 && desk.get(a + 1).get(b - 1).contains("w")) {
                move.add(a + 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wQ") && a - 1 >= 0 && b + 1 < 8 && desk.get(a - 1).get(b + 1).contains("b")) {
                move.add(a - 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bQ") && a - 1 >= 0 && b + 1 < 8 && desk.get(a - 1).get(b + 1).contains("w")) {
                move.add(a - 1);
                move.add(b + 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("wQ") && a - 1 >= 0 && b - 1 >= 0 && desk.get(a - 1).get(b - 1).contains("b")) {
                move.add(a - 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
            if (figur.equals("bQ") && a - 1 >= 0 && b - 1 >= 0 && desk.get(a - 1).get(b - 1).contains("w")) {
                move.add(a - 1);
                move.add(b - 1);
                move.add(-1);
                moves.add(new ArrayList<Integer>(move));
                move.clear();
            }
        }
        return moves;
    }


}
