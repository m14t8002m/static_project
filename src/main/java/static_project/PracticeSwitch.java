package static_project;

public class PracticeSwitch {
	public static void main(String[] args) {

		int[] arrayId = new int[5];
		String[] arrayJob = new String[5];

		for (int i = 1; i <= 5; i++) {
			arrayId[i - 1] = i;
			switch (i) {
			case 1:
				arrayJob[i - 1] = "勇者";
				break;
			case 2:
				arrayJob[i - 1] = "バトルマスター";
				break;
			case 3:
				arrayJob[i - 1] = "パラディン";
				break;
			case 4:
				arrayJob[i - 1] = "海賊";
				break;
			case 5:
				arrayJob[i - 1] = "魔法剣士";
				break;
			}
		}
		for (int i = 0; i < arrayId.length; i++) {
			System.out.println(arrayId[i] + ":" + arrayJob[i]);
		}
	}
}