public class Main {

    public static void main(String[] args) {
	double[] myList ={1.2,1.3,4.3,5.6};
    double total=0;
    double enBuyuk=myList[0];

    for(double number:myList){
        total=total+number;
        System.out.println(number);
    }
    System.out.println("toplam="+total);

    for(double max:myList){
        if(enBuyuk<max){
            enBuyuk=max;
        }
    }

    System.out.println("En büyük sayı:"+enBuyuk);
    }
}
