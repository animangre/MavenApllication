package com.soft.beans;

public class DTDC {
	private int productId;
	private String proName;
	private String deliveryConfirmation;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getDeliveryConfirmation() {
		return deliveryConfirmation;
	}
	public void setDeliveryConfirmation(String deliveryConfirmation) {
		this.deliveryConfirmation = deliveryConfirmation;
	}
	@Override
	public String toString() {
		return "DTDC [productId=" + productId + ", proName=" + proName + ", deliveryConfirmation="
				+ deliveryConfirmation + "]";
	}
	
	

}
