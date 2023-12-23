import java.util.ArrayList;
import java.util.List;

public class EvSahibi {
    private String adi;
    private String soyadi;
    private Bina bina = null;
    private List<Daire> sahipOlunanDaireler = new ArrayList<>();
    private List<Integer> sahipOlunanDaireNo = new ArrayList<>();

    // "bina" alanı için Get ve Set metodu.
    public Bina getBina() {
        return bina;
    }
    public void setBina(Bina bina) {
        this.bina = bina;
    }

    // "sahipOlunanDaireler" alanı için Get ve Set metodu.
    public List<Daire> getSahipOlunanDaireler() {
        return sahipOlunanDaireler;
    }
    public void setSahipOlunanDaireler(Daire daire) {
        if(!sahipOlunanDaireler.contains(daire)){
            this.sahipOlunanDaireler.add(daire);
        }else {
            System.out.println("Bu daireye zaten sahipsiniz!");
        }
    }

    // "sahipOlunanDaireNo" alanı için Get ve Set metodu.
    public List<Integer> getSahipOlunanDaireNo() {
        return sahipOlunanDaireNo;
    }
    public void setSahipOlunanDaireNo(int sahipOlunanDaireNo) {
        this.sahipOlunanDaireNo.add(sahipOlunanDaireNo);
    }

    // Yapıcı metot içerisinde ev sahibinin "adı", "soyadı" ve "bina" bilgisi bu sınıftan bir nesne oluşturulacağı zaman isteniyor.
    public EvSahibi(String adi, String soyadi, Bina bina) {
        this.adi = adi;
        this.soyadi = soyadi;
        setBina(bina);
    }

    // Ev sahibi tek bir "Daire" nesnesi eklediğinde daire bilgileri ekleniyor.
    public void addApartment(Daire daire){
        setSahipOlunanDaireler(daire);
        setSahipOlunanDaireNo(daire.getDaireNo());
    }

    // Ev sahibi birden fazla "Daire" nesnesi içeren liste eklediğinde daire bilgileri ekleniyor.
    public void addApartment(List<Daire> daireListesi){
        for (Daire daire : daireListesi) {
            setSahipOlunanDaireler(daire);
            setSahipOlunanDaireNo(daire.getDaireNo());
        }
    }

    public String displayInfo(){
        return "Ev sahibinin Adı: " + this.adi + " - Soyadı: " + this.soyadi +
                " \n- Bina bilgileri: - " + getBina().displayInfo();
    }
}
