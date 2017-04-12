package module1.gen;


/**
 * Created by Andriy_Yarish on 6/14/2016.
 */
public abstract class Product <T extends Product<T>> implements Comparable<Product> {
    String name;
    double price;

    public int compareTo(Product o) {
        return 0;
    }

    protected abstract int deepCompare(T p);
}
