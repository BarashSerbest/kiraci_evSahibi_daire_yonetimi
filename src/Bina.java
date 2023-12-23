public class Bina extends Konut{
    private int numberOfFloors;

    // "numberOfFloors" alanı için Get ve Set metodu
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    // Yapıcı metot içerisinde "adres" ve "kat" bilgisi bu sınıftan bir nesne oluşturulacağı zaman isteniyor.
    public Bina(String address, int numberOfFloors) {
        super(address);
        setNumberOfFloors(numberOfFloors);
    }

    @Override
    public String displayInfo() {
        return "Adres: " + super.displayInfo() + " - Bina kat sayısı: " + getNumberOfFloors();
    }
}
