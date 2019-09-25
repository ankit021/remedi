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
@Table(name="svn_repo")
public class SvnEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", unique=true, nullable=false)
	@TableGenerator(name = "table_gen", table = "sm_sequencer", pkColumnName = "seq_name", valueColumnName = "seq_count",
		pkColumnValue = "svn_config_seq_next_val")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen")
	private int id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "pass_word")
	private String passWord;
	@Column(name = "svn_url")
	private String svnUrl;

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

	public String getSvnUrl() {
		return svnUrl;
	}

	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}

}
