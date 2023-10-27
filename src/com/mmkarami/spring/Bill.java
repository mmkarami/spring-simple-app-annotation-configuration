package com.mmkarami.spring;

import java.util.Date;

public class Bill {

	private Date reportDate;

	private String content;

	public Bill(Date reportDate, String content) {
		this.reportDate = reportDate;
		this.content = content;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Bill [reportDate=" + reportDate + ", content=" + content + "]";
	}
}