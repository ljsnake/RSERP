package com.fudan.rserp.module.yhgl;

import java.util.List;

import com.fudan.rserp.config.model.TbErpUser;
import com.fudan.rserp.module.base.BaseGetSessionValue;
import com.fudan.rserp.util.PageSet;
import com.hp.ipg.security.PasswordManager;
import com.hp.ipg.security.PasswordManagerException;

public class YhglService {
	private YhglDao dao;
	public PageSet getYhList(PageSet ps,ListCondition lc){
		if(ps==null){
			ps = new PageSet();
		}
		ps = dao.getYhList(ps, lc);
		return ps;
	}
	public int addUser(TbErpUser user){
		if(user!=null){
			if(user.getLoginName()!=null&&!"".equals(user.getLoginName())){
				List<?> ls = dao.checkLoginNameExist(user.getLoginName());
				if(ls!=null&&ls.size()>0){
					return 2;//登录名已存在
				}
				if(user.getPassword()!=null&&!"".equals(user.getPassword())){
					try {
						user.setPassword(PasswordManager.encryptAndEncodeString(user.getPassword()));
					} catch (PasswordManagerException e) {
						e.printStackTrace();
						return 10;//异常
					}
				}
				dao.saveOrUpdateObject(user);
				return 0;//操作成功.
			}
		}
		return 1;//传入参数不合法.
	}
	public TbErpUser getUser(TbErpUser uservo){
		if(uservo!=null){
			return (TbErpUser)dao.getObjectById(TbErpUser.class, uservo.getId());
		}
		return uservo;
	}
	public TbErpUser getUserById(Integer id){
		return (TbErpUser)dao.getObjectById(TbErpUser.class, id);
	}
	public void updateUser(TbErpUser uservo){
		TbErpUser user = (TbErpUser)dao.getObjectById(TbErpUser.class, uservo.getId());
		user.setName(uservo.getName());
		user.setEmail(uservo.getEmail());
		if(uservo.getPassword()!=null&&!"".equals(uservo.getPassword())){
			try {
				user.setPassword(PasswordManager.encryptAndEncodeString(uservo.getPassword()));
			} catch (PasswordManagerException e) {
				e.printStackTrace();
			}
		}
		dao.updateObject(user);
	}
	public int updatePassword(TbErpUser uservo,String passwordold){
		if(uservo==null || passwordold==null || "".equals(passwordold)
				||uservo.getPassword()==null || "".equals(uservo.getPassword())){
			return 1;//传入值不合法或旧密码为空.
		}
		try {
			passwordold = PasswordManager.encryptAndEncodeString(passwordold);
			String loginName = BaseGetSessionValue.getUserLoginName();
			if(loginName!=null&&!"".equals(loginName)){
				List<?> ls = dao.checkUserLoginNamePasswordExist(loginName,passwordold);
				if(ls==null||ls.size()<1){
					return 2;//原密码错误.
				}
			}
			String id = BaseGetSessionValue.getUserId();
			if(id!=null&&!"".equals(id)){
				TbErpUser user = (TbErpUser)dao.getObjectById(TbErpUser.class, id);
				try {
					user.setPassword(PasswordManager.encryptAndEncodeString(uservo.getPassword()));
					dao.updateObject(user);
					return 0;//操作成功.
				} catch (PasswordManagerException e) {
					e.printStackTrace();
				}
			}
		} catch (PasswordManagerException e) {
			e.printStackTrace();
		}
		return 10;//异常.
	}
	
	public YhglDao getDao() {
		return dao;
	}
	public void setDao(YhglDao dao) {
		this.dao = dao;
	}
	
}
