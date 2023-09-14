import Shapes.IShape;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Класс GeometryFigure представляет собой контейнер для хранения и управления геометрическими фигурами.
 * Вы можете добавлять, удалять, искать и получать информацию о фигурах в этом контейнере.
 */
public class GeometryFigure {

    private List<IShape> toolbox;

    /**
     * Конструктор создает экземпляр GeometryFigure и инициализирует пустой список для хранения фигур.
     */
    public GeometryFigure() {
        toolbox = new ArrayList<>();
    }

    /**
     * Метод для добавления новой фигуры в контейнер.
     *
     * @param figure Добавляемая геометрическая фигура.
     */
    public void add(IShape figure) {
        toolbox.add(figure);
    }

    /**
     * Метод для удаления фигуры из контейнера по ее номеру.
     *
     * @param num Номер фигуры, которую необходимо удалить.
     */
    public void delFigure(int num) {
        if (num >= toolbox.size()) {
            System.out.println("Фигуры по запрошенному номеру нет.");
            return;
        }
        IShape figure = toolbox.remove(num);
        System.out.println("Удалена фигура *****************************");
        printFigure(figure);
    }

    /**
     * Метод для поиска фигуры в контейнере по ее названию.
     *
     * @param name Название фигуры, которую необходимо найти.
     */
    public void searchFigure(String name) {
        int i = 0;
        boolean found = false;
        String nameFormat = name.toLowerCase();
        for (IShape figure : toolbox) {
            if (nameFormat.equals(figure.getName().toLowerCase())) {
                found = true;
                System.out.println(i + " *****************************");
                printFigure(figure);
            }
            i++;
        }
        if (!found)
            System.out.println("Фигуры с названием \"" + name + "\" не найдено");
    }

    /**
     * Метод для получения информации о фигуре по ее номеру и вывода ее в консоль.
     *
     * @param num Номер фигуры, информацию о которой необходимо получить.
     */
    public void getFigureInfo(int num) {
        if (num >= toolbox.size()) {
            System.out.println("Фигуры по запрошенному номеру нет.");
            return;
        }
        IShape figure = toolbox.get(num);
        printFigure(figure);
    }

    /**
     * Метод для получения информации о всех фигурах в контейнере и вывода их в консоль.
     */
    public void getAllFiguresInfo() {
        int i = 0;
        for (IShape figure : toolbox) {
            System.out.println((i++) + " *****************************");
            printFigure(figure);
        }
        System.out.println("*****************************");
    }

    /**
     * Метод для вывода информации о фигуре в консоль.
     *
     * @param figure Геометрическая фигура, информацию о которой необходимо вывести.
     */
    private void printFigure(IShape figure) {

        Map<String, String> parametersMap = figure.getParameters();
        String parametersString = "";
        for (var item : parametersMap.entrySet())
            parametersString += item.getKey() + ": " + item.getValue() + "\n";

        System.out.println(
                "Название фигуры: " + figure.getName() + "\n" +
                        parametersString +
                        "Площадь фигуры: " + (Math.round(figure.getArea() * 100) / 100.0) + "\n" +
                        "Периметр фигуры: " + (Math.round(figure.getPerimeter() * 100) / 100.0)
        );
    }
}