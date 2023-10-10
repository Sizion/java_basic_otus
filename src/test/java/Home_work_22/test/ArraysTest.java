package Home_work_22.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static home_work_22.Main.*;


public class ArraysTest {

    public static Stream<Arguments> getArrayAfterOneData() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 2, 1, 2, 2}, new int[]{2, 2}));
        out.add(Arguments.arguments(new int[]{1, 0, 0, 2, 2, 1, 2, 1, 0, 0, 0, 0,}, new int[]{0, 0, 0, 0}));
        return out.stream();
    }

    @MethodSource("getArrayAfterOneData")
    @ParameterizedTest
    public void getArrayAfterOneTest(int[] a, int[] res) {
        Assertions.assertEquals(Arrays.toString(res), Arrays.toString(getArrayAfterOne(a)));
        Assertions.assertThrows(RuntimeException.class, () -> {
            getArrayAfterOne(new int[]{2, 2, 2, 2, 2, 2, 2});
        });
    }

//    @Test
//    public void getArrayAfterOneTestExc() {
//        Assertions.assertThrows(RuntimeException.class, () -> {
//            getArrayAfterOne(new int[]{2, 2, 2, 2, 2, 2, 2});
//        });
//    }

    public static Stream<Arguments> existsOnlyOneTwoArrayData() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 3}, false));
        out.add(Arguments.arguments(new int[]{1, 2}, true));
        out.add(Arguments.arguments(new int[]{1, 1}, false));
        out.add(Arguments.arguments(new int[]{2, 2, 2, 2, 2}, false));
        out.add(Arguments.arguments(new int[]{1, 2, 2, 1}, true));
        return out.stream();
    }

    @MethodSource("existsOnlyOneTwoArrayData")
    @ParameterizedTest
    public void existsOnlyOneTwoArrayTest(int[] b, boolean res) {
        Assertions.assertEquals(res, existsOnlyOneTwoArray(b));
    }
}
