class Device implements Runnable{
    private String name;
    private String type;
    private Router router;
    private Output output;

    public Device(String name, String type, Router router,Output output) {
        this.name = name;
        this.type = type;
        this.router = router;
        this.output=output;
    }

    @Override
    public void run() {
        try {
            router.connect(this);
            String out="- Connection " + router.connectionCount + ": " + GetName() + " login";
            output.writeToFile(out);
            output.flush();
            router.performOnlineActivity(this);
            router.release(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String GetName() {
        return this.name;
    }

    public String getType() {
        return type;
    }
}