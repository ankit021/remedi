package com.eclature.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclature.app.repository.GitRepository;
import com.eclature.app.service.GitService;
import com.eclature.bean.GitBean;
@Service
public class GitServiceImpl implements GitService {
@Autowired
private GitRepository gitRepository;
	@Override
	public void saveGitCred(GitBean bean) {
	gitRepository.save(bean);	
	}

}
