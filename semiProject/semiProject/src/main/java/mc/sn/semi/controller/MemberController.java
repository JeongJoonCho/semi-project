package mc.sn.semi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.semi.vo.MemberVO;

public interface MemberController {
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView joinForm(HttpServletRequest request, HttpServletResponse response);
	
	public ModelAndView addMember(@ModelAttribute("member") MemberVO memberVO,
			HttpServletRequest request, HttpServletResponse response);
}
