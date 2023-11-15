package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice () {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
			String input = scanner.next();
			if(!(input.equals("r") || input.equals("s") || input.equals("p"))) {
				System.out.println(input + "はじゃんけんの手ではありません");
				continue;
			}else {
				scanner.close();
				return input;
			}
		}
	}
	
	public String getRandom () {
		String[]  choice = {"r", "s", "p"};
		
		String Random = choice[(int) Math.floor(Math.random() * 3)];
		return Random;
	}
	
	public void playGame() {
		HashMap<String,String> choiceMap =new HashMap<String,String>();
		
		choiceMap.put("r", "グー");
		choiceMap.put("s", "チョキ");
		choiceMap.put("p", "パー");
		
		System.out.println("自分の手は" + choiceMap.get(getMyChoice()));
		System.out.println("相手の手は" + choiceMap.get(getRandom()));
		
		if(getMyChoice() == getRandom()) {
			System.out.println("あいこです");
		}else if((getMyChoice()=="r")&&(getRandom()=="s")){
			System.out.println("自分の勝ちです");
		}else if((getMyChoice()=="r")&&(getRandom()=="p")) {
			System.out.println("自分の負けです");
		}else if((getMyChoice()=="s")&&(getRandom()=="r")) {
			System.out.println("自分の負けです");
		}else if((getMyChoice()=="s")&&(getRandom()=="p")) {
			System.out.println("自分の勝ちです");
		}else if((getMyChoice()=="p")&&(getRandom()=="r")) {
			System.out.println("自分の勝ちです");
		}else if((getMyChoice()=="p")&&(getRandom()=="s")) {
			System.out.println("自分の負けです");
		}
	}
}
