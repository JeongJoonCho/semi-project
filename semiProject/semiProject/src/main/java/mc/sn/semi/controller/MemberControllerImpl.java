package mc.sn.semi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.semi.service.MemberService;

@Controller("membercontroller")
public class MemberControllerImpl implements MemberController {
	@Autowired
	private MemberService memberService;
	
	@Override
	@RequestMapping(value="/ownerList" ,method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String url = "/ownerList";
		mav.setViewName(url);
		List ownersList = memberService.listOwners();
		mav.addObject("ownersList", ownersList);
		return mav;
	}
}
