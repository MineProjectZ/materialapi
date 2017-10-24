package net.tilera.materialapi.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.tilera.materialapi.compat.ModDetector;
import net.tilera.materialapi.items.Dusts;
import net.tilera.materialapi.items.Ingots;
import net.tilera.materialapi.items.Materials;

public class Recipes {
	public static void init() {
		if (!ModDetector.extrautils2) {
			GameRegistry.addShapelessRecipe(new ItemStack(Ingots.ingotEnchanted), Items.GOLD_INGOT, new ItemStack(Items.DYE, 1, 4), Items.ENCHANTED_BOOK);
			GameRegistry.addShapelessRecipe(new ItemStack(Ingots.ingotEvilInfused), Items.IRON_INGOT, Items.NETHER_STAR, Items.ENCHANTED_BOOK);
			GameRegistry.addShapelessRecipe(new ItemStack(Ingots.ingotDemon), Items.GOLD_INGOT, Items.LAVA_BUCKET, Blocks.NETHER_BRICK, Blocks.NETHER_BRICK, Blocks.NETHER_BRICK, Blocks.NETHER_BRICK);
		}
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.ingot1810ium), Blocks.GLOWSTONE, Blocks.DIAMOND_BLOCK, Items.IRON_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(Dusts.dustGreenstone, 2), Items.EMERALD, Items.REDSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(Dusts.dustBluestone, 2), new ItemStack(Items.DYE, 1, 4), Items.REDSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(Materials.gemQuartzBlack), Items.COAL, Items.QUARTZ);
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.ingotMixed), Ingots.ingotCopper, Ingots.ingotTin, Items.IRON_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.ingotCrystalMatrix), Items.NETHER_STAR, Items.NETHER_STAR, Items.DIAMOND, Items.DIAMOND, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_BLOCK);
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(Ingots.ingotSteel), 0.0F);
		GameRegistry.addSmelting(Ingots.ingotMixed, new ItemStack(Ingots.ingotAdvancedAlloy), 0.0F);
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Dusts.dustBronze, 3), new Object[] {"dustTin", "dustCopper", "dustCopper"}));
		GameRegistry.addRecipe(new ItemStack(Ingots.ingotDraconic), new Object[] {"DRD", "RER", "DRD", 'D', Ingots.ingotDraconium, 'R', Ingots.ingotRedstone, 'E', Ingots.ingotDragonEgg});
	}
}
