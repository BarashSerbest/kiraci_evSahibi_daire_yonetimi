public class Kiraci {
    private String adi;
    private String soyadi;
    private EvSahibi evSahibi = null;
    private Daire kiralananDaire = null;

    // "evSahibi" alanı için Get ve Set metodu.
    public EvSahibi getEvSahibi() {
        return evSahibi;
    }
    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }

    // "kiralananDaire" alanı için Get ve Set metodu.
    public Daire getKiralananDaire() {
        return kiralananDaire;
    }
    public void setKiralananDaire(Daire kiralananDaire) {
        this.kiralananDaire = kiralananDaire;
    }

    // Yapıcı metot içerisinde kiracının "adı", "soyadı" ve "ev sahibi" bilgisi bu sınıftan bir nesne oluşturulacağı zaman isteniyor.
    public Kiraci(String adi, String soyadi, EvSahibi evSahibi) {
        this.adi = adi;
        this.soyadi = soyadi;
        setEvSahibi(evSahibi);
    }

    // Kiraci daire kiralamak için "evSahibi" ve "daireNo" bilgilerini giriyor ve koşullar sağlanırsa kiralama için gerekli işlemler yapılıyor.
    public void evKirala(EvSahibi evSahibi, int daireNo) {
        // Kiracının ev sahibi olup olmadığını ve belirtilen daire numarasını sahip olunan daireler içinde bulunup bulamadığını kontrol etme
        if (getEvSahibi() != null && evSahibi.getSahipOlunanDaireNo().contains(daireNo)) {
            setEvSahibi(evSahibi);
            if (kiralananDaire == null) {
                // Parametre ile alınan "daireNo" ile ev sahibinin sahip olduğu daireler içerisinde aynı "daireNo"ya sahip daire nesnesi var ise kiralanan daireyi ayarlama
                for (Daire daire : getEvSahibi().getSahipOlunanDaireler()) {
                    if (daire.getDaireNo() == daireNo) {
                        setKiralananDaire(daire);
                        break;
                    }
                }
            }
        }
    }

    public String displayInfo(){
        return "- Kiracının Adı: " + this.adi + " - Soyadı: " + this.soyadi +
                " \n- Kiraladığı ev bilgisi: " + getKiralananDaire().displayInfo() +
                " \n- Kiraladığı ev sahibinin bilgileri: " + getEvSahibi().displayInfo();
    }
}
