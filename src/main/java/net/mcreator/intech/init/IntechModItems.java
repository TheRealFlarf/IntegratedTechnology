
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.intech.IntechMod;

public class IntechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IntechMod.MODID);
	public static final RegistryObject<Item> POLISHED_BAUXITE = block(IntechModBlocks.POLISHED_BAUXITE);
	public static final RegistryObject<Item> BAUXITE = block(IntechModBlocks.BAUXITE);
	public static final RegistryObject<Item> BAUXITE_BRICKS = block(IntechModBlocks.BAUXITE_BRICKS);
	public static final RegistryObject<Item> CHISELED_BAUXITE = block(IntechModBlocks.CHISELED_BAUXITE);
	public static final RegistryObject<Item> BAUXITE_STAIRS = block(IntechModBlocks.BAUXITE_STAIRS);
	public static final RegistryObject<Item> BAUXITE_SLAB = block(IntechModBlocks.BAUXITE_SLAB);
	public static final RegistryObject<Item> BAUXITE_WALL = block(IntechModBlocks.BAUXITE_WALL);
	public static final RegistryObject<Item> BAUXITE_BRICK_STAIRS = block(IntechModBlocks.BAUXITE_BRICK_STAIRS);
	public static final RegistryObject<Item> BAUXITE_BRICK_SLAB = block(IntechModBlocks.BAUXITE_BRICK_SLAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
