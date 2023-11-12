package kadai_017;

public abstract class Kato_Chapter17 {
	public String familyName;
	public String givenName;
	public String address;
	
	public void commonIntroduce(String familyName, String address){
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce("加藤", "東京都中野区〇×");
		eachIntroduce();
	}
}

