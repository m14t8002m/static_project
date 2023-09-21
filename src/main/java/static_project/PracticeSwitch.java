package static_project;

import java.util.Random;

public class PracticeSwitch {
	public static void main(String[] args) {

		int jobNumsLength = 10;
		int[] jobNums = new int[jobNumsLength];

		Random random = new Random();
		int randomRange = 5;

		for (int i = 0; i < jobNumsLength; i++) {
			int randomNum = random.nextInt(randomRange) + 1;
			jobNums[i] = randomNum;
		}

		for (int jobData : jobNums) {
			switch (jobData) {
			case 1:
				System.out.println("勇者");
				break;
			case 2:
				System.out.println("バトルマスター");
				break;
			case 3:
				System.out.println("パラディン");
				break;
			case 4:
				System.out.println("海賊");
				break;
			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}
}