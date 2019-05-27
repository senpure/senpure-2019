package model.bean;

/**
 * @author senpure
* @time 2019-5-18 14:41:36
*/
public enum Sexy {
    X(1),
    Y(2),
    UNKNOWN(-1);

    private int value;

    Sexy(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static Sexy  getSexy (int value) {
        switch(value){
        case 1:
            return X;
        case 2:
            return Y;
        default:
            return UNKNOWN;
        }
    }

    public static final int X_VALUE = 1;
    public static final int Y_VALUE = 2;
}