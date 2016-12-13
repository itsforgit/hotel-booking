/**
 * 
 */
package com.mindtree.hotelbooking.view;

/**
 * @author M1030360
 *
 */
public class TwitteData {

	private String content;
	private String screenName;

	/**
	 * @param content
	 * @param screenName
	 */
	public TwitteData(String content, String screenName) {
		super();
		this.content = content;
		this.screenName = screenName;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the screenName
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * @param screenName
	 *            the screenName to set
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

}
