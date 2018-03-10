package im_hip;

import java.util.Scanner;

public class Popular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type in something you think is cool: ");
		String s = input.nextLine();
		String[] arr = new String[10];
		arr[0] = "Yeezys";
		arr[1] = "Supreme";
		arr[2] = "Vans";
		arr[3] = "Offwhite";
		arr[4] = "Will Smith";
		arr[5] = "Bad grades";
		arr[6] = "Not me";
		arr[7] = "Black Panther";
		arr[8] = "John Oliver";
		arr[9] = "Android";
		while (!s.equals("quit")) {
			try {
				hipThings(arr, s);
			} catch (NotCoolException e) {
				// e.printStackTrace();
				System.err.println(e.getMessage());
			}
			System.out.print("Type in something you think is cool: ");
			s = input.nextLine();
		}
	}

	public static void hipThings(String[] arr, String s) throws NotCoolException {
		boolean b = false;
		for (int i = 0; i < 10; i++) {
			if (s.equalsIgnoreCase(arr[i])) {
				b = true;
				break;
			}
		}
		if (b == false) {
			int n = (int) (Math.random() * 2);
			if (n == 0)
				throw new NotCoolException("That is so not cool. ");
			else
				throw new OutOfStyleException("How out of style can you be? ");
		} else {
			System.out.println("Apparently that's cool.");
		}
	}
}
