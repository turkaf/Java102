
public class BusinessAddress implements IAddress{
	private int id;
	private String street;
    private String city;
    private String postalCode;
    private String country;
    private String companyName;
    
	public BusinessAddress(int id, String street, String city, String postalCode, String country, String companyName) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
		this.companyName = companyName;
	}

	@Override
	public String getStreet() {
		return street;
	}
	
	@Override
	public String getCity() {
		return city;
	}
	
	@Override
	public String getPostalCode() {
		return postalCode;
	}
	
	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public int getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		return id + " Adres: [Sokak: " + street + ", Şehir: " + city + ", Posta Kodu: " + postalCode
				+ ", Ülke: " + country + "]";
	}
}
