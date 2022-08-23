package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.item.dimatis_use.AscunauticDimatis;
import net.minecraft.item.Item;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.Structure;

public class AscunauticItem extends Item implements AscunauticDimatis {
    ServerWorld serverWorld;
    public Registry<Structure> getStructureKey = serverWorld.getStructureAccessor().getRegistryManager().get(Registry.STRUCTURE_KEY);
    public AscunauticItem(Settings settings) {
        super(settings);
    }
}
