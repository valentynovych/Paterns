package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class ToolBox implements Tool {
    private final List<Tool> tools = new ArrayList<>();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public void addTool(Tool tool){
        tools.add(tool);
    }

    public void removeTool(Tool tool){
        tools.remove(tool);
    }

    @Override
    public void take() {
        System.out.println("I`m take tool box with tools inside");
        for (Tool tool : tools){
            if (tool instanceof ToolBox){
                System.out.println(ANSI_GREEN + "\t I`m have tool box inside me - - - - \n\t{" + ANSI_RESET);
            }
            tool.take();
        }
        System.out.println(ANSI_YELLOW + "\t} \nTool box is empty" + ANSI_RESET);
    }
}
