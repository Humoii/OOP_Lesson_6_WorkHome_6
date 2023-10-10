package lsp1.view;
import lsp1.shape.Shape;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Shape shape;

    public ShapeView(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(shape.getArea());
    }
}
