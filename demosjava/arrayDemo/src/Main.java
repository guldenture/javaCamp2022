public class Main {

    public static void main(String[] args) {
        String [] ogrenciler =new String[3]; //dizi tanımlamasını yaptık
        ogrenciler[0]="Engin";//dizi indexleri 0'dan başlar.
        ogrenciler[1]="Damla";
        ogrenciler[2]="Gülden";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        //for döngüsünün farklı kullanımı genellikle bu kullanılır
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
