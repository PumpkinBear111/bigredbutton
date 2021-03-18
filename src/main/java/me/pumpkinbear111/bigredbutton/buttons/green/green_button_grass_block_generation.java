package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_grass_block_generation {

    public static void placeTheBlocks(World world, int x, int y, int z) {

        BlockPos blockPos = new BlockPos(x, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 2, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 1, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y, z + 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y, z - 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x -1, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x -1, y, z - 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z - 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z + 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 2, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 2, y, z + 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 1, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 1, y, z + 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z + 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z - 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 2, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 2, y, z - 2);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 3, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 3, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 3, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 3, y, z);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 3, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 3, y, z - 1);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y, z + 3);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z + 3);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 1, y, z + 3);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y, z - 3);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 1, y, z - 3);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z - 3);
        world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);



    }

}
