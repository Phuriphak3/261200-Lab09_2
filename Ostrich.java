package oop.lsp;

public class Ostrich implements Moveable {
    @Override
    public void move() {
        // นกกระจอกเทศวิ่งเก่งแต่บินไม่ได้ จึง implement แค่ Moveable
        System.out.println("Ostrich: Moving by running at high speeds across the savanna.");
    }
}
