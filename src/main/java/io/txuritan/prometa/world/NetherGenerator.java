package io.txuritan.prometa.world;

import io.txuritan.prometa.init.ModBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class NetherGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
			case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
		}
	}
 
	private void GenerateNether(Random random, int x, int z, World world)
	{
		this.addOreSpawn(ModBlocks.multiBlockone, 1, 1, world, random, x, z, 20, 30, 3, 0, 128);
	}
	
	public void addOreSpawn(Block block, int j, int k, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
	{
		WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.netherrack);
		for(int i = 0; i < chancesToSpawn; i++)
		{
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			minable.generate(world, random, posX, posY, posZ);
		}
	}
}
