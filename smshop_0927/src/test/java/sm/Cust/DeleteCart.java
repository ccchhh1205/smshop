package sm.Cust;
//test
import edu.sm.service.CartService;

public class DeleteCart {
    public static void main(String[] args) {
        CartService cartService = new CartService();

        int cartId = 1;

        try{
            boolean isDeleted = cartService.remove(cartId);
            if(isDeleted){
                System.out.println("Cart has been deleted.");
            } else {
                System.out.println("Cart has not been deleted.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
