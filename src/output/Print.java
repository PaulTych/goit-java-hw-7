package output;

import graphic_objects.Shape;

public class Print implements Output{

    @Override
    public void printName(Shape shape) {
        System.out.println(shape.getName());
    }
}
