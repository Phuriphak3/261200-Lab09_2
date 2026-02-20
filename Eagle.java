package oop.lsp;

public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("Eagle: Moving by soaring through the sky.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle: Flapping wings and gliding at high altitude.");
    }
}
