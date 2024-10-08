package sm.Cust;
//test1
import java.sql.Timestamp;
import java.util.Date;

import edu.sm.dto.Review;
import edu.sm.service.ReviewService;

public class ReviewInsert {
    public static void main(String[] args) {
        // 현재 시간의 Timestamp 생성
        Timestamp timestamp = new Timestamp(new Date().getTime());

        // Review 객체 빌드
        ReviewService reviewService = new ReviewService();
        Review review = Review.builder()
                .reviewKey(1)
                .custKey(3)
                .itemKey(3)
                .managerKey(1)  // managerKey 값 추가
                .title("총맞음")
                .content("집가고싶다")
                .img("이미지완")
                .rdate(timestamp)  // 생성한 Timestamp 사용
                .rate(1)
                .answer("살려주세요.")
                .build();
        try {
            reviewService.add(review);
            System.out.println("리뷰 등록");
        } catch (Exception e) {
            System.out.println("시스템 장애");
            e.printStackTrace();
        }
    }
}
