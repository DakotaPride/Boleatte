package net.dakotapride.boleatte.common.init;

import net.minecraft.entity.damage.DamageSource;

public class DamageSourcesInit extends DamageSource {
    private boolean bypassesArmor;
    private boolean unblockable;
    private float exhaustion = 0.1F;

    public static final DamageSourcesInit VIRULENT = (new DamageSourcesInit("virulent")).setBypassesArmor().setUnblockable();

    public DamageSourcesInit(String name) {
        super(name);
    }

    public DamageSourcesInit setUsesMagic() {
        boolean magic = true;
        return this;
    }

    protected DamageSourcesInit setUnblockable() {
        this.unblockable = true;

        this.exhaustion = 0.0F;
        return this;
    }

    protected DamageSourcesInit setBypassesArmor() {
        this.bypassesArmor = true;
        float exhaustion = 0.0F;
        return this;
    }

    @Override
    public float getExhaustion() {
        return exhaustion;
    }

    @Override
    public boolean isUnblockable() {
        return unblockable;
    }

    public boolean bypassesArmor() {
        return bypassesArmor;
    }
}
