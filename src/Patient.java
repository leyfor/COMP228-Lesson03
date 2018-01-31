
public class Patient {
	
	private int _patienteId;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private int _postalCode;
	
	public Patient()  {
		
	}
	
	public Patient(int patienteId, String firstName, String lastName, String address, String city,
			String province, int postalCode) {
		super();
		this._patienteId = patienteId;
		this._firstName = firstName;
		this._lastName = lastName;
		this._address = address;
		this._city = city;
		this._province = province;
		_postalCode = postalCode;
	}

	/**
	 * @return the _patienteId
	 */
	public int get_patienteId() {
		return _patienteId;
	}

	/**
	 * @param patienteId the _patienteId to set
	 */
	public void set_patienteId(int patienteId) {
		this._patienteId = patienteId;
	}

	/**
	 * @return the _firstName
	 */
	public String get_firstName() {
		return _firstName;
	}

	/**
	 * @param firstName the _firstName to set
	 */
	public void set_firstName(String firstName) {
		this._firstName = firstName;
	}

	/**
	 * @return the _lastName
	 */
	public String get_lastName() {
		return _lastName;
	}

	/**
	 * @param lastName the _lastName to set
	 */
	public void set_lastName(String lastName) {
		this._lastName = lastName;
	}

	/**
	 * @return the _address
	 */
	public String get_address() {
		return _address;
	}

	/**
	 * @param address the _address to set
	 */
	public void set_address(String address) {
		this._address = address;
	}

	/**
	 * @return the _city
	 */
	public String get_city() {
		return _city;
	}

	/**
	 * @param city the _city to set
	 */
	public void set_city(String city) {
		this._city = city;
	}

	/**
	 * @return the _province
	 */
	public String get_province() {
		return _province;
	}

	/**
	 * @param province the _province to set
	 */
	public void set_province(String province) {
		this._province = province;
	}

	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return _postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		_postalCode = postalCode;
	}
	
	public void getPatientInfo() {
		System.out.printf("First Name: %s. Last Name: %s. Address:  %s. City: %s. Province: %s. Postal Code: %d.",
				           this.get_firstName(), this.get_lastName(), this.get_address(), this.get_city(), this.get_province(),
				           this.getPostalCode());
	}
	
	
	
	

}
