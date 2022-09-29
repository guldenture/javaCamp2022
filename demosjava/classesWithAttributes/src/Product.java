public class Product {


  public Product(int id,String name,String description,double price,int stockAmount,String renk){  //constructor classın ismiyle aynı olmalı.
    System.out.println("Yapıcı blok çalıştı");
    this.id=id;
    this.name=name;
    this.price=price;
    this.description=description;
    this.stockAmount=stockAmount;
  }

  //attribute | field
  private String name;
  private int id;
  private String description;
  private double price;
  private int stockAmount;
  private String renk;
  private String kod;


   //this.id demek bu clastaki id demek
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStockAmount() {
    return stockAmount;
  }

  public void setStockAmount(int stockAmount) {
    this.stockAmount = stockAmount;
  }


  public String getRenk() {
    return renk;
  }

  public void setRenk(String renk) {
    this.renk = renk;
  }

  public String getKod() {
    return this.name.substring(0,1) + id;
  }


}
//Classların diğer bir özelliği ise özellik tutmasıdır.



