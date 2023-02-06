package src.pz_2;

import java.util.ArrayList;
import java.util.Collections;

public class SplitArray {
    ArrayList<Integer> source;
    ArrayList<Integer> positive;
    ArrayList<Integer> negative;
    public SplitArray(ArrayList<Integer> source, ArrayList<Integer> positive, ArrayList<Integer> negative) {
        this.source = source;
        this.positive = positive;
        this.negative = negative;

        for(Integer i : source) {
            if (i > 0){
                this.positive.add(i);
            }
            else if (i < 0){
                this.negative.add(i);
            }
        }

        Collections.sort(positive);
        Collections.sort(negative);
    }

    public void printPositive(){
        for (Integer i : positive) {
            System.out.println(i);
        }
    }
    public void printNegative(){
        for (Integer i : negative) {
            System.out.println(i);
        }
    }
}
