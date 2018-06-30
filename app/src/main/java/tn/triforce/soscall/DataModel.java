package tn.triforce.soscall;

/**
 * Created by anupamchugh on 11/02/17.
 */

public class DataModel {


    public int text;
    public int drawable;
    public int color;
    public String emergencyNumber;

    public DataModel(int text, int drawable, int color, String emergencyNumber) {
        this.text = text;
        this.drawable = drawable;
        this.color = color;
        this.emergencyNumber = emergencyNumber;
    }
}
