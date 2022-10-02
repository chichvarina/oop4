package animals;

public class Bird extends Animal{

    public Bird(String name, int yearsOld, String livingEnvironment) {
        super(name, yearsOld, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Птица " + getName() + " кушает !");
    }

    @Override
    public void go() {
        System.out.println("Птица " + getName() + " движется !");
    }

    public void hunt(){
        System.out.println("Птица " + getName() + " охотится !");
    }



}
