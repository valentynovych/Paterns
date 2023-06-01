package Structural.Flyweigth;

import java.util.HashMap;
import java.util.Map;

public class CheckerFactory {
    private static final Map<String, Checker> checkers = new HashMap<>();

    public Checker getChecker(String color){
        Checker checker = checkers.get(color);
        if (checker == null){
            switch (color){
                case "White":
                    checker = new WhiteChecker(color);
                    break;
                case "Black":
                    checker = new BlackChecker(color);
                    break;
                default: throw new RuntimeException("Cant creat checker with color " + color);
            }
            checkers.put(color, checker);
        }
        return checker;
    }
}
