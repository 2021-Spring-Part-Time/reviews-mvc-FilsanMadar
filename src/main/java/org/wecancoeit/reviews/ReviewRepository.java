package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review suga = new Review (1L, "Suga", "Korean borne rapper is in BTS!");
        Review rM = new Review (2L, "RM", "Korean borne rapper that is in BTS!");
        Review jHope = new Review (3L, "j-hope", "Korean borne rapper that is in BTS!");

        reviewList.put(suga.getId(), suga);
        reviewList.put(rM.getId(), rM);
        reviewList.put(jHope.getId(), jHope);
    }

    public ReviewRepository(Review ...reviewToAdd) {
        for(Review review: reviewToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
