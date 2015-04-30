package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockFive extends ItemBlock
{
	public ItemMultiBlockFive(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "gundanium_ore"; break;
			case 1: name = "handwavium_ore"; break;
			case 2: name = "heartstone_ore"; break;
			case 3: name = "hellion_ore"; break;
			case 4: name = "hex_ore"; break;
			case 5: name = "ignatius_ore"; break;
			case 6: name = "illyrion_ore"; break;
			case 7: name = "imulsium_ore"; break;
			case 8: name = "infuscolium_ore"; break;
			case 9: name = "invar_ore"; break;
			case 10: name = "isogen_ore"; break;
			case 11: name = "japanium_ore"; break;
			case 12: name = "jouronium_ore"; break;
			case 13: name = "jumbonium_ore"; break;
			case 14: name = "kalendrite_ore"; break;
			case 15: name = "kunzite_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.five.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.five.dim." + stack.getItemDamage()));
	}*/
}
