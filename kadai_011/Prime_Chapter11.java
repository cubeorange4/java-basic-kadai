package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] judge = new boolean [101];
		
		for (int i = 1; i < judge.length; i++) {
			judge[i] = true;
		}
		
		int number = 2;
		while( number < 101) {
			for( int i = number +1; i < 101; i++) {
				if (i % number ==0) {
					judge[i] = false;
					continue;
				} 
			}
			number = number + 1;
		}
		
		for( int i = 2; i < 101; i++) {
			if( judge[i]) {
				System.out.println(i);
			}
		}
	}

}
