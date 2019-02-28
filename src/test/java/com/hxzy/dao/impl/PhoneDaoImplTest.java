package com.hxzy.dao.impl;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.hxzy.dao.PhoneDao;
import com.hxzy.entity.Brand;
import com.hxzy.entity.Phone;
import com.hxzy.vo.PhoneVo;

public class PhoneDaoImplTest {

	@Test
	@Ignore
	public void testQueryOne() throws IOException {
		PhoneDao phoneDao = new PhoneDaoImpl();
		Phone phone = phoneDao.queryOne(2);
		System.out.println(phone);
	}

	@Test
	public void testQueryByCondition() throws IOException {
		PhoneDao phoneDao = new PhoneDaoImpl();
		
		PhoneVo vo = new PhoneVo();
		Brand brand = new Brand("华为");
		vo.setBrand(brand);
		//vo.setMinPrice(new Double(2000));
		//vo.setMaxPrice(new Double(3000));
		
		//分页
		/*
		 * 分页： （pageIndex-1）*pageSize
		 * */
		vo.setPageIndex(0);
		vo.setPageSize(5);
		
		List<Phone> list = phoneDao.queryByCondition(vo);
		list.stream().forEach(System.out::println);
	}
	
	@Test
	public void testQueryByConditionCount() throws IOException {
		PhoneDao phoneDao = new PhoneDaoImpl();
		
		PhoneVo vo = new PhoneVo();
		Brand brand = new Brand("华为");
		vo.setBrand(brand);
		//vo.setMinPrice(new Double(2000));
		//vo.setMaxPrice(new Double(3000));
		int count = phoneDao.queryByConditionCount(vo);
		System.out.println(count);
		
	}
	
	@Test
	@Ignore
	public void testQueryByBound() throws IOException {
		PhoneDao phoneDao = new PhoneDaoImpl();
		List<Integer> list = Arrays.asList(2,3,4);
		List<Phone> phoneList = phoneDao.queryByBound(list);
		phoneList.stream().forEach(System.out::println);
	}
	
	
}
