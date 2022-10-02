
public class Car extends Transport {
    private float engineVolume;
    private String transmission;//коробка передач
    private final String bodyType;//тип кузова
    private String number;//регистрационный номер
    private final int seats;//количество мест
    private boolean winterTires;//зимняя резина

    private Insurance insurance;

    private int fillValue;//литры или киловатт-часы

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry,
               int maxSpeed, int fillType,
               String transmission, String bodyType, String number, int seats, boolean winterTires,
               int insuranceDuration, float insuranceCost, String insuranceNumber) {

        super(brand, model, productionYear, productionCountry, color, maxSpeed, fillType);

        setEngineVolume(engineVolume);
        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        setNumber(number);

        if (seats > 0) {
            this.seats = seats;
        } else {
            this.seats = 4;
        }

        this.winterTires = winterTires;

        this.insurance = new Insurance(insuranceDuration, insuranceCost, insuranceNumber);

    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (checkNumber(number)) {
            this.number = number;
        } else {
            this.number = "default";
        }
    }

    public int getSeats() {
        return seats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    //это сеттер и он же "Метод сменить шины на сезонные"
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    //проверка государственного номера х000хх000
    public boolean checkNumber(String number) {
        if (number == null) {
            return false;
        } else if (number.length() < 9) {
            return false;//номер слишком короткий
        } else {
            return Character.isLetter(number.charAt(0))//первый символ буква
                    //дальше 3 цифры
                    && Character.isDigit(number.charAt(1))
                    && Character.isDigit(number.charAt(2))
                    && Character.isDigit(number.charAt(3))
                    //дальше 2 буквы
                    && Character.isLetter(number.charAt(4))
                    && Character.isLetter(number.charAt(5))
                    //дальше 3 цифры
                    && Character.isDigit(number.charAt(6))
                    && Character.isDigit(number.charAt(7))
                    && Character.isDigit(number.charAt(8));
        }
    }

    @Override
    public void refill(int value){
       this.fillValue=value;
    }

    @Override
    public String toString() {
        String tires;
        if (winterTires) {
            tires = "зимняя резина";
        } else {
            tires = "летняя резина";
        }
        String fillMessage;
        if(fillType==FILL_PETROL){
            fillMessage = "Заправлен бензином: " + fillValue + " литров";
        }else if(fillType==FILL_DIESEL){
            fillMessage = "Заправлен дизельным топливом: " + fillValue + " литров";
        }else{
            fillMessage = "Заряжен: " + fillValue + " квт-час";
        }

        return super.toString()+", "+
                fillMessage+", "+
                "объем двигателя в литрах: " + engineVolume + ", " +
                "коробка передач: " + transmission + ", " +
                "тип кузова: " + bodyType + ", " +
                "регистрационный номер: " + number + ", " +
                "количество мест: " + seats + ", " +
                tires + ". " +
                insurance + "\n";
    }

    //вложенные классы
    class Key {
        private boolean remoteEngine;//удалённый запуск двигателя
        private boolean accessWithoutKey;//бесключевой доступ

        public Key(boolean remoteEngine, boolean accessWithoutKey) {
            this.remoteEngine = remoteEngine;
            this.accessWithoutKey = accessWithoutKey;
        }
    }

    class Insurance {
        private int insuranceDuration;//Срок действия страховки
        private float insuranceCost;//Стоимость страховки
        private String insuranceNumber;//Номер страховки

        public Insurance(int insuranceDuration, float insuranceCost, String insuranceNumber) {
            this.insuranceDuration = insuranceDuration;
            this.insuranceCost = insuranceCost;
            this.insuranceNumber = insuranceNumber;
        }

        boolean checkLength() {
            return insuranceNumber.length() == 9;
        }

        boolean checkDuration() {
            int currentYear = 2022;
            return currentYear < insuranceDuration;
        }

        @Override
        public String toString() {
            String s = "";
            if (!checkDuration()) {
                s = "Нужно срочно ехать оформлять новую страховку.";
            }
            if (!checkLength()) {
                s = s + "Номер страховки некорректный.";
            }
            return s;
        }

    }

}

