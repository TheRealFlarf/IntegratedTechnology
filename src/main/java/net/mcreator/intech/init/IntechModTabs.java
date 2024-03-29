
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.intech.IntechMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntechModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IntechMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(IntechModBlocks.POLISHED_BAUXITE.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_BRICKS.get().asItem());
			tabData.accept(IntechModBlocks.CHISELED_BAUXITE.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_SLAB.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_WALL.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_BRICK_STAIRS.get().asItem());
			tabData.accept(IntechModBlocks.BAUXITE_BRICK_SLAB.get().asItem());
		}
	}
}
