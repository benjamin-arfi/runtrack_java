package jour04.job05;

public class job05 extends Thread {
    private int endIndex;
    private int startIndex;

    public job05(int startIndex, int endIndex) {
        this.endIndex = endIndex;
        this.startIndex = startIndex;
    }

    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(i);
        }
    }
}


