import java.util.ArrayList;
import java.util.Date;

public class User {
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String profession;
	private int age;
	private ArrayList<IAddress> address;
	private Date date;
	
	@Override
	public String toString() {
		return "İsim: " + name + "\nSoyisim: " + lastName + "\nMeslek: " + profession + "\nYaş: " + age + "\nAdres(ler): " + address;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<IAddress> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<IAddress> address) {
		this.address = address;
	}	
}