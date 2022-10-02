package animals;

public class Mammal extends Animal {

    private float speed;

    public Mammal(String name, int yearsOld, String livingEnvironment, float speed) {
        super(name, yearsOld, livingEnvironment);
        setSpeed(speed);
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 0f;
        }
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающее " + getName() + " кушает !");
    }

    @Override
    public void go() {
        System.out.println("Млекопитающее " + getName() + " движется со скоростью " + speed);
    }

    public void stroll(){//гулять
        System.out.println("Млекопитающее " + getName() + " гуляет");
    }

    @Override
    public String toString() {
        return super.toString() + ", Скорость перемещения: " + speed;
    }
}
