import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Daire extends Konut{
    private int apartmentNumber;
    private int daireNo;

    // "apartmentNumber" alanı için Get ve Set metodu.
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    // "daireNo" alanı için Get ve Set metodu.
    public int getDaireNo() {
        return daireNo;
    }
    public void setDaireNo(int daireNo) {
        this.daireNo = daireNo;
    }

    // Yapıcı metot içerisinde "adres", "apartman numarası" ve "daire No" bilgisi bu sınıftan bir nesne oluşturulacağı zaman isteniyor.
    public Daire(String address, int apartmentNumber, int daireNo) {
        super(address);
        this.setApartmentNumber(apartmentNumber);
        this.daireNo = daireNo;
    }

    @Override
    public String displayInfo(){
        return "Adres: " + super.displayInfo() +
                " - Apartman numarası: " + getApartmentNumber() +
                " - Daire No: " + getDaireNo();
    }

    // Daireleri sadece daire numarasına göre sıralar.
    public void compareTo(List<Daire> daireListesi) {
        Collections.sort(daireListesi, Comparator.comparingInt(Daire::getDaireNo));
    }

    // Kullanıcı tarafından verilen daire listesini "apartmentNumber" alanına göre sıralar, apartman numaraları aynı ise "daireNo" alanına göre sıralar.
    // Static olarak tanımlandığı için nesne oluşturulmadan doğrudan sınıf ile erişilerek kullanılabilir.
    public static void sirala(List<Daire> daireListesi) {
        Collections.sort(daireListesi, Comparator
                .comparingInt(Daire::getApartmentNumber)
                .thenComparingInt(Daire::getDaireNo)
        );
    }
}
