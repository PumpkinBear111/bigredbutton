package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_plant_generation {

    public static void makePlants(World world, int x, int y, int z) {

        x -= 3;
        z -= 3;

        BlockPos blockPos;

        for(int i = 1; i < 48; i++) {
            if( i == 6 || i == 42 )
                continue;

            if(Math.random() < .5) {

                double random = Math.random();
                blockPos = new BlockPos(x + i % 7, y, z + i / 7);
                if(random < .5) {

                    world.setBlock(blockPos, Blocks.GRASS.defaultBlockState(), 1);

                } else if (random < .75) {

                    world.setBlock(blockPos, Blocks.POPPY.defaultBlockState(), 1);

                } else {

                    world.setBlock(blockPos, Blocks.DANDELION.defaultBlockState(), 1);

                }

            }

        }

        /* Grass

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

         */

    }

}
