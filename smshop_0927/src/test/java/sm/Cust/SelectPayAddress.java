package sm.Cust;
//test
import edu.sm.service.PayService;
import edu.sm.dto.Address;

import java.sql.SQLException;
import java.util.List;

public class SelectPayAddress {
    public static void main(String[] args) {
        try {
            PayService payService = new PayService();  // SQLException 처리
            int custKey = 2;

            List<Address> address = payService.getselectPay(custKey);

            for (Address add : address) {
                System.out.println("Address Key: " + add.getAddressKey() +
                        ", 집 주소: " + add.getZipnum() +
                        ", 지번: " + add.getAddrD());
            }
        } catch (SQLException e) {
            e.printStackTrace();  // 예외 발생 시 처리
        } catch (Exception e) {
            e.printStackTrace();  // 다른 예외 처리
        }
    }
}
