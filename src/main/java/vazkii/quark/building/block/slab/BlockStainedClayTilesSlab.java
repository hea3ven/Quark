/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [20/03/2016, 18:31:18 (GMT)]
 */
package vazkii.quark.building.block.slab;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import vazkii.quark.base.block.BlockModSlab;
import vazkii.quark.building.block.BlockStainedClayTiles;
import vazkii.quark.building.block.BlockStainedClayTiles.Variants;

public class BlockStainedClayTilesSlab extends BlockModSlab {

	public BlockStainedClayTilesSlab(BlockStainedClayTiles.Variants variant, boolean doubleSlab) {
		super(variant.getName() + "_slab", Material.rock, doubleSlab);
		setHardness(1.25F);
		setResistance(7.0F);
		setStepSound(SoundType.STONE);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.adobeColor;
	}

}
