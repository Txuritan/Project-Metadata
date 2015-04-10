package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockThree extends ItemBlock
{
	public ItemMultiBlockThree(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "columbite_ore"; break;
			case 1: name = "copper_ore"; break;
			case 2: name = "corrodium_ore"; break;
			case 3: name = "cortex_ore"; break;
			case 4: name = "dark_iron_ore"; break;
			case 5: name = "deep_iron_ore"; break;
			case 6: name = "destronium_ore"; break;
			case 7: name = "disgruntium_ore"; break;
			case 8: name = "dragonbane_ore"; break;
			case 9: name = "ebony_ore"; break;
			case 10: name = "echsarite_ore"; break;
			case 11: name = "ekti_ore"; break;
			case 12: name = "elementium_ore"; break;
			case 13: name = "elephantigen_ore"; break;
			case 14: name = "elerium_ore"; break;
			case 15: name = "enderium_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.three.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.three.dim." + stack.getItemDamage()));
	}*/
}
