package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        if (t1.getHp() > t2.getHp()) {
            return t1;
        } else if (t1.getHp() < t2.getHp()) {
            return t2;
        } else {
            return t1;
        }
    }

}