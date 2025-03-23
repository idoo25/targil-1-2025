import java.util.ArrayList;

/**
 * 
 */
public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;


    /**
     * @param array - an arrayList of integers
     * @param b - the size of the array
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * @return the winArray
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * @param winArray setting the winning array
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * @return return the arrayList
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * @return flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * @param flag set flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}