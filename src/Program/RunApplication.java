package Program;

import GraphicObjects.*;
import Output.*;

public class RunApplication {
    public static void main(String[] args) {
        Output output = new Print();
        Shape circle = new Circle();
        output.print(circle);
        Shape quad = new Quad();
        output.print(quad);
        Shape triangle = new Triangle();
        output.print(triangle);
    }
}
