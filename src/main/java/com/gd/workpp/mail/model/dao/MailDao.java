package com.gd.workpp.mail.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.gd.workpp.common.model.vo.Attachment;
import com.gd.workpp.mail.model.vo.Mail;

@Repository
public class MailDao {

	public int insertMail(SqlSessionTemplate sqlSession, Mail m) {
		return sqlSession.insert("mailMapper.insertMail", m);
	}
	
	public int insertAttachment(SqlSessionTemplate sqlSession, Attachment at) {
		return sqlSession.insert("mailMapper.insertAttachment", at);
	}

}
