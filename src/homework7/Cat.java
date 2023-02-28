package homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness; // статус сытости

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness (boolean status) {
        fullness = status;
    }

    // проверка на то, что кот голодный. сытым этот код не выполняется
    void eat (Plate platter) {
        if (!fullness) {
            fullness = platter.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "кот: " + name + "; аппетит: " + appetite + "; сытость: " + fullness;
    }
}
