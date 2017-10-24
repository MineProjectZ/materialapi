package net.tilera.materialapi.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tilera.materialapi.Main;

public class Ingots {

	public static ItemBase ingot1810ium;
	public static ItemBase ingotAdvancedAlloy;
	public static ItemBase ingotAlubrass;
	public static ItemBase ingotAluminum;
	public static ItemBase ingotArdite;
	public static ItemBase ingotBedrock;
	public static ItemBase ingotBedrockium;
	public static ItemBase ingotBlutonium;
	public static ItemBase ingotBrass;
	public static ItemBase ingotBronze;
	public static ItemBase ingotChrome;
	public static ItemBase ingotCobalt;
	public static ItemBase ingotConstantan;
	public static ItemBase ingotCopper;
	public static ItemBase ingotCreativite;
	public static ItemBase ingotCyanite;
	public static ItemBase ingotDarkSteel;
	public static ItemBase ingotDemon;
	public static ItemBase ingotDraconic;
	public static ItemBase ingotDraconium;
	public static ItemBase ingotElectricalSteel;
	public static ItemBase ingotElectrum;
	public static ItemBase ingotEnchanted;
	public static ItemBase ingotEnderium;
	public static ItemBase ingotEndgameium;
	public static ItemBase ingotEnergeticAlloy;
	public static ItemBase ingotEvilInfused;
	public static ItemBase ingotGlowstone;
	public static ItemBase ingotGraphite;
	public static ItemBase ingotInvar;
	public static ItemBase ingotIridium;
	public static ItemBase ingotKnightslime;
	public static ItemBase ingotLead;
	public static ItemBase ingotLudicrite;
	public static ItemBase ingotLumium;
	public static ItemBase ingotManyullyn;
	public static ItemBase ingotMithril;
	public static ItemBase ingotNickel;
	public static ItemBase ingotObsidian;
	public static ItemBase ingotOsmium;
	public static ItemBase ingotPhasedGold;
	public static ItemBase ingotPigiron;
	public static ItemBase ingotPlatinum;
	public static ItemBase ingotQuartzEnriched;
	public static ItemBase ingotRedstoneAlloy;
	public static ItemBase ingotRefinedObsidian;
	public static ItemBase ingotSignalum;
	public static ItemBase ingotSilver;
	public static ItemBase ingotSoularium;
	public static ItemBase ingotStarSteel;
	public static ItemBase ingotSteel;
	public static ItemBase ingotTheingot;
	public static ItemBase ingotTin;
	public static ItemBase ingotTitanium;
	public static ItemBase ingotTungsten;
	public static ItemBase ingotTungstenSteel;
	public static ItemBase ingotUnstable;
	public static ItemBase ingotUranium;
	public static ItemBase ingotYellorium;
	public static ItemBase ingotZinc;
	public static ItemBase ingotRedstone;
	public static ItemBase ingotBluestone;
	public static ItemBase ingotGreenstone;
	public static ItemBase ingotEnder;
	public static ItemBase ingotDragonEgg;
	public static ItemBase ingotChaos;
	public static ItemBase ingotInfinity;
	public static ItemBase ingotCosmicNeutronium;
	public static ItemBase ingotCrystalMatrix;
	public static ItemBase ingotMixed;
	
	public static void init() {
		ingot1810ium = register(new ItemOre("ingot1810ium", "ingot1810ium").setCreativeTab(Main.ingotTab));
		ingotAdvancedAlloy = register(new ItemOre("ingotAdvancedAlloy", "ingotAdvancedAlloy").setCreativeTab(Main.ingotTab));
		ingotAlubrass = register(new ItemOre("ingotAlubrass", "ingotAlubrass").setCreativeTab(Main.ingotTab));
		ingotAluminum = register(new ItemOre("ingotAluminum", "ingotAluminum").setCreativeTab(Main.ingotTab));
		ingotArdite = register(new ItemOre("ingotArdite", "ingotArdite").setCreativeTab(Main.ingotTab));
		ingotBedrock = register(new ItemOre("ingotBedrock", "ingotBedrock").setCreativeTab(Main.ingotTab));
		ingotBedrockium = register(new ItemOre("ingotBedrockium", "ingotBedrockium").setCreativeTab(Main.ingotTab));
		ingotBlutonium = register(new ItemOre("ingotBlutonium", "ingotBlutonium").setCreativeTab(Main.ingotTab));
		ingotBrass = register(new ItemOre("ingotBrass", "ingotBrass").setCreativeTab(Main.ingotTab));
		ingotBronze = register(new ItemOre("ingotBronze", "ingotBronze").setCreativeTab(Main.ingotTab));
		ingotChrome = register(new ItemOre("ingotChrome", "ingotChrome").setCreativeTab(Main.ingotTab));
		ingotCobalt = register(new ItemOre("ingotCobalt", "ingotCobalt").setCreativeTab(Main.ingotTab));
		ingotConstantan = register(new ItemOre("ingotConstantan", "ingotConstantan").setCreativeTab(Main.ingotTab));
		ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper").setCreativeTab(Main.ingotTab));
		ingotCreativite = register(new ItemOre("ingotCreativite", "ingotCreativite").setCreativeTab(Main.ingotTab));
		ingotCyanite = register(new ItemOre("ingotCyanite", "ingotCyanite").setCreativeTab(Main.ingotTab));
		ingotDarkSteel = register(new ItemOre("ingotDarkSteel", "ingotDarkSteel").setCreativeTab(Main.ingotTab));
		ingotDemon = register(new ItemOre("ingotDemon", "ingotDemon").setCreativeTab(Main.ingotTab));
		ingotDraconic = register(new ItemOre("ingotDraconic", "ingotDraconiumAwakened").setCreativeTab(Main.ingotTab));
		ingotDraconium = register(new ItemOre("ingotDraconium", "ingotDraconium").setCreativeTab(Main.ingotTab));
		ingotElectricalSteel = register(new ItemOre("ingotElectricalSteel", "ingotElectricalSteel").setCreativeTab(Main.ingotTab));
		ingotElectrum = register(new ItemOre("ingotElectrum", "ingotElectrum").setCreativeTab(Main.ingotTab));
		ingotEnchanted = register(new ItemOre("ingotEnchanted", "ingotEnchanted").setCreativeTab(Main.ingotTab));
		ingotEnderium = register(new ItemOre("ingotEnderium", "ingotEnderium").setCreativeTab(Main.ingotTab));
		ingotEndgameium = register(new ItemOre("ingotEndgameium", "ingotEndgameium").setCreativeTab(Main.ingotTab));
		ingotEnergeticAlloy = register(new ItemOre("ingotEnergeticAlloy", "ingotEnergeticAlloy").setCreativeTab(Main.ingotTab));
		ingotEvilInfused = register(new ItemOre("ingotEvilInfused", "ingotEvilInfused").setCreativeTab(Main.ingotTab));
		ingotGlowstone = register(new ItemOre("ingotGlowstone", "ingotRefinedGlowstone").setCreativeTab(Main.ingotTab));
		ingotGraphite = register(new ItemOre("ingotGraphite", "ingotGraphite").setCreativeTab(Main.ingotTab));
		ingotInvar = register(new ItemOre("ingotInvar", "ingotInvar").setCreativeTab(Main.ingotTab));
		ingotIridium = register(new ItemOre("ingotIridium", "ingotIridium").setCreativeTab(Main.ingotTab));
		ingotKnightslime = register(new ItemOre("ingotKnightslime", "ingotKnightslime").setCreativeTab(Main.ingotTab));
		ingotLead = register(new ItemOre("ingotLead", "ingotLead").setCreativeTab(Main.ingotTab));
		ingotLudicrite = register(new ItemOre("ingotLudicrite", "ingotLudicrite").setCreativeTab(Main.ingotTab));
		ingotLumium = register(new ItemOre("ingotLumium", "ingotLumium").setCreativeTab(Main.ingotTab));
		ingotManyullyn = register(new ItemOre("ingotManyullyn", "ingotManyullyn").setCreativeTab(Main.ingotTab));
		ingotMithril = register(new ItemOre("ingotMithril", "ingotMithril").setCreativeTab(Main.ingotTab));
		ingotNickel = register(new ItemOre("ingotNickel", "ingotNickel").setCreativeTab(Main.ingotTab));
		ingotObsidian = register(new ItemOre("ingotObsidian", "ingotObsidian").setCreativeTab(Main.ingotTab));
		ingotOsmium = register(new ItemOre("ingotOsmium", "ingotOsmium").setCreativeTab(Main.ingotTab));
		ingotPhasedGold = register(new ItemOre("ingotPhasedGold", "ingotPhasedGold").setCreativeTab(Main.ingotTab));
		ingotPigiron = register(new ItemOre("ingotPigiron", "ingotPigiron").setCreativeTab(Main.ingotTab));
		ingotPlatinum = register(new ItemOre("ingotPlatinum", "ingotPlatinum").setCreativeTab(Main.ingotTab));
		ingotQuartzEnriched = register(new ItemOre("ingotQuartzEnriched", "ingotQuartzEnriched").setCreativeTab(Main.ingotTab));
		ingotRedstoneAlloy = register(new ItemOre("ingotRedstoneAlloy", "ingotRedstoneAlloy").setCreativeTab(Main.ingotTab));
		ingotRefinedObsidian = register(new ItemOre("ingotRefinedObsidian", "ingotRefinedObsidian").setCreativeTab(Main.ingotTab));
		ingotSignalum = register(new ItemOre("ingotSignalum", "ingotSignalum").setCreativeTab(Main.ingotTab));
		ingotSilver = register(new ItemOre("ingotSilver", "ingotSilver").setCreativeTab(Main.ingotTab));
		ingotSoularium = register(new ItemOre("ingotSoularium", "ingotSoularium").setCreativeTab(Main.ingotTab));
		ingotStarSteel = register(new ItemOre("ingotStarSteel", "ingotStarSteel").setCreativeTab(Main.ingotTab));
		ingotSteel = register(new ItemOre("ingotSteel", "ingotSteel").setCreativeTab(Main.ingotTab));
		ingotTheingot = register(new ItemOre("ingotTheingot", "ingotTheingot").setCreativeTab(Main.ingotTab));
		ingotTin = register(new ItemOre("ingotTin", "ingotTin").setCreativeTab(Main.ingotTab));
		ingotTitanium = register(new ItemOre("ingotTitanium", "ingotTitanium").setCreativeTab(Main.ingotTab));
		ingotTungsten = register(new ItemOre("ingotTungsten", "ingotTungsten").setCreativeTab(Main.ingotTab));
		ingotTungstenSteel = register(new ItemOre("ingotTungstenSteel", "ingotTungstenSteel").setCreativeTab(Main.ingotTab));
		ingotUnstable = register(new ItemOre("ingotUnstable", "ingotUnstable").setCreativeTab(Main.ingotTab));
		ingotUranium = register(new ItemOre("ingotUranium", "ingotUranium").setCreativeTab(Main.ingotTab));
		ingotYellorium = register(new ItemOre("ingotYellorium", "ingotYellorium").setCreativeTab(Main.ingotTab));
		ingotZinc = register(new ItemOre("ingotZinc", "ingotZinc").setCreativeTab(Main.ingotTab));
		ingotRedstone = register(new ItemOre("ingotRedstone", "ingotRedstone").setCreativeTab(Main.ingotTab));
		ingotBluestone = register(new ItemOre("ingotBluestone", "ingotBluestone").setCreativeTab(Main.ingotTab));
		ingotGreenstone = register(new ItemOre("ingotGreenstone", "ingotGreenstone").setCreativeTab(Main.ingotTab));
		ingotEnder = register(new ItemOre("ingotEnder", "ingotEnder").setCreativeTab(Main.ingotTab));
		ingotDragonEgg = register(new ItemOre("ingotDragonEgg", "ingotDragonEgg").setCreativeTab(Main.ingotTab));
		ingotChaos = register(new ItemOre("ingotChaos", "ingotChaos").setCreativeTab(Main.ingotTab));
		ingotInfinity = register(new ItemOre("ingotInfinity", "ingotInfinity").setCreativeTab(Main.ingotTab));
		ingotCosmicNeutronium = register(new ItemOre("ingotCosmicNeutronium", "ingotCosmicNeutronium").setCreativeTab(Main.ingotTab));
		ingotCrystalMatrix = register(new ItemOre("ingotCrystalMatrix", "ingotCrystalMatrix").setCreativeTab(Main.ingotTab));
		ingotMixed = register(new ItemOre("ingotMixed", "ingotMixed").setCreativeTab(Main.ingotTab));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}

		return item;
	}
}
