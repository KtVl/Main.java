package Homework6;

class Cats extends Animal {
    Cats(int runLimit){
        super(runLimit,0);
    }
    @Override
    public String swim(int distance){
        return getClassName() + " не умеет плавать";
    }
}
