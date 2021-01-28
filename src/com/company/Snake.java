package com.company;

public final class Snake extends Game{
    public int health;
    public int length;

    public int getHealth() {
        return health;
    }

    public int getLength() {
        return length;
    }

    public Snake(Color color, Certificate certificate, int health, int length) {
        super(color, certificate);
        this.health = health;
        this.length = length;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSnake health: " + health + "\nSnake length: " + length;
    }


    public void moving(String navigation, int distance, double speed) {
        for (int i = 0; i < distance; i++) {
            System.out.println("He moved: " + (i + 1) + " meter.");
        }
        System.out.println("He move with:  " + speed + " meter/m.\nHe turned to " + navigation);
    }
    public void copyMethod(Snake snake){
        this.length = snake.getLength();
        this.health = snake.getHealth();

    }

    public Snake (Snake objectB){

    }
}
