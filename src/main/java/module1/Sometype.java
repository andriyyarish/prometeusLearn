package module1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Andriy_Yarish on 6/14/2016.
 */
public class Sometype<T> {

    public static void main(String[] args) {
        Sometype<Object> sometype = new Sometype();
        List<String> list = Arrays.asList("value");
        sometype.test(list);
    }
    public <E> void test(Collection<E> collection){

        for (E e: collection){
            System.out.println(e);
        }
    }

    public void test(List<Integer> integerList){

        for (Integer i: integerList){
            System.out.println(i);
        }
    }



}
