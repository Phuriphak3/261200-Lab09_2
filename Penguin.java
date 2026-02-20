package oop.lsp;

public class Penguin implements Moveable {
    @Override
    public void move() {
        // เพนกวินบินไม่ได้ เราจึง implement แค่ Moveable
        System.out.println("Penguin: Moving by waddling on ice or swimming.");
    }
}
