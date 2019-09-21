public class PcMuhendis implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendis(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("askerligimi yaptim ");
        }
        else{
            System.out.println("askerligi yapmadim ");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "ortalma"+ derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("adli sicil kaydinin bulunuyor");
        }
        else{
            System.out.println("herhangi bir adli sicil kaydininiz bulunmuyor");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("bilgisiyar muhendis olarak su sirketlerde calistim ");

        for(int i=0 ; i<array.length; i++){
            System.out.println(i);
        }

    }
}
