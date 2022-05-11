

/**
 * @author kidist - 1207423
 * @author Abdureuf - 1200676
 * @version 1.0
 * @created 11-May-2022 9:29:52 PM
 */
public class Tenant extends Customer {

	public char Status;
	public Lessor m_Lessor;

	public Tenant(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param ID
	 * @param Email
	 * @param Phone_Number
	 */
	public void access_lessorProfile(int ID, char Email, long Phone_Number){

	}

	public void accessing_houseInfo(){

	}

	/**
	 * 
	 * @param HouseID
	 * @param Price
	 */
	public void billPayment(char HouseID, double Price){

	}

	public void contractDetail(){

	}

	/**
	 * 
	 * @param ID
	 * @param CustomRate
	 */
	public float rate(int ID, float CustomRate){
		return null;
	}
}//end Tenant