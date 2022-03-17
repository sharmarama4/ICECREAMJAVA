package be.intecbrussel.application;
import be.intecbrussel.eatables.*;

import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
      PriceList priceList=new PriceList(.5,1,1.5);
     IceCreamSeller iceCreamSeller=new IceCreamSalon(priceList);

   Eatable [] eatables={iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE),
           iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS),
           iceCreamSeller.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES),
           iceCreamSeller.orderMagnum(MagnumType.MILKCHOCOLATE),
           iceCreamSeller.orderMagnum(MagnumType.WHITECHOCOLATE),
           iceCreamSeller.orderMagnum(MagnumType.WHITECHOCOLATE),
           iceCreamSeller.orderIceRocket(),
            iceCreamSeller.orderCone(Flavor.values())};
       for(Eatable iceSalon: eatables){
           System.out.println(iceSalon);// Arrays
           iceSalon.eat();
       }
        System.out.println("The profit van de Icecreamseller is = "+ ((IceCreamSalon) iceCreamSeller).getProfit());
    }
}
