package com.hxzy.vo;

import com.hxzy.entity.Phone;

public class PhoneVo extends Phone {

	private Double minPrice; //最低价
	private Double maxPrice; //最高价
	
	private Integer pageIndex; //页码
	private Integer pageSize; //每页显示的条数
	
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "PhoneVo [minPrice=" + minPrice + ", maxPrice=" + maxPrice + "]";
	}
	
	
}
