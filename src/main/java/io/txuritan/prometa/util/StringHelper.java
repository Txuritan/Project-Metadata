package io.txuritan.prometa.util;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;

public class StringHelper
{
	public static boolean isAltKeyDown()
	{ return Keyboard.isKeyDown(Keyboard.KEY_LMENU) || Keyboard.isKeyDown(Keyboard.KEY_RMENU); }
	
	public static boolean isControlKeyDown()
	{ return Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) || Keyboard.isKeyDown(Keyboard.KEY_RCONTROL); }
	
	public static boolean isShiftKeyDown()
	{ return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT); }
	
	public static String localize(String key)
	{ return StatCollector.translateToLocal(key); }
	
	public static String getItemName(ItemStack stack)
	{ String name = "" + END; if (stack.getRarity() == EnumRarity.uncommon) { name += YELLOW; } else if (stack.getRarity() == EnumRarity.rare) { name += BRIGHT_BLUE; } else if (stack.getRarity() == EnumRarity.epic) { name += PINK; } name += stack.getDisplayName() + END; return name; }
	
	public static String getActivationText(String key)
	{ return BRIGHT_BLUE + localize(key) + END; }
	
	public static String getDeactivationText(String key)
	{ return YELLOW + localize(key) + END; }
	
	public static String getInfoText(String key)
	{ return BRIGHT_GREEN + localize(key) + END; }
	
	public static String getNoticeText(String key)
	{ return ORANGE + localize(key) + END; }
	
	public static String getFlavorText(String key)
	{ return LIGHT_GRAY + localize(key) + END; }
	
	public static String getRarity(int level)
	{ switch (level) { case 2: return StringHelper.YELLOW; case 3: return StringHelper.BRIGHT_BLUE; default: return StringHelper.LIGHT_GRAY; } }
	
	public static String shiftForDetails()
	{ return LIGHT_GRAY + localize("info.prometa.hold") + " " + YELLOW + ITALIC + localize("info.prometa.shift") + " " + END + LIGHT_GRAY + localize("info.prometa.forDetails") + END; }
	
	public static final String ORANGE = (char) 167 + "6";
	public static final String LIGHT_GRAY = (char) 167 + "7";
	public static final String BRIGHT_GREEN = (char) 167 + "a";
	public static final String BRIGHT_BLUE = (char) 167 + "b";
	public static final String PINK = (char) 167 + "d";
	public static final String YELLOW = (char) 167 + "e";
	public static final String ITALIC = (char) 167 + "o";
	public static final String END = (char) 167 + "r";
	
	public static boolean displayShiftForDetail = true;
}
