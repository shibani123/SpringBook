package com.aciworldwide.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promotion")
public class Promotion {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="promotionid")
	private long promotionid;
	
	@Column(name="promocode", nullable = false)
	private String promocode;
	
	@Column(name="discount")
	private float discount;
	
	public Promotion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promotion(long promotionid, String promocode, float discount) {
		super();
		this.promotionid = promotionid;
		this.promocode = promocode;
		this.discount = discount;
	}

	
	public long getPromotionId() {
		return promotionid;
	}

	public void setPromotionId(long promotionid) {
		this.promotionid = promotionid;
	}

	
	public String getPromoCode() {
		return promocode;
	}

	public void setPromoCode(String promocode) {
		this.promocode = promocode;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
	
	
}
