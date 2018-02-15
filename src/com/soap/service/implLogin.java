package com.soap.service;

import com.soap.model.BeanLogin;

public class implLogin implements IfaceLogin{

	@Override
	public BeanLogin validadLogin(BeanLogin obj) {
		BeanLogin bean= new BeanLogin();
		if(obj.getUser().equals("admin") && obj.getPassword().equals("admin")){
			bean.setMessage("User authorized ...");
			bean.setStatus(true);
		}else{
			bean.setMessage("User not found ...");
			bean.setStatus(false);
		}
	 
		return bean;
	}
	
	

}
