import java.util.*;

public class SequentialPutReversed {

    static long time(Integer[] store) {
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        long start = System.nanoTime();
        for (int i: store) {
            tm.put(i, i);
        }
        long end = System.nanoTime();
        return (end-start);
    }

    public static void main(String[] args) {
        int n, trial;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);
            trial = 5;
        } else if (args.length == 2) {
            n = Integer.parseInt(args[0]);
            trial = Integer.parseInt(args[1]);
        } else {
            throw new RuntimeException("must have 1 or 2 args");
        }

        Integer[] store = new Integer[n];
        for (int i = n-1 ; i >= 0; i--) {
            store[i] = i;
        }
        
        long result = 0;
        for (int i = 0; i < trial ; i++) {
            result += time(store);
        }
        result /= trial;
        System.out.println("SequentialPutReversed "+n+" entries ("+trial+" trial avg): "+((float) result)/1000000+"ms");
    }

}
