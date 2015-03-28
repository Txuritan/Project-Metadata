package io.txuritan.prometa.init;

import net.minecraft.block.Block;
import io.txuritan.prometa.Info;
import io.txuritan.prometa.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Info.MODID)
public class ModBlocks
{
	public static Block multiBlockone;
	public static Block multiBlocktwo;
	
	public static void init()
	{
		multiBlockone = new MultiBlockOne();
		multiBlocktwo = new MultiBlockTwo();
	}
}
