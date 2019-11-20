
package com.web.price.pojo;

import java.util.ArrayList;
import java.util.List;

public class RequestParams {

	private Long offset;
	private Long maxResults;
	private Boolean employee;
	private List<Object> refinement = new ArrayList<Object>();

	/**
	 * 
	 * @return The offset
	 */
	public Long getOffset() {
		return offset;
	}

	/**
	 * 
	 * @param offset
	 *            The offset
	 */
	public void setOffset(Long offset) {
		this.offset = offset;
	}

	/**
	 * 
	 * @return The maxResults
	 */
	public Long getMaxResults() {
		return maxResults;
	}

	/**
	 * 
	 * @param maxResults
	 *            The maxResults
	 */
	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	/**
	 * 
	 * @return The employee
	 */
	public Boolean getEmployee() {
		return employee;
	}

	/**
	 * 
	 * @param employee
	 *            The employee
	 */
	public void setEmployee(Boolean employee) {
		this.employee = employee;
	}

	/**
	 * 
	 * @return The refinement
	 */
	public List<Object> getRefinement() {
		return refinement;
	}

	/**
	 * 
	 * @param refinement
	 *            The refinement
	 */
	public void setRefinement(List<Object> refinement) {
		this.refinement = refinement;
	}

}
