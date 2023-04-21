package activity;

public class Strongnumber {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
            int a = i;
            int s = 0;

            while (a != 0) {
                int digit = a % 10;
                int fact = 1;

                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }

                s += fact;
                a /= 10;
            }

            if (i == s) {
                System.out.println(i);
            }
        }

	}

}
