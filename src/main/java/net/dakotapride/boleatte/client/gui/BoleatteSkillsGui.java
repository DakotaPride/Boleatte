package net.dakotapride.boleatte.client.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BoleatteSkillsGui extends LightweightGuiDescription {
    public BoleatteSkillsGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);
        root.setInsets(Insets.ROOT_PANEL);
        WLabel skill = new WLabel(Text.translatable("text.boleatte.is_skill.skill"), 0x000000);
        WLabel skill1 = new WLabel(Text.translatable("text.boleatte.is_skill.skill"), 0x000000);
        WLabel skill2 = new WLabel(Text.translatable("text.boleatte.is_skill.skill"), 0x000000);
        WLabel skill3 = new WLabel(Text.translatable("text.boleatte.is_skill.skill"), 0x000000);
        WLabel skill4 = new WLabel(Text.translatable("text.boleatte.is_skill.skill"), 0x000000);
        WLabel skill5 = new WLabel(Text.translatable("text.boleatte.is_skill.skill"), 0x000000);

        WSprite veretFavour = new WSprite(new Identifier("boleatte:textures/mob_effect/veret_favour.png"));
        root.add(veretFavour, 0, 2, 1, 1);
        root.add(skill, 1, (int) 2.5, 2, 1);
        WLabel vertFavourLabel = new WLabel(Text.translatable("text.boleatte.is_skill.veret"), 0x000000);
        root.add(vertFavourLabel, 4, (int) 2.5, 2, 1);

        WSprite laideBlessing = new WSprite(new Identifier("boleatte:textures/mob_effect/laide_blessing.png"));
        root.add(laideBlessing, 0, 4, 1, 1);
        root.add(skill1, 1, (int) 4.5, 2, 1);
        WLabel laideBlessingLabel = new WLabel(Text.translatable("text.boleatte.is_skill.laide"), 0x000000);
        root.add(laideBlessingLabel, 4, (int) 4.5, 2, 1);

        WSprite sterresGift = new WSprite(new Identifier("boleatte:textures/mob_effect/sterres_gift.png"));
        root.add(sterresGift, 0, 6, 1, 1);
        root.add(skill2, 1, (int) 6.5, 2, 1);
        WLabel sterresGiftLabel = new WLabel(Text.translatable("text.boleatte.is_skill.sterres"), 0x000000);
        root.add(sterresGiftLabel, 4, (int) 6.5, 2, 1);

        WSprite oritemProfit = new WSprite(new Identifier("boleatte:textures/mob_effect/oritem_profit.png"));
        root.add(oritemProfit, 0, 8, 1, 1);
        root.add(skill3, 1, (int) 8.5, 2, 1);
        WLabel oritemProfitLabel = new WLabel(Text.translatable("text.boleatte.is_skill.oritem"), 0x000000);
        root.add(oritemProfitLabel, 4, (int) 8.5, 2, 1);

        WSprite gelaBenefit = new WSprite(new Identifier("boleatte:textures/mob_effect/gela_benefit.png"));
        root.add(gelaBenefit, 0, 10, 1, 1);
        root.add(skill4, 1, (int) 10.5, 2, 1);
        WLabel gelaBenefitLabel = new WLabel(Text.translatable("text.boleatte.is_skill.gela"), 0x000000);
        root.add(gelaBenefitLabel, 4, (int) 10.5, 2, 1);

        WSprite beusereVirtue = new WSprite(new Identifier("boleatte:textures/mob_effect/beusere_virtue.png"));
        root.add(beusereVirtue, 0, 12, 1, 1);
        root.add(skill5, 1, (int) 12.5, 2, 1);
        WLabel beusereVirtueLabel = new WLabel(Text.translatable("text.boleatte.is_skill.beusere"), 0x000000);
        root.add(beusereVirtueLabel, 4, (int) 12.5, 2, 1);

        root.validate(this);
    }
}
