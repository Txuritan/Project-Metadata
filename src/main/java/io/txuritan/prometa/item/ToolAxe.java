package io.txuritan.prometa.item;

import io.txuritan.prometa.Info;
import io.txuritan.prometa.creativetab.CreativeTab;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe
{
	public ToolAxe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Info.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTab.tabProMetaTool);
	}
}
