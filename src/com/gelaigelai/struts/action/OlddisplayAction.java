/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.gelaigelai.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gelaigelai.domain.Image;
import com.gelaigelai.domain.Poem;
import com.gelaigelai.domain.Poet;
import com.gelaigelai.domain.User;
import com.gelaigelai.service.PoemService;
import com.gelaigelai.service.PoetService;
import com.gelaigelai.service.UserService;

/** 
 * MyEclipse Struts
 * Creation date: 04-01-2018
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class OlddisplayAction extends Action {
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
		// TODO Auto-generated method stub
		int poemId;
		Integer userId;
		request.getSession().getAttribute("userId");
		poemId=Integer.parseInt(request.getParameter("poemId"));
		PoemService poemService=new PoemService();
		PoetService poetService=new PoetService();
		UserService userService=new UserService();
		List<Image>images=new ArrayList<Image>();
		Poem poem=poemService.getPoemDAO().findById(poemId);
		images=poemService.poemImg(poem);
		Poet poet =poem.getPoet();
		Integer writeId=poem.getUserIdUser();
		User user=null;
		if(writeId!=null){
		 user=userService.getUserDAO().findById(writeId);
		
		}
	
		request.setAttribute("user", user);
		request.setAttribute("poem", poem);
		request.setAttribute("image", images);
		request.setAttribute("poet", poet);
		
		//使用时用${images[0].filepath}
	   userId=Integer.parseInt(request.getParameter("userId").toString());
		request.setAttribute("userId", userId);
		return mapping.findForward("ok");
	}
}