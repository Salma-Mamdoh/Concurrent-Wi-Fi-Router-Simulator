import java.util.Scanner;
public class Network {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the number of WI-FI Connections?");
        int N= scanner.nextInt();

        System.out.println("What is the number of devices Clients want to connect?");
        int totalDevices = scanner.nextInt();
        Output output=new Output();
        Router router = new Router(N,output);
        System.out.println("Enter the name and type of device (e.g., C1 mobile): ");
        for (int i = 0; i < totalDevices; i++) {
            String name = scanner.next();
            String type = scanner.next();
            Device device = new Device(name, type, router,output);
            Thread thread = new Thread(device);
            thread.start();
        }
        scanner.close();
    }
}





