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

import com.gelaigelai.domain.Poem;
import com.gelaigelai.domain.PoemComment;
import com.gelaigelai.domain.PoemCommentDAO;
import com.gelaigelai.service.CommentService;
import com.gelaigelai.service.PoemService;
import com.gelaigelai.struts.form.CommentForm;

/** 
 * MyEclipse Struts
 * Creation date: 04-01-2018
 * 
 * XDoclet definition:
 * @struts.action path="/comment" name="commentForm" scope="request" validate="true"
 */
public class CommentAction extends Action {
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
		CommentForm commentForm = (CommentForm) form;// TODO Auto-generated method stub
		PoemService poemService=new PoemService();
		CommentService commentService=new CommentService();
		Integer poemId=Integer.parseInt(request.getAttribute("poemId").toString());
		String infoString=commentForm.getCommentInfo();
		PoemComment poemComment=new PoemComment();
		poemComment.setCdate(new Date());
		poemComment.setInfo(infoString);
		Poem poem=poemService.getPoemDAO().findById(poemId);
		poemComment.setPoem(poem);
		commentService.getPoemCommentDAO().save(poemComment);
		return mapping.findForward("ok");
		
	}
}