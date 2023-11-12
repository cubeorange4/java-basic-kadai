package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	public void referer(String [] word) {
		HashMap<String, String> dictionaryMap = new HashMap<String, String>();
		String result = "";
		
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "イチゴ");
		dictionaryMap.put("grape", "ブドウ");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
		
		for(int i = 0; i < word.length; i++) {
			result = dictionaryMap.get(word[i]);
			if(result == null) {
				System.out.println(word[i] + "は存在しません");
			}else {
				System.out.println(word[i] + "の意味は" + result);
			}
		}
	}
}
