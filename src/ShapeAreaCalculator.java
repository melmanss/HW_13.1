public class ShapeAreaCalculator {
    public static double totalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area(); /*Додаємо площу кожної фігури*/
        }
        return total;
    }
}
