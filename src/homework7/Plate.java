package homework7;

public class Plate {
    private  int food;
    private int volume;

    Plate(int volume, int food) {
        this.food = food;
        this.volume = volume; //показывает объем тарелки. можно не указывать
    }


// если тарелка меньше порции, то ничего не происходит. если больше или = вычитаем
    boolean decreaseFood(int portion){
        if (food < portion){
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food){
        if ((this.food + food) <= volume){
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "тарелка: " + food;
    }
}
