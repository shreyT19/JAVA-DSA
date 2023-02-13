package Lect51comparatorsVScomparables;

import java.util.Comparator;

public class CarComparatorSpeed implements Comparator<Cars> {
      public int compare(Cars o1, Cars o2){
          return o1.speed-o2.speed;
      }
}
