package io.txuritan.prometa.armor;

import io.txuritan.prometa.Info;
import io.txuritan.prometa.creativetab.CreativeTab;
import io.txuritan.prometa.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Armor extends ItemArmor
{
	public String textureName;
	
	public Armor(String unlocalizedName, ArmorMaterial material, String textureName, int type)
	{
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Info.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(CreativeTab.tabProMetaArmor);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Info.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (itemStack.getItem().equals(ModItems.txuriteLeggings))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
		
		if (itemStack.getItem().equals(ModItems.txuriteChestplate))
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40));
		if (itemStack.getItem().equals(ModItems.yuriteBoots))
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 40));
		
		if (itemStack.getItem().equals(ModItems.yuriteChestplate))
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));
		
		if (itemStack.getItem().equals(ModItems.yuriteLeggings))
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40));
	}
}
