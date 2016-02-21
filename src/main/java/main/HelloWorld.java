//File HelloWorld.java ---------------------------------
package main;

import bird.Bird;

public class HelloWorld {
    public static void main(String[] args) {
        Bird firstBird = new Bird();
        firstBird.builNest();
        System.out.println("Done.");
    }
}
