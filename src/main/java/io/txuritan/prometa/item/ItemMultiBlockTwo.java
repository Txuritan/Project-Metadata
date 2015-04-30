package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockTwo extends ItemBlock
{
	public ItemMultiBlockTwo(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "bombastium_ore"; break;
			case 1: name = "buxite_ore"; break;
			case 2: name = "byzantium_ore"; break;
			case 3: name = "caesium_ore"; break;
			case 4: name = "capitalium_ore"; break;
			case 5: name = "capsidium_ore"; break;
			case 6: name = "carmot_ore"; break;
			case 7: name = "carnelian_ore"; break;
			case 8: name = "cassiterite_ore"; break;
			case 9: name = "cavorite_ore"; break;
			case 10: name = "ceruclase_ore"; break;
			case 11: name = "chlorizite_ore"; break;
			case 12: name = "chromium_ore"; break;
			case 13: name = "cinnabar_ore"; break;
			case 14: name = "clear_quartz_ore"; break;
			case 15: name = "cobalt_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.two.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.two.dim." + stack.getItemDamage()));
	}*/
}
