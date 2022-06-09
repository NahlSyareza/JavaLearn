package generator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

@SuppressWarnings({ "resource", "unused" })
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
		} else if (line1.equalsIgnoreCase("TieredItem")) {
			StringBuilder sb = new StringBuilder();

			sb.append("Specify the item :").append("\n- SwordItem").append("\n- PickaxeItem").append("\n- AxeItem")
					.append("\n- ShovelItem").append("\n- HoeItem").append("\n- ArmorItem");

			System.out.println(sb.toString());

			startGenerator();
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
		} else if (line1.equalsIgnoreCase("ForgeSpawnEggItem") || line1.equalsIgnoreCase("SpawnEggItem")) {
			itemTypeMaker("ForgeSpawnEggItem");
		} else if (line1.equalsIgnoreCase("ElementalBowItem")){
			itemTypeMaker("ElementalBowItem");
		} else if (line1.equalsIgnoreCase("List")) {
			StringBuilder sb = new StringBuilder();

			sb.append("Lists of item : ").append("Item, TieredItem, ForgeSpawnEggItem/SpawnEggItem");

			System.out.println(sb.toString());

			startGenerator();
		} else {
			System.out.println("Please use vanilla item classes");
			startGenerator();
		}
	}

	public static void itemTypeMaker(String type) {

		Scanner input = new Scanner(System.in);

		String id;

		String tier;
		
		String tierCorrector;
		
		String armorMaterial;

		String armorMaterialCorrector;
		
		String equipmentSlotSpecify = new String();
		
		String equipmentSlot = new String();

		int attackDamage;

		float attackSpeed;

		System.out.println(type + " has been chosen");

		if (type.equals("Item") || type.equals("ShieldItem") || type.equals("ElementalBowItem")) {

			System.out.println("Type the ID");
			id = input.nextLine();

			StringBuilder sb = new StringBuilder();
			sb.append("public static final").append(" RegistryObject<" + type + "> ").append(id.toUpperCase())
					.append(" = ").append("ITEMS.register")
					.append("(\"" + id.toLowerCase() + "\", () -> new " + type + "(new Item.Properties()));");

			System.out.println(sb.toString());

			System.out.println("");
			System.out.println("Copied to clipboard!");

			String copyText = sb.toString();
			StringSelection stringSelection = new StringSelection(copyText);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

			System.out.println("Select the type of Item you want to generate");
			startGenerator();

		} else if (type.equals("SwordItem") || type.equals("PickaxeItem") || type.equals("AxeItem")
				|| type.equals("ShovelItem") || type.equals("HoeItem") || type.equals("ElementalSwordItem")) {

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

			String copyText = sb.toString();
			StringSelection stringSelection = new StringSelection(copyText);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

			System.out.println("Select the type of Item you want to generate");
			startGenerator();

		} else if (type.equals("ArmorItem")) {

			int i;

			System.out.println("Type the ID");
			id = input.nextLine();

			System.out.println("Type the armor material");
			armorMaterial = input.nextLine();

			for (i = 0; i < 4; i++) {
				if (i == 0) {
					equipmentSlotSpecify = "_BOOTS";
					equipmentSlot = "EquipmentSlotType.FEET";
				} else if (i == 1) {
					equipmentSlotSpecify = "_LEGGINGS";
					equipmentSlot = "EquipmentSlot.LEGS";
				} else if (i == 2) {
					equipmentSlotSpecify = "_CHESTPLATE";
					equipmentSlot = "EquipmentSlot.CHEST";
				} else if (i == 3) {
					equipmentSlotSpecify = "_HELMET";
					equipmentSlot = "EquipmentSlot.HEAD";
				}

				StringBuilder sb = new StringBuilder();

				sb.append("public static final").append(" RegistryObject<" + type + "> ").append(id.toUpperCase() + equipmentSlotSpecify.toUpperCase())
						.append(" = ").append("ITEMS.register(\"" + id.toLowerCase() + equipmentSlotSpecify.toLowerCase() + "\"")
						.append(", () -> new " + type).append("(" + armorMaterial + ", " + equipmentSlot + "new Item.Properties())");

				System.out.println(sb.toString());
			}

			System.out.println("");
			System.out.println("Copy to clipboard unsupported, please copy them manually");
		}
	}
}
