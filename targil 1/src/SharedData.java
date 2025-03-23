import java.util.ArrayList;


/**
 * SharedData is a class that stores the shared data between threads in the
 * subset sum problem. It holds the array of integers, the target sum value,
 * a result array indicating which elements contribute to the sum,
 * and a flag indicating whether a solution has been found.
 * 
 * This class provides synchronization mechanisms to safely coordinate
 * between multiple threads working on the same problem.
 * 
 * 
 * check hhh

 */
public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * creates a SharedData with the specified array and target sum.
     * @param array The ArrayList of integers to check for subset sum a
     * @param b The target sum value to achieve
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the boolean array indicating which elements are part of the solution
     * @return The boolean array where true values indicate elements included in the solution
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array that tracks which elements are part of the solution
     * @param winArray The boolean array where true values indicate elements included in the solution
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the ArrayList containing the integers to check.
     * @return The ArrayList of integers
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * return the target sum value 
     * @return the target sum value of b
     */
    public int getB() {
        return b;
    }

    /**
     * return if solution was foundx
     * @return true if found otherwise false
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * flag indication if the solution was found
     * sync external when calls thread
     *
     * @param flag
     * true if found
     * otherwise false
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}











