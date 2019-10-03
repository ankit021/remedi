package com.eclature.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eclature.bean.GitBean;

public interface GitRepository extends JpaRepository<GitBean, Integer> {

}
