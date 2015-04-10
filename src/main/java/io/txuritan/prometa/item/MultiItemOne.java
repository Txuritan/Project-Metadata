package io.txuritan.prometa.item;

import io.txuritan.prometa.Info;
import io.txuritan.prometa.creativetab.CreativeTab;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class MultiItemOne extends Item
{
	public IIcon[] icons = new IIcon[300];
	
	public MultiItemOne(String unlocalizedName) {
		super();
		this.setHasSubtypes(true);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTab.tabProMetaItem);
	}
	
	@Override
	public void registerIcons(IIconRegister reg)
	{
		for (int i = 0; i < 300; i ++)
		{
			this.icons[i] = reg.registerIcon(Info.MODID + ":mi10one_" + i);
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta)
	{
		if (meta > 299)
			meta = 0;
		return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list)
	{
		for (int i = 0; i < 300; i ++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
}
