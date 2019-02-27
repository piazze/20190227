package com.hxzy.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hxzy.dao.BrandDao;
import com.hxzy.entity.Brand;
import com.hxzy.util.SqlSessionFactoryInstance;

public class BrandDaoImpl implements BrandDao {

	private SqlSessionFactory factory;
	
	
	public BrandDaoImpl() throws IOException {
		factory = SqlSessionFactoryInstance.getInstance().getSqlSessionFactory();
	}

	@Override
	public int add(Brand t) {
		SqlSession session = factory.openSession();
		try {
			/*BrandDao mapper = session.getMapper(BrandDao.class);
			int row = mapper.add(t);
			*/
			int row = session.insert("com.hxzy.dao.BrandDao.add", t);
			
			session.commit(); //提交事务
			return row;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return 0;
	}

	@Override
	public int update(Brand t) {
		SqlSession session = factory.openSession();
		try {
			int row = session.update("com.hxzy.dao.BrandDao.update", t);
			
			session.commit();//提交事务
			return row;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	@Override
	public int delete(Object id) {
		SqlSession session = factory.openSession();
		try {
			int row = session.delete("com.hxzy.dao.BrandDao.delete", id);
			session.commit();//提交事务
			return row;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
	}

	@Override
	public Brand queryOne(Object id) {
		SqlSession session = factory.openSession();
		try {
			/*
			 * selectOne() 查询出来的结果只有一条数据。
			 * selectList() 查询出来的结果是一个集合。
			 * selectMap()  将查询出来的结果组建成HashMap
			 * */
			Brand brand = session.selectOne("com.hxzy.dao.BrandDao.queryOne", id);
			return brand;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<Brand> queryAll() {
		SqlSession session = factory.openSession();
		try {
			/*
			 * selectOne() 查询出来的结果只有一条数据。
			 * selectList() 查询出来的结果是一个集合。
			 * selectMap()  将查询出来的结果组建成HashMap
			 * */
			List<Brand> list = session.selectList("com.hxzy.dao.BrandDao.queryAll");
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}
