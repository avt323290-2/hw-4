package Shapes;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс Rectangle представляет собой геометрическую фигуру - прямоугольник.
 */
public class Rectangle implements IShape {

    private double width;  // Ширина прямоугольника
    private double height; // Высота прямоугольника

    /**
     * Конструктор создает экземпляр прямоугольника с заданными параметрами ширины и высоты.
     *
     * @param width  Ширина прямоугольника.
     * @param height Высота прямоугольника.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Метод для получения имени фигуры (прямоугольник).
     *
     * @return Имя фигуры - "прямоугольник".
     */
    @Override
    public String getName() {
        return "прямоугольник";
    }

    /**
     * Метод для вычисления площади прямоугольника.
     *
     * @return Площадь прямоугольника.
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Метод для вычисления периметра прямоугольника.
     *
     * @return Периметр прямоугольника.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /**
     * Метод для получения параметров прямоугольника (ширина и высота).
     *
     * @return Карта параметров, где ключ - название параметра, значение - значение параметра.
     */
    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Ширина", Double.toString(this.getWidth()),
                "Высота", Double.toString(this.getHeight())
        ));
    }

    /**
     * Метод для получения ширины прямоугольника.
     *
     * @return Ширина прямоугольника.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Метод для получения высоты прямоугольника.
     *
     * @return Высота прямоугольника.
     */
    public double getHeight() {
        return height;
    }
}