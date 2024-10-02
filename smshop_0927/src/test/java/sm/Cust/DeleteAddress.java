package sm.Cust;
//test1
import edu.sm.service.AddressService;

public class DeleteAddress {
    public static void main(String[] args) {
        AddressService addressService = new AddressService();

        int ine = 12;

        try {
            addressService.remove(String.valueOf(ine));
            System.out.println("주소가 삭제되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}