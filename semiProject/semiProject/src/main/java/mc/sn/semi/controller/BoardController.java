package mc.sn.semi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.semi.vo.BoardVO;

public interface BoardController {
	public ModelAndView boardList(@RequestParam("ownerId") String ownerId,HttpServletRequest request, HttpServletResponse response);
	
	public ModelAndView requestReserve(@RequestParam("ownerId") String ownerId,HttpServletRequest request, HttpServletResponse response);
	
	public ModelAndView addRequest(@ModelAttribute("request") BoardVO boardVO,
			HttpServletRequest request, HttpServletResponse response);
	
	public ModelAndView viewArticle(@RequestParam("articleNO") int articleNO,HttpServletRequest request, HttpServletResponse response);
}
