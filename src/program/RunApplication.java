package program;

import graphic_objects.*;
import output.*;

public class RunApplication {
    public static void main(String[] args) {
        Output output = new Print();
        Shape circle = new Circle();
        output.printName(circle);
        Shape quad = new Quad();
        output.printName(quad);
        Shape triangle = new Triangle();
        output.printName(triangle);
    }
}
