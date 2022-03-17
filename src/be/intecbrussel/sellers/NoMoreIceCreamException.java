package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends Exception {


    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public static void orderCone(double cone)
            throws NoMoreIceCreamException {

    }

    public static void orderIceRocket(double iceRocket)
            throws NoMoreIceCreamException {
;
    }

}

  /*   public static void OrderIceRocket(double iceRocket) {
            if (iceRocket < 5) {
                throws NoMoreIceCreamException("Not enough IceRocket in Car");
            } else {
                System.out.println("Get order of IceRocket");
            }

        }

        public static void setOrderCone(double cone) {
            if (cone < 2) {
                throw new ArithmeticException("Not enough Cone in Car");
            } else {
                System.out.println("Get order of Cone");
            }

        }
        public static void orderMagnum(double magnum) {
            if (magnum < 1) {
                throw new ArithmeticException("Not enough Magnum in the car");
            }else {
                System.out.println("Get order of Magnum");
            }

}


}*/
