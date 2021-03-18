package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_plant_generation {

    public static void placeTheBlocks(World world, int x, int y, int z) {

        // Grass

        BlockPos blockPos = new BlockPos(x, y, z);
        world.setBlock(blockPos, Blocks.GRASS.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z + 2);
        world.setBlock(blockPos, Blocks.GRASS.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 3, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS.defaultBlockState(), 1);

        blockPos = new BlockPos(x + 1, y, z + 1);
        world.setBlock(blockPos, Blocks.GRASS.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z + -2);
        world.setBlock(blockPos, Blocks.GRASS.defaultBlockState(), 1);

        // Poppy

        blockPos = new BlockPos(x + 1, y, z - 3);
        world.setBlock(blockPos, Blocks.POPPY.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 1, y, z + 3);
        world.setBlock(blockPos, Blocks.POPPY.defaultBlockState(), 1);

        // Yellow flower

        blockPos = new BlockPos(x + 2, y, z + -1);
        world.setBlock(blockPos, Blocks.DANDELION.defaultBlockState(), 1);

        blockPos = new BlockPos(x - 2, y, z + 2);
        world.setBlock(blockPos, Blocks.DANDELION.defaultBlockState(), 1);



    }

}
