public class Main {
    public static void main(String[] args) {
        Sarunk sarunk1 = new Sarunk();
        sarunk1.setType("Gajah Duduk");
        sarunk1.setDamage(100);

        SangPetarunk petarunk1 = new SangPetarunk("Ananta Waskita", sarunk1.getType(), sarunk1.getDamage(), 1000, 1.0);

        Sarunk sarunk2 = new Sarunk("Wadimor", 150);

        SangPetarunk petarunk2 = new SangPetarunk();
        petarunk2.setName("Rezka Wildan");
        petarunk2.setSarunk(sarunk2);
        petarunk2.setHealth(1000);
        petarunk2.setCoordinate(2.5);

        printBarriers();
        petarunk1.checkStatus();
        printBarriers();
        petarunk2.checkStatus();

        printBarriers();
        petarunk1.launchBattleTo(petarunk2);

        printBarriers();
        petarunk1.travelToCoordinate(2.5);

        printBarriers();
        petarunk1.launchBattleTo(petarunk2);

        printBarriers();
        petarunk1.checkStatus();
        printBarriers();
        petarunk2.checkStatus();

        printBarriers();
        petarunk2.upgradeSarunk("Super Wadimor", 500);

        printBarriers();
        petarunk2.launchBattleTo(petarunk1);

        printBarriers();
        petarunk1.checkStatus();
        printBarriers();
        petarunk2.checkStatus();

        printBarriers();
        petarunk2.travelToCoordinate(1.5);

        printBarriers();
    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}
