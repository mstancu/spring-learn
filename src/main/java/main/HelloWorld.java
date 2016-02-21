//File HelloWorld.java ---------------------------------
package main;

import bird.Bird;
import bird.Nest;
import bird.Shelter;

public class HelloWorld {
    public static void main(String[] args) {
        Shelter alreadyBuildedNest = new Nest();
        Bird firstBird = new Bird(alreadyBuildedNest);
        firstBird.builNest();
        System.out.println("Done.");
    }
}
