package me.pumpkinbear111.bigredbutton.buttons.blue;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class blue_button_generation {

    public static void create(World world, int x, int y, int z) {

        generateSandLayer(world, x, y, z);
        generateWaterLayer(world, x, y + 1, z);
        generateWaterLayer(world, x, y + 2, z);
        generateWaterLayer(world, x, y + 3, z);
        generateWaterLayer(world, x, y + 4, z);

        generatePlantLayer(world, x, y + 1, z);

        spawnAnimals(world, x, y + 2, z);

    }

    public static void generateSandLayer(World world, int x, int y, int z) {

        BlockPos blockPos = new BlockPos(x, y, z);
        sandLine(world, x, y, z - 2);
        sandLine(world, x, y, z - 1);
        sandLine(world, x, y, z);
        sandLine(world, x, y, z + 1);
        sandLine(world, x, y, z + 2);

    }

    public static void sandLine(World world, int x, int y, int z) {

        int i = 0;

        while(i < 5) {
            BlockPos blockPos = new BlockPos(x, y, z);
            world.setBlock(blockPos, Blocks.SAND.defaultBlockState(), 1);

            x++;
            i++;
        }

    }

    public static void generateWaterLayer(World world, int x, int y, int z) {

        BlockPos blockPos = new BlockPos(x, y, z);
        waterLine(world, x, y, z - 2);
        waterLine(world, x, y, z - 1);
        waterLine(world, x, y, z);
        waterLine(world, x, y, z + 1);
        waterLine(world, x, y, z + 2);

    }

    public static void waterLine(World world, int x, int y, int z) {

        int i = 0;

        while(i < 5) {
            BlockPos blockPos = new BlockPos(x, y, z);
            world.setBlock(blockPos, Blocks.WATER.defaultBlockState(), 1);

            x++;
            i++;
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

        BlockPos blockPos = new BlockPos(x, y, z);
        plantLine(world, x, y, z - 2);
        plantLine(world, x, y, z - 1);
        plantLine(world, x, y, z);
        plantLine(world, x, y, z + 1);
        plantLine(world, x, y, z + 2);

    }

    public static void plantLine(World world, int x, int y, int z) {

        int i = 0;

        while(i < 5) {
            BlockPos blockPos = new BlockPos(x, y, z);

            if(Math.random() < .5) {
                world.setBlock(blockPos, Blocks.SEAGRASS.defaultBlockState(), 1);
            }

            x++;
            i++;
        }

    }

}
