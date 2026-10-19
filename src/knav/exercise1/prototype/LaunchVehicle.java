package knav.exercise1.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 🚀
public final class LaunchVehicle implements Prototype<LaunchVehicle> {
    private final String name;
    private String mission;
    private final List<String> payloads;

    public LaunchVehicle(String name, String mission) {
        this.name = name;
        this.mission = mission;
        this.payloads = new ArrayList<>();
    }

    // copy contructor for copy()
    private LaunchVehicle(LaunchVehicle source) {
        this.name = source.name;
        this.mission = source.mission;
        // deep copy
        this.payloads = new ArrayList<>(source.payloads);
    }

    @Override
    public LaunchVehicle copy() {
        return new LaunchVehicle(this);
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void addPayload(String payload) {
        payloads.add(payload);
    }

    // good copy check
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        LaunchVehicle vehicle = (LaunchVehicle) other;
        return Objects.equals(name, vehicle.name)
                && Objects.equals(mission, vehicle.mission)
                && Objects.equals(payloads, vehicle.payloads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mission, payloads);
    }

    @Override
    public String toString() {
        return name + " [" + mission + "] payloads: " + payloads;
    }
}
