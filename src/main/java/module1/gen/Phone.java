package module1.gen;

/**
 * Created by Andriy_Yarish on 6/14/2016.
 */
public class Phone extends Product<Phone> {
String model;

    @Override
    protected int deepCompare(Phone p) {
        return 0;
    }

}
