package co.grandcircus.javaBeansLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JavaBeansController {

	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("javaBean-index");
		return mav;
	}
	@RequestMapping("/javaBean-register")
	public ModelAndView showForm() {
		
		ModelAndView mav = new ModelAndView("javaBean-register");
		return mav;
	}

	@PostMapping("/javaBean-addUser")
	public ModelAndView showResult(Customer customer) {
		ModelAndView mav = new ModelAndView("javaBean-addUser");

		return mav;
	}
//	@PostMapping
//	public ModelAndView showSecure(Customer customer) {
//		ModelAndView mav = new ModelAndView("javaBean-addUser");
//
//		return mav;
//	}
}
