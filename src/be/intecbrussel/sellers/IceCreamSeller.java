package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller {

Cone orderCone(Flavor[] flavors);
IceRocket orderIceRocket();
Magnum orderMagnum( MagnumType magnumType);

}
