package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockSeven extends ItemBlock
{
	public ItemMultiBlockSeven(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "meutoite_ore"; break;
			case 1: name = "mexallon_ore"; break;
			case 2: name = "midasium_ore"; break;
			case 3: name = "mithril_ore"; break;
			case 4: name = "mizzium_ore"; break;
			case 5: name = "moonsilver_ore"; break;
			case 6: name = "moonstone_ore"; break;
			case 7: name = "morphite_ore"; break;
			case 8: name = "naquadah_ore"; break;
			case 9: name = "necrodermis_ore"; break;
			case 10: name = "necrogen_ore"; break;
			case 11: name = "necronium_ore"; break;
			case 12: name = "neoteutonium_ore"; break;
			case 13: name = "nickel_ore"; break;
			case 14: name = "nith_ore"; break;
			case 15: name = "noczium_ore"; break;
			default: name = "noMeta";
		}
		return getUnlocalizedName() + "." + name;
    }
	
	@Override
	public int getMetadata(int meta)
	{ return meta; }
	
	/*@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		if (StringHelper.displayShiftForDetail && !StringHelper.isShiftKeyDown())
		{ list.add(StringHelper.shiftForDetails()); }
		if (!StringHelper.isShiftKeyDown())
		{ return; }
		list.add(StringHelper.getInfoText("info.prometa.mod.name"));
		list.add(StringHelper.getInfoText("info.prometa.ore.seven.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.seven.dim." + stack.getItemDamage()));
	}*/
}
