package iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hello {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";
        String[] str1= str.split("");

        String str2 = "1234543278908754";
        String[] str3= str2.split("");

        int[] intArray = Arrays.stream(str3)
                .mapToInt(Integer::parseInt)
                .toArray();


        System.out.println(Collections.frequency (Arrays.asList(str1),"b"));

        System.out.println(Arrays.toString(intArray));
        System.out.println(Collections.frequency (Arrays.asList(intArray),1));

        //int max= Collections.

    }

}
