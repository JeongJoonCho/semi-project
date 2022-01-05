package mc.sn.semi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface BoardController {
	public ModelAndView boardList(@RequestParam("ownerId") String ownerId,HttpServletRequest request, HttpServletResponse response);
}
