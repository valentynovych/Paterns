package Creational.Singleton;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CheckAccess {
    public static void main(String[] args) {


        SuperAdmin superAdmin = SuperAdmin.getSuperAdmin();
        SuperAdmin superAdmin1 = SuperAdmin.getSuperAdmin();
        SuperAdmin superAdmin2 = SuperAdmin.getSuperAdmin();

        System.out.println(superAdmin);
        System.out.println(superAdmin1);
        System.out.println(superAdmin2);

        System.out.println("Створено екземплярів класу SuperAdmin : " + SuperAdmin.getCounter());

    }
}
