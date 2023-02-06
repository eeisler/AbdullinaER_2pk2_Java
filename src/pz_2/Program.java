package src.pz_2;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        Random rnd = new Random();

        for(int i = 0; i < 50; ++i) {
            source.add(rnd.nextInt(-100, 100));
        }

        SplitArray split = new SplitArray(source, new ArrayList<Integer>(), new ArrayList<Integer>());

        System.out.println("Source array: ");
        for(Integer i : source){
            System.out.println(i);
        }

        System.out.println("Positive numbers: ");
        split.printPositive();
        System.out.println("\nNegative numbers: ");
        split.printNegative();
    }
}
