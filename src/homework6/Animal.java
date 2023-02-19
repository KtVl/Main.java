package homework6;


abstract class Animal implements InterfaceAnimal {
    protected int runLimit; //задаем максимальную длину пробежки
    protected int swimLimit; //макс длину проплыва
    protected String className; // заполняем имя класса при создании существа
    protected static int count = 0;

    Animal(int runLimit, int swimLimit) { //инициализация полей через конструктор
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        count++;
    }
    public String getClassName(){
        return className;
    }
    public static int getCount(){
        return count;
    }
    @Override
    public String run(int distance){
        if(distance > runLimit){
            return className + " не может пробежать  " + distance + " метров.";
        } else {
            return className + " пробежал " + distance + ".";
        }
    }
    @Override
    public String swim(int distance){
        if(distance > swimLimit){
            return className + " не может проплыть " + distance + " метров.";
        } else {
            return className + " проплыл " + distance + ".";
        }
    }
    @Override
    public String toString(){
        return className + " может пробежать: " + runLimit + ". может проплыть " + swimLimit + ".";
    }
}
