package com.iouter.appequip.ae2.enchantment;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import com.iouter.appequip.AppliedEquipment;
import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.Nullable;

public class EnchantmentKeyType extends AEKeyType {

    public static final AEKeyType INSTANCE = new EnchantmentKeyType();
    private static final MapCodec<? extends AEKey> CODEC = MapCodec.unit(EnchantmentKey.INSTANCE);
    public static final MutableComponent COMPONENT = AppliedEquipment.component(EnchantmentKey.SHORT_ID);

    private EnchantmentKeyType() {
        super(EnchantmentKey.ID, EnchantmentKey.class, COMPONENT);
    }

    @Override
    public MapCodec<? extends AEKey> codec() {
        return CODEC;
    }

    @Override
    public @Nullable AEKey readFromPacket(RegistryFriendlyByteBuf input) {
        return EnchantmentKey.INSTANCE;
    }
}
