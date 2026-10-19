package knav;

import knav.exercise1.builder.BuilderDemo;
import knav.exercise1.prototype.PrototypeDemo;

public final class Main {
    public static void main(String[] args) {
        // 1. cviceni
        System.out.println("=== Builder ===\n");
        BuilderDemo.run();

        System.out.println("\n");

        System.out.println("=== Prototype ===");
        PrototypeDemo.run();

        // 2. cviceni
    }
}
