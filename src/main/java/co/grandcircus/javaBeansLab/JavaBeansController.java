package co.grandcircus.javaBeansLab;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.javaBeansLab.dao.CustomerDao;
import co.grandcircus.javaBeansLab.dao.ItemsDao;
import co.grandcircus.javaBeansLab.dao.UsersDao;
import co.grandcircus.javaBeansLab.entity.Customer;
import co.grandcircus.javaBeansLab.entity.Item;
import co.grandcircus.javaBeansLab.entity.users;


@Controller
public class JavaBeansController {
	
	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ItemsDao itemsDao;
	
	@Autowired
	private UsersDao userDao;
//	
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
	public ModelAndView homepage() {
		List<Item> leListOfItems = itemsDao.findAll();

		return new ModelAndView("index","items", leListOfItems);
	}
	//Registration
	@RequestMapping("/register")
	public ModelAndView getForm() {

		return new ModelAndView ("form");
	}
	@RequestMapping("/signup")
	public ModelAndView getSignUp() {

		return new ModelAndView ("form");
	}
	
	@RequestMapping("/Login")
	public ModelAndView getLogin() {

		return new ModelAndView ("customerlogin");
	}

	@RequestMapping("/confirmed")
	public ModelAndView showForm(Customer customer) {
		customerDao.create(customer);
		return new ModelAndView("completeForm");
	}
	@RequestMapping("/products")
	public ModelAndView showProducts() {
		List<Item> leListOfProducts = itemsDao.findAll();

		return new ModelAndView ("itemslist", "items", leListOfProducts);
	}
	
	//Admin Stuff
	@RequestMapping("/login")
	public ModelAndView getAdmin() {
		
		return new ModelAndView ("login");
	}
	
	@RequestMapping("/list")
	public ModelAndView showList() {
		List<Item> leListOfProduct = itemsDao.findAll();

		return new ModelAndView ("itemslist", "items", leListOfProduct);
	}
	
	@RequestMapping("/products/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Item items = itemsDao.findById(id);
		
		return new ModelAndView("detail", "items", items);
	}
	
	@RequestMapping("/products/{id}/edit")
	public ModelAndView edit(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		
		return new ModelAndView("edit", "room", item);
	}
	
	@PostMapping("/products/{id}/edit")
	public ModelAndView save(@PathVariable("id") Long id, Item item) {
		item.setId(id);
		
		itemsDao.update(item);
		
		return new ModelAndView("redirect:/products/" + id);
	}
	
	@RequestMapping("/products/add")
	public ModelAndView add() {		
		return new ModelAndView("add");
	}
	
	@PostMapping("/products/add")
	public ModelAndView addSubmit(Item item) {		
		itemsDao.create(item);
		
		return new ModelAndView("redirect:/products");
	}
	
	@RequestMapping("/products/{id}/delete")
	public ModelAndView remove(@PathVariable("id") Long id) {
		itemsDao.delete(id);
		
		return new ModelAndView("redirect:/products");
	}
//	@RequestMapping("/javaBean-list-items")
//	public ModelAndView showItems() {
//		
//		ModelAndView mav = new ModelAndView("javaBean-list-itemst");
//		return mav;
//	}


//	@PostMapping
//	public ModelAndView showSecure(Customer customer) {
//		ModelAndView mav = new ModelAndView("javaBean-addUser");
//
//		return mav;
//	}
//	@RequestMapping("/signup")
//	public ModelAndView showSignupForm() {
//		return new ModelAndView("signup");
//	}
//
//	@PostMapping("/Login")
//	public ModelAndView showLogin(
//			Customer customer,
//			@RequestParam("confirm-password") String confirmPassword, 
//			HttpSession session, RedirectAttributes redir) {
//		// Find the matching user.
//		CustomerDao existingUser = customerDao.findByEmail(customer.getEmail());
//		if (existingUser != null) {
//			// If user already exists, display an error message.
//			return new ModelAndView("signup", "message", "A user with that username already exists.");
//		}
//		
//		if (!confirmPassword.equals(customer.getPassword())) {
//			// If the user or passwords don't match, display an error message.
//			return new ModelAndView("customerlogin", "message", "Passwords do not match.");
//		}
//		
//		CustomerDao.create(customer);
//		
//		// On successful sign-up, add the user to the session.
//		session.setAttribute("customer", customerDao);
//		
//		// A flash message will only show on the very next page. Then it will go away.
//		// It is useful with redirects since you can't add attributes to the mav.
//		redir.addFlashAttribute("message", "Thanks for signing up!");
//		return new ModelAndView("redirect:/register");
//	}
}
