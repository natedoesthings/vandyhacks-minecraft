package net.vandyhacks.demomodsolutions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;

import java.util.Arrays;
import java.util.List;

public class LuckyBlock extends Block {
    public LuckyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);

        if (!world.isClient()) {
            dropRandomItem((ServerWorld) world, pos);
        }

    }


    private void dropRandomItem(ServerWorld world, BlockPos pos) {
        List<ItemStack> items = Arrays.asList(
                new ItemStack(Items.DIAMOND, 3),
                new ItemStack(Items.GOLD_INGOT, 5),
                new ItemStack(Items.IRON_INGOT, 8),
                new ItemStack(Items.APPLE, 10),
                new ItemStack(Items.BREAD, 5),
                new ItemStack(Items.COOKED_BEEF, 4)
        );

        ItemStack itemToDrop = items.get(Random.create().nextInt(items.size()));
        Block.dropStack(world, pos, itemToDrop);
    }

}
