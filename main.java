package oop.lsp;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //ใช้ Polymorphism ร่วมกับ Moveable interface

        List<Moveable> allBirds = new ArrayList<>();
        allBirds.add(new Eagle());
        allBirds.add(new Sparrow());
        allBirds.add(new Penguin());
        allBirds.add(new Ostrich());

        System.out.println("=== Testing All Birds (Moveable Interface) ===");
        for (Moveable bird : allBirds) {
            // ทุก Object สามารถทำงานผ่าน Moveable ได้โดยไม่มี Error
            bird.move();
        }

        //เฉพาะกลุ่มที่บินได้
        System.out.println("\n=== Testing Flying Birds (Flyable Interface) ===");
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Eagle());
        flyingBirds.add(new Sparrow());

        for (Flyable bird : flyingBirds) {
            bird.fly();
        }


//         เราแยก Flyable ออกมาจาก Moveable เพื่อให้โครงสร้างลำดับชั้นถูกต้อง

}}
