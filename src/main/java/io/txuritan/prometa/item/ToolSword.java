package io.txuritan.prometa.item;

import io.txuritan.prometa.Info;
import io.txuritan.prometa.creativetab.CreativeTab;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword
{
	public ToolSword(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Info.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTab.tabProMetaTool);
	}
}
