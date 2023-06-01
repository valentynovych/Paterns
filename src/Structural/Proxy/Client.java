package Structural.Proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Server server = new ProxyServer("Hostpro");
        System.out.println("Enter number some operation\n" +
                "\t1) - Login to server\n" +
                "\t2) - Update some data in the server\n" +
                "\t3) - Logout server\n" +
                "\t0) - close this menu");
        interactive(server);
    }
    public static void interactive(Server server){
        Scanner scanner = new Scanner(System.in);

        int action;
        do {

            action = scanner.nextInt();
            switch (action) {
                case 1:
                    server.login();
                    break;
                case 2:
                    server.updateData();
                    break;
                case 3:
                    server.logout();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please entre number action (1-3) or 0 for exit");
             }
        }  while (action < 1) ;
        if (action >= 1){
            interactive(server);
        }

            }
        }

