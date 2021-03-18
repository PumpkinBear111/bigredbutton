package me.pumpkinbear111.bigredbutton.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class Lightning {

    public static void summon(int xpositon, int yposition, int zposition, World world) {

        BlockPos blockPos = new BlockPos(xpositon, yposition, zposition);

        LightningBoltEntity lightningboltentity = EntityType.LIGHTNING_BOLT.create(world);
        lightningboltentity.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(lightningboltentity);

    }

}
