package generator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

@SuppressWarnings({ "resource" })
public class ModItemsGenerator {

	public static void main(String[] args) {
		System.out.println("Select the type of Item you want to generate");
		startGenerator();
	}
	
	public static void terminateProgram() {
		System.out.println("Program terminated");
	}

	public static void startGenerator() {
		Scanner input = new Scanner(System.in);

		String line1 = input.nextLine();

		if (line1.equalsIgnoreCase("Item")) {
			itemTypeMaker("Item");
		} else if (line1.equalsIgnoreCase("SwordItem")) {
			itemTypeMaker("SwordItem");
		} else if (line1.equalsIgnoreCase("PickaxeItem")) {
			itemTypeMaker("PickaxeItem");
		} else if (line1.equalsIgnoreCase("ShovelItem")) {
			itemTypeMaker("ShovelItem");
		} else if (line1.equalsIgnoreCase("AxeItem")) {
			itemTypeMaker("AxeItem");
		} else if (line1.equalsIgnoreCase("HoeItem")) {
			itemTypeMaker("HoeItem");
		} else if (line1.equalsIgnoreCase("ArmorItem")) {
			itemTypeMaker("ArmorItem");
		} else if (line1.equalsIgnoreCase("ShieldItem")) {
			itemTypeMaker("ShieldItem");
		} else if (line1.equalsIgnoreCase("Exit")) {
			terminateProgram();
		} else {
			System.out.println("Please use vanilla item classes");
			startGenerator();
		}
	}

	public static void itemTypeMaker(String type) {

		Scanner input = new Scanner(System.in);

		String id;

		String tier;

		int attackDamage;

		float attackSpeed;

		System.out.println(type + " has been chosen");

		if (type.equals("Item") || type.equals("ShieldItem")) {

			System.out.println("Type the ID");
			id = input.nextLine();

			StringBuilder sb = new StringBuilder();
			sb.append("public static final").append(" RegistryObject<" + type + "> ").append(id.toUpperCase())
					.append(" = ").append("ITEMS.register")
					.append("(\"" + id.toLowerCase() + "\", () -> new " + type + "(new Item.Properties()));");

			System.out.println(sb.toString());

			System.out.println("");
			System.out.println("Copied to clipboard!");

			System.out.println("Select the type of Item you want to generate");
			startGenerator();

			String copyText = sb.toString();
			StringSelection stringSelection = new StringSelection(copyText);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

		} else if (type.equals("SwordItem") || type.equals("PickaxeItem") || type.equals("AxeItem")
				|| type.equals("ShovelItem") || type.equals("HoeItem")) {

			System.out.println("Type the ID");
			id = input.nextLine();

			System.out.println("Type the tier");
			tier = input.nextLine();

			System.out.println("Put the attack damage");
			attackDamage = input.nextInt();

			System.out.println("Put the attack speed");
			attackSpeed = input.nextFloat();

			StringBuilder sb = new StringBuilder();
			sb.append("public static final").append(" RegistryObject<" + type + "> ").append(id.toUpperCase())
					.append(" = ").append("ITEMS.register")
					.append("(\"" + id.toLowerCase() + "\", () -> new " + type + "(" + tier + ", " + (int) attackDamage
							+ ", " + (float) attackSpeed + "F, new Item.Properties()));");

			System.out.println(sb.toString());

			System.out.println("");
			System.out.println("Copied to clipboard!");

			System.out.println("Select the type of Item you want to generate");
			startGenerator();

			String copyText = sb.toString();
			StringSelection stringSelection = new StringSelection(copyText);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

		} else if (type.equals("ArmorItem")) {

			System.out.println("Type the ID");
			id = input.nextLine();

			System.out.println("Type the tier");
			tier = input.nextLine();

			System.out.println("Type the equipment slot");

			StringBuilder sb = new StringBuilder();

			sb.append("public static void").append(" RegistryObject<" + type + "> ");

			System.out.println(sb.toString());
			String copyText = sb.toString();
			StringSelection stringSelection = new StringSelection(copyText);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
		}
	}
}
