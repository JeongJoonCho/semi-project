package mc.sn.semi.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.semi.service.BoardService;
import mc.sn.semi.service.MemberService;
import mc.sn.semi.vo.BoardVO;

@Controller("boardController")
public class BoardControllerImpl implements BoardController {
	@Autowired
	private BoardService boardService;
	@Autowired
	private MemberService memberService;
	
	@Override
	@RequestMapping(value="/boardList" ,method = RequestMethod.GET)
	public ModelAndView boardList(@RequestParam("ownerId") String ownerId,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List list = boardService.readBoard(ownerId);
		mav.addObject("list", list);
		mav.addObject("ownerId", ownerId);
		String url = "/articleList";
		mav.setViewName(url);
		
		return mav;
	}
	
	// 예약 신청 화면이동
	@Override
	@RequestMapping(value = "/view_requestReserve", method = RequestMethod.GET)
	public ModelAndView requestReserve(@RequestParam("ownerId") String ownerId,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		String url = "/requestReserve";
		mav.addObject("ownerId", ownerId);
		mav.setViewName(url);
		return mav;
	}
	
	// 예약 신청
	@Override
	@RequestMapping(value = "/addRequest", method = RequestMethod.POST)
	public ModelAndView addRequest(@ModelAttribute("request") BoardVO boardVO,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		boardService.addRequest(boardVO);
		String url = "redirect:/boardList?ownerId="+boardVO.getOwnerId();
		mav.setViewName(url);
		return mav;
	}
	
	// 예약 내용 상세 보기
	@Override
	@RequestMapping(value = "/view_article", method = RequestMethod.GET)
	public ModelAndView viewArticle(@RequestParam("articleNO") int articleNO,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		BoardVO vo = boardService.searchBoard(articleNO);
		mav.addObject("board", vo);
		String url = "/viewArticle";
		mav.setViewName(url);
		return mav;
	}
	
	// 예약 확정 화면 이동
	@Override
	@RequestMapping(value = "/view_commitForm", method = RequestMethod.POST)
	public ModelAndView viewCommit(@ModelAttribute("request") BoardVO boardVO,
			HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		String id = boardVO.getId();
		String ownerId = boardVO.getOwnerId();
		mav.addObject("id", id);
		mav.addObject("ownerId", ownerId);
		String url = "/commitForm";
		mav.setViewName(url);
		return mav;
	}
	
	// 예약 확정
	@Override
	@RequestMapping(value = "/commitFin", method = RequestMethod.POST)
	public ModelAndView commitFin(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> commitMap = new HashMap<String, Object>();
		String day = request.getParameter("day");
		String id = request.getParameter("id");
		String ownerId = request.getParameter("ownerId");
		commitMap.put("ownerId", ownerId);
		commitMap.put("id", id);
		commitMap.put("day", day);
		System.out.println(commitMap);
		memberService.finishCommit(commitMap);
		String url = "redirect:/ownerListForm";
		ModelAndView mav = new ModelAndView();
		mav.setViewName(url);
		return mav;
	}
	
}
