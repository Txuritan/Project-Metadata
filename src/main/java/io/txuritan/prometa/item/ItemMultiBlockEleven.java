package io.txuritan.prometa.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockEleven extends ItemBlock
{
	public ItemMultiBlockEleven(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
			case 0: name = "sphene_ore"; break;
			case 1: name = "spinal_ore"; break;
			case 2: name = "star_steel_ore"; break;
			case 3: name = "stupidium_ore"; break;
			case 4: name = "stygium_ore"; break;
			case 5: name = "sulfur_ore"; break;
			case 6: name = "sunstone_ore"; break;
			case 7: name = "thaumium_ore"; break;
			case 8: name = "therium_ore"; break;
			case 9: name = "thiotimoline_ore"; break;
			case 10: name = "thorium_ore"; break;
			case 11: name = "thyrium_ore"; break;
			case 12: name = "tin_ore"; break;
			case 13: name = "titanium_ore"; break;
			case 14: name = "trotium_ore"; break;
			case 15: name = "trilithium_ore"; break;
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
