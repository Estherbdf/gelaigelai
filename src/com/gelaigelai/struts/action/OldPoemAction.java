/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.gelaigelai.struts.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gelaigelai.common.Transform;
import com.gelaigelai.domain.Image;
import com.gelaigelai.domain.NewImage;
import com.gelaigelai.domain.Poem;
import com.gelaigelai.domain.Poet;
import com.gelaigelai.domain.User;
import com.gelaigelai.service.PoemService;
import com.gelaigelai.service.PoetService;
import com.gelaigelai.service.UserService;

/** 
 * MyEclipse Struts
 * Creation date: 03-31-2018
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="old" path="/oldPoem.jsp"
 * @struts.action-forward name="morden" path="/mordenPoem.jsp"
 * @struts.action-forward name="orgin" path="/orginPoem.jsp"
 */
public class OldPoemAction extends Action {
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
		int flag=0;//判断是否登录
		int type;
		Integer userId;
		List<Poem>recommendPoems=new ArrayList<Poem>();
		List<Poem>hotPoems=new ArrayList<Poem>();
		List<Poem>newPoems=new ArrayList<Poem>();
		List<Poem>randomPoems=new ArrayList<Poem>();
		List<Poet>poets=new ArrayList<Poet>();
		   List<Image> images=new ArrayList<Image>();
		   List<Image>ranimages=new ArrayList<Image>();
		   List<NewImage>newImages=new ArrayList<NewImage>();
		   List<NewImage>rannewImages=new ArrayList<NewImage>();
		userId=Integer.parseInt(request.getParameter("userId"));
		type=Integer.parseInt(request.getParameter("type"));
		
		PoemService poemService=new PoemService();
		PoetService poetService=new PoetService();
		
	if(type!=4&&type!=5)   {
		hotPoems=poemService.getHotPoem(type,7);
		newPoems=poemService.getNewPoem(type,7);
		recommendPoems=poemService.getRecommendPoem(type);
		randomPoems=poemService.getRandomPoems(type);
		poets=poetService.getPoets();
		for(Poem p:recommendPoems){
	    	Image image=null;
	    	Set<Image> set = p.getImages();
	    	Iterator<Image> it = set.iterator();
			while(it.hasNext()){
			image=it.next();
			if(image!=null)
				break;
			}
			images.add(image);
	    }
	   
	    for(int i=0;i<images.size();i++){
	    	 NewImage  newImage=new NewImage();
	    	 if(images!=null&&images.get(i)!=null){
	    	 newImage.setFilepath(images.get(i).getFilepath());
	    	 newImage.setTitle(recommendPoems.get(i).getPtitle());
	    	 newImage.setPoemId(recommendPoems.get(i).getIdpoem());
	    	 newImages.add(newImage);}
	    }
	    for(Poem p:randomPoems){
	    	Image image=null;
	    	Set<Image> set = p.getImages();
	    	Iterator<Image> it = set.iterator();
			while(it.hasNext()){
			image=it.next();
			if(image!=null)
				break;
			}
			ranimages.add(image);
	    }
	   
	    for(int i=0;i<ranimages.size();i++){
	    	 NewImage  newImage=new NewImage();
	    	 if(ranimages!=null&&ranimages.get(i)!=null){
	    	 newImage.setFilepath(ranimages.get(i).getFilepath());
	    	 newImage.setTitle(randomPoems.get(i).getPtitle());
	    	 newImage.setPoemId(randomPoems.get(i).getIdpoem());
	    	 rannewImages.add(newImage);}
	    }}
		request.setAttribute("hotPoems",hotPoems);
		request.setAttribute("newPoems",newPoems);
		request.setAttribute("reco", newImages);
		request.setAttribute("random", rannewImages);
	    request.setAttribute("recommendPoems", recommendPoems);
		request.setAttribute("poets", poets);
	    request.setAttribute("userId", userId);
	    
	    Date date=new Date();
		String dateString=Transform.DateToString(date);
		UserService userService=new UserService();
		User u =userService.findByIdGet(userId);
		String username=u.getUsername();
		request.setAttribute("username", username);
		request.setAttribute("date", dateString);
		
		/*按类别显示诗歌*/
		switch(type){
		case(1):{
			List <Poem>pl1=poemService.getPoemByType(1);//叙事诗
			List <Poem>pl2=poemService.getPoemByType(2);//抒情诗
			List <Poem>pl3=poemService.getPoemByType(3);//送别诗
			List <Poem>pl4=poemService.getPoemByType(4);//边塞诗
			List <Poem>pl5=poemService.getPoemByType(5);//山水田园诗
			List <Poem>pl6=poemService.getPoemByType(6);//怀古诗
			List <Poem>pl7=poemService.getPoemByType(7);//咏物诗
			List <Poem>pl8=poemService.getPoemByType(8);//悼亡诗
			List <Poem>pl9=poemService.getPoemByType(9);//讽喻诗
			List <Poem>pl10=poemService.getPoemByType(10);//行旅诗
			request.setAttribute("pl1",pl1);
			request.setAttribute("pl2",pl2);
			request.setAttribute("pl3",pl3);
			request.setAttribute("pl4",pl4);
			request.setAttribute("pl5",pl5);
			request.setAttribute("pl6",pl6);
			request.setAttribute("pl7",pl7);
			request.setAttribute("pl8",pl8);
			request.setAttribute("pl9",pl9);
			request.setAttribute("pl10",pl10);
			return mapping.findForward("old");
			
		}
		case(2):{
			List <Poem>pl11=poemService.getPoemByType(11);//叙事诗
			List <Poem>pl12=poemService.getPoemByType(12);//抒情诗
			List <Poem>pl13=poemService.getPoemByType(13);//格律诗
			List <Poem>pl14=poemService.getPoemByType(14);//自由诗
			List <Poem>pl15=poemService.getPoemByType(15);//散文诗
			List <Poem>pl16=poemService.getPoemByType(16);//韵脚诗
			List <Poem>pl17=poemService.getPoemByType(17);//外国诗
			request.setAttribute("pl11",pl11);
			request.setAttribute("pl12",pl12);
			request.setAttribute("pl13",pl13);
			request.setAttribute("pl14",pl14);
			request.setAttribute("pl15",pl15);
			request.setAttribute("pl16",pl16);
			request.setAttribute("pl17",pl17);
			
			return mapping.findForward("morden");
			
		}
		case(3):{
			List <Poem>pl18=poemService.getPoemByType(18);//原创诗
			request.setAttribute("pl18",pl18);
			return mapping.findForward("orgin");
			
		}
		default:{
			
			return mapping.findForward("write");
			
		}
		}
		
		
	}
	public void test(List<Poem> list){
		for(Poem l:list){
			System.out.println(l.getPtitle());
		}
	}
	
}