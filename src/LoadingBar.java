//https://www.docs4dev.com/docs/en/java/java8/tutorials/java-IandI-QandE-interfaces-answers.html

public class LoadingBar {

	public static void main(String[] args) throws InterruptedException {

		int count = 0;

		for (count = 1; count <= 100; ++count) {
			if (count >= 1 && count < 10) {
				System.out.print("[           ]");
			} else if (count >= 10 && count < 20) {
				System.out.print("[■          ]");
			} else if (count >= 20 && count < 30) {
				System.out.print("[■■         ]");
			} else if (count >= 30 && count < 40) {
				System.out.print("[■■■        ]");
			} else if (count >= 40 && count < 50) {
				System.out.print("[■■■■       ]");
			} else if (count >= 50 && count < 60) {
				System.out.print("[■■■■■      ]");
			} else if (count >= 60 && count < 70) {
				System.out.print("[■■■■■■     ]");
			} else if (count >= 70 && count < 80) {
				System.out.print("[■■■■■■■    ]");
			} else if (count >= 80 && count < 90) {
				System.out.print("[■■■■■■■■   ]");
			} else if (count >= 90 && count < 100) {
				System.out.print("[■■■■■■■■■■ ]");
			} else if (count == 100) {
				System.out.print("[■■■■■■■■■■■]");
			}
			System.out.print(count + "%");
			if (count >= 0 && count < 90) {
				Thread.sleep(80);
			} else if (count >= 90) {
				Thread.sleep(500);
			}
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");

		}
		System.out.println("[■■■■■■■■■■■]100%");

		System.out.print("Install complete!");
	}

}
