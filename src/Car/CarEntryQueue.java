package Car;

public class CarEntryQueue extends CarQueue {

    private int entrySpeed;

    /**
     * Constructor for the CarEntryQueue with one parameter.
     * @param entrySpeed an integer deciding the speed of how fast cars enter the queue before entry.
     */
    public CarEntryQueue(int entrySpeed) {
        this.entrySpeed = entrySpeed;
    }

    /**
     *
     * @return the integer the entrySpeed is set to.
     */
    public int getEntrySpeed() {
        return entrySpeed;
    }
}
