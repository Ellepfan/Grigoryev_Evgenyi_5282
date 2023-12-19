package Domen;

public class HotDrink extends Product {
    // Поля
    private int temperatureHotDrink;
    // Свойства
    public int getTemperatureHotDrink() {
        return temperatureHotDrink;
    }

    public void setTemperatureHotDrink(int temperatureHotDrink) {
        this.temperatureHotDrink = temperatureHotDrink;
    }
    //конструкторы
    public HotDrink(int price, int place, String name, long id, int temperatureHotDrink) {
        super(price, place, name, id);
        this.temperatureHotDrink = temperatureHotDrink;
    }

    @Override
    public String toString() {
        return super.toString() + "\nТемпература напитка = " + temperatureHotDrink;
    }


}


