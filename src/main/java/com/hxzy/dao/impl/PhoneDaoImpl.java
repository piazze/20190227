package com.hxzy.dao.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hxzy.dao.PhoneDao;
import com.hxzy.entity.Phone;
import com.hxzy.util.SqlSessionFactoryInstance;
import com.hxzy.vo.PhoneVo;

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

	@Override
	public List<Phone> queryByCondition(PhoneVo vo) {
		SqlSession session = factory.openSession();
		try {
			
			PhoneDao mapper = session.getMapper(PhoneDao.class);
			List<Phone> list = mapper.queryByCondition(vo);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public int queryByConditionCount(PhoneVo vo) {
		SqlSession session = factory.openSession();
		try {
			
			PhoneDao mapper = session.getMapper(PhoneDao.class);
			int count = mapper.queryByConditionCount(vo);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	@Override
	public List<Phone> queryByBound(List<Integer> list) {
		SqlSession session = factory.openSession();
		try {
			
			PhoneDao mapper = session.getMapper(PhoneDao.class);
			List<Phone> result = mapper.queryByBound(list);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	

}
