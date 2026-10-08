public class Valet implements HotelService {

    @Override
    public String getServiceName() {
        return "Valet";
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("[Valet] Retrieving vehicle with plate number " + plateNumber);
    }
}