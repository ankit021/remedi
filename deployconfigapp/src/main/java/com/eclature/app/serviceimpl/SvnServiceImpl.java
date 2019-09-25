package com.eclature.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclature.app.repository.SvnRepository;
import com.eclature.app.service.SvnService;
import com.eclature.bean.SvnBean;
@Service
public class SvnServiceImpl implements SvnService{
@Autowired
private SvnRepository svnRepository;
	@Override
	public void saveSvnCred(SvnBean bean) {
		svnRepository.save(bean);
	}

}
