package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


   public  PriceList(){

    }
   public  PriceList(double ballPrice,double rocketPrice,double magnumStandardPrice){
       this.ballPrice=ballPrice;
       this.magnumStandardPrice=magnumStandardPrice;
       this.rocketPrice=rocketPrice;

   }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(MagnumType ALPINEUTS) {
    return 1.5*magnumStandardPrice ;

    }
    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
