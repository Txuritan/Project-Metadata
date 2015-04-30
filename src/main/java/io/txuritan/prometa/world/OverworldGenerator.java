package io.txuritan.prometa.world;

import io.txuritan.prometa.init.ModBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OverworldGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
			case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
		}
	}
 
	private void GenerateOverworld(Random random, int x, int z, World world)
	{
		this.addOreSpawn(ModBlocks.multiBlockone, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockone, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockone, 1, 14, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockone, 1, 15, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 0, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 6, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 7, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 12, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 14, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwo, 1, 15, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 0, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 5, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 6, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 11, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthree, 1, 14, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockfour, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfour, 1, 9, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfour, 1, 11, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfour, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 0, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 2, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 19, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 11, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockfive, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 0, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 2, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 5, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 6, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 7, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 12, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocksix, 1, 14, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 3, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 6, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 11, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockseven, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 0, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 3, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 5, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 6, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 9, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 11, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 12, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeight, 1, 15, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 3, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 14, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocknine, 1, 15, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockten, 1, 0, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockten, 1, 2, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockten, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockten, 1, 9, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 1, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 3, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 4, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 7, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 11, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 13, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 14, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockeleven, 1, 15, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlocktwelve, 1, 2, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwelve, 1, 3, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwelve, 1, 7, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwelve, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwelve, 1, 12, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlocktwelve, 1, 15, world, random, x, z, 10, 15, 3, 0, 128);
		
		this.addOreSpawn(ModBlocks.multiBlockthirteen, 1, 3, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthirteen, 1, 8, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthirteen, 1, 9, world, random, x, z, 10, 15, 3, 0, 128);
		this.addOreSpawn(ModBlocks.multiBlockthirteen, 1, 10, world, random, x, z, 10, 15, 3, 0, 128);
	}
	
	public void addOreSpawn(Block block, int j, int k, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
	{
		WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.stone);
		for(int i = 0; i < chancesToSpawn; i++)
		{
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			minable.generate(world, random, posX, posY, posZ);
		}
	}
}
