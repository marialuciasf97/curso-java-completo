package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus order1 = OrderStatus.DELIVERED;
		
		// Converts a String to OrderStatus (must match exactly the enum name)
		OrderStatus order2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(order1);
		System.out.println(order2);
		
	}
}
