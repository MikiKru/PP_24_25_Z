package org.example.lect5;

class Price{
    public static final int VAT_23 = 23;
    public static final int VAT_8 = 8;
    public static final int VAT_5 = 5;
    //cena w groszach
    final public int price;
    //vat w promilach
    private int vat;
    public Price(int price, int vat){
        this.price = price;
        this.vat = vat;
    }
    public double getBrutto(){
        return price * (1 + (double) this.vat / 100);
    }
    public void setVat(int vat){
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                ", vat=" + vat +
                '}';
    }

    public static void main(String[] args) {
        Price price1 = new Price(1000, VAT_23);
        System.out.println(price1);
        price1.setVat(VAT_8);
        System.out.println(price1);
        System.out.println(price1.getBrutto());
    }
}
