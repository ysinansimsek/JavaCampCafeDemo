package cafeProjectDemo;

public  class StarbucksCafeManager extends BaseCafeManager {

	CustomerCheckManager checkManager = new CustomerCheckManager();
	public void add(Customer customer) {
		if(checkManager.customerCheck(customer)) {
			
		
		System.out.println("Müşteri Sisteme Eklendi.  : " + customer.name);
		
	
		}else {
			System.out.println("Müşteri Doğrulaması Yapılamadı");
		}
	}

	
	


	

}
