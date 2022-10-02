import animals.Amphibian;
import animals.Carnivore;
import animals.Herbivore;
import animals.NotFlying;
import animals.Flying;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1.1 ******************************************");

        Car lada = new Car("Lada", "Grande", 1.7f, "желтый", 2015, "Россия",
                180, Transport.FILL_PETROL,
                null, null, "ы123ва152", 4, true,
                2023, 50000.5f, "777777777");
        lada.refill(30);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3f, "черный", 2020, "Германия",
                200, Transport.FILL_DIESEL,
                null, null, "К456ЛЛ052", 4, true,
                2023, 20000.5f, "ddddddddd");
        audi.refill(20);

        Car bmw = new Car("BMW", "Z8", 3f, "черный", 2021, "Германия",
                260, Transport.FILL_PETROL,
                null, null, null, 5, true,
                2023, 10000.5f, "889999998");
        bmw.refill(40);

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, "красный", 2018, "Южная Корея",
                220, Transport.FILL_PETROL,
                null, null, null, 5, false,
                2021, 30000.5f, "a12345678");
        kia.refill(25);

        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея",
                210, Transport.FILL_PETROL,
                null, null, null, 4, false,
                2023, 20000.5f, "777");
        hyundai.refill(42);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println("Домашнее задание 1.2 ******************************************");

        Train lastochka = new Train("Ласточка", "B-901",2011,
                "Россия", "Красный", 301, 3500, 7,
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.refill(700);

        Train leningrad = new Train("Ленинград", "D-125",2019,
                "Россия", "Синий", 270, 1700, 8,
                "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        leningrad.refill(1000);

        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println("Домашнее задание 1.3 ******************************************");

        Bus paz = new Bus("ПАЗ", "3205", 2005, "Россия", "Белый",
                110, Transport.FILL_PETROL);
        paz.refill(100);

        Bus liaz = new Bus("ЛиАЗ", "6228 Вояж L", 2011, "Россия", "Зеленый",
                90, Transport.FILL_DIESEL);
        liaz.refill(120);

        Bus nefaz = new Bus("НефАЗ", "52998", 2010, "Россия", "Желтый",
                80, Transport.FILL_DIESEL);
        nefaz.refill(150);

        System.out.println(paz);
        System.out.println(liaz);
        System.out.println(nefaz);

        System.out.println("Домашнее задание о животных  **************************************");

        Herbivore gazelle = new Herbivore("Газель Маша", 3, "лес", 30, "траву");
        System.out.println(gazelle);
        gazelle.eat();
        gazelle.go();
        gazelle.stroll();
        gazelle.pasture();

        System.out.println();

        Herbivore giraffe = new Herbivore("Жираф Вася", 4, "саванна", 6, "листья");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.go();
        giraffe.stroll();
        giraffe.pasture();

        System.out.println();

        Herbivore horse = new Herbivore("Жеребец Мальчик", 6, "конюшня", 40, "сено");
        System.out.println(horse);
        horse.eat();
        horse.go();
        horse.stroll();
        horse.pasture();

        System.out.println();

        Carnivore hyena = new Carnivore("Гиена Мурка",  8, "саванна", 30, "мясо");
        System.out.println(hyena);
        hyena.eat();
        hyena.go();
        hyena.stroll();
        hyena.hunt();

        System.out.println();

        Carnivore bear = new Carnivore("Медведь Потап",  10, "лес", 15, "мёд");
        System.out.println(bear);
        bear.eat();
        bear.go();
        bear.stroll();
        bear.hunt();

        System.out.println();

        Carnivore tiger = new Carnivore("Тигр Мурзик",  11, "тайга", 25, "мясо");
        System.out.println(tiger);
        tiger.eat();
        tiger.go();
        tiger.stroll();
        tiger.hunt();

        System.out.println();

        Amphibian frog = new Amphibian("Лягушка Квакша", 1, "болото");
        System.out.println(frog);
        frog.eat();
        frog.go();
        frog.hunt();

        System.out.println();

        Amphibian snake = new Amphibian("Уж Пресноводный", 2, "река");
        System.out.println(snake);
        snake.eat();
        snake.go();
        snake.hunt();

        System.out.println();

        NotFlying peacock = new NotFlying("Павлин", 2, "Джунгли", "ходьба");
        System.out.println(peacock);
        peacock.eat();
        peacock.go();
        peacock.hunt();
        peacock.stroll();

        System.out.println();

        NotFlying penguin = new NotFlying("Пингвин", 3, "Антарктида", "плавание");
        System.out.println(penguin);
        penguin.eat();
        penguin.go();
        penguin.hunt();
        penguin.stroll();

        System.out.println();

        NotFlying dodo = new NotFlying("Птица Додо", 3, "Австралия", "ходьба");
        System.out.println(dodo);
        dodo.eat();
        dodo.go();
        dodo.hunt();
        dodo.stroll();

        System.out.println();

        Flying gull = new Flying("Чайка Лариса", 2, "Море", "полёт");
        System.out.println(gull);
        gull.eat();
        gull.go();
        gull.hunt();
        gull.fly();

        System.out.println();

        Flying albatross = new Flying("Альбатрос Макс", 1, "Море", "парящий полёт");
        System.out.println(albatross);
        albatross.eat();
        albatross.go();
        albatross.hunt();
        albatross.fly();

        System.out.println();

        Flying falcon = new Flying("Сокол Миг", 5, "Степь", "полёт");
        System.out.println(falcon);
        falcon.eat();
        falcon.go();
        falcon.hunt();
        falcon.fly();
    }
}