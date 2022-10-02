package animals;

import java.util.Objects;

public class Amphibian extends Animal{

    public Amphibian(String name, int yearsOld, String livingEnvironment) {
        super(name, yearsOld, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Земноводное " + getName() + " кушает !");
    }

    @Override
    public void go() {
        System.out.println("Земноводное " + getName() + " движется !");
    }

    public void hunt(){
        System.out.println("Земноводное " + getName() + " охотится !");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibian)) return false;

        Amphibian amphibian = (Amphibian) o;

        return Objects.equals(super.getName(), amphibian.getName());//уникальным считаем только имя
    }

}
