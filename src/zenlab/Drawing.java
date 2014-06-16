package zenlab;

import zen.core.Zen;

public class Drawing {
	public static void main(String[] args) {
		Zen.create(500, 500);
		Zen.drawText("Welcome to Java!", 160, 250);
		Zen.fillRect(0, 0, 500, 100);
	}
}
