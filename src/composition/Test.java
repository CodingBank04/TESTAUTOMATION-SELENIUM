package composition;

public class Test {
    public static void main(String[] args) {

        Resolution resolution=new Resolution(1920,1980);
        Monitor monitor=new Monitor("vs197de","asus","18.5", resolution);

        Kasa kasa =new Kasa("Shadow Blade","Shadow", "Temperli Cam");

        Anakart anakart =new Anakart("B250-PRO","ASUS",10,"Windows 10");

        Bilgisiyar pc =new Bilgisiyar(monitor,kasa,anakart);

        pc.getKasa().bigisiyari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().islteim_sistemi_yukle("ubuntu 16.04");

    }
}
