import java.util.LinkedList;
import java.util.Queue;

class Router {
    private Queue<Device> connections;
    private Semaphore semaphore;
    protected int connectionCount;
    private Output output;

    public Router(int maxConnections,Output output) {
        this.semaphore = new Semaphore(maxConnections,output);
        this.connections = new LinkedList<>();
        this.output=output;
        this.connectionCount = 0;
    }

    public void connect(Device device) throws InterruptedException {
        semaphore.acquire(device);
        connections.add(device);
        Thread.sleep((long) (Math.random() * 3000)); // Simulate online activity
        String out="- Connection " + (connectionCount+1)+ ": " + device.GetName() + " Occupied";
        output.writeToFile(out);
        output.flush();
        connectionCount++;
    }

    public void performOnlineActivity(Device device) throws InterruptedException {
        String out ="- Connection " + connectionCount+ ": " + device.GetName() + " performs online activity";
        output.writeToFile(out);
        output.flush();
        Thread.sleep((long) (Math.random() * 3000));
    }

    public void release(Device device) {
        connections.remove(device);
        semaphore.release();
        connectionCount--;
        String out="- Connection " + (connectionCount+1) + ": " + device.GetName() + " Logged out";
        output.writeToFile(out);
        output.flush();
    }
}