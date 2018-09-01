package model;

/**
* @author Raghul Karthik

* 21 Aug. 2018
*/
public class Posion {
	private int a[][] = new int[10][10];

	public boolean isFoodPresent(int x, int y) {
		int total = 0;
		int k = x;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				if (i == x && j == y) {
					return true;
				}
				// return ;
			}

		return false;
	}

	public boolean isMaximumTwoFood(int foodCount) {
		if (foodCount >= 0 && foodCount <= 2) {
			return true;
		} else {
			return false;
		}

	}

	public int isFoodPresentTimeCount(int x) {
		int k = 0;
		for (int i = 0; i < x; i++) {
			k++;
		}
		if (k > 0 && k < 20) {
			return 1;
		} else {
			return 0;
		}

	}
}
