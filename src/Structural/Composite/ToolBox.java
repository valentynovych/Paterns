package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class ToolBox implements Tool {
    private List<Tool> tools = new ArrayList<>();

    public void addTool(Tool tool){
        tools.add(tool);
    }

    public void removeTool(Tool tool){
        tools.remove(tool);
    }

    @Override
    public void take() {
        System.out.println("- - - I`m take tool box with tools inside");
        for (Tool tool : tools){
            if (tool instanceof ToolBox){
                System.out.println("\t- - - - I`m have tool box inside me - - - -");
            }
            tool.take();
        }
        System.out.println("- - - Tool box is empty");

    }
}
