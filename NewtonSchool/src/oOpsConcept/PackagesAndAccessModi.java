package oOpsConcept;

//Access Modifiers.
class School{
	String name;
	public int teachers;
	private String principal;
	protected int password;
	public String getPrincipal() {
		setPrincipal("manoj");
		return principal;
	}
	private void setPrincipal(String principal) {
		this.principal = principal;
	}
	
}

public class PackagesAndAccessModi {

	public static void main(String[] args) {
		School sc=new School();
		sc.name="navodaya";
		sc.teachers=20;
		//sc.setPrincipal("Naveen");
		sc.password=12457;
		System.out.println(sc.getPrincipal());
		System.out.println("the password is "+sc.password);

	}

}
