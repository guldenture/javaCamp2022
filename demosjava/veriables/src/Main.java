public class Main {

    public static void main(String[] args) {
        int ogrenciSayisi=12;
	    System.out.println("Öğrenci sayım:"+ogrenciSayisi);
        System.out.println("Öğrenci sayım:"+ogrenciSayisi);
        System.out.println("Öğrenci sayım:"+ogrenciSayisi);

        //öğrenci sayısınıda tekrar tekrar yazmak yerine onuda bir değişkene atayıp tekrar tekrar uzun şekilde yazmamıza gerek kalmaz

        String mesaj="Öğrenci sayım";
        System.out.println(mesaj +":"+ ogrenciSayisi);
        System.out.println(mesaj+":"+ogrenciSayisi);
        System.out.println(mesaj+":"+ogrenciSayisi);
    }
}
