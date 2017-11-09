package com.internousdev.sub.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sub.dao.LoginDAO;
import com.internousdev.sub.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String userName;
	private String password;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();


	public String execute() {

		String result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(userName, password);

		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;
			return result;
		}

		return result;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
