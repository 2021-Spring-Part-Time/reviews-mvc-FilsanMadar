package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review suga = new Review (1L, "Suga", "Korean borne rapper is in BTS!"
        + "Suga is responsible for writing, composing, arranging, mixing, and mastering his material. Over 100 registered songs are credited to him by the Korea Music Copyright Association. He is a pianist, and produces hiphop and R&B music. His lyrics involve themes that are \"full of dreams and hope,\" conceived with the intent of his music becoming \"many people's strength.\" He cites Stony Skunk and Epik High as his inspirations to pursue hiph op music. Particularly, he credits the former's reggae-hiph op hybrid album Ragga Muffin (2005) and its title track for igniting his interest in the genre.", "/images/BTS-Suga-interlude.jpeg");
        Review rM = new Review (2L, "RM", "Korean borne rapper that is in BTS!"
        + "As the leader of BTS, RM is responsible for bridging the distance between BigHit (record label) and his bandmates. He has also been credited to over 100 songs by the Korean Music Copyright Association, and has been responsible since before the bands debut with their lyrics and song production.", "/images/rm-pic.jpeg");
        Review jHope = new Review (3L, "j-hope", "Korean borne rapper that is in BTS!"
        + "Often coined the 2nd leader of BTS and their dance leader. J-Hope has been described as having an upbeat and energetic tone to his music and performances. His mixtape, Hope World, was described as having a fun nature and variety of musical genres, including synth-pop, trap, house, alternative hip hop, funk-soul, and retro elements.", "/images/jhopebts.jpeg");

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
