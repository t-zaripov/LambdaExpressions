public class Main {
    public static void main(String[] args) {
        OnTaskErrorListener errorListener = System.out::println;
        OnTaskDoneListener doneListener = System.out::println;
        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}
