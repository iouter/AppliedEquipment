package com.iouter.appequip.ae2.enchantment;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import com.iouter.appequip.AppliedEquipment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class EnchantmentKey extends AEKey {
    public static AEKey INSTANCE = new EnchantmentKey();
    protected static String SHORT_ID = "enchantment";
    protected static final ResourceLocation ID = AppliedEquipment.id(SHORT_ID);

    private EnchantmentKey() {}

    @Override
    public AEKeyType getType() {
        return EnchantmentKeyType.INSTANCE;
    }

    @Override
    public AEKey dropSecondary() {
        return this;
    }

    @Override
    public CompoundTag toTag(HolderLookup.Provider registries) {
        return new CompoundTag();
    }

    @Override
    public Object getPrimaryKey() {
        return this;
    }

    @Override
    public ResourceLocation getId() {
        return ID;
    }

    @Override
    public void writeToPacket(RegistryFriendlyByteBuf data) {

    }

    @Override
    protected Component computeDisplayName() {
        return EnchantmentKeyType.COMPONENT;
    }

    @Override
    public void addDrops(long amount, List<ItemStack> drops, Level level, BlockPos pos) {

    }

    @Override
    public boolean hasComponents() {
        return false;
    }
}
