package com.rashid;

import java.io.*;

public class Datedayfind {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		String dataarp[] = data.split("[/,:, ,-]");

		// System.out.println(dataarp[2]);
		int mont = month(Integer.parseInt(dataarp[1]));

		int mon = total(Integer.parseInt(dataarp[0]), mont, Integer.parseInt(dataarp[2]));

		int da = mon % 7;
		String days = dayd(da);
		System.out.println(days);

	}

	private static String dayd(int da) {
		switch (da) {
		case 1:
			return "sunday";

		case 2:
			return "monday";

		case 3:
			return "tuesday";

		case 4:
			return "wednesday";

		case 5:
			return "thursday";

		case 6:
			return "friday";

		case 0:
			return "saturday";
		}
		return null;

	}

	static int month(int m) {
		switch (m) {
		case 1:
			return 1;
		case 2:
			return 4;
		case 3:
			return 4;
		case 4:
			return 0;
		case 5:
			return 2;
		case 6:
			return 5;
		case 7:
			return 0;
		case 8:
			return 3;
		case 9:
			return 6;
		case 10:
			return 1;
		case 11:
			return 4;
		case 12:
			return 6;
		}
		return m;
	}

	static int total(int d, int m, int yr) {
		int f = m;
		int lp;

		int total = 0, c = 0;

		if (yr > 1900 && yr < 2000) {
			m = (yr) % 1900;

		} else if (yr > 2000 && yr < 2099) {
			m = (yr) % 2000;

		} else if (yr > 1800 && yr < 1899) {
			m = (yr) % 1800;

		} else if (yr > 2100 && yr < 2199) {
			m = (yr) % 2100;

		} else if (yr > 2200 && yr < 2299) {
			m = (yr) % 2200;
		}
		if (yr > 1900 && yr < 2000) {
			c = 0;
		} else if (yr > 2000 && yr < 2099) {
			c = 6;
		} else if (yr > 1800 && yr < 1899) {
			c = 2;
		}
		else if (yr > 2100 && yr < 2199) {
			c = 4;
		} else if (yr > 2200 && yr < 2299) {
			c = 2;
		} else {
		}
		lp = (m) / 4;
		total = d + f + m + lp + c;
		return total;

	}

}
