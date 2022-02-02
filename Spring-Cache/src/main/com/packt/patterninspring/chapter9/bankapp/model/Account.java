package main.com.packt.patterninspring.chapter9.bankapp.model;

/**
 * @author Dinesh.Rajput
 *
 */
public class Account {
	
	Long id;
	Long balance;
	String name;

	public Account() {}

	public Account(Long id) {
		this.id = id;
	}

	public Account(Long id, Long balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}

}
