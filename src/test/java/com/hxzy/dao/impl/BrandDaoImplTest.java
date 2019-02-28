package com.hxzy.dao.impl;


import java.io.IOException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.hxzy.dao.BrandDao;
import com.hxzy.entity.Brand;

public class BrandDaoImplTest {

	@Test
	@Ignore
	public void testAdd() {
		try {
			BrandDao brandDao = new BrandDaoImpl();
			
			Brand brand = new Brand("小西瓜");
			
			brandDao.add(brand);
			
			System.out.println("主键：" + brand.getBrandId());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Ignore
	public void testUpdate() {
		try {
			BrandDao brandDao = new BrandDaoImpl();
			Brand brand = new Brand(13,"小南瓜");
			int row = brandDao.update(brand);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	@Ignore
	public void testDelete() {
		try {
			BrandDao brandDao = new BrandDaoImpl();
			int row = brandDao.delete(13);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	@Ignore
	public void testQueryOne() {
		try {
			BrandDao brandDao = new BrandDaoImpl();
			Brand brand = brandDao.queryOne(12);
			System.out.println(brand);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQueryAll() {
		try {
			BrandDao brandDao = new BrandDaoImpl();
			List<Brand> list = brandDao.queryAll();
			list.stream().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
