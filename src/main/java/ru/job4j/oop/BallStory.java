package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        fox.love(wolf);
        hare.run(wolf);
        wolf.eat(hare);
        ball.rollingAway(fox, wolf, hare);
    }
}
