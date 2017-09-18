/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.aquote.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.service.TreeService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.aquote.model.entity.QModel;
import com.aquote.model.dao.QModelDao;

/**
 * 产品型号管理Service
 * @author wn
 * @version 2017-09-14
 */
@Service
@Transactional(readOnly = true)
public class QModelService extends TreeService<QModelDao, QModel> {

	public QModel get(String id) {
		return super.get(id);
	}
	
	public List<QModel> findList(QModel qModel) {
		if (StringUtils.isNotBlank(qModel.getParentIds())){
			qModel.setParentIds(","+qModel.getParentIds()+",");
		}
		return super.findList(qModel);
	}
	
	@Transactional(readOnly = false)
	public void save(QModel qModel) {
		super.save(qModel);
	}
	
	@Transactional(readOnly = false)
	public void delete(QModel qModel) {
		super.delete(qModel);
	}
	
}