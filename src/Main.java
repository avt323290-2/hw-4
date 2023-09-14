import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Triangle;

/**
 * Главный класс Main для демонстрации использования класса GeometryFigure для управления геометрическими фигурами.
 */
public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр GeometryFigure для хранения фигур
        GeometryFigure figureBox = new GeometryFigure();

        // Добавляем круг
        Circle circle = new Circle(20);
        figureBox.add(circle);

        // Добавляем прямоугольник
        Rectangle rectangle = new Rectangle(15, 25);
        figureBox.add(rectangle);

        // Добавляем треугольники
        Triangle triangle1 = new Triangle(10, 15, 20);
        figureBox.add(triangle1);
        Triangle triangle2 = new Triangle(7, 9, 13);
        figureBox.add(triangle2);

        // Отображаем информацию о всех геометрических фигурах, содержащихся в figureBox
        figureBox.getAllFiguresInfo();

        // Отображаем информацию о фигуре, находящейся под указанным номером в figureBox
        figureBox.getFigureInfo(2);

        // Удаляем фигуру из figureBox по указанному номеру
        figureBox.delFigure(1);

        // Находим и отображаем геометрические фигуры с заданным названием
        figureBox.searchFigure("Треугольник");
    }
}