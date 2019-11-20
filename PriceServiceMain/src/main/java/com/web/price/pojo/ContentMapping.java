
package com.web.price.pojo;

import java.util.ArrayList;
import java.util.List;

public class ContentMapping {

	private List<String> mainContent = new ArrayList<String>();
	private List<String> fullwidthContent = new ArrayList<String>();
	private List<String> secondaryContent = new ArrayList<String>();
	private List<String> headerContent = new ArrayList<String>();

	/**
	 * 
	 * @return The mainContent
	 */
	public List<String> getMainContent() {
		return mainContent;
	}

	/**
	 * 
	 * @param mainContent
	 *            The mainContent
	 */
	public void setMainContent(List<String> mainContent) {
		this.mainContent = mainContent;
	}

	/**
	 * 
	 * @return The fullwidthContent
	 */
	public List<String> getFullwidthContent() {
		return fullwidthContent;
	}

	/**
	 * 
	 * @param fullwidthContent
	 *            The fullwidthContent
	 */
	public void setFullwidthContent(List<String> fullwidthContent) {
		this.fullwidthContent = fullwidthContent;
	}

	/**
	 * 
	 * @return The secondaryContent
	 */
	public List<String> getSecondaryContent() {
		return secondaryContent;
	}

	/**
	 * 
	 * @param secondaryContent
	 *            The secondaryContent
	 */
	public void setSecondaryContent(List<String> secondaryContent) {
		this.secondaryContent = secondaryContent;
	}

	/**
	 * 
	 * @return The headerContent
	 */
	public List<String> getHeaderContent() {
		return headerContent;
	}

	/**
	 * 
	 * @param headerContent
	 *            The headerContent
	 */
	public void setHeaderContent(List<String> headerContent) {
		this.headerContent = headerContent;
	}

}
