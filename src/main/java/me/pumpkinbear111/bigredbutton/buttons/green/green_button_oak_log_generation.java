package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_oak_log_generation {

    public static void generate(World world, int x, int y, int z) {

        BlockPos blockPos = new BlockPos(x, y, z);

        // Log

        world.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y + 1, z);
        world.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y + 2, z);
        world.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y + 3, z);
        world.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 1);

        blockPos = new BlockPos(x, y + 4, z);
        world.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 1);

    }



}
