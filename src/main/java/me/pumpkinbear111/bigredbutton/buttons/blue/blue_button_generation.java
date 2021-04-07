package me.pumpkinbear111.bigredbutton.buttons.blue;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class blue_button_generation {

    public static void create(World world, int x, int y, int z) {

        generateLayer(world, x, y, z, Blocks.SAND.defaultBlockState());

        for( int yinc = 0; yinc < 5; yinc++ ) {

            generateLayer(world, x, y + yinc, z, Blocks.WATER.defaultBlockState());

        }

        generatePlantLayer(world, x, y + 1, z);

        spawnAnimals(world, x, y + 2, z);

    }

    public static void generateLayer(World world, int x, int y, int z, BlockState blockType) {

        BlockPos blockPos = new BlockPos(x, y, z);

        for( int newZ = z - 2; newZ <= z + 2; newZ++ ) {
            for( int i = 0; i < 5; i++ ) {
                world.setBlock(new BlockPos(x + i, y, newZ), blockType, 1);
            }
        }

    }

    public static void spawnAnimals(World world, int x, int y, int z) {

        BlockPos blockPos = new BlockPos(x, y, z);
        Entity entity1 = EntityType.TROPICAL_FISH.create(world);
        entity1.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(entity1);

        blockPos = new BlockPos(x + 3, y - 1, z - 2);
        Entity entity2 = EntityType.TROPICAL_FISH.create(world);
        entity2.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(entity2);

        blockPos = new BlockPos(x - 3, y + 1, z + 2);
        Entity entity3 = EntityType.TROPICAL_FISH.create(world);
        entity3.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(entity3);

    }

    public static void generatePlantLayer(World world, int x, int y, int z) {

        z -= 2;

        BlockPos blockPos;

        for(int i = 0; i < 25; i++) {

            if(Math.random() < .5) {

                blockPos = new BlockPos(x + i%5, y, z + i/5);
                world.setBlock(blockPos, Blocks.SEAGRASS.defaultBlockState(), 1);

            }

        }

    }

}
