import java.util.ArrayList;

public class mp3Player {
    private String brand;
    private String producer;
    private int storage; // in gigabytes
    private ArrayList<String> supportedFormats;

    public mp3Player(String brand, String producer, int storage, ArrayList<String> supportedFormats) {
        this.brand = brand;
        this.producer = producer;
        this.storage = storage;
        this.supportedFormats = supportedFormats;
    }

    public mp3Player(String brand, String producer, int storage) {
        this(brand, producer, storage, null); // teacher said it had been ok :)
    }

    public mp3Player(String brand, String producer, ArrayList<String> supportedFormats) {
        this.brand = brand;
        this.producer = producer;
        this.supportedFormats = supportedFormats;
    }

    @Override
    public String toString() {
        String result = "mp3Player{" +
                "brand='" + brand + '\'' +
                ", producer='" + producer + '\'' +
                ", storage=" + storage;
        if (supportedFormats != null) {
            result += ", supportedFormats=" + supportedFormats +
                '}';
        }
        return result;
    }
}
