package com.company;

import java.util.ArrayList;

public class WorkWithUnicDesks {
    WorkWithUnicDesks(FullDesk fullDesk){
        for (ArrayList<ArrayList<String>> desk : fullDesk.getDesk()){
            Tree tree = new Tree(desk);
        }
    }
}
