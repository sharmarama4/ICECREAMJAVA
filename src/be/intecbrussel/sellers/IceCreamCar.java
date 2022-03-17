package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller,Profitable {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar() {

    }

    public IceCreamCar(Stock stock, PriceList priceList) {
        this.stock = stock;
        this.priceList = priceList;
    }

    public IceCreamCar(PriceList priceList, Stock stock, double profit) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = 0;
    }

    public IceCreamCar(PriceList priceList, Stock stock) {
    }

    @Override
    public Cone orderCone(Flavor[] flavors) {
        profit+= flavors.length*stock.getCones();
        return prePareCone(flavors);
    }

    private Cone prePareCone(Flavor[] flavors) {
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        profit+=stock.getIceRockets();
        return prepareIceRocket();
    }

    private IceRocket prepareIceRocket() {
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        profit+=stock.getMagni();
        return prepareMagnum();
    }

    private Magnum prepareMagnum() {
        return new Magnum(MagnumType.ROMANTICSTRAWBERRIES);
    }
    public Cone prepareCone(Flavor[] flavors) {
        profit += flavors.length * stock.getBalls();
        return new Cone(flavors);
    }
    @Override
    public double getProfit() {
        return profit;
    }
}
