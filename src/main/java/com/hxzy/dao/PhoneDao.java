package com.hxzy.dao;

import java.util.List;

import com.hxzy.entity.Phone;
import com.hxzy.vo.PhoneVo;

public interface PhoneDao extends CommonDao<Phone> {
	List<Phone> queryByCondition(PhoneVo vo);
	int queryByConditionCount(PhoneVo vo);
	List<Phone> queryByBound(List<Integer> list);
}
