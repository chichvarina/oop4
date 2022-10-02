package animals;

import java.util.Objects;

public class Flying extends Bird{

    private String movementType; //тип передвижения

    public Flying(String name, int yearsOld, String livingEnvironment, String movementType) {
        super(name, yearsOld, livingEnvironment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty()) {
            this.movementType = "Неизвестно";
        } else {
            this.movementType = movementType;
        }
    }

    @Override
    public void eat() {
        System.out.println("летающая птица " + getName() + " кушает !");
    }

    @Override
    public void go() {
        System.out.println("летающая птица " + getName() + " движется !");
    }

    public void hunt(){
        System.out.println("летающая птица " + getName() + " охотится !");
    }

    public void fly(){
        System.out.println("летающая птица " + getName() + " летит");
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип передвижения: " + movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;

        Flying flying = (Flying) o;

        return Objects.equals(super.getName(), flying.getName());//уникальным считаем только имя
    }

}
