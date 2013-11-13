package edu.app.web.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name = "authBean")
@SessionScoped
public class AuthentificationBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;

	public AuthentificationBean() {
	}

	public  String dologin()
	{
		String navigato=null;
		if(login.equals("yassine")&&password.equals("admin")){
			navigato="success";
		}
		else{
			navigato="failure";
		}
		return navigato;
	}
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
