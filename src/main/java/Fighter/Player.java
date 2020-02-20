package Fighter;

public abstract class Player {
    private String name;
    private double health;

    public Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

}

