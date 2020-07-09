package homework.lesson3;
/*
Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
Найти список слов, из которых состоит текст (дубликаты не считать);
Посчитать сколько раз встречается каждое слово (использовать HashMap);
Написать простой класс PhoneBook(внутри использовать HashMap):
В качестве ключа использовать фамилию
В каждой записи всего два поля: phone, e-mail
Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть несколько записей.

 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Иванов", "223344");
        phonebook.add("Иванов", "22334411");
        phonebook.add("Петров", "22334499");
        phonebook.add("Сидоров", "22334488");
        phonebook.add("Иванов", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "223344");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
