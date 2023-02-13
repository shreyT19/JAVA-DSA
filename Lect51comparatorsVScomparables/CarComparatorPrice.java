package Lect51comparatorsVScomparables;

import java.util.Comparator;

public class CarComparatorPrice implements Comparator<Cars> {
    public int compare(Cars o1, Cars o2){
        return o2.price -o1.price;
    }
}
