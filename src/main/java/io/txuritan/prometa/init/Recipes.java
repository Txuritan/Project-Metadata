package io.txuritan.prometa.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes
{
	public static void init()
	{
		initRecipes();
	}

	private static void initRecipes()
	{
		/* Shapeless Ore Dictionary Recipe
		 * GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(dustBronze, 3), new Object[] { "dustCopper", "dustCopper", "dustTin" }));
		 */
		
		/* Shaped Ore Dictionary Recipe
		 * GameRegistry.addRecipe(newShapedOreRecipe(Blocks.stone_brick_stairs, "xxx", "yyy", "zzz", 'x', "stone", 'y', Blocks.sponge, 'z', "blockGlass"));
		 */
	}
}
