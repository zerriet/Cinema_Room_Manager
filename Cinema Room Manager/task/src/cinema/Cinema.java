package cinema;

import java.util.Scanner;

public class Cinema {

    static char[][] cinemaSeats;
    static final int TICKET_NORMAL_PRICE = 10;
    static final int TICKET_LOW_PRICE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows:\n> ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        int seats = scanner.nextInt();

        cinemaSeats = new char[rows][seats];
        initializeSeats();




        while (true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printCinemaLayout();
                    break;
                case 2:
                    buyTicket(scanner);
                    break;
                case 3:
                    showStatistics();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    public static void initializeSeats() {
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                cinemaSeats[i][j] = 'S';
            }
        }
    }

    public static void printCinemaLayout() {
        System.out.println("\nCinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinemaSeats[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < cinemaSeats.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                System.out.print(" " + cinemaSeats[i][j]);
            }
            System.out.println();
        }
    }

    public static void buyTicket(Scanner scanner) {
        int rowNumber, seatNumber;
        while (true) {
            System.out.print("Enter a row number:\n> ");
            rowNumber = scanner.nextInt();
            System.out.print("Enter a seat number in that row:\n> ");
            seatNumber = scanner.nextInt();

            if (rowNumber <= 0 || rowNumber > cinemaSeats.length || seatNumber <= 0 || seatNumber > cinemaSeats[0].length) {
                System.out.println("Wrong input!");
                continue;
            }
            if (cinemaSeats[rowNumber - 1][seatNumber - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                continue;
            } else {
                break;
            }
        }

        int ticketPrice = calculateTicketPrice(rowNumber);
        System.out.println("Ticket price: $" + ticketPrice);
        cinemaSeats[rowNumber - 1][seatNumber - 1] = 'B';
    }

    public static int calculateTicketPrice(int rowNumber) {
        if (cinemaSeats.length * cinemaSeats[0].length <= 60) {
            return TICKET_NORMAL_PRICE;
        } else {
            return (rowNumber <= cinemaSeats.length / 2) ? TICKET_NORMAL_PRICE : TICKET_LOW_PRICE;
        }
    }

    public static void showStatistics() {
        int totalSeats = cinemaSeats.length * cinemaSeats[0].length;
        int bookedSeats = 0;
        int currentIncome = 0;
        int totalIncome = 0;

        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                if (cinemaSeats[i][j] == 'B') {
                    bookedSeats++;
                    currentIncome += calculateTicketPrice(i + 1);
                }
                totalIncome += calculateTicketPrice(i + 1);
            }
        }

        double percentage = (double) bookedSeats / totalSeats * 100;

        System.out.println("Number of purchased tickets: " + bookedSeats);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }
}
