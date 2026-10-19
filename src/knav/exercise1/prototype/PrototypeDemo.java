package knav.exercise1.prototype;

public final class PrototypeDemo {
    public static void run() {
        LaunchVehicle original = new LaunchVehicle("Falcon 9", "Crew-13");
        original.addPayload("Crewed Dragon");

        LaunchVehicle copy = original.copy();

        // checks for correct object copy
        System.out.println("Different object: " + (copy != original));
        System.out.println("Equal values:     " + copy.equals(original));
        System.out.println("Same class:       " + (copy.getClass() == original.getClass()));

        // next crew mission again, but with rideshare satellites
        copy.setMission("Crew-14");
        copy.addPayload("CubeSats"); // rideshare in the spacecraft trunk
        System.out.println("Original:         " + original);
        System.out.println("Copy:             " + copy);
    }
}
