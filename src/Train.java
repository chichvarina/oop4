public class Train extends Transport{
    private float price;//Цена поездки
    private int duration;//Время поездки в часах
    private String startStation;//Название станции отбытия
    private String finalStation;//Конечная остановка
    private int wagons;//Количество вагонов

    private int fillValue;//литры дизельного топлива

    public Train(String brand, String model, int productionYear, String productionCountry, String color,
                 int maxSpeed,
                 float price, int duration, String startStation, String finalStation, int wagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, FILL_DIESEL);
        this.price = price;
        this.duration = duration;
        this.startStation = startStation;
        this.finalStation = finalStation;
        this.wagons = wagons;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    @Override
    public void refill(int value){
        this.fillValue=value;
    }

    @Override
    public String toString() {
        return super.toString()+", "+
                "Цена поездки: " + price + ", " +
                "Время поездки: " + duration + " часов, " +
                "станция отбытия: " + startStation + ", " +
                "Конечная остановка: " + finalStation + ", " +
                "Количество вагонов: " + wagons + ", " +
                "Заправлен дизельным топливом: " + fillValue + " литров" +
                "\n";
    }
}
