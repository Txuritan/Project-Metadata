package io.txuritan.prometa.init;

import io.txuritan.prometa.block.MultiBlockEight;
import io.txuritan.prometa.block.MultiBlockEleven;
import io.txuritan.prometa.block.MultiBlockFive;
import io.txuritan.prometa.block.MultiBlockFour;
import io.txuritan.prometa.block.MultiBlockNine;
import io.txuritan.prometa.block.MultiBlockOne;
import io.txuritan.prometa.block.MultiBlockSeven;
import io.txuritan.prometa.block.MultiBlockSix;
import io.txuritan.prometa.block.MultiBlockTen;
import io.txuritan.prometa.block.MultiBlockThirteen;
import io.txuritan.prometa.block.MultiBlockThree;
import io.txuritan.prometa.block.MultiBlockTwelve;
import io.txuritan.prometa.block.MultiBlockTwo;

import net.minecraft.block.Block;

public class ModBlocks
{
	public static Block multiBlockone;
	public static Block multiBlocktwo;
	public static Block multiBlockthree;
	public static Block multiBlockfour;
	public static Block multiBlockfive;
	public static Block multiBlocksix;
	public static Block multiBlockseven;
	public static Block multiBlockeight;
	public static Block multiBlocknine;
	public static Block multiBlockten;
	public static Block multiBlockeleven;
	public static Block multiBlocktwelve;
	public static Block multiBlockthirteen;
	
	public static void init()
	{
		multiBlockone = new MultiBlockOne();
		multiBlocktwo = new MultiBlockTwo();
		multiBlockthree = new MultiBlockThree();
		multiBlockfour = new MultiBlockFour();
		multiBlockfive = new MultiBlockFive();
		multiBlocksix = new MultiBlockSix();
		multiBlockseven = new MultiBlockSeven();
		multiBlockeight = new MultiBlockEight();
		multiBlocknine = new MultiBlockNine();
		multiBlockten = new MultiBlockTen();
		multiBlockeleven = new MultiBlockEleven();
		multiBlocktwelve = new MultiBlockTwelve();
		multiBlockthirteen = new MultiBlockThirteen();
	}
}
