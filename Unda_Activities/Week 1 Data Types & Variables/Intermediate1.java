
public class Intermediate1 {
    public static void main(String[] args) {
    
    int quant = 10;
    double unitprice = 100;
    String store = "UKAY-UKAY";
    double totalcost;
    
    
    totalcost = quant * unitprice;
    
        System.out.println("STORE: " + store);
        System.out.println("QUANTITY: " + quant);
        System.out.println("UNIT PRICE: " + unitprice);
        System.out.println("TOTAL: " + totalcost);
    
    /* The `double` type was used because the total cost might have a decimal value. */
    }
}
