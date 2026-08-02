package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDiceRolls {
    public static void main(String[] args) {
        numRollsToTargetFace("",7,8);
    }


    static void numRollsToTarget(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= target && i <= 6; i++) {
            numRollsToTarget(p + i, target - i);
        }
    }


    public static List<String> numRollsToTargetRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= target && i <= 6; i++) {

            list.addAll(numRollsToTargetRet(p + i, target - i));
        }
        return list;
    }


    static void numRollsToTargetFace(String p, int target, int face) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= target && i <= face; i++) {
            numRollsToTarget(p + i, target - i);
        }
    }
}
