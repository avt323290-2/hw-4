package Shapes;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс Circle представляет собой геометрическую фигуру - круг.
 */
public class Circle implements IShape {

    private double radius; // Радиус круга

    /**
     * Конструктор создает экземпляр круга с заданным радиусом.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод для получения имени фигуры (круг).
     *
     * @return Имя фигуры - "круг".
     */
    @Override
    public String getName() {
        return "Круг";
    }

    /**
     * Метод для вычисления площади круга.
     *
     * @return Площадь круга.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод для вычисления длины окружности.
     *
     * @return Длина окружности.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Метод для получения параметров круга (радиус).
     *
     * @return Карта параметров, где ключ - название параметра, значение - значение параметра.
     */
    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Радиус", Double.toString(this.getRadius())
        ));
    }

    /**
     * Метод для получения радиуса круга.
     *
     * @return Радиус круга.
     */
    public double getRadius() {
        return radius;
    }
}