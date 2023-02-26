/**
 * 
 */
package com.learning.hotelbooking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.hotelbooking.view.TwitteData;

import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.auth.AccessToken;

/**
 * @author M1030360
 *
 */
@RestController
public class TwitterController {

	@Value("${CONSUMER_KEY}")
	private String consumerKey;

	@Value("${CONSUMER_SECRET}")
	private String consumerSecret;
	@Value("${ACCESS_TOKEN}")
	private String accessToken;
	@Value("${ACCESS_TOKEN_SECRET}")
	private String accessTokenSecret;

	StatusListener listener = new StatusListener() {

		// The onStatus method is executed every time a new tweet comes in
		// matching the filter.
		public void onStatus(Status status) {
			tweets.add(new TwitteData(status.getText(), status.getUser().getScreenName()));

		}

		@Override
		public void onException(Exception arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onDeletionNotice(StatusDeletionNotice arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onScrubGeo(long arg0, long arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onStallWarning(StallWarning arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onTrackLimitationNotice(int arg0) {
			// TODO Auto-generated method stub

		}
	};

	List<TwitteData> tweets;

	@RequestMapping(path = "/tweets", method = RequestMethod.GET)
	public List<TwitteData> helloTwitter(Model model) {
		tweets = new ArrayList<>();
		TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		twitterStream.setOAuthConsumer(consumerKey, consumerSecret);
		twitterStream.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
		twitterStream.addListener(listener);

		FilterQuery capitalsQuery = new FilterQuery();
		capitalsQuery.track(new String[] { "tokiohotel","hotel" });
		twitterStream.filter(capitalsQuery);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		twitterStream.shutdown();
		return tweets;
	}
}
