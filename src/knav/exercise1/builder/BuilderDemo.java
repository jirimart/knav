package knav.exercise1.builder;

public final class BuilderDemo {
    public static void run() {
        Rocket falconHeavy = new Rocket.Builder("Falcon Heavy")
                .engines(27)
                .boosters(2)
                .reusable(true)
                .payload("STP-2") // many space exploration satellites
                .build();

        Rocket falcon9 = new Rocket.Builder("Falcon 9")
                .engines(9)
                .reusable(true)
                .payload("Transiting Exoplanet Survey Satellite") // big science impact, discoverec thousands of exoplanets
                .build();

        // only name, rest is default
        Rocket vegaC = new Rocket.Builder("Vega-C").build();

        System.out.println(falconHeavy);
        System.out.println(falcon9);
        System.out.println(vegaC);
    }
}
