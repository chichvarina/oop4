package animals;

import java.util.Objects;

public class NotFlying extends Bird{

    private String movementType; //тип передвижения

    public NotFlying(String name, int yearsOld, String livingEnvironment, String movementType) {
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
        System.out.println("Нелетающая птица " + getName() + " кушает !");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица " + getName() + " движется !");
    }

    public void hunt(){
        System.out.println("Нелетающая птица " + getName() + " охотится !");
    }

    public void stroll(){
        System.out.println("Нелетающая птица " + getName() + " гуляет");
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип передвижения: " + movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotFlying)) return false;

        NotFlying notFlying = (NotFlying) o;

        return Objects.equals(super.getName(), notFlying.getName());//уникальным считаем только имя
    }

}
