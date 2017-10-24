package net.tilera.materialapi;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.tilera.materialapi.items.Ingots;

public class OreDict {

	public static void init() {
		OreDictionary.registerOre("obsidian", new ItemStack(Ingots.ingotObsidian));
		OreDictionary.registerOre("dustRefinedGlowstone", new ItemStack(Items.GLOWSTONE_DUST));
		OreDictionary.registerOre("ingotDragonEgg", new ItemStack(Blocks.DRAGON_EGG));
		OreDictionary.registerOre("dragonEgg", new ItemStack(Ingots.ingotDragonEgg));
	}
}
