public class Main {

    public static void main(String[] args) {
	int[] sayilar = new int[]{1,2,5,7,9,0};
    int aranacak=9;
    boolean varMi=false;
    /*
    for(int i=0;i<6;i++){
        if(sayilar[i]==aranacak){
            System.out.println("aranan eleman "+ i +". elemandır");
        }
    }
     */
        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        System.out.println("Bu sayı "+ varMi);

    }
}
