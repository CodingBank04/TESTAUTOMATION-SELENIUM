public class MakinaMuhendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public MakinaMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {


    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return null;
    }

    @Override
    public void adli_sicil_sorgula() {

    }

    @Override
    public void is_tecrubesi(String[] array) {

    }
}
