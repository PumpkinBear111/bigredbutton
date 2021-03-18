package me.pumpkinbear111.bigredbutton.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class yellow_button extends Block {

    public static final DirectionProperty FACING = DirectionProperty.create(Direction.NORTH.getName());

    public yellow_button() {
        super(Properties.of(Material.STONE)
                .strength(5, 0)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .noOcclusion());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_N;
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(1, 0, 1, 15, 4, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.join(v1, v2, IBooleanFunction.OR);}).get();

}
