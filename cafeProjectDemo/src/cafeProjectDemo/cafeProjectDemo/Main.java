package cafeProjectDemo;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.name="Sinan";
		customer.surName="ŞİMŞEK";
		customer.id=1;
		BaseCafeManager baseCafeManager = new NeroCafeManager();
		baseCafeManager.add(customer);
				

	}

}
