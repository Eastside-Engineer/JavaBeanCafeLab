package co.grandcircus.javaBeansLab;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


// DAO stands for Data Access Object.
// DAOs are used as a layer of code that is responsible for communicating
// with the database. On the Java side, we use the Room POJO with properties.
// On the SQL side, there are corresponding rows and columns.
// The @Repository annotation tells Spring both that this is a component
// (a.k.a Spring Bean) that can be autowired and that it should be treated like
// a DAO (which mostly applies to error handling behind the scenes).
@Repository
public class ItemsDao {
	
	// Spring will automatically inject this dependency thanks to @Autowired
	@Autowired
	private JdbcTemplate jdbc;

	public List<Item> findAll() {
		// BeanPropertyRowMapper uses the rows from the SQL result create
		// new Room objects and fill in the values by calling the setters.
		// Use .query for SQL SELECT statements.
		return jdbc.query("SELECT * FROM items", new BeanPropertyRowMapper<>(Item.class));
	}
	
	public Item findById(Long id) {
		// The last parameters of .query let us specify values for the (?) parameters in our SQL statement.
		// While .query returns a list, .queryForObject assumes only one result. 
		Item match = jdbc.queryForObject("SELECT * FROM items WHERE id = ?", new BeanPropertyRowMapper<>(Item.class), id);
		// If nothing matched, match will be null.
		return match;
	}
	
	public void update(Item items) {
		// Use .update for SQL INSERT, UPDATE, and DELETE
		// All the parameters after the first specify values to fill in the ?s in the SQL.
		String sql = "UPDATE items * SET id= ?, name=?, Description=?, Price=?";
		jdbc.update(sql, items.getId(), items.getName(), items.getDescription(), items.getPrice());
	}
	
	public void create(Item items) {
		String sql = "INSERT INTO items * SET id= ?, name=?, Description=?, Price=?";
		jdbc.update(sql, items.getId(), items.getName(), items.getDescription(), items.getPrice());

	}

	public void delete(Long id) {
		String sql = "DELETE FROM Room WHERE id = ?";
		jdbc.update(sql, id);
	}
}
