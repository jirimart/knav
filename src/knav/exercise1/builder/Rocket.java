package knav.exercise1.builder;

// 🚀
public final class Rocket {
    private final String name;
    private final int engines;
    private final int boosters;
    private final boolean reusable;
    private final String payload;

    private Rocket(Builder builder) {
        this.name = builder.name;
        this.engines = builder.engines;
        this.boosters = builder.boosters;
        this.reusable = builder.reusable;
        this.payload = builder.payload;
    }

    @Override
    public String toString() {
        return name + "(engines: " + engines + ", boosters: " + boosters + ", reusable: " + reusable + ", payload: " + payload + ")";
    }

    public static final class Builder {
        private final String name; // needs to be provided
        private int engines = 1;
        private int boosters = 0;
        private boolean reusable = false;
        private String payload = "none";

        public Builder(String name) {
            this.name = name;
        }

        public Builder engines(int engines) {
            this.engines = engines;
            return this;
        }

        public Builder boosters(int boosters) {
            this.boosters = boosters;
            return this;
        }

        public Builder reusable(boolean reusable) {
            this.reusable = reusable;
            return this;
        }

        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        public Rocket build() {
            return new Rocket(this);
        }
    }
}
