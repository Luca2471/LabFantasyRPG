package enemys;

public abstract class Enemy {

    private double health;

    public Enemy(double health) {
        this.health = health;
    }


    public double getHealth() {
        return health;
    }

}


