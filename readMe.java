import java.util.Scanner;

public class readMe {
    private int breakfastCharge;
    private int singleAvailable;
    private int doubleAvailable;
    private singleRoom single;
    private doubleRoom doubleR;

    public readMe(singleRoom single, doubleRoom doubleR, int breakfastCharge, int singleAvailable, int doubleAvailable) {
        this.single = single;
        this.doubleR = doubleR;
        this.breakfastCharge = breakfastCharge;
        this.singleAvailable = singleAvailable;
        this.doubleAvailable = doubleAvailable;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        int bookingNum = 1;
        System.out.println("Welcome to the hotel reservation system!");
        while (true) {
            double roomCharge;
            double payment;
            System.out.println("Single bed rooms: Total - " + single.getSingleTotal() + " , Available- " + singleAvailable + " , Price per room- " + single.getSinglePricePerRoom());
            System.out.println("Double bed rooms: Total - " + doubleR.getDoubleTotal() + " , Available- " + doubleAvailable + " , Price per room- " + doubleR.getDoublePricePerRoom());
            System.out.println("What type of room do you need? ");
            String roomType = scanner.nextLine();
            if ("single".equals(roomType) && singleAvailable > 0) {
                singleAvailable--;
                roomCharge = single.getSinglePricePerRoom();
            } else if ("double".equals(roomType) && doubleAvailable > 0) {
                doubleAvailable--;
                roomCharge = doubleR.getDoublePricePerRoom();
            } else {
                System.out.println("Sorry, you have no availability! But you can try the other option; there are single and double bedrooms.");
                continue;
            }
            System.out.println("Do you want breakfast? (Y/N)");
            String wantBreakfast = scanner.nextLine();
            if ("Y".equals(wantBreakfast)) {
                System.out.println("Breakfast will be provided for " + breakfastCharge);
                payment = breakfastCharge + roomCharge;
            } else {
                payment = roomCharge;
            }
            System.out.println("Booking number- " + bookingNum);
            bookingNum++;
            System.out.println("Room is booked. Pay: " + payment);
            System.out.print("Do you want to make another booking? (Y/N) ");
            String wantAnother = scanner.nextLine();
            if ("N".equals(wantAnother)) {
                System.out.println("Thank you for using the hotel reservation system!");
                break;
            }
        }
    }
}
