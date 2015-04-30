package io.txuritan.prometa;

import io.txuritan.prometa.init.Dictionary;
import io.txuritan.prometa.init.ModBlocks;
import io.txuritan.prometa.init.ModItems;
import io.txuritan.prometa.init.Recipes;
import io.txuritan.prometa.proxy.CommonProxy;
import io.txuritan.prometa.world.EndGenerator;
import io.txuritan.prometa.world.NetherGenerator;
import io.txuritan.prometa.world.OverworldGenerator;

import java.util.logging.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Info.MODID, name = Info.MODNAME, version = Info.VERSION)
public class ProMeta
{
	@Mod.Instance(Info.MODID)
	public static ProMeta instance;
	
	public static final Logger logger = Logger.getLogger("Project Metadata");
	
	@SidedProxy(clientSide = Info.CLIENTPROXY, serverSide = Info.COMMONPROXY)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(new OverworldGenerator(), 1);
		GameRegistry.registerWorldGenerator(new NetherGenerator(), 1);
		GameRegistry.registerWorldGenerator(new EndGenerator(), 1);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
    		Recipes.init();
    		Dictionary.init();
	}
    
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
