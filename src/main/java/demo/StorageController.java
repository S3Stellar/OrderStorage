package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
	private List<OrderBoundary> orderBoundarylist;

	public StorageController() {
		orderBoundarylist = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			orderBoundarylist.add(new OrderBoundary(new Order(i + "", i % 2 == 0 ? true : false),
					new User(i % 4 == 0 ? "Jonathan@gmail.com" : "Gil@gmail.com")));
		}
	}

	@RequestMapping(path = "/shoppingCarts/{shoppingCartId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderBoundary> store(@PathVariable("shoppingCartId") String shoppingCartId,
			@RequestBody boolean expired, String email) {
		orderBoundarylist.add(new OrderBoundary(new Order(shoppingCartId, expired), new User(email)));

		return orderBoundarylist;
	}

	@RequestMapping(path = "/shoppingCarts/{shoppingCartId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderBoundary getValueByKey(@PathVariable("shoppingCartId") String shoppingCartId) {
		return this.orderBoundarylist.get(Integer.parseInt(shoppingCartId));
	}

	@RequestMapping(path = "/shoppingCarts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderBoundary> getAll(@RequestParam(name = "size", required = false, defaultValue = "10") int size,
			@RequestParam(name = "page", required = false, defaultValue = "0") int page) {
		return this.orderBoundarylist;
	}

	@RequestMapping(path = "/shoppingCarts", method = RequestMethod.DELETE)
	public void deleteAll() {
		this.orderBoundarylist.clear();
	}
}
