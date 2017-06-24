package pl.kordulewski.memory.leaks.runners;

import pl.kordulewski.memory.leaks.ZipInputStreamNotProperlyClosedWithCollectingGenerator;

/**
 * Created by Michał Kordulewski on 2017-06-09.
 * 
 * @see ZipInputStreamNotProperlyClosedWithCollectingGenerator
 */
public class ZipInputStreamNotProperlyClosedWithCollectingRunner {

    public static void main (String... args) {
        System.out.println("START");
        System.out.println("... wait");
        new ZipInputStreamNotProperlyClosedWithCollectingGenerator().run();
    }
    
}
