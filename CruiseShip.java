public class CruiseShip extends Ship {
    private static String[] availablePackageArr = {"Srilanka", "Chennai", "Goa"};
    private static int[] priceArr = {65000, 25000, 30000};
    private boolean adventureActivity;

    public CruiseShip(Passenger passenger, boolean adventureActivity) {
        super(passenger);
        this.adventureActivity = adventureActivity;
    }

    @Override
    public void calculateBill(String cuisine) {
        boolean value = super.getPassenger().validatePassengerDetails();

        if(value == false) {
            this.setBookingId("NA");
            this.setBillAmount(-1.0);
        } else {
            for (int i = 0; i < availablePackageArr.length; i++) {
                if(availablePackageArr[i] == super.getPassenger().getPackageType()) {
                    
                }
            }
        }
        
    }
}