//File Bird.java ---------------------------------
package bird;

public class Bird {
    private String name;
    private Shelter nest;

    public Bird(Shelter nest) {
        this.name = "Dumb bird";
        this.nest = nest;
        System.out.println("'" + name + "' bird has born.");
    }

    public void builNest() {
        System.out.println("'" + name + "' is building a home.");
        nest.build();
    }
}
