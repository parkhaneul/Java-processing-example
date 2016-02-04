import processing.core.PApplet;

import java.util.ArrayList;
//Java Graphic windows format

public class ProcessingEntry extends PApplet {

    public static void main(String[] args)
    {
        ProcessingEntry p = new ProcessingEntry();
        //Processing 초기 설정
        p.runSketch();
        //Sketch run
    }

    //함수가 실행되는 순서 : setttings -> setup -> draw

    //settings() : processing ver.3 부터 나온 설정을 위한 함수
    public void settings()
    {
        size(800,600);
    }

    //setup() : 프로그램 시작 시 초기 설정하는 함수
    public void setup()
    {
        background(0);
    }

    public class Shape{
        private int x = 100;
        private int y = 100;

        public void draw(){
        }

        public void setPosition(int a,int b){
            x = a;
            y = b;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }
    }

    public class Circle extends Shape{
        public Circle(int a,int b)
        {
            setPosition(a,b);
        }

        public void draw(){
            noStroke();
            fill(random(255),random(255),random(255),5);
            ellipse(getX(),getY(),50,50);
        }
    }

    public class Rect extends Shape{
        public Rect(int a,int b)
        {
            setPosition(a,b);
        }

        public void draw(){
            noStroke();
            fill(random(255),random(255),random(255),5);
            rect(getX()-25,getY()-25,50,50);
        }
    }

    //draw() : 이벤트 루프가 도는 함수
    public void draw()
    {
        /*
        noStroke();
        fill(random(150,255),random(150,255),random(150,255),30);

        float raduis = random(50,200);
        ellipse(mouseX,mouseY,raduis,raduis);
        */

        ArrayList<Shape> shape = new ArrayList<>();

        for(int i=0; i<20; i++) {
            shape.add(new Circle(i*50,100));
            shape.add(new Rect(i*50,100));
        }

        for(Shape each : shape) {
            each.draw();
        }
    }
}
