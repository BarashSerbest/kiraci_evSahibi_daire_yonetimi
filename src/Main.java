import java.util.ArrayList;
import java.util.List;
// Barash Serbest - 5220505051

public class Main {
    public static void main(String[] args) {
        // Daire sınıfından oluşturulan nesneleri tutacak liste oluşturuluyor.
        List<Daire> daireListesi = new ArrayList<>();
        daireListesi.add(new Daire("Kırklareli / Merkez - Cumhuriyet Mahallesi - 53. Sokak",7,7));
        daireListesi.add(new Daire("Kırklareli / Merkez - Cumhuriyet Mahallesi - 53. Sokak",7,5));
        daireListesi.add(new Daire("Kırklareli / Lüleburgaz - Atatürk Mahallesi - Yıldız Sokak",4,3));
        daireListesi.add(new Daire("Kırklareli / Lüleburgaz - Atatürk Mahallesi - Yıldız Sokak",4,2));

        // EvSahibi sınıfı için bir nesne oluşturuluyor, sahip olduğu evler bir "liste" halinde ekleniyor, "sıralanmamış" ve "sıralanmış" şekilde konsola yazdırılıyor.
        EvSahibi evSahibi = new EvSahibi("Shaggy","Rogers",new Bina("Kırklareli",5));
        evSahibi.addApartment(daireListesi);

        System.out.println("\nEv sahibinin sahip olduğu evlerin sıralanmamış bilgisi:");
        for(Daire daire : evSahibi.getSahipOlunanDaireler()){
            System.out.println("Apartman numarası: " + daire.getApartmentNumber() + " - Daire numarası: " + daire.getDaireNo() + " - Adresi: " + daire.getAddress());
        }

        // evSahibi nesnesinin düzensiz aldığı "daireListesi" içerisindeki Daire nesnelerini Apartman numarasına göre sıralıyor, apartman numarasına göre sıralanmış nesneleri de daireNo'larına göre sıralıyor.
        Daire.sirala(evSahibi.getSahipOlunanDaireler());

        System.out.println("\nEv sahibinin sahip olduğu evlerin sıralandıktan sonraki bilgisi:");
        for(Daire daire : evSahibi.getSahipOlunanDaireler()){
            System.out.println("Apartman numarası: " + daire.getApartmentNumber() + " - Daire numarası: " + daire.getDaireNo() + " - Adresi: " + daire.getAddress());
        }
        System.out.println("\n" + evSahibi.displayInfo()); // "EvSahibi" sınıfının displayInfo metodu kullanılıyor.

        // Kiraci sınıfından bir nesne oluşturuluyor, evKirala metoduna "evSahibi" ve "daireNo" bilgileri verilerek kiralama işlemi gerçekleştiriliyor.
        Kiraci kiraci = new Kiraci("Barash", "Serbest", evSahibi);
        kiraci.evKirala(evSahibi,3);
        System.out.println("\n"+kiraci.displayInfo()); // "Kiraci" sınıfının displayInfo metodu kullanılıyor.
    }
}