package suleymanhoca.day24accessmodifiersinheritance;

import suleymanhoca.day23datetimestringbuilder.Snake;

public class AnimalsRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat();

    }
}
