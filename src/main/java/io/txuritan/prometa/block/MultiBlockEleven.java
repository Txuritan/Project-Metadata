package io.txuritan.prometa.block;

import io.txuritan.prometa.Info;
import io.txuritan.prometa.creativetab.CreativeTab;
import io.txuritan.prometa.item.ItemMultiBlockEleven;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MultiBlockEleven extends Block
{
	private final String name = "mb11eleven";
	private int maxMeta = 16;
	
	private IIcon[] icons;
	
	public MultiBlockEleven()
	{ super(Material.rock); setBlockName(Info.MODID); setCreativeTab(CreativeTab.tabProMetaBlock); GameRegistry.registerBlock(this, ItemMultiBlockEleven.class, name); icons = new IIcon[maxMeta]; }
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{ for(int i = 0; i < icons.length; i++) { icons[i] = iconRegister.registerIcon(Info.MODID + ":" + name + i); } }
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		switch(meta)
		{
			case 0: return icons[0];
			case 1: return icons[1];
			case 2: return icons[2];
			case 3: return icons[3];
			case 4: return icons[4];
			case 5: return icons[5];
			case 6: return icons[6];
			case 7: return icons[7];
			case 8: return icons[8];
			case 9: return icons[9];
			case 10: return icons[10];
			case 11: return icons[11];
			case 12: return icons[12];
			case 13: return icons[13];
			case 14: return icons[14];
			case 15: return icons[15];
			case 16: return icons[16];
			default: { return icons[0]; }
		}
    }
	
	@Override
	public int damageDropped(int meta)
	{ return meta; }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
	{ for(int i = 0; i < maxMeta; i++) { list.add(new ItemStack(item, 1, i)); } }
}
