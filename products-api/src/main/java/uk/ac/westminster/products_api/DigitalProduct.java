package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadURL;
    private double fileSizeMb;

    public DigitalProduct(){}

    public DigitalProduct(Long id, String name, double price, String downloadURL, double fileSizeMb){
        super(id, name, price);
        this.downloadURL =  downloadURL;
        this.fileSizeMb = fileSizeMb;
    }
    public String getDownloadURL(){return downloadURL;}
    public double getFileSizeMb(){return fileSizeMb;}
}
