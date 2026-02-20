package oop.lsp;

public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow: Moving by flying or hopping on branches.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow: Rapidly flapping wings to fly between trees.");
    }
}
