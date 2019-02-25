package co.grandcircus.javaBeansLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.javaBeansLab.dao.CustomerDao;
import co.grandcircus.javaBeansLab.dao.ItemsDao;
import co.grandcircus.javaBeansLab.dao.UsersDao;
import co.grandcircus.javaBeansLab.entity.Customer;
import co.grandcircus.javaBeansLab.entity.Item;


@Controller
public class JavaBeansController {
	
	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ItemsDao itemsDao;
	
//	@Autowired
//	private UsersDao userDao;
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
		return new ModelAndView("javaBean-index");
	}
	//Registration
	@RequestMapping("/register")
	public ModelAndView showForm() {

		return new ModelAndView ("javaBean-register");
	}
	@RequestMapping("/addUser")
	public ModelAndView showResult(Customer customer) {
		List<Item> leListOfItems = itemsDao.findAll();
		customerDao.create(customer);
		return new ModelAndView("javaBean-addUser", "items", leListOfItems);
	}
	@RequestMapping("/products")
	public ModelAndView showProducts() {
		List<Item> leListOfProducts = itemsDao.findAll();

		return new ModelAndView ("javaBean-itemsList", "items", leListOfProducts);
	}
	
	//Admin Stuff
	@RequestMapping("/login")
	public ModelAndView showAdmin() {
		
		return new ModelAndView ("javaBean-Login");
	}
	
	@RequestMapping("/list")
	public ModelAndView showList() {
		List<Item> leListOfProduct = itemsDao.findAll();

		return new ModelAndView ("javaBean-itemsAdd", "items", leListOfProduct);
	}
	
	@RequestMapping("/items/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Item items = itemsDao.findById(id);
		
		return new ModelAndView("detail", "items", items);
	}
	
	@RequestMapping("/item/{id}/edit")
	public ModelAndView edit(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		
		return new ModelAndView("edit", "room", item);
	}
	
	@RequestMapping("/item/{id}/edit")
	public ModelAndView save(@PathVariable("id") Long id, Item item) {
		item.setId(id);
		
		itemsDao.update(item);
		
		return new ModelAndView("redirect:/item/" + id);
	}
	
	@RequestMapping("/item/add")
	public ModelAndView add() {		
		return new ModelAndView("add");
	}
	
	@RequestMapping("/item/add")
	public ModelAndView addSubmit(Item item) {		
		itemsDao.create(item);
		
		return new ModelAndView("redirect:/items");
	}
	
	@RequestMapping("/item/{id}/delete")
	public ModelAndView remove(@PathVariable("id") Long id) {
		itemsDao.delete(id);
		
		return new ModelAndView("redirect:/item");
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
}
