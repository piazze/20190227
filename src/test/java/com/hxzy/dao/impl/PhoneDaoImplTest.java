package com.hxzy.dao.impl;


import java.io.IOException;

import org.junit.Test;

import com.hxzy.dao.PhoneDao;
import com.hxzy.entity.Phone;

public class PhoneDaoImplTest {

	@Test
	public void testQueryOne() throws IOException {
		PhoneDao phoneDao = new PhoneDaoImpl();
		Phone phone = phoneDao.queryOne(2);
		System.out.println(phone);
	}

}
