public class hesap {
    private String kullanici_adi;
    private String parola;
    private int bakiye;
    public hesap(String kullanici_adi, String parola, int bakiye) {
        this.setKullanici_adi(kullanici_adi);
        this.setParola(parola);
        this.setBakiye(bakiye);
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int tutar) {
        this.bakiye+=tutar;
        System.out.println("yeni bakiyeniz:"+bakiye);
    }
    public void paraCekme(int tutar) {
        if (tutar>bakiye) {
            System.out.println("yeterli bakiyeniz bulunmamaktadir");
        }
        else {
            bakiye-=tutar;
            System.out.println("yeni bakiyeniz:"+bakiye);
        }
    }
}


