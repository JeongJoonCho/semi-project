package mc.sn.semi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.semi.service.BoardService;

@Controller("boardController")
public class BoardControllerImpl implements BoardController {
	@Autowired
	private BoardService boardService;
	
	@Override
	@RequestMapping(value="/boardList" ,method = RequestMethod.GET)
	public ModelAndView boardList(@RequestParam("ownerId") String ownerId,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		List list = boardService.readBoard(ownerId);
		mav.addObject("list", list);
		String url = "/articleList";
		mav.setViewName(url);
		
		return mav;
	}
}
