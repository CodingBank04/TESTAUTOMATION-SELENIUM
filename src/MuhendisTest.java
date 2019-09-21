public class MuhendisTest {
    public static void main(String[] args) {

        PcMuhendis muhendis1= new PcMuhendis(false, false);
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));

        String [] tecube ={"vestel", "havelsan","turksat"};
        muhendis1.is_tecrubesi(tecube);



    }
}
