// Імпорт класу HashMap - реалізації карти для зберігання пар ключ-значення
import java.util.HashMap;
// Імпорт інтерфейсу Map - структури даних для зберігання валют
import java.util.Map;
// Імпорт класу Scanner - для зчитування даних, введених користувачем з консолі
import java.util.Scanner;

// Визначення інтерфейсу Exchangeable - визначає контракт для класів, що обробляють обмін валют
interface Exchangeable {
    // Метод для конвертації з гривні в іншу валюту
    // Приймає цільову валюту та суму в гривнях, повертає суму в цільовій валюті
    double convertTo(Currency targetCurrency, double amount);

    // Метод для конвертації з іншої валюти в гривню
    // Приймає вихідну валюту та суму в цій валюті, повертає суму в гривнях
    double convertFrom(Currency sourceCurrency, double amount);
}

// Визначення абстрактного класу Currency - шаблон для всіх валют
// Абстрактний клас - не можна створювати його екземпляри, служить тільки для наслідування
abstract class Currency {
    // Захищені поля (protected) - доступні в класі та класах-нащадках
    protected String name;        // Зберігає назву валюти
    protected String symbol;       // Зберігає символ валюти (напр. $, €)
    protected double exchangeRateToUAH; // Курс обміну до гривні як базової валюти

    // Конструктор класу Currency - викликається класами-нащадками
    // Ініціалізує поля назви, символу та курсу обміну
    public Currency(String name, String symbol, double exchangeRateToUAH) {
        this.name = name;           // this.name посилається на поле об'єкта, name - це параметр
        this.symbol = symbol;       // Присвоєння символу полю об'єкта
        this.exchangeRateToUAH = exchangeRateToUAH; // Присвоєння курсу
    }

    // Геттер для поля name - публічний метод доступу до назви валюти
    public String getName() {
        return name;                // Повертає назву валюти
    }

    // Геттер для поля symbol - публічний метод доступу до символу валюти
    public String getSymbol() {
        return symbol;              // Повертає символ валюти
    }

    // Геттер для поля exchangeRateToUAH - повертає курс обміну до гривні
    public double getExchangeRateToUAH() {
        return exchangeRateToUAH;   // Повертає курс обміну
    }

    // Абстрактний метод - має бути реалізований класами-нащадками
    // Повертає інформацію про країну/регіон, що використовує дану валюту
    public abstract String getCountryInfo();

    // Перевизначення методу toString() з класу Object
    // Визначає, як об'єкт має бути представлений у вигляді тексту
    @Override
    public String toString() {
        return name + " (" + symbol + ")"; // Повертає назву та символ у форматі: "Назва (Символ)"
    }
}

// Клас Dollar, що наслідує Currency - конкретна реалізація валюти
class Dollar extends Currency {
    // Конструктор без параметрів - викликає конструктор батьківського класу з конкретними значеннями
    public Dollar() {
        // super() - виклик конструктора батьківського класу (Currency)
        super("US Dollar", "$", 37.5); // Передає назву, символ та курс
    }

    // Реалізація абстрактного методу getCountryInfo() з класу Currency
    @Override
    public String getCountryInfo() {
        return "Official currency of the USA and many other countries"; // Повертає інформацію про долар
    }
}

// Клас Euro, що наслідує Currency
class Euro extends Currency {
    // Конструктор, що ініціалізує євро з курсом 40.2 до гривні
    public Euro() {
        super("Euro", "€", 40.2); // Виклик конструктора Currency з параметрами для євро
    }

    // Реалізація абстрактного методу для євро
    @Override
    public String getCountryInfo() {
        return "Official currency of the European Union"; // Інформація про євро
    }
}

// Клас Zloty, що наслідує Currency
class Zloty extends Currency {
    // Конструктор, що ініціалізує злотого з курсом 8.9 до гривні
    public Zloty() {
        super("Zloty", "zł", 8.9); // Виклик конструктора Currency для злотого
    }

    // Реалізація абстрактного методу для злотого
    @Override
    public String getCountryInfo() {
        return "Official currency of Poland"; // Інформація про злотого
    }
}

// Клас Hryvnia, що наслідує Currency
class Hryvnia extends Currency {
    // Конструктор, що ініціалізує гривню - курс 1.0 (базова валюта)
    public Hryvnia() {
        super("Hryvnia", "₴", 1.0); // Виклик конструктора Currency для гривні
    }

    // Реалізація абстрактного методу для гривні
    @Override
    public String getCountryInfo() {
        return "Official currency of Ukraine"; // Інформація про гривню
    }
}

// Клас калькулятора валют, що реалізує інтерфейс Exchangeable
class CurrencyCalculator implements Exchangeable {
    // Приватне поле - мапа, що зберігає валюти, ключем є назва валюти
    private Map<String, Currency> currencies;

    // Конструктор, що ініціалізує калькулятор з валютами за замовчуванням
    public CurrencyCalculator() {
        currencies = new HashMap<>(); // Створює нову, порожню HashMap
        // Додавання доступних валют до мапи
        addCurrency(new Dollar());     // Створює об'єкт Dollar і додає до мапи
        addCurrency(new Euro());       // Створює об'єкт Euro і додає до мапи
        addCurrency(new Zloty());      // Створює об'єкт Zloty і додає до мапи
        addCurrency(new Hryvnia());    // Створює об'єкт Hryvnia і додає до мапи
    }

    // Метод додавання валюти до мапи
    public void addCurrency(Currency currency) {
        // put() - додає пару ключ-значення до мапи
        // Ключем є назва валюти, значенням об'єкт валюти
        currencies.put(currency.getName(), currency);
    }

    // Метод отримання валюти з мапи за назвою
    public Currency getCurrency(String name) {
        // get() - повертає значення (об'єкт Currency) для заданого ключа (назви)
        return currencies.get(name);
    }

    // Метод відображення всіх доступних валют
    public void displayAllCurrencies() {
        System.out.println("\nAvailable currencies:"); // Заголовок списку валют

        // Цикл for-each, що проходить через всі значення в мапі
        for (Currency currency : currencies.values()) {
            // Виведення інформації про валюту
            System.out.println("- " + currency + " | Exchange rate to UAH: " + currency.getExchangeRateToUAH());
            System.out.println("  " + currency.getCountryInfo()); // Виклик поліморфного методу
        }
    }

    // Реалізація методу convertTo з інтерфейсу Exchangeable
    // Конвертує з гривні в цільову валюту
    @Override
    public double convertTo(Currency targetCurrency, double amountInUAH) {
        // Ділення суми в гривнях на курс цільової валюти
        return amountInUAH / targetCurrency.getExchangeRateToUAH();
    }

    // Реалізація методу convertFrom з інтерфейсу Exchangeable
    // Конвертує з вихідної валюти в гривню
    @Override
    public double convertFrom(Currency sourceCurrency, double amountInSource) {
        // Множення суми у вихідній валюті на її курс до гривні
        return amountInSource * sourceCurrency.getExchangeRateToUAH();
    }

    // Метод для прямої конверсії між двома валютами (без гривні)
    public double convertDirect(Currency from, Currency to, double amount) {
        // Двоетапна конверсія: спочатку в гривню, потім у цільову валюту
        double amountInUAH = convertFrom(from, amount); // Крок 1: вихідна валюта -> гривня
        return convertTo(to, amountInUAH);              // Крок 2: гривня -> цільова валюта
    }
}

// Головний клас програми, що містить метод main
public class CurrencyConverterApp {
    // Метод main - точка входу в програму
    public static void main(String[] args) {
        // Створення об'єкта Scanner для зчитування даних з клавіатури (System.in)
        Scanner scanner = new Scanner(System.in);
        // Створення об'єкта калькулятора валют
        CurrencyCalculator calculator = new CurrencyCalculator();

        // Виведення заголовка програми
        System.out.println("=== Currency Calculator ===");

        // Нескінченний цикл while - програма працює до вибору опції 5
        while (true) {
            // Виведення меню опцій
            System.out.println("\nChoose an option:");
            System.out.println("1. Show all currencies");
            System.out.println("2. Convert from UAH to another currency");
            System.out.println("3. Convert from another currency to UAH");
            System.out.println("4. Direct conversion between two currencies");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");

            // Зчитування цілого числа від користувача
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера - видалення символу нового рядка

            // Інструкція switch, що виконує відповідну дію на основі вибору
            switch (choice) {
                case 1:
                    // Виклик методу відображення всіх валют
                    calculator.displayAllCurrencies();
                    break; // Вихід з switch

                case 2:
                    // Виклик методу для конвертації з гривні
                    convertFromUAH(scanner, calculator);
                    break;

                case 3:
                    // Виклик методу для конвертації в гривню
                    convertToUAH(scanner, calculator);
                    break;

                case 4:
                    // Виклик методу для прямої конвертації
                    convertDirect(scanner, calculator);
                    break;

                case 5:
                    // Завершення програми
                    System.out.println("Thank you for using the calculator!");
                    scanner.close(); // Закриття об'єкта Scanner (звільнення ресурсів)
                    return; // Завершення методу main (вихід з програми)

                default:
                    // Обробка неправильного вибору
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Приватний статичний метод для конвертації з гривні в іншу валюту
    private static void convertFromUAH(Scanner scanner, CurrencyCalculator calculator) {
        // Запит на введення суми в гривнях
        System.out.print("Enter amount in UAH: ");
        double amountUAH = scanner.nextDouble(); // Зчитування суми (число з плаваючою точкою)
        scanner.nextLine(); // Очищення буфера

        // Запит на введення назви цільової валюти
        System.out.print("Enter target currency name (US Dollar/Euro/Zloty): ");
        String targetName = scanner.nextLine(); // Зчитування назви валюти

        // Отримання об'єкта валюти з калькулятора
        Currency target = calculator.getCurrency(targetName);

        // Перевірка, чи існує валюта
        if (target == null) {
            System.out.println("Currency not found!"); // Повідомлення про помилку
            return; // Завершення методу
        }

        // Виконання конвертації
        double result = calculator.convertTo(target, amountUAH);
        // Виведення результату з форматуванням (2 знаки після коми)
        System.out.printf("%.2f UAH = %.2f %s\n", amountUAH, result, target.getSymbol());
    }

    // Приватний статичний метод для конвертації з іншої валюти в гривню
    private static void convertToUAH(Scanner scanner, CurrencyCalculator calculator) {
        // Запит на введення назви вихідної валюти
        System.out.print("Enter source currency name (US Dollar/Euro/Zloty): ");
        String sourceName = scanner.nextLine(); // Зчитування назви валюти

        // Отримання об'єкта валюти з калькулятора
        Currency source = calculator.getCurrency(sourceName);

        // Перевірка, чи існує валюта
        if (source == null) {
            System.out.println("Currency not found!"); // Повідомлення про помилку
            return; // Завершення методу
        }

        // Запит на введення суми у вихідній валюті
        System.out.print("Enter amount in " + source.getName() + ": ");
        double amount = scanner.nextDouble(); // Зчитування суми
        scanner.nextLine(); // Очищення буфера

        // Виконання конвертації
        double result = calculator.convertFrom(source, amount);
        // Виведення результату
        System.out.printf("%.2f %s = %.2f UAH\n", amount, source.getSymbol(), result);
    }

    // Приватний статичний метод для прямої конвертації між двома валютами
    private static void convertDirect(Scanner scanner, CurrencyCalculator calculator) {
        // Запит на введення назви вихідної валюти
        System.out.print("Enter source currency name: ");
        String fromName = scanner.nextLine(); // Зчитування назви вихідної валюти

        // Запит на введення назви цільової валюти
        System.out.print("Enter target currency name: ");
        String toName = scanner.nextLine(); // Зчитування назви цільової валюти

        // Отримання об'єктів валют з калькулятора
        Currency from = calculator.getCurrency(fromName);
        Currency to = calculator.getCurrency(toName);

        // Перевірка, чи існують обидві валюти
        if (from == null || to == null) {
            System.out.println("One of the currencies not found!"); // Повідомлення про помилку
            return; // Завершення методу
        }

        // Запит на введення суми у вихідній валюті
        System.out.print("Enter amount in " + from.getName() + ": ");
        double amount = scanner.nextDouble(); // Зчитування суми
        scanner.nextLine(); // Очищення буфера

        // Виконання прямої конвертації
        double result = calculator.convertDirect(from, to, amount);
        // Виведення результату
        System.out.printf("%.2f %s = %.2f %s\n", amount, from.getSymbol(), result, to.getSymbol());
    }
}