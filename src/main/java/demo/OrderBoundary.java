package demo;

public class OrderBoundary {

	public Order order;
	public User user;

	public OrderBoundary() {

	}

	public OrderBoundary(Order order, User user) {
		super();
		this.order = order;
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
