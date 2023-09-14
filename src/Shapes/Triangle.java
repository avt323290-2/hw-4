package Shapes;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс Triangle представляет собой геометрическую фигуру - треугольник.
 */
public class Triangle implements IShape {

    private double a;  // Длина первой стороны треугольника
    private double b;  // Длина второй стороны треугольника
    private double c;  // Длина третьей стороны треугольника

    /**
     * Конструктор создает экземпляр треугольника с заданными длинами его сторон.
     *
     * @param a Длина первой стороны треугольника.
     * @param b Длина второй стороны треугольника.
     * @param c Длина третьей стороны треугольника.
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод для получения имени фигуры (треугольник).
     *
     * @return Имя фигуры - "треугольник".
     */
    @Override
    public String getName() {
        return "треугольник";
    }

    /**
     * Метод для вычисления площади треугольника.
     *
     * @return Площадь треугольника.
     */
    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Метод для вычисления периметра треугольника.
     *
     * @return Периметр треугольника.
     */
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    /**
     * Метод для получения параметров треугольника (длины его сторон).
     *
     * @return Карта параметров, где ключ - название характеристики (Стороны), значение - значение характеристики (длины сторон).
     */
    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Стороны", this.getA() + ", " + this.getB() + ", " + this.getC()
        ));
    }

    /**
     * Метод для получения длины первой стороны треугольника.
     *
     * @return Длина первой стороны треугольника.
     */
    public double getA() {
        return a;
    }

    /**
     * Метод для получения длины второй стороны треугольника.
     *
     * @return Длина второй стороны треугольника.
     */
    public double getB() {
        return b;
    }

    /**
     * Метод для получения длины третьей стороны треугольника.
     *
     * @return Длина третьей стороны треугольника.
     */
    public double getC() {
        return c;
    }
}