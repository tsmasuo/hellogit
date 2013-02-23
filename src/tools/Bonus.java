package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bonus {
	
	
	public static int getBonus(
			int basePay, String rank) {
		int rate = 0;
		if (rank.equals("A")) {
			rate = 4;			
		} else if (rank.equals("B")) {
			rate = 3;
		} else if (rank.equals("C")) {
			rate = 2;
		}
		return basePay * rate;
	}
	
	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("��������͂��Ă��������i�~�P�ʂ̐��l�j> ");
		int basePay = Integer.parseInt(br.readLine());
		System.out.print("�����̕]�������N����͂��Ă��������iA|B|C) > ");
		String rank = br.readLine();
		int bonus = Bonus.getBonus(basePay, rank);
		System.out.printf("�{�[�i�X��%d�~�ł�\n", bonus);
		br.close();
	}
}
