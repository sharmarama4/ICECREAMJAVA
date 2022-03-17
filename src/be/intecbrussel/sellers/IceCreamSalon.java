package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller,Profitable{
    private PriceList pricelist;
    private double totalProfit;

    public IceCreamSalon() {

    }
  public IceCreamSalon(PriceList priceList){
        this.pricelist=priceList;
  }
    public IceCreamSalon(PriceList pricelist, double totalProfit) {
        this.pricelist = pricelist;
        this.totalProfit =0;
    }


    @Override
    public double getProfit() {

        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        totalProfit+= flavors.length* pricelist.getBallPrice();
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit+=pricelist.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        totalProfit+=pricelist.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + pricelist +
                ", totalProfit=" + totalProfit +
                '}';
    }
}