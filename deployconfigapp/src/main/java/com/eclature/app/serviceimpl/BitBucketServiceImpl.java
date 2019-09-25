package com.eclature.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclature.app.repository.BitBucketRepository;
import com.eclature.app.service.BitBucketService;
import com.eclature.bean.BitBucketBean;
@Service
public class BitBucketServiceImpl implements BitBucketService {
	@Autowired
	private BitBucketRepository bitBucketRepository;

	@Override
	public void saveBitBucketCred(BitBucketBean bean) {
		bitBucketRepository.save(bean);
	}

}
