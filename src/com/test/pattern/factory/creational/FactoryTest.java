package com.test.pattern.factory.creational;


interface Shape{
    void drawShape();
}

class Circle implements Shape{
    @Override
    public void drawShape() {
        System.out.println("Circle Shape Drawn!");
    }
}

class Square implements Shape{
    @Override
    public void drawShape() {
        System.out.println("Square Shape Drawn!");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType){
        if(null==shapeType || shapeType.isEmpty())
        {
            System.out.println("Error: null or empty shape object request received!");
            return null;
        }
        switch (shapeType.toLowerCase())
        {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                System.out.println("Error: Unknown shape object: "+shapeType+" request received!");
                return null;
        }
    }
}


//Driver Code
public class FactoryTest {
    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();

        //check return type for all Shape objects before calling drawShape()

        Shape shape1 = sf.getShape("Circle");
        if(null!=shape1)
            shape1.drawShape();

        Shape shape2 = sf.getShape("SQUARE");
        if(null!=shape2)
            shape2.drawShape();

        Shape shape3 = sf.getShape("Octagon");
        if(null!=shape3)
            shape3.drawShape();

        Shape shape4 = sf.getShape(null);
        if(null!=shape4)
            shape4.drawShape();

        Shape shape5 = sf.getShape("");
        if(null!=shape5)
            shape5.drawShape();

    }
}
