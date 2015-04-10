package io.txuritan.prometa.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
			case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
			case 1: GenerateEnd(random, chunkX * 16, chunkZ * 16, world); break;
			case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
		}
	}
 
	private void GenerateOverworld(Random random, int x, int z, World world)
	{
		//this.addOreSpawn(ModBlocks.oreChromedigizoid, world, random, x, z, 10, 15, 5, 0, 128);
	}
 
	private void GenerateNether(Random random, int x, int z, World world)
	{
		/* int Xcoord = x + random.nextInt(16);
		 * int Ycoord = 10 + random.nextInt(128);
		 * int Zcoord = z + random.nextInt(16);
		 * (new WorldGenMinable(Tutorial.tutorialBlock, 1, 15, Blocks.netherrack)).generate(world, random, Xcoord, Ycoord, Zcoord);
		 */
	}
 
	private void GenerateEnd(Random random, int x, int z, World world)
	{
		/* int Xcoord = x + random.nextInt(16);
		 * int Ycoord = 10 + random.nextInt(128);
		 * int Zcoord = z + random.nextInt(16);
		 * (new WorldGenMinable(Tutorial.tutorialBlock, 1, 15, Blocks.whitestone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		 */
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
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
