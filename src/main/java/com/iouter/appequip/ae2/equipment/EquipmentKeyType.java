package com.iouter.appequip.ae2.equipment;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import com.iouter.appequip.AppliedEquipment;
import com.iouter.appequip.ae2.enchantment.EnchantmentKey;
import com.iouter.appequip.ae2.enchantment.EnchantmentKeyType;
import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.Nullable;

public class EquipmentKeyType extends AEKeyType {
    public static final AEKeyType INSTANCE = new EquipmentKeyType();
    private static final MapCodec<? extends AEKey> CODEC = MapCodec.unit(EquipmentKey.INSTANCE);
    public static final MutableComponent COMPONENT = AppliedEquipment.component(EquipmentKey.SHORT_ID);

    private EquipmentKeyType() {
        super(EquipmentKey.ID, EquipmentKey.class, COMPONENT);
    }

    @Override
    public MapCodec<? extends AEKey> codec() {
        return CODEC;
    }

    @Override
    public @Nullable AEKey readFromPacket(RegistryFriendlyByteBuf input) {
        return EquipmentKey.INSTANCE;
    }
}
