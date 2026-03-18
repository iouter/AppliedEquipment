package com.iouter.appequip.ae2.xp;

import appeng.api.stacks.AEKey;
import appeng.api.stacks.AEKeyType;
import com.iouter.appequip.AppliedEquipment;
import com.iouter.appequip.ae2.equipment.EquipmentKey;
import com.iouter.appequip.ae2.equipment.EquipmentKeyType;
import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.Nullable;

public class XpKeyType extends AEKeyType {
    public static final AEKeyType INSTANCE = new XpKeyType();
    private static final MapCodec<? extends AEKey> CODEC = MapCodec.unit(XpKey.INSTANCE);
    public static final MutableComponent COMPONENT = AppliedEquipment.component(XpKey.SHORT_ID);

    private XpKeyType() {
        super(XpKey.ID, XpKey.class, COMPONENT);
    }

    @Override
    public MapCodec<? extends AEKey> codec() {
        return CODEC;
    }

    @Override
    public @Nullable AEKey readFromPacket(RegistryFriendlyByteBuf input) {
        return XpKey.INSTANCE;
    }
}
