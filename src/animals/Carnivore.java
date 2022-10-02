package animals;

import java.util.Objects;

public class Carnivore extends Mammal{

    private String food; //тип пищи

    public Carnivore(String name, int yearsOld, String livingEnvironment, float speed, String food) {
        super(name, yearsOld, livingEnvironment, speed);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if(food == null || food.isEmpty()){
            this.food = "Неизвестен";
        }else{
            this.food = food;
        }
    }

    @Override
    public void eat() {
        System.out.println("Хищник " + getName() + " кушает "+food);
    }

    @Override
    public void go() {
        System.out.println("Хищник " + getName() + " движется со скоростью " + getSpeed());
    }

    public void stroll(){//гулять
        System.out.println("Хищник " + getName() + " гуляет");
    }

    public void hunt(){
        System.out.println("Хищник " + getName() + " охотится !");
    }

    @Override
    public String toString() {
        return super.toString() + ", кушает " + food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carnivore)) return false;

        Carnivore carnivore = (Carnivore) o;

        return Objects.equals(super.getName(), carnivore.getName());//уникальным считаем только имя
    }

}
