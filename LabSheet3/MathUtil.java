package LabSheet3;

public class MathUtil {
    public int sum(int... nums) {
        int total = 0;
        for (int n : nums) total += n;
        return total;
    }
}
