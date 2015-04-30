package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockTen extends ItemBlock
{
	public ItemMultiBlockTen(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "salt_ore"; break;
			case 1: name = "sangiunite_ore"; break;
			case 2: name = "sapphire_ore"; break;
			case 3: name = "schwartz_ore"; break;
			case 4: name = "scrith_ore"; break;
			case 5: name = "selthium_ore"; break;
			case 6: name = "shadow_iron_ore"; break;
			case 7: name = "shale_ore"; break;
			case 8: name = "silicon_ore"; break;
			case 9: name = "silver_ore"; break;
			case 10: name = "sinisite_ore"; break;
			case 11: name = "slate_ore"; break;
			case 12: name = "slood_ore"; break;
			case 13: name = "smitherene_ore"; break;
			case 14: name = "soulsteel_ore"; break;
			case 15: name = "sphalerite_ore"; break;
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
		list.add(StringHelper.getInfoText("info.prometa.ore.ten.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.ten.dim." + stack.getItemDamage()));
	}*/
}
