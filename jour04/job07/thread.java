package jour04.job07;

public class thread extends Thread{
    private int[] tableau;
    private int endIndex;
    private int startIndex;
    private int sum = 0;
    public thread(int[] tableau,int startIndex, int endIndex) {
        this.endIndex = endIndex;
        this.startIndex = startIndex;
        this.tableau = tableau;
    }
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            sum +=tableau [i];
        }
    }
    public int getsum() {
        return sum;
    }
}
