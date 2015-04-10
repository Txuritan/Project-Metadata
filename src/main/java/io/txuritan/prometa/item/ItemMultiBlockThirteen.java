package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockThirteen extends ItemBlock
{
	public ItemMultiBlockThirteen(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "x_ore"; break;
			case 1: name = "xentronium_ore"; break;
			case 2: name = "yellowrite_ore"; break;
			case 3: name = "yellowrium_ore"; break;
			case 4: name = "yuanon_ore"; break;
			case 5: name = "zexonite_ore"; break;
			case 6: name = "zfylud_crystal_ore"; break;
			case 7: name = "zinc_ore"; break;
			case 8: name = "zinic_ore"; break;
			case 9: name = "zoridium_ore"; break;
			case 10: name = "zydrine_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.eleven.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.eleven.dim." + stack.getItemDamage()));
	}*/
}
