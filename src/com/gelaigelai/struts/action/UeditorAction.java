/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.gelaigelai.struts.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.ServiceConfigurationError;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
















import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gelaigelai.common.HibernateUtil;
import com.gelaigelai.common.ImgUtil;
import com.gelaigelai.common.Transform;
import com.gelaigelai.domain.Image;
import com.gelaigelai.domain.Poem;
import com.gelaigelai.domain.Type;
import com.gelaigelai.domain.User;
import com.gelaigelai.service.ImageService;
import com.gelaigelai.service.PoemService;
import com.gelaigelai.service.UserService;

/** 
 * MyEclipse Struts
 * Creation date: 04-01-2018
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class UeditorAction extends Action {
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
	 * @throws IOException 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//获取用户ID
		Integer userId=Integer.parseInt(request.getParameter("userId"));
		
		PoemService poemService=new PoemService();
		ImageService imageService=new ImageService();
		Session session=HibernateUtil.getsSession();
		Transaction tx=session.beginTransaction();
		
		Poem poeminfo=null;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("UTF-8");
	String pinfo=new String(request.getParameter("editorValue").getBytes("utf-8"),"UTF-8");
	String ptitle="yes";
	int key;
	String username = null;
	Date d=new Date();
	String ps=Transform.DateToString(d);
	Date ptime=Transform.StringToDate(ps);
	List list=ImgUtil.getImageSrc(request.getParameter("editorValue"));
	//String filepath=com.bupt.common.StringUtil.listToString(list, ',');
		try{
			Type type=(Type)session.get(Type.class,18);
		    /*poeminfo=(Poem)session.get(Poem.class,3);*/
			//获取诗人的信息
			
			Poem poem=new Poem();
			//Image image=new Image();
			poem.setPtitle(ptitle);
		    poem.setPtime(ptime);
		    poem.setPinfo(pinfo);
		    poem.setType(type);
		    poem.setUserIdUser(userId);
		    //image.setFilepath(filepath);
		    session.save(poem);
		  //  image.setPoem(poem);
		   // session.save(image);
			//session.save(type);
			key=poem.getIdpoem();
			//存放默认图片
			Poem curpoem=poemService.getPoemDAO().findById(poem.getIdpoem());
			//Image image=new Image(curpoem,"images/4.jpg");
			//imageService.getImageDAO().save(image);
			poeminfo=(Poem)session.get(Poem.class,key);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			HibernateUtil.closeSession();
		}
		
		request.setAttribute("poeminfo", poeminfo);
		
		return mapping.findForward("ok");
	}
	
}