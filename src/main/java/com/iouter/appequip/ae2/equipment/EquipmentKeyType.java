package com.iouter.appequip.ae2.equipment;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import com.iouter.appequip.AppliedEquipment;
import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.Nullable;

public class EquipmentKeyType extends AEKeyType {
    public static final AEKeyType INSTANCE = new EquipmentKeyType();
    public static final MutableComponent COMPONENT = AppliedEquipment.component(EquipmentKey.SHORT_ID);
    private static final MapCodec<? extends AEKey> CODEC = MapCodec.unit(EquipmentKey.INSTANCE);

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
