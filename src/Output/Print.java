package Output;

import GraphicObjects.Shape;

public class Print implements Output{

    @Override
    public void print(Shape shape) {
        System.out.println(shape.printName());
    }
}
