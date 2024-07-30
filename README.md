# Проект: Телефонная книга

## Описание

Проект представляет собой приложение для управления телефонной книгой с использованием структуры данных `HashMap`. Программа позволяет пользователю вводить контакты, включающие имя и номер телефона, и хранить их таким образом, чтобы один человек мог иметь несколько номеров телефонов. Контакты выводятся в порядке убывания числа телефонов.

## Структура проекта

### Packages (папки):

- `model`: содержит классы модели данных.
- `validation`: содержит классы для валидации данных.
- `console`: содержит классы для работы с консолью.
- `file`: содержит классы для записи и чтения из файла.
- `exception`: содержит кастомные исключения.

### Классы:

1. **Model:**

   - `Contact`: класс, представляющий контакт с именем и списком телефонов.

2. **Validation:**

   - `ContactValidator`: класс для валидации данных контакта.

3. **Console:**

   - `ConsoleHelper`: класс для взаимодействия с пользователем через консоль.

4. **File:**

   - `FileHelper`: класс для записи данных в файл и чтения из файла.

5. **Exception:**

   - `InvalidContactException`: кастомное исключение для ошибок валидации контакта.
   - `FileOperationException`: кастомное исключение для ошибок работы с файлами.

6. **Main:**
   - `PhoneBookApp`: основной класс приложения.

## Использование

1. Запустите `PhoneBookApp` для начала работы с приложением.
2. Введите контакты согласно подсказкам в консоли.
3. Программа валидирует данные и сохраняет их в файл `phonebook.txt`.
4. При необходимости, можно расширить функциональность для чтения данных из файла.

## Примечания

- Программа обрабатывает исключения и выводит пользователю соответствующие сообщения.
- Контакты сортируются по числу телефонов в порядке убывания при выводе на консоль.

## Информация о разработчике 👤

- **Группа:** 6381
- **Фамилия и Имя:** Bakun Denis
