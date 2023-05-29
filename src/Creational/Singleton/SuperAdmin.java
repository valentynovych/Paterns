package Creational.Singleton;

public class SuperAdmin {
    private static SuperAdmin superAdmin;
    private static int counter = 0;
    private SuperAdmin(){
        counter++;
    }

    public static synchronized SuperAdmin getSuperAdmin() {
        if (superAdmin == null){
            superAdmin = new SuperAdmin();
        }
        return superAdmin;
    }

    public static int getCounter() {
        return counter;
    }
}
