package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockTwelve extends ItemBlock
{
	public ItemMultiBlockTwelve(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "trinium_ore"; break;
			case 1: name = "tritanium_ore"; break;
			case 2: name = "tungsten_ore"; break;
			case 3: name = "ulexite_ore"; break;
			case 4: name = "unobtainium_ore"; break;
			case 5: name = "upsidaisium_ore"; break;
			case 6: name = "uranium_ore"; break;
			case 7: name = "uridium_ore"; break;
			case 8: name = "vanadinite_ore"; break;
			case 9: name = "venomite_ore"; break;
			case 10: name = "vibranium_ore"; break;
			case 11: name = "vizorium_ore"; break;
			case 12: name = "vulconite_ore"; break;
			case 13: name = "vyroxeres_ore"; break;
			case 14: name = "warpstone_ore"; break;
			case 15: name = "wellstone_ore"; break;
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
