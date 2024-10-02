package sm.Cust;

import edu.sm.dto.Address;
import edu.sm.service.AddressService;

public class InsertAddress {
    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        Address address = Address.builder()
                .addressKey(13)
                .custKey(2)
                .zipnum("1215")
                .addrD("네이처")
                .build();

        try {
            addressService.add(address);
        } catch (Exception e) {
            System.out.println("시스템 장애");
            e.printStackTrace();
        }
    }
}
