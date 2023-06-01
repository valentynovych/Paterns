package Structural.Flyweigth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CheckersField {
    public static void main(String[] args) {

        CheckerFactory checkerFactory = new CheckerFactory();
        List<Checker> checkerList = new ArrayList<>();

        for (int i = 0; i < 12; i++){
            checkerList.add(checkerFactory.getChecker("Black"));
            checkerList.add(checkerFactory.getChecker("White"));
        }

        Random random = new Random();
        for (Checker checker : checkerList){
            checker.position(random.nextInt(10), random.nextInt(10));
        }
    }
}
