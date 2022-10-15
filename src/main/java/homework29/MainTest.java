/*
Основное задание
1. Создать программу для чтения номеров контрактов из файла.
Неповторяющиеся номера контрактов следует сохранить в структуру
данных ключ-значение, где ключ - это номер контракта, а значение - это
объекта класса Document со всей контекстной информацией (номер
документа, дата создания и другая информация).
Структуру данных ключ-значение вывести на экран.
2. Сгенерировать коллекцию типа List из 1000 пользователей, используя Random
для генерации случайного имени (набор символов, не обязательно что-то читабельное)
и возраста. Отсортировать уникальных пользователей по возрасту в убывающем порядке,
вывести топ 10 пользователей в консоль.

Дополнительное задание
1. Создать свой кэш памяти объектов, используя коллекцию WeakHashMap.
2*. Написать свою простую реализацию LinkedList, не используя библиотеку Collection,
реализовать логику добавления, удаления, поиска по списку.
 */
package homework29;

import homework29.classUtil.WorkingCollectionsUtil;
import homework29.userClasses.Document;
import homework29.userClasses.User;

import javax.management.ObjectName;
import java.util.*;

public class MainTest {
    public static void main(String[] args) {

        Map<String, Document> mapUsers = new HashMap<>();
        WorkingCollectionsUtil.countWriteMap("src/main/resources/numberPhone.txt", mapUsers);
        WorkingCollectionsUtil.outputMap(mapUsers);

        List<User> listUsers = new ArrayList();
        for (int i = 0; i < 999; i++) {
            listUsers.add(new User());
        }

        new User().sortReturnTenFirst(listUsers);

        }
    }