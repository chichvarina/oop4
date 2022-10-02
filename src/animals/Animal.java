package animals;

public abstract class Animal {
    private final String name;//кличка
    private int yearsOld;//количество лет
    private String livingEnvironment;//среда проживания

    public Animal(String name, int yearsOld, String livingEnvironment) {
        this.name = name;
        setYearsOld(yearsOld);
        setLivingEnvironment(livingEnvironment);
    }

    public String getName() {
        return name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        if(yearsOld>0) {
            this.yearsOld = yearsOld;
        }else {
            this.yearsOld = 0;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment==null || livingEnvironment.isEmpty()){
            this.livingEnvironment="default";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public abstract void eat();

    void sleep(){
        System.out.println(name + " спмт !");
    }

    public abstract void go();

    @Override
    public String toString() {
        return "Кличка: "+name+", Возраст: "+yearsOld+" лет, Среда проживания: "+livingEnvironment;
    }

}
