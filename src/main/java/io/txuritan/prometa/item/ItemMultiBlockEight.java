package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockEight extends ItemBlock
{
	public ItemMultiBlockEight(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "nucleon_ore"; break;
			case 1: name = "nvidium_ore"; break;
			case 2: name = "octiron_ore"; break;
			case 3: name = "omega_ore"; break;
			case 4: name = "onnesium_ore"; break;
			case 5: name = "onyx_ore"; break;
			case 6: name = "orichalcum_ore"; break;
			case 7: name = "orpiment_ore"; break;
			case 8: name = "osmium_ore"; break;
			case 9: name = "ourclase_ore"; break;
			case 10: name = "oxyale_ore"; break;
			case 11: name = "phazon_ore"; break;
			case 12: name = "philote_ore"; break;
			case 13: name = "phlogiston_ore"; break;
			case 14: name = "photomium_ore"; break;
			case 15: name = "platinum_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.eight.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.eight.dim." + stack.getItemDamage()));
	}*/
}
