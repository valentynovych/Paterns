package Creational.Builder;

public class BuildTableRunner {
    public static void main(String[] args) {
        BuildMaster buildMaster = new BuildMaster();

        buildMaster.setTableBuilder(new ComputerTableBuilder());
        Table computerTable = buildMaster.buildTable();
        System.out.println(computerTable);

        System.out.println("- - - - - - - - - - - -");

        buildMaster.setTableBuilder(new IndustrialTableBuilder());
        Table industrialTable = buildMaster.buildTable();
        System.out.println(industrialTable);
    }
}
