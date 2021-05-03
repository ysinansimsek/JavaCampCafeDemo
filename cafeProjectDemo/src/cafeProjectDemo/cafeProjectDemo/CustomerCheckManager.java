package cafeProjectDemo;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean customerCheck(Customer customer) {
		
		System.out.println("Mernis servisi çağrıldı");
		return true;
	}

}
