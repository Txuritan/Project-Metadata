package io.txuritan.prometa.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import io.txuritan.prometa.Info;
import io.txuritan.prometa.armor.*;
import io.txuritan.prometa.item.*;

@GameRegistry.ObjectHolder(Info.MODID)
public class ModItems
{
	public static Item txuriteHelmet;
	public static Item txuriteChestplate;
	public static Item txuriteLeggings;
	public static Item txuriteBoots;
	
	public static ArmorMaterial TXURITE_ARMOR = EnumHelper.addArmorMaterial("TXURITE_ARMOR", 25, new int[] {3, 8, 6, 3}, 30);
	
	public static Item txuritePickaxe;
	public static Item txuriteAxe;
	public static Item txuriteSpade;
	public static Item txuriteHoe;
	public static Item txuriteSword;
	
	public static ToolMaterial TXURITE_TOOL = EnumHelper.addToolMaterial("TXURITE_TOOL", 3, 1000, 15.0F, 4.0F, 30);
	
	public static Item yuriteHelmet;
	public static Item yuriteChestplate;
	public static Item yuriteLeggings;
	public static Item yuriteBoots;
	
	public static ArmorMaterial YURITE_ARMOR = EnumHelper.addArmorMaterial("YURITE_ARMOR", 25, new int[] {3, 8, 6, 3}, 40);
	
	public static Item yuritePickaxe;
	public static Item yuriteAxe;
	public static Item yuriteSpade;
	public static Item yuriteHoe;
	public static Item yuriteSword;
	
	public static ToolMaterial YURITE_TOOL = EnumHelper.addToolMaterial("YURITE_TOOL", 3, 1000, 15.0F, 4.0F, 40);
	
	public static void init()
	{	
		GameRegistry.registerItem(txuriteHelmet = new Armor("txurite_helmet", TXURITE_ARMOR, "txurite", 0), "txurite_helmet");
		GameRegistry.registerItem(txuriteChestplate = new Armor("txurite_chestplate", TXURITE_ARMOR, "txurite", 1), "txurite_chestplate");
		GameRegistry.registerItem(txuriteLeggings = new Armor("txurite_leggings", TXURITE_ARMOR, "txurite", 2), "txurite_leggings");
		GameRegistry.registerItem(txuriteBoots = new Armor("txurite_boots", TXURITE_ARMOR, "txurite", 3), "txurite_boots");
		
		GameRegistry.registerItem(txuritePickaxe = new ToolPickaxe("txurite_pickaxe", TXURITE_TOOL), "txurite_pickaxe");
		GameRegistry.registerItem(txuriteAxe = new ToolAxe("txurite_axe", TXURITE_TOOL), "txurite_axe");
		GameRegistry.registerItem(txuriteSpade = new ToolSpade("txurite_spade", TXURITE_TOOL), "txurite_spade");
		GameRegistry.registerItem(txuriteHoe = new ToolHoe("txurite_hoe", TXURITE_TOOL), "txurite_hoe");
		GameRegistry.registerItem(txuriteSword = new ToolSword("txurite_sword", TXURITE_TOOL), "txurite_sword");
		
		GameRegistry.registerItem(yuriteHelmet = new Armor("yurite_helmet", YURITE_ARMOR, "yurite", 0), "yurite_helmet");
		GameRegistry.registerItem(yuriteChestplate = new Armor("yurite_chestplate", YURITE_ARMOR, "yurite", 1), "yurite_chestplate");
		GameRegistry.registerItem(yuriteLeggings = new Armor("yurite_leggings", YURITE_ARMOR, "yurite", 2), "yurite_leggings");
		GameRegistry.registerItem(yuriteBoots = new Armor("yurite_boots", YURITE_ARMOR, "yurite", 3), "yurite_boots");
		
		GameRegistry.registerItem(yuritePickaxe = new ToolPickaxe("yurite_pickaxe", YURITE_TOOL), "yurite_pickaxe");
		GameRegistry.registerItem(yuriteAxe = new ToolAxe("yurite_axe", YURITE_TOOL), "yurite_axe");
		GameRegistry.registerItem(yuriteSpade = new ToolSpade("yurite_spade", YURITE_TOOL), "yurite_spade");
		GameRegistry.registerItem(yuriteHoe = new ToolHoe("yurite_hoe", YURITE_TOOL), "yurite_hoe");
		GameRegistry.registerItem(yuriteSword = new ToolSword("yurite_sword", YURITE_TOOL), "yurite_sword");
	}
}
