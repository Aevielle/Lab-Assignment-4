public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Individual requests ===");
        frontDesk.requestLuggageCarts(2);
        frontDesk.requestVehiclePickUp("ABC-1234");
        frontDesk.requestRoomCleaning(305);

        System.out.println();
        System.out.println("=== Full check-out ===");
        frontDesk.checkOut(305, "ABC-1234", 2);
    }
}