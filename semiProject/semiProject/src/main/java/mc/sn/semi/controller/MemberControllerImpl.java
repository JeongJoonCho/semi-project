package mc.sn.semi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import mc.sn.semi.service.MemberService;
import mc.sn.semi.vo.MemberVO;

@Controller("membercontroller")
public class MemberControllerImpl implements MemberController {
	@Autowired
	private MemberService memberService;
	
	// 홈화면
	@Override
	@RequestMapping(value="/ownerListForm" ,method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String url = "/ownerList";
		mav.setViewName(url);
		// 가게리스트를 불러옴. 조건조회
		List ownersList = memberService.listOwners();
		mav.addObject("ownersList", ownersList);
		return mav;
	}
	
	// 회원가입 화면 이동
	@Override
	@RequestMapping(value="/view_joinForm" ,method = RequestMethod.GET)
	public ModelAndView joinForm(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		String url = "/joinForm";
		mav.setViewName(url);
		return mav;
	}
	
	// 회원가입 실행
	@Override
	@RequestMapping(value="/addMember" ,method = RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("member") MemberVO memberVO,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		// 회원 정보 추가
		memberService.addMember(memberVO);
		// 완료 후 홈화면으로 이동
		String url = "redirect:/ownerListForm";
		mav.setViewName(url);
		return mav;
	}
	
	// 로그인 화면이동
	@Override
	@RequestMapping(value = "/view_login", method = RequestMethod.GET)
	public ModelAndView view_login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		String url = "/loginForm";
		mav.setViewName(url);
		return mav;
	}
	
	// 로그인
	@Override
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		MemberVO memberVO = memberService.login(member);
		if (memberVO != null) {
			//session에 member와 isLogOn을 저장
			HttpSession session = request.getSession();
			session.setAttribute("member", memberVO);
			session.setAttribute("isLogOn", true);
			mav.setViewName("redirect:/ownerListForm");
		} else {
			rAttr.addAttribute("result", "loginFailed");
			mav.setViewName("redirect:/view_login");
		}
		return mav;
	}
	
	// 로그아웃
	@Override
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		// session에 member와 isLogOn을 제거
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("isLogOn");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/ownerListForm");
		return mav;
	}
	
}
