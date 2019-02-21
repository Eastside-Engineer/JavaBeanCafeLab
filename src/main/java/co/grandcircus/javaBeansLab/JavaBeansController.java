package co.grandcircus.javaBeansLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.javaBeansLab.dao.CustomerDao;
import co.grandcircus.javaBeansLab.dao.ItemsDao;
import co.grandcircus.javaBeansLab.entity.Customer;
import co.grandcircus.javaBeansLab.entity.Item;


@Controller
public class JavaBeansController {
	
	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ItemsDao itemsDao;
	
//	@RequestMapping("/")
//	public ModelAndView showIndex() {
//		ModelAndView mav = new ModelAndView("javaBean-index");
//		return mav;
//	}
//	@PostMapping("/")
//	public ModelAndView list() {
//		List<Customer> leListOfCustomers = customerDao.findAll();
//		return new ModelAndView("javaBean-index", "customers", leListOfCustomers);
//	}
	@RequestMapping("/")
	public ModelAndView list1() {
		List<Item> leListOfItems = itemsDao.findAll();
		return new ModelAndView("javaBean-index", "items", leListOfItems);
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
	@RequestMapping("/javaBean-admin")
	public ModelAndView showAdmin() {
		
		ModelAndView mav = new ModelAndView("javaBean-admin");
		return mav;
	}
	@RequestMapping("/javaBean-list-items")
	public ModelAndView showItems() {
		
		ModelAndView mav = new ModelAndView("javaBean-list-itemst");
		return mav;
	}
}

//	@PostMapping
//	public ModelAndView showSecure(Customer customer) {
//		ModelAndView mav = new ModelAndView("javaBean-addUser");
//
//		return mav;
//	}

