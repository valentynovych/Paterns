package Structural.Composite;

public class ToolsCompositor extends ToolBox {
    public static void main(String[] args) {

        Tool tool = new Screwdriver();
        Tool tool1 = new Screwdriver();
        Tool tool2 = new Screwdriver();
        Tool tool3 = new Hammer();
        Tool tool4 = new Hammer();
        Tool tool5 = new Hammer();
        Tool tool6 = new Wrench();
        Tool tool7 = new Wrench();
        Tool tool8 = new Wrench();
        Tool tool9 = new Wrench();

        ToolBox toolBox = new ToolBox();
        ToolBox toolBox1 = new ToolBox();
        ToolBox toolBox2 = new ToolBox();

        toolBox.addTool(tool);
        toolBox.addTool(tool1);
        toolBox.addTool(tool2);

        toolBox1.addTool(tool3);
        toolBox1.addTool(tool4);
        toolBox1.addTool(tool5);

        toolBox2.addTool(tool6);
        toolBox2.addTool(tool7);
        toolBox2.addTool(tool8);
        toolBox2.addTool(tool9);

        toolBox.addTool(toolBox1);
        toolBox1.addTool(toolBox2);

        toolBox.take();
    }
}
