package search;

public class Block {
    private int max;
    private int minIdx;
    private int maxIdx;

    public Block() {
    }

    public Block(int max, int minIdx, int maxIdx) {
        this.max = max;
        this.minIdx = minIdx;
        this.maxIdx = maxIdx;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMinIdx() {
        return minIdx;
    }

    public void setMinIdx(int minIdx) {
        this.minIdx = minIdx;
    }

    public int getMaxIdx() {
        return maxIdx;
    }

    public void setMaxIdx(int maxIdx) {
        this.maxIdx = maxIdx;
    }
}
