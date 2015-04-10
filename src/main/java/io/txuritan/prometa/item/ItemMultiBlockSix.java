package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockSix extends ItemBlock
{
	public ItemMultiBlockSix(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "kyanite_ore"; break;
			case 1: name = "laconia_ore"; break;
			case 2: name = "lead_ore"; break;
			case 3: name = "lemurite_ore"; break;
			case 4: name = "lux_ore"; break;
			case 5: name = "macharium_ore"; break;
			case 6: name = "magicite_ore"; break;
			case 7: name = "magnesium_ore"; break;
			case 8: name = "malachite_ore"; break;
			case 9: name = "manganese_ore"; break;
			case 10: name = "mangnite_ore"; break;
			case 11: name = "marsarite_ore"; break;
			case 12: name = "mecha_ore"; break;
			case 13: name = "megacyte_ore"; break;
			case 14: name = "meowium_ore"; break;
			case 15: name = "metatron_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.six.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.six.dim." + stack.getItemDamage()));
	}*/
}
