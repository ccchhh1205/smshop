package sm.Cust;

import edu.sm.service.ReviewService;

public class ReviewDelete {
    public static void main(String[] args) {
        ReviewService reviewService = new ReviewService();
        String reviewKey = "1";

        try {
            System.out.println("리뷰 삭제 완료");
            reviewService.remove(reviewKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

