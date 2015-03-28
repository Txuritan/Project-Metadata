package io.txuritan.prometa.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import io.txuritan.prometa.Info;
import io.txuritan.prometa.init.ModItems;

public class CreativeTab
{
	public static final CreativeTabs tabProMetaArmor = new CreativeTabs(Info.MODID + "." + "armor")
	{ @Override public Item getTabIconItem() { return ModItems.txuriteSword; } };
	
	public static final CreativeTabs tabProMetaBlock = new CreativeTabs(Info.MODID + "." + "block")
	{ @Override public Item getTabIconItem() { return ModItems.txuriteSword; } };
	
	public static final CreativeTabs tabProMetaItem = new CreativeTabs(Info.MODID + "." + "item")
	{ @Override public Item getTabIconItem() { return ModItems.txuriteSword; } };
	
	public static final CreativeTabs tabProMetaTool = new CreativeTabs(Info.MODID + "." + "tool")
	{ @Override public Item getTabIconItem() { return ModItems.txuriteSword; } };
}
