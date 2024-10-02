package sm.Cust;
//test
import edu.sm.dto.Review;
import edu.sm.service.ReviewService;
import java.sql.Timestamp;
import java.util.Date;

public class ReviewUpdate {
    public static void main(String[] args) {
        ReviewService reviewService = new ReviewService();
        Timestamp timestamp = new Timestamp(new Date().getTime());
        // 업데이트할 review 객체 생성
        Review review = Review.builder()
                .reviewKey(1)
                .title("Go To Home")
                .content("나는 간다 바이바이")
                .rate(5)

                .build();

        try {
            reviewService.modify(review);  // 수정된 review 객체로 modify 호출
            System.out.println("리뷰 수정 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
