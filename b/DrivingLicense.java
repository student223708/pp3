public class DrivingLicense
{
	private String name;
	private String surname;
	private String address;
	private String postalCode;
	private String city;
	private String number;
	private String yearOfIssue;
	private String category;
	
	public String getName()
	{
	    return name;
         }
         
        public void setName(String name)
        {
            this.name = name;
        }
        
        public String toString()
        {
            return name+" "+surname;
        }
}