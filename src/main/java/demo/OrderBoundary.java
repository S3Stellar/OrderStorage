package demo;

public class OrderBoundary {
	
	private String shoppingCartId;
	private boolean expired;
	
	
	public OrderBoundary() {
	}
	
	public OrderBoundary(String shoppingCartId,boolean expired) {
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
