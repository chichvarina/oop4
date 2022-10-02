package animals;

import java.util.Objects;

public class Herbivore extends Mammal{//травоядные

    private String food; //тип пищи

    public Herbivore(String name, int yearsOld, String livingEnvironment, float speed, String food ) {
        super(name, yearsOld, livingEnvironment, speed);
        setFood(food);
    }

    public void setFood(String food) {
        if(food == null || food.isEmpty()){
            this.food = "Неизвестен";
        }else{
            this.food = food;
        }
    }

    public void pasture(){
        System.out.println("Травоядное " + getName() + " пасётся");
    }

    @Override
    public void eat() {
        System.out.println("Травоядное " + getName() + " кушает "+food);
    }

    @Override
    public void go() {
        System.out.println("Травоядное " + getName() + " движется со скоростью " + super.getSpeed());
    }

    @Override
    public void stroll(){
        System.out.println("Травоядное " + getName() + " гуляет");
    }

    @Override
    public String toString() {
        return super.toString() + ", кушает " + food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivore)) return false;

        Herbivore herbivore = (Herbivore) o;

        return Objects.equals(super.getName(), herbivore.getName());////уникальным считаем только имя
    }


}
