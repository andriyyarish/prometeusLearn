package module2;

/**
 * Created by Andriy_Yarish on 4/10/2017.
 */
public class MergeSort {



    public int [] marge(int [] left, int [] right){
        int[] res = new int[left.length + right.length];

        int leftIter = 0;
        int rightIter = 0;

        for (int i = 0; i < left.length + right.length -1; i++){
            int a = left[leftIter];
            int b = right[rightIter];

            if (a <= b){
                res[i] = a;
                leftIter += 1;
            }else{
              res[i] = b;
              rightIter +=1;
            }
        }
        return res;
    }
}
