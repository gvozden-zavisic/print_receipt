package model;
public class Article {
    public String name;
    public int ean;
    public String unit;
    public double priceWithTaxPerPiece;
    public double priceWithoutTaxPerPiece;
    public int tax;
    public double priceWithTaxAllPieces;
    public int qty;
    public double taxAllPieces; 
    
    public Article(int ean, String name, String unit, int qty, double priceWithTaxPerPiece, int tax){
    this.ean = ean;
    this.name = name;
    this.unit = unit;
    this.priceWithTaxPerPiece = priceWithTaxPerPiece;
    this.qty = qty;
    this.tax = tax;
    this.priceWithoutTaxPerPiece = this.priceWithTaxPerPiece / (1+this.tax*0.01);
    this.taxAllPieces = this.priceWithoutTaxPerPiece * this.tax / 100 * this.qty;
    this.priceWithTaxAllPieces = this.priceWithTaxPerPiece * this.qty;
    
    
    }
}
