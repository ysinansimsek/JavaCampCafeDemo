package cafeProjectDemo;

public abstract class BaseCafeManager implements IBaseCafe{


	

	public void add(Customer customer) {
		
		System.out.println("Müşteri Sisteme Eklendi. : " + customer.name);
		
	}

}
