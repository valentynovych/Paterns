package Structural.Proxy;

public class RealServer implements Server {

    private final String serverName;

    public RealServer(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void login() {
        System.out.println("Login in " + serverName + " success");
    }

    @Override
    public void updateData() {
        System.out.println("Update data on " + serverName + " success");
    }

    @Override
    public void logout() {
        System.out.println("Goodbye my friend, we a welcome to " + serverName + " again" );
    }
}
