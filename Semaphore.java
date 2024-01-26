class Semaphore {
    private int permits;
    private Output output;

    public Semaphore(int permits, Output output) {
        this.permits = permits;
        this.output = output;
    }

    public synchronized void acquire(Device device) throws InterruptedException {
        boolean flag=false;
        while (permits == 0) {
            String out = "- " + device.GetName() + "(" + device.getType() + ")" + " arrived and waiting";
            flag=true;
            output.writeToFile(out);
            output.flush();
            wait();
        }
        permits--;
        if(!flag) {
            String out = "- " + device.GetName() + "(" + device.getType() + ")" + " arrived";
            output.writeToFile(out);
            output.flush();
        }
    }

    public synchronized void release() {
        permits++;
        notify();
    }
}


