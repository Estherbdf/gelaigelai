/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.gelaigelai.struts.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gelaigelai.common.Transform;
import com.gelaigelai.domain.User;
import com.gelaigelai.service.UserService;
import com.gelaigelai.struts.form.RegisterForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-30-2018
 * 
 * XDoclet definition:
 * @struts.action path="/register" name="RegisterForm" scope="request" validate="true"
 */
public class RegisterAction extends Action {
	
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
	
		RegisterForm registerForm = (RegisterForm) form;// TODO Auto-generated method stub
		String username=registerForm.getUsername();
		String password=registerForm.getPassword();
		String repassword=registerForm.getRepassword();
		String email=registerForm.getEmail();
		String sex=registerForm.getSex();
		String date=registerForm.getBirth();
		UserService userService=new UserService();
		
		if(!password.equals(repassword)){
			request.setAttribute("loginError", "两次输入的密码不符");
			return mapping.findForward("fail");
			
		}
		else{
			if(!userService.checkRename(username)){
				request.setAttribute("loginError", "您输入的用户名已存在，请换一个！");
				return mapping.findForward("fail");
			}
			else{
				User u=new User();
				u.setUsername(username);
				u.setPassword(password);
			    u.setBirth(Transform.StringToDate(date));
			    u.setEmail(email);
			    u.setSex(sex);
			    u.setRegdate(new Date());
			    userService.save(u);
			   
			    return mapping.findForward("ok");
			}
		}
		
	}
}