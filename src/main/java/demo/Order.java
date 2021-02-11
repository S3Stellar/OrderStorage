package demo;

public class Order {
	
	private String shoppingCartId;
	private boolean expired;
	
	
	public Order() {
	}
	
	public Order(String shoppingCartId,boolean expired) {
		super();
		this.shoppingCartId = shoppingCartId;
		this.expired = expired;
	}
	
	public String getShoppingCartId() {
		return shoppingCartId;
	}
	public void setShoppingCartId(String shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}

}
