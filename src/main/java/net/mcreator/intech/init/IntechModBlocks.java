
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.intech.block.PolishedBauxiteBlock;
import net.mcreator.intech.block.ChiseledBauxiteBlock;
import net.mcreator.intech.block.BauxiteWallBlock;
import net.mcreator.intech.block.BauxiteStairsBlock;
import net.mcreator.intech.block.BauxiteSlabBlock;
import net.mcreator.intech.block.BauxiteBricksBlock;
import net.mcreator.intech.block.BauxiteBrickStairsBlock;
import net.mcreator.intech.block.BauxiteBrickSlabBlock;
import net.mcreator.intech.block.BauxiteBlock;
import net.mcreator.intech.IntechMod;

public class IntechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IntechMod.MODID);
	public static final RegistryObject<Block> POLISHED_BAUXITE = REGISTRY.register("polished_bauxite", () -> new PolishedBauxiteBlock());
	public static final RegistryObject<Block> BAUXITE = REGISTRY.register("bauxite", () -> new BauxiteBlock());
	public static final RegistryObject<Block> BAUXITE_BRICKS = REGISTRY.register("bauxite_bricks", () -> new BauxiteBricksBlock());
	public static final RegistryObject<Block> CHISELED_BAUXITE = REGISTRY.register("chiseled_bauxite", () -> new ChiseledBauxiteBlock());
	public static final RegistryObject<Block> BAUXITE_STAIRS = REGISTRY.register("bauxite_stairs", () -> new BauxiteStairsBlock());
	public static final RegistryObject<Block> BAUXITE_SLAB = REGISTRY.register("bauxite_slab", () -> new BauxiteSlabBlock());
	public static final RegistryObject<Block> BAUXITE_WALL = REGISTRY.register("bauxite_wall", () -> new BauxiteWallBlock());
	public static final RegistryObject<Block> BAUXITE_BRICK_STAIRS = REGISTRY.register("bauxite_brick_stairs", () -> new BauxiteBrickStairsBlock());
	public static final RegistryObject<Block> BAUXITE_BRICK_SLAB = REGISTRY.register("bauxite_brick_slab", () -> new BauxiteBrickSlabBlock());
}
