package com.interior.store;

import com.interior.upload.UploadDTO;

public class StoreDTO {
	
	private int num;
	private String name;
	private int price;
	private boolean saleCheck;
	private int saleRate;
	private int salePrice;
	private String category;
	private int stock;
	private String seller;
	private int delivery;
	
	// ????? //////////
	private int grade;
	private int count;
	private int ranking;
	private int hit;
	private int scrap;
	//private UploadDTO uploadDTO;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isSaleCheck() {
		return saleCheck;
	}
	public void setSaleCheck(boolean saleCheck) {
		this.saleCheck = saleCheck;
	}
	public int getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(int saleRate) {
		this.saleRate = saleRate;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getDelivery() {
		return delivery;
	}
	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getScrap() {
		return scrap;
	}
	public void setScrap(int scrap) {
		this.scrap = scrap;
	}
	/*
	public UploadDTO getUploadDTO() {
		return uploadDTO;
	}
	public void setUploadDTO(UploadDTO uploadDTO) {
		this.uploadDTO = uploadDTO;
	}
	*/
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}