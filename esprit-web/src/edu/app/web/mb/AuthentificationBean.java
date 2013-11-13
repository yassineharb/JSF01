package edu.app.web.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.app.business.AuthenticationServiceLocal;
import edu.app.persistence.User;

@ManagedBean(name = "authBean")
@SessionScoped
public class AuthentificationBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Model
	 */
	private User user = new User();
	/**
	 * injection of proxy
	 */
	@EJB
	private AuthenticationServiceLocal authenticationServiceLocal;

	public AuthentificationBean() {
	}

	public String doLogin() {
		String navigateTo = null;
        User userFound = authenticationServiceLocal.authenticate(
                        user.getLogin(), user.getPassword());
        if (userFound != null) {
              
               
                navigateTo = "/pages/admin/home?faces-redirect=true";

        } else {
              
              
                navigateTo = "/pages/error?faces-redirect=true";

        }
        return navigateTo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
