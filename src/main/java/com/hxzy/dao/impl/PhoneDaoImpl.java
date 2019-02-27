package com.hxzy.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hxzy.dao.PhoneDao;
import com.hxzy.entity.Phone;
import com.hxzy.util.SqlSessionFactoryInstance;

public class PhoneDaoImpl implements PhoneDao {

	private SqlSessionFactory factory;
	
	public PhoneDaoImpl() throws IOException {
		super();
		factory = SqlSessionFactoryInstance.getInstance().getSqlSessionFactory();
	}

	@Override
	public int add(Phone t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Phone t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Phone queryOne(Object id) {
		SqlSession session = factory.openSession();
		try {
			Phone phone = session.selectOne("com.hxzy.dao.PhoneDao.queryOne", id);
			return phone;
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<Phone> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
