public abstract class Transport {
    private final String brand;//марка
    private final String model;//модель
    private final int productionYear;//год выпуска
    private final String productionCountry;//Страна производства
    private String color;//Цвет
    private int maxSpeed;//Максимальная скорость передвижения

    //виды топлива
    public static final int FILL_PETROL = 1;//бензин
    public static final int FILL_DIESEL = 2;//дизель
    public static final int FILL_ELECTRIC = 3;//электрическая зарядка

    public final int fillType;//бензин, дизель или зарядка

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int fillType) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        setColor(color);
        setMaxSpeed(maxSpeed);

        if(fillType==FILL_PETROL || fillType==FILL_DIESEL || fillType==FILL_ELECTRIC){
            this.fillType=fillType;
        }else{
            this.fillType = FILL_PETROL;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>0) {
            this.maxSpeed = maxSpeed;
        }else{
            this.maxSpeed = 100;
        }
    }

    public abstract void refill(int value);//абстрактный метод заправки

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", " +
                "модель: " + getModel() + ", " +
                "цвет: " + getColor() + ", " +
                "год производства: " + getProductionYear() + ", " +
                "страна сборки: " + getProductionCountry() + ", " +
                "максимальная скорость: " + getMaxSpeed() + " км/ч";
    }
}
