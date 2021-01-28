package com.company;

public class Main {

    public static void main(String[] args) {
    Certificate certificate = new Certificate("Game",2020);
    Game objectA = new Game(Color.GREEN,certificate);
    objectA.moving(15,"left.");
        System.out.println(objectA.getInfo());
        System.out.println("__________________");
    Snake objectB = new Snake(Color.YELLOW,new Certificate("Snake 3d",2030),50,20);
    objectB.moving("right",14,40);
        System.out.println(objectB.getInfo());
        System.out.println("__________________");
    Snake objectC = new Snake(Color.RED,new Certificate("Snake nokia.",1988),15,10);
    objectC.moving("back",5);
        System.out.println(objectC.getInfo());
        System.out.println("__________________");
        Snake snake = new Snake(objectC);
        objectC.copyMethod(objectB);
        System.out.println(objectC.getInfo());
        snake.moving(4,"forward");
    }
}
