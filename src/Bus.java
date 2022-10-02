public class Bus extends Transport{

    private int fillValue;//литры топлива

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int fillType) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fillType);
    }

    @Override
    public void refill(int value){
        this.fillValue=value;
    }

    @Override
    public String toString(){
        String fillMessage;
        if(fillType==FILL_PETROL){
            fillMessage = "Заправлен бензином: " + fillValue + " литров";
        }else if(fillType==FILL_DIESEL){
            fillMessage = "Заправлен дизельным топливом: " + fillValue + " литров";
        }else{
            fillMessage = "Заряжен: " + fillValue + " квт-час";
        }
        return super.toString()+", "+
                fillMessage+
                "\n";
    }

}
