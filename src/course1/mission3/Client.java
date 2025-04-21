package course1.mission3;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("请输入所需绘制图形类型(circle/rectangle/triangle)：");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        try{
            Shape shape = ShapeFactory.createShape(type);
            shape.draw();
            shape.erase();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
