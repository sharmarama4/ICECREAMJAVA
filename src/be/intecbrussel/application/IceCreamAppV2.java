package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;

import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

import java.util.Scanner;

import static java.lang.System.out;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        Stock stock = new Stock(12, 15, 20, 20);
        PriceList priceList = new PriceList(2, 4, 5);
        IceCreamSeller iceCreamSeller = new IceCreamCar(stock, priceList);

        iceCreamSeller.orderIceRocket();
        Eatable[] eatables = {iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE),
                iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS),
                iceCreamSeller.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSeller.orderMagnum(MagnumType.MILKCHOCOLATE),
                iceCreamSeller.orderMagnum(MagnumType.WHITECHOCOLATE),
                iceCreamSeller.orderMagnum(MagnumType.WHITECHOCOLATE),
                iceCreamSeller.orderIceRocket(),
                iceCreamSeller.orderCone(new Flavor[]{Flavor.BANANA,
                        Flavor.CHOCOLATE, Flavor.LEMON, Flavor.MOKKA,
                        Flavor.PISTACHE, Flavor.STRACCIATELLA, Flavor.STRAWBERRY,
                        Flavor.VANILLA})};
        for (Eatable iceSalon : eatables) {
            System.out.println(iceSalon);
            iceSalon.eat();
        }
     System.out.println("The profit van de Icecreamseller is = " + ((IceCreamCar) iceCreamSeller).getProfit());

        Scanner kbd = new Scanner(System.in);
       System. out.println("Please enter the order of the RocketIceCream");
        double orderRocketIceCream = kbd.nextDouble();
   if(orderRocketIceCream>stock.getIceRockets()){
       try {
           throw new NoMoreIceCreamException();
       }
       catch (Exception e){
           System.out.println(e);

       }
   }
        }
    }
