import java.util.Scanner;

class list {
	public static void main(String args[]) {
		int N, i, j, u = 0;

		System.out.print("ENTER THE VALUE OF N : ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		System.out.println(
				"0 and 1 are neither Prime nor Composite Numbers so It will not be included in this List of Prime Numbers.");
		System.out.println("List of Prime Numbers from 1 to " + N + ":");
		for (i = 2; i <= N; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					u = 1;
					break;
				} else {
					u = 0;
				}
			}
			if (u == 0) {
				System.out.println(i);
			}
		}
	}
}