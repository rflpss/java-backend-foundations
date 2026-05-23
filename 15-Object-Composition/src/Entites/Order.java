package Entites;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entites.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	} 
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double total = 0.0;
		for (int i = 0; i < items.size(); i++)  {
			total += items.get(i).subTotal();
		}
		return total;
	}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		StringBuilder sb = new StringBuilder();
		for (OrderItem item : items) {
		    sb.append(item.toString() + "\n");
		}
		return "ORDER SUMMARY: \n"
				+ "Order moment: " + sdf.format(moment) + "\n"
				+ "Order status: " + status + "\n"
				+ "Client: " + client.toString() + "\n"
				+ "Order items:\n" + sb.toString() + "\n"
				+ "Total price: $" + String.format("%.2f", total());
	}
	
	
}
