
/**
 *
 * @author camil
 */
public class TaxVisitor implements Visitor{

    public TaxVisitor() {
    }
    
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: preço com taxa ");
        return (liquorItem.getPrice() * 0.18) + liquorItem.getPrice();
    }
    
    @Override
    public double visit(Tabacco tabaccoItem) {
        System.out.println("Tabacco Item: preço com taxa ");
        return (tabaccoItem.getPrice() * 0.32) + tabaccoItem.getPrice();
    }
    
    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: preço com taxa ");
        return (necessityItem.getPrice() * 0) + necessityItem.getPrice();
    }
    
}
