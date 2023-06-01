package Structural.Proxy;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProxyServer implements Server {
    private RealServer realServer;

    public ProxyServer(String serverName) {
        this.realServer = new RealServer(serverName);
    }

    @Override
    public void login() {
        System.out.print(logAction());
        realServer.login();
    }

    @Override
    public void updateData() {
        System.out.print(logAction());
        realServer.updateData();
    }

    @Override
    public void logout() {
        System.out.print(logAction());
        realServer.logout();
    }

    private String logAction(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String log = "\u001B[33m INFO: ";
        log += dateFormatter.format(LocalDateTime.now()) + "\t";
        log += "The user performs some actions: \u001B[0m";

        return log;
    }
}
