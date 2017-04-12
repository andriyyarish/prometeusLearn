package module2;

import org.testng.annotations.Test;

/**
 * Created by Andriy_Yarish on 4/10/2017.
 */
public class MergeSortTest {

    MergeSort mergeSort;
    @Test
    public void test1(){
        int[] ar1 = {2, 4, 5, 7};
        int[] ar2 = {1, 2, 3, 6};
        mergeSort = new MergeSort();
        int[] margeResult = mergeSort.marge(ar1, ar2);
        for (int i = 0; i < margeResult.length; i++) {
            System.out.println(margeResult[i]);
        }

    }

}
