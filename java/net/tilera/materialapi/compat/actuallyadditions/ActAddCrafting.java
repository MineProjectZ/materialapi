package net.tilera.materialapi.compat.actuallyadditions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.tilera.materialapi.items.Ingots;

public class ActAddCrafting {

	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getByNameOrId("actuallyadditions:itemWingsOfTheBats")), "I I", "NDN", "I I", 'I', Ingots.ingot1810ium, 'D', "ingotDraconiumAwakened", 'N', "netherStar"));
	}
}
