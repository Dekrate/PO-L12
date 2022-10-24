public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(true, 16);
        phone.turnOnOrOff();
        int i = phone.timeFromDevice();
        System.out.println(phone);
        System.out.println("Godzina: " + i);
    }
}
