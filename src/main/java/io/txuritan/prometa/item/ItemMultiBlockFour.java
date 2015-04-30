package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockFour extends ItemBlock
{
	public ItemMultiBlockFour(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "endurium_ore"; break;
			case 1: name = "essence_ore"; break;
			case 2: name = "etherium_ore"; break;
			case 3: name = "exodite_ore"; break;
			case 4: name = "explodium_ore"; break;
			case 5: name = "faidon_ore"; break;
			case 6: name = "feldspar_ore"; break;
			case 7: name = "feminium_ore"; break;
			case 8: name = "flowtonium_ore"; break;
			case 9: name = "fluorite_ore"; break;
			case 10: name = "fulgarator_ore"; break;
			case 11: name = "frozen_carbonite_ore"; break;
			case 12: name = "galvorn_ore"; break;
			case 13: name = "garnet_ore"; break;
			case 14: name = "ghelonium_ore"; break;
			case 15: name = "grimacite_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.four.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.four.dim." + stack.getItemDamage()));
	}*/
}
