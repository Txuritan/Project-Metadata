package io.txuritan.prometa.item;

import io.txuritan.prometa.Info;
import io.txuritan.prometa.creativetab.CreativeTab;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe
{
	public ToolPickaxe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Info.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTab.tabProMetaTool);
	}
}
