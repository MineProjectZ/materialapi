package net.tilera.materialapi;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tilera.materialapi.compat.ModDetector;
import net.tilera.materialapi.compat.actuallyadditions.ActAddCrafting;
import net.tilera.materialapi.items.Dusts;
import net.tilera.materialapi.items.Ingots;
import net.tilera.materialapi.items.Materials;
import net.tilera.materialapi.items.Nuggets;
import net.tilera.materialapi.recipes.DustSmelting;
import net.tilera.materialapi.recipes.NuggetRecipes;
import net.tilera.materialapi.recipes.Recipes;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "materialapi";
	public static final String MODNAME = "Material API";
	public static final String VERSION = "1.0.0";
	public static final MaterialTab materialTab = new MaterialTab();
	public static final IngotTab ingotTab = new IngotTab();
	public static final DustTab dustTab = new DustTab();
	public static final NuggetTab nuggetTab = new NuggetTab();
	
	@Mod.Instance(MODID)
	public static Main instance;
	
	@SidedProxy(clientSide="net.tilera.materialapi.ClientProxy", serverSide="net.tilera.materialapi.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(MODNAME + " is loading!");
		Ingots.init();
		Materials.init();
		Dusts.init();
		Nuggets.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		OreDict.init();
		Recipes.init();
		DustSmelting.init();
		NuggetRecipes.init();
		if (ModDetector.actuallyadditions) {
			ActAddCrafting.init();
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Is Extra Utilities 2 installed: " + ModDetector.extrautils2);
		System.out.println("Is Avaritia installed: " + ModDetector.avaritia);
		System.out.println("Is Actually Additions installed: " + ModDetector.actuallyadditions);
	}
}
