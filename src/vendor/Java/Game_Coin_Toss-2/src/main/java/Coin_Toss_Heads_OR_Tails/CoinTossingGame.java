package Coin_Toss_Heads_OR_Tails;

import java.util.Scanner;
import java.util.Random;

public class CoinTossingGame{
    // Змінні для мов
    private static String language = "ukrainian";
    private static String[] menuItems = new String[6];
    private static String[] gameTexts = new String[10];

    // Статистика
    private static int totalGames = 0;
    private static int wins = 0;
    private static int losses = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Вибір мови
        chooseLanguage(scanner);

        // Ініціалізація тексту для обраної мови
        initializeTexts();

        // Головний цикл гри
        boolean playing = true;
        while (playing) {
            showMainMenu();
            System.out.print(gameTexts[7]); // "Ваш вибір: "
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    playGame(scanner, random);
                    break;
                case 2:
                    showStatistics();
                    break;
                case 3:
                    showInfo();
                    break;
                case 4:
                    changeLanguage(scanner);
                    break;
                case 5:
                    resetStatistics();
                    break;
                case 0:
                    System.out.println(gameTexts[8]); // "Дякую за гру!"
                    playing = false;
                    break;
                default:
                    System.out.println(gameTexts[9]); // "Невірний вибір!"
            }
        }
        scanner.close();
    }

    // Вибір мови
    private static void chooseLanguage(Scanner scanner) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       ВИБІР МОВИ / LANGUAGE          ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ 1. Українська                        ║");
        System.out.println("║ 2. English                           ║");
        System.out.println("║ 3. Polski                            ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("Оберіть мову / Choose language: ");

        int langChoice = scanner.nextInt();
        switch (langChoice) {
            case 1: language = "ukrainian"; break;
            case 2: language = "english"; break;
            case 3: language = "polski"; break;
            default: language = "ukrainian";
        }
    }

    // Ініціалізація текстів для обраної мови
    private static void initializeTexts() {
        if (language.equals("english")) {
            // Меню
            menuItems[0] = "PLAY GAME";
            menuItems[1] = "STATISTICS";
            menuItems[2] = "INFORMATION";
            menuItems[3] = "CHANGE LANGUAGE";
            menuItems[4] = "RESET STATISTICS";
            menuItems[5] = "EXIT";

            // Тексти гри
            gameTexts[0] = "=== HEADS OR TAILS GAME ===";
            gameTexts[1] = "Try to guess: Heads or Tails?";
            gameTexts[2] = "Heads";
            gameTexts[3] = "Tails";
            gameTexts[4] = "CORRECT! You guessed!";
            gameTexts[5] = "WRONG! Try again!";
            gameTexts[6] = "Exit";
            gameTexts[7] = "Your choice: ";
            gameTexts[8] = "Thank you for playing!";
            gameTexts[9] = "Invalid choice!";

        } else if (language.equals("polski")) {
            // Меню
            menuItems[0] = "GRAJ";
            menuItems[1] = "STATYSTYKI";
            menuItems[2] = "INFORMACJE";
            menuItems[3] = "ZMIEŃ JĘZYK";
            menuItems[4] = "RESETUJ STATYSTYKI";
            menuItems[5] = "WYJŚCIE";

            // Тексти гри
            gameTexts[0] = "=== GRA ORZEŁ CZY RESZKA ===";
            gameTexts[1] = "Spróbuj zgadnąć: Orzeł czy Reszka?";
            gameTexts[2] = "Orzeł";
            gameTexts[3] = "Reszka";
            gameTexts[4] = "POPRAWNIE! Zgadłeś!";
            gameTexts[5] = "ŹLE! Spróbuj ponownie!";
            gameTexts[6] = "Wyjście";
            gameTexts[7] = "Twój wybór: ";
            gameTexts[8] = "Dziękuję za grę!";
            gameTexts[9] = "Nieprawidłowy wybór!";

        } else { // Українська (за замовчуванням)
            // Меню
            menuItems[0] = "ГРАТИ";
            menuItems[1] = "СТАТИСТИКА";
            menuItems[2] = "ІНФОРМАЦІЯ";
            menuItems[3] = "ЗМІНИТИ МОВУ";
            menuItems[4] = "СКИНУТИ СТАТИСТИКУ";
            menuItems[5] = "ВИХІД";

            // Тексти гри
            gameTexts[0] = "=== ГРА 'ОРЕЛ АБО РЕШКА' ===";
            gameTexts[1] = "Спробуйте вгадати: Орел чи Решка?";
            gameTexts[2] = "Орел";
            gameTexts[3] = "Решка";
            gameTexts[4] = "ВІРНО! Ви вгадали!";
            gameTexts[5] = "НЕ ВІРНО! Спробуйте ще раз!";
            gameTexts[6] = "Вихід";
            gameTexts[7] = "Ваш вибір: ";
            gameTexts[8] = "Дякую за гру!";
            gameTexts[9] = "Невірний вибір!";
        }
    }

    // Показати головне меню
    private static void showMainMenu() {
        System.out.println("\n" + gameTexts[0]);
        System.out.println("══════════════════════════════════════");
        System.out.println(gameTexts[1]);
        System.out.println("──────────────────────────────────────");
        System.out.println("1. " + menuItems[0]);
        System.out.println("2. " + menuItems[1]);
        System.out.println("3. " + menuItems[2]);
        System.out.println("4. " + menuItems[3]);
        System.out.println("5. " + menuItems[4]);
        System.out.println("0. " + menuItems[5]);
        System.out.println("══════════════════════════════════════");
    }

    // Грати в гру
    private static void playGame(Scanner scanner, Random random) {
        System.out.println("\n══════════════════════════════════════");
        System.out.println("           " + menuItems[0]);
        System.out.println("══════════════════════════════════════");

        System.out.println("1. " + gameTexts[2] + " (1)");
        System.out.println("2. " + gameTexts[3] + " (2)");
        System.out.println("0. " + gameTexts[6]);
        System.out.print(gameTexts[7]);

        int choice = scanner.nextInt();
        if (choice == 0) return;

        if (choice != 1 && choice != 2) {
            System.out.println(gameTexts[9]);
            return;
        }

        // Підкидання монетки
        System.out.print("Монетка летить... ");
        try { Thread.sleep(1500); } catch (Exception e) {}

        int coin = random.nextInt(2) + 1; // 1 або 2
        String result = (coin == 1) ? gameTexts[2] : gameTexts[3];
        System.out.println("Випало: " + result + "!");

        // Перевірка результату
        totalGames++;
        if (choice == coin) {
            System.out.println("✅ " + gameTexts[4]);
            wins++;
        } else {
            System.out.println("❌ " + gameTexts[5]);
            losses++;
        }

        // Пауза перед поверненням до меню
        try { Thread.sleep(1000); } catch (Exception e) {}
    }

    // Показати статистику
    private static void showStatistics() {
        System.out.println("\n══════════════════════════════════════");
        System.out.println("           " + menuItems[1]);
        System.out.println("══════════════════════════════════════");

        if (totalGames == 0) {
            System.out.println("Ще не зіграно жодної гри!");
            return;
        }

        System.out.println("Всього ігор: " + totalGames);
        System.out.println("Перемоги: " + wins);
        System.out.println("Поразки: " + losses);

        double winRate = (wins * 100.0) / totalGames;
        System.out.printf("Відсоток перемог: %.1f%%\n", winRate);

        // Аналіз результатів
        System.out.println("\n📊 Аналіз:");
        if (winRate > 60) {
            System.out.println("Ви граєте дуже добре!");
        } else if (winRate > 45) {
            System.out.println("Непоганий результат!");
        } else {
            System.out.println("Трішки не пощастило...");
        }
    }

    // Показати інформацію
    private static void showInfo() {
        System.out.println("\n══════════════════════════════════════");
        System.out.println("           " + menuItems[2]);
        System.out.println("══════════════════════════════════════");

        if (language.equals("english")) {
            System.out.println("Game: Heads or Tails");
            System.out.println("Version: 1.0");
            System.out.println("Developer: Student");
            System.out.println("Contact: student@university.edu");
            System.out.println("\nRules:");
            System.out.println("1. Guess Heads or Tails");
            System.out.println("2. Coin is tossed randomly");
            System.out.println("3. Statistics are saved");
        } else if (language.equals("polski")) {
            System.out.println("Gra: Orzeł czy Reszka");
            System.out.println("Wersja: 1.0");
            System.out.println("Developer: Student");
            System.out.println("Kontakt: student@university.edu");
            System.out.println("\nZasady:");
            System.out.println("1. Zgadnij Orzeł czy Reszka");
            System.out.println("2. Moneta jest losowo rzucana");
            System.out.println("3. Statystyki są zapisywane");
        } else {
            System.out.println("Гра: Орел або Решка");
            System.out.println("Версія: 1.0");
            System.out.println("Розробник: Студент");
            System.out.println("Контакт: student@university.edu");
            System.out.println("\nПравила:");
            System.out.println("1. Вгадайте Орел чи Решка");
            System.out.println("2. Монетку підкидають випадково");
            System.out.println("3. Статистика зберігається");
        }

        System.out.println("\nНатисніть Enter для продовження...");
        try { System.in.read(); } catch (Exception e) {}
    }

    // Змінити мову
    private static void changeLanguage(Scanner scanner) {
        System.out.println("\n══════════════════════════════════════");
        System.out.println("           " + menuItems[3]);
        System.out.println("══════════════════════════════════════");

        System.out.println("1. Українська");
        System.out.println("2. English");
        System.out.println("3. Polski");
        System.out.print("Оберіть мову / Choose language: ");

        int langChoice = scanner.nextInt();
        switch (langChoice) {
            case 1: language = "ukrainian"; break;
            case 2: language = "english"; break;
            case 3: language = "polski"; break;
        }

        initializeTexts();
        System.out.println("Мову змінено / Language changed!");
    }

    // Скинути статистику
    private static void resetStatistics() {
        System.out.println("\n══════════════════════════════════════");
        System.out.println("           " + menuItems[4]);
        System.out.println("══════════════════════════════════════");

        if (language.equals("english")) {
            System.out.print("Are you sure? (yes/no): ");
        } else if (language.equals("polski")) {
            System.out.print("Jesteś pewny? (tak/nie): ");
        } else {
            System.out.print("Ви впевнені? (так/ні): ");
        }

        Scanner tempScanner = new Scanner(System.in);
        String answer = tempScanner.nextLine().toLowerCase();

        if (answer.equals("yes") || answer.equals("tak") || answer.equals("так") || answer.equals("y")) {
            totalGames = 0;
            wins = 0;
            losses = 0;

            if (language.equals("english")) {
                System.out.println("Statistics reset!");
            } else if (language.equals("polski")) {
                System.out.println("Statystyki zresetowane!");
            } else {
                System.out.println("Статистику скинуто!");
            }
        } else {
            if (language.equals("english")) {
                System.out.println("Reset cancelled.");
            } else if (language.equals("polski")) {
                System.out.println("Resetowanie anulowane.");
            } else {
                System.out.println("Скидання скасовано.");
            }
        }
    }
}