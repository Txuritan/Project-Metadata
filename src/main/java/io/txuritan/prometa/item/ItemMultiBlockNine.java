package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockNine extends ItemBlock
{
	public ItemMultiBlockNine(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "plutonium_ore"; break;
			case 1: name = "potash_ore"; break;
			case 2: name = "primium_ore"; break;
			case 3: name = "promethium_ore"; break;
			case 4: name = "protonine_ore"; break;
			case 5: name = "psitarium_ore"; break;
			case 6: name = "pyerite_ore"; break;
			case 7: name = "pyreal_ore"; break;
			case 8: name = "pyrite_ore"; break;
			case 9: name = "realgar_ore"; break;
			case 10: name = "rearden_ore"; break;
			case 11: name = "relux_ore"; break;
			case 12: name = "rhodonite_ore"; break;
			case 13: name = "ruby_ore"; break;
			case 14: name = "runite_ore"; break;
			case 15: name = "sakuradite_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.nine.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.nine.dim." + stack.getItemDamage()));
	}*/
}
