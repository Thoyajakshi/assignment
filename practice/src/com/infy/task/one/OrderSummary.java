package com.infy.task.one;

import java.util.List;

public class OrderSummary {
private int usageCount;
	
	private List<String> orderNames;

	public int getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(int usageCount) {
		this.usageCount = usageCount;
	}

	public List<String> getOrderNames() {
		return orderNames;
	}

	public void setOrderNames(List<String> orderNames) {
		this.orderNames = orderNames;
	}

}
