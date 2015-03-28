package io.txuritan.prometa.item;

import io.txuritan.prometa.block.MultiBlockOne;
import io.txuritan.prometa.util.StringHelper;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMultiBlockOne extends ItemBlock
{
	public ItemMultiBlockOne(Block block)
	{ super(block); setHasSubtypes(true); }
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		String name;
		switch(itemStack.getItemDamage())
		{
		case 0: name = "adamantine_ore"; break;
		case 1: name = "adlourite_ore"; break;
		case 2: name = "agricite_ore"; break;
		case 3: name = "alkahest_ore"; break;
		case 4: name = "altarus_ore"; break;
		case 5: name = "aluminum_ore"; break;
		case 6: name = "alumite_ore"; break;
		case 7: name = "am2_ore"; break;
		case 8: name = "arcanite_ore"; break;
		case 9: name = "arnmonium_ore"; break;
		case 10: name = "atmospherium_ore"; break;
		case 11: name = "axonite_ore"; break;
		case 12: name = "balthazate_ore"; break;
		case 13: name = "basidiumite_ore"; break;
		case 14: name = "bendezium_ore"; break;
		case 15: name = "bitumen_ore"; break;
			default: name = "noMeta";
		}
		return getUnlocalizedName() + "." + name;
    }
	
	@Override
	public int getMetadata(int meta)
	{ return meta; }
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		if (StringHelper.displayShiftForDetail && !StringHelper.isShiftKeyDown())
		{ list.add(StringHelper.shiftForDetails()); }
		if (!StringHelper.isShiftKeyDown())
		{ return; }
		list.add(StringHelper.getInfoText("info.prometa.mod.name"));
		list.add(StringHelper.getInfoText("info.prometa.ore.one.rarity." + stack.getItemDamage()));
		list.add(StringHelper.getInfoText("info.prometa.ore.one.dim." + stack.getItemDamage()));
	}
}
