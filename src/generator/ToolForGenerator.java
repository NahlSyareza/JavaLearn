package generator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

@SuppressWarnings({"unused", "resource"})
public class ToolForGenerator {

	public static void main(String[] args) {
		stringGetter();
	}
	
	public static void stringGetter() {
		String myStr = "Oh think twice";
	    System.out.println(myStr.indexOf("think"));
	}

	public static void lineLengthGetter() {
		String tiers = "tiers.diamond";
		
		String tiersTested = tiers.substring(0, 1).toUpperCase() + tiers.substring(1, 5).toLowerCase() + tiers.substring(5).toUpperCase();
		
		System.out.println(tiersTested);
	}

	public static void autoCopy() {
		String myString = "This text will be copied into clipboard";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}

	public static void caseChecker() {
		String line = "TEST";
		String line2 = "test";
		String lineTest = line.substring(0, line.length()).toLowerCase();

		if (line.equalsIgnoreCase(line2)) {
			System.out.println("Cool");
		} else {
			System.out.println("Uncool");
		}
	}

	public static void caseCheckerInput() {
		Scanner input = new Scanner(System.in);

		String lnInput = input.nextLine();

		if (lnInput.equalsIgnoreCase("test")) {
			System.out.println("True");
			caseCheckerInput();
		} else {
			System.out.println("False");
			caseCheckerInput();
		}
	}

}
