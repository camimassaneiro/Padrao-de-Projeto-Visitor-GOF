/**
 *
 * @author camil
 * https://www.youtube.com/watch?v=pL4mOUDi54o&t=726s
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TaxVisitor tx = new TaxVisitor();
        TaxHolidayVisitor txh = new TaxHolidayVisitor();
        
        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tabacco cigar = new Tabacco(19.99);
        
        System.out.println(milk.accept(tx));
        System.out.println(vodka.accept(tx));
        System.out.println(cigar.accept(tx));
        
        System.out.println("Holiday");
        System.out.println(milk.accept(txh));
        System.out.println(vodka.accept(txh));
        System.out.println(cigar.accept(txh));
    }
    
}
