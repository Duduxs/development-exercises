package leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandomO1 {

   static class RandomizedSet {

        List<Integer> data = new ArrayList<>();
        Random random = new Random();
        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (data.contains(val)) {
                return false;
            }
            return data.add(val);
        }

        public boolean remove(int val) {
            if (data.contains(val)) {
                data.remove((Object)val);
                return true;
            }
            return false;
        }

        public int getRandom() {
            return data.get(random.nextInt(data.size()));
        }
    }

    public static void main(String[] args) {
        var set = new RandomizedSet();
        set.insert(1);
        set.remove(2);
        set.insert(2);
        set.getRandom();
        set.remove(1);
        set.insert(2);
        set.getRandom();
    }

}
