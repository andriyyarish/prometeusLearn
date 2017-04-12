package module1.gen;

import java.util.List;

/**
 * Created by Andriy_Yarish on 6/14/2016.
 */
public class Container<T> {
    T item;

    public T getItem() {
        return item;
    }

    public Container setItem(T item) {
        this.item = item;
        return this;
    }

    static void copy (List<? extends Product> src, List<? super Product> dest){
        for (Product p: src) {
            dest.add(p);
        }


    }
}
