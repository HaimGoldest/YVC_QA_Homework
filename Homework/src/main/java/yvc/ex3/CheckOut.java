package yvc.ex3;

public class CheckOut {
    public static boolean checkOut(double cart, int creditRating, Status status ) {
        boolean approved = false;

        if (status == Status.gold) {
            if (cart < 3500.00)
                approved = true;
            else if (creditRating > 650)
                approved = true;
        } else {
            if (status == Status.silver) {
                if (cart < 2500.00)
                    approved = true;
                else if (creditRating > 750)
                    approved = true;
            }
            else {
                if (cart < 1500.00)
                    approved = true;
                else if (creditRating > 800)
                    approved = true;
            }
        }

        return approved;
    }
}
