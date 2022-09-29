public class Main {

    public static void main(String[] args) {
	Product product = new Product(1,"laptop","Asus Laptop",3000,2,"siyah");

    //bunları bu şekilde yazmak yerine yukarıdaki gibi parametreli constructorda yazabiliriz.
    //fakat aşağıdaki gibi kullanmak istersekte boş bir constructor oluşturabilirz.
    /*product.setName("Laptop");
    product.setId(1);
    product.setDescription("Asus Laptop");
    product.setPrice(5000);
    product.setStockAmount(3);*/


    ProductManager productManager =new ProductManager();
    productManager.Add(product);
    System.out.println(product.getKod());
    }
}
