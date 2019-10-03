package com.eclature.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "bitbucket_repo")
public class BitBucketEntity implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@TableGenerator(name = "table_gen", table = "sm_sequencer", pkColumnName = "seq_name", valueColumnName = "seq_count", pkColumnValue = "bitbucket_config_seq_next_val")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen")
	private int id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "pass_word")
	private String passWord;
	@Column(name = "bit_url")
	private String bitUrl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getBitUrl() {
		return bitUrl;
	}

	public void setBitUrl(String bitUrl) {
		this.bitUrl = bitUrl;
	}

}
