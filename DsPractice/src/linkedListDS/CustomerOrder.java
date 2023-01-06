package linkedListDS;

public class CustomerOrder implements Comparable<CustomerOrder> {

	private int customerID;
	private String customerName;
	private double orderAmount;
	
	public CustomerOrder(int customerID, String customerName, double orderAmount){
		this.customerID=customerID;
		this.customerName=customerName;
		this.orderAmount=orderAmount;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
	
	public String getName() {
		return customerName;
	}
	
	public int getCustomerId() {
		return customerID;
	}

	@Override
	public String toString() {
		return "customerID=" + customerID + ", customerName=" + customerName + ", orderAmount="
				+ orderAmount + "]";
	}

	@Override
	public int compareTo(CustomerOrder o) {
		// TODO Auto-generated method stub
		return o.orderAmount> this.orderAmount?1:-1;
	}
	

}
