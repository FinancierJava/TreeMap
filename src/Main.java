public class Main {
    public static void main(String[] args) {
        // Создание экземпляра TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Добавление элементов в TreeSet
        set.add(5);
        set.add(2);
        set.add(8);

        // Проверка наличия элементов
        System.out.println(set.contains(2));  // true
        System.out.println(set.contains(6));  // false

        // Удаление элемента из TreeSet
        set.remove(5);

        // Проверка наличия удаленного элемента
        System.out.println(set.contains(5));  // false
    }
}
