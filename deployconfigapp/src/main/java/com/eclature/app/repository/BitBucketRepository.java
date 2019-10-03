package com.eclature.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eclature.bean.BitBucketBean;

public interface BitBucketRepository extends JpaRepository<BitBucketBean, Integer> {

}
