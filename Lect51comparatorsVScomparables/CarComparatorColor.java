package Lect51comparatorsVScomparables;

import java.util.Comparator;

public class CarComparatorColor implements Comparator<Cars> {
    public int compare(Cars o1, Cars o2){
        return o1.color.compareTo(o2.color);
    }
}
