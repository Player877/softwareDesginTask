package course1.task2.shape;

import course1.task2.Client;

public abstract class Shape extends Client {

    public Shape(){
        //todo 提供默认的位置与长宽与颜色
    }

    public Shape(int x, int y, int width, int height, String color) {
        this.init();
        this.fill();
    }
    public abstract void init();
    public abstract void fill();
    public abstract void display();

    public void setColor(){

    };

    public void setSize(){

    };


}
