public class Worker {
    private OnTaskDoneListener doneCallback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener doneCallback, OnTaskErrorListener ErrorCallback){
        this.doneCallback = doneCallback;
        errorCallback = ErrorCallback;
    }

    public void start(){
        for (int i = 0; i < 100; i++) {
            if (i != 33) doneCallback.onDone("Task " + i + " is done");
            else errorCallback.onError("Task " + i + " isn't done");
        }
    }
}
