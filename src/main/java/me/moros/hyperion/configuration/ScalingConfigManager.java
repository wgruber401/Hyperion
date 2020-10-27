package me.moros.hyperion.configuration;

import me.moros.hyperion.Hyperion;
import org.bukkit.configuration.file.FileConfiguration;

public class ScalingConfigManager {
	ScalingConfigManager() {
		Hyperion.getLog().info("Loading scaling config.");
	}

	public void setupScalingConfig(Config scalingConfig) {
		FileConfiguration config = scalingConfig.getConfig();

		config.addDefault("Abilities.Air.Evade.Cooldown.MinLevel", 5000);
		config.addDefault("Abilities.Air.Evade.Cooldown.MaxLevel", 1500);

		config.addDefault("Abilities.Air.AirCombo.AirWheel.Damage.MinLevel", 0);
		config.addDefault("Abilities.Air.AirCombo.AirWheel.Damage.MaxLevel", 1.0);
		config.addDefault("Abilities.Air.AirCombo.AirWheel.Knockback.MinLevel", 0.5);
		config.addDefault("Abilities.Air.AirCombo.AirWheel.Knockback.MaxLevel", 1.5);
		config.addDefault("Abilities.Air.AirCombo.AirWheel.Cooldown.MinLevel", 20000);
		config.addDefault("Abilities.Air.AirCombo.AirWheel.Cooldown.MaxLevel", 12500);

		config.addDefault("Abilities.Earth.EarthLine.Damage.MinLevel", 1.0);
		config.addDefault("Abilities.Earth.EarthLine.Damage.MaxLevel", 5.0);
		config.addDefault("Abilities.Earth.EarthLine.Cooldown.MinLevel", 5000);
		config.addDefault("Abilities.Earth.EarthLine.Cooldown.MaxLevel", 2000);
		config.addDefault("Abilities.Earth.EarthLine.Range.MinLevel", 14);
		config.addDefault("Abilities.Earth.EarthLine.Range.MaxLevel", 26);
		config.addDefault("Abilities.Earth.EarthLine.SelectRange.MinLevel", 4);
		config.addDefault("Abilities.Earth.EarthLine.SelectRange.MaxLevel", 8);
		config.addDefault("Abilities.Earth.EarthLine.Magma.RegenDelay.MinLevel", 20000);
		config.addDefault("Abilities.Earth.EarthLine.Magma.RegenDelay.MaxLevel", 20000);
		config.addDefault("Abilities.Earth.EarthLine.PrisonCooldown.MinLevel", 20000);
		config.addDefault("Abilities.Earth.EarthLine.PrisonCooldown.MaxLevel", 12500);
		config.addDefault("Abilities.Earth.EarthLine.PrisonDuration.MinLevel", 1000);
		config.addDefault("Abilities.Earth.EarthLine.PrisonDuration.MaxLevel", 3000);

		config.addDefault("Abilities.Earth.EarthShot.Damage.MinLevel", 2.0);
		config.addDefault("Abilities.Earth.EarthShot.Damage.MaxLevel", 5.0);
		config.addDefault("Abilities.Earth.EarthShot.Cooldown.MinLevel", 2500);
		config.addDefault("Abilities.Earth.EarthShot.Cooldown.MaxLevel", 1500);
		config.addDefault("Abilities.Earth.EarthShot.Range.MinLevel", 30);
		config.addDefault("Abilities.Earth.EarthShot.Range.MaxLevel", 60);
		config.addDefault("Abilities.Earth.EarthShot.SelectRange.MinLevel", 5);
		config.addDefault("Abilities.Earth.EarthShot.SelectRange.MaxLevel", 8);
		config.addDefault("Abilities.Earth.EarthShot.MagmaShot.ChargeTime.MinLevel", 2500);
		config.addDefault("Abilities.Earth.EarthShot.MagmaShot.ChargeTime.MaxLevel", 1500);

		config.addDefault("Abilities.Earth.EarthGlove.Damage.MinLevel", 1.0);
		config.addDefault("Abilities.Earth.EarthGlove.Damage.MaxLevel", 3.0);
		config.addDefault("Abilities.Earth.EarthGlove.Cooldown.MinLevel", 10000);
		config.addDefault("Abilities.Earth.EarthGlove.Cooldown.MaxLevel", 5000);
		config.addDefault("Abilities.Earth.EarthGlove.Range.MinLevel", 8);
		config.addDefault("Abilities.Earth.EarthGlove.Range.MaxLevel", 24);

		config.addDefault("Abilities.Earth.EarthGuard.Cooldown.MinLevel", 20000);
		config.addDefault("Abilities.Earth.EarthGuard.Cooldown.MaxLevel", 20000);
		config.addDefault("Abilities.Earth.EarthGuard.Duration.MinLevel", 7500);
		config.addDefault("Abilities.Earth.EarthGuard.Duration.MaxLevel", 15000);
		config.addDefault("Abilities.Earth.EarthGuard.SelectRange.MinLevel", 6);
		config.addDefault("Abilities.Earth.EarthGuard.SelectRange.MaxLevel", 6);
		config.addDefault("Abilities.Earth.EarthGuard.WallDuration.MinLevel", 1500);
		config.addDefault("Abilities.Earth.EarthGuard.WallDuration.MaxLevel", 3000);
		config.addDefault("Abilities.Earth.EarthGuard.WallCooldown.MinLevel", 5000);
		config.addDefault("Abilities.Earth.EarthGuard.WallCooldown.MaxLevel", 1500);

		config.addDefault("Abilities.Earth.LavaDisk.MaxDamage.MinLevel", 1.0);
		config.addDefault("Abilities.Earth.LavaDisk.MaxDamage.MaxLevel", 4.0);
		config.addDefault("Abilities.Earth.LavaDisk.MinDamage.MinLevel", 0.5);
		config.addDefault("Abilities.Earth.LavaDisk.MinDamage.MaxLevel", 1.0);
		config.addDefault("Abilities.Earth.LavaDisk.Cooldown.MinLevel", 7000);
		config.addDefault("Abilities.Earth.LavaDisk.Cooldown.MaxLevel", 7000);
		config.addDefault("Abilities.Earth.LavaDisk.Range.MinLevel", 10);
		config.addDefault("Abilities.Earth.LavaDisk.Range.MaxLevel", 24);
		config.addDefault("Abilities.Earth.LavaDisk.RegenDelay.MinLevel", 10000);
		config.addDefault("Abilities.Earth.LavaDisk.RegenDelay.MaxLevel", 10000);

		config.addDefault("Abilities.Earth.MetalCable.Damage.MinLevel", 2.0);
		config.addDefault("Abilities.Earth.MetalCable.Damage.MaxLevel", 6.0);
		config.addDefault("Abilities.Earth.MetalCable.BlockSpeed.MinLevel", 0.9);
		config.addDefault("Abilities.Earth.MetalCable.BlockSpeed.MaxLevel", 1.6);
		config.addDefault("Abilities.Earth.MetalCable.Cooldown.MinLevel", 5000);
		config.addDefault("Abilities.Earth.MetalCable.Cooldown.MaxLevel", 5000);
		config.addDefault("Abilities.Earth.MetalCable.Range.MinLevel", 20);
		config.addDefault("Abilities.Earth.MetalCable.Range.MaxLevel", 30);
		config.addDefault("Abilities.Earth.MetalCable.RegenDelay.MinLevel", 10000);
		config.addDefault("Abilities.Earth.MetalCable.RegenDelay.MaxLevel", 10000);

		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.Damage.MinLevel", 0.5);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.Damage.MaxLevel", 1.0);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.Cooldown.MinLevel", 20000);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.Cooldown.MaxLevel", 12500);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.ShotCooldown.MinLevel", 250);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.ShotCooldown.MaxLevel", 100);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.Range.MinLevel", 14);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.Range.MaxLevel", 20);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.AccuracyDrop.MinLevel", 0.3);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.AccuracyDrop.MaxLevel", 0.1);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.MaxShards.MinLevel", 6);
		config.addDefault("Abilities.Earth.EarthCombo.EarthShards.MaxShards.MaxLevel", 10);

		config.addDefault("Abilities.Fire.Bolt.Damage.MinLevel", 3.0);
		config.addDefault("Abilities.Fire.Bolt.Damage.MaxLevel", 6.0);
		config.addDefault("Abilities.Fire.Bolt.Cooldown.MinLevel", 5000);
		config.addDefault("Abilities.Fire.Bolt.Cooldown.MaxLevel", 3000);
		config.addDefault("Abilities.Fire.Bolt.Range.MinLevel", 24);
		config.addDefault("Abilities.Fire.Bolt.Range.MaxLevel", 36);
		config.addDefault("Abilities.Fire.Bolt.ChargeTime.MinLevel", 2500);
		config.addDefault("Abilities.Fire.Bolt.ChargeTime.MaxLevel", 1500);

		config.addDefault("Abilities.Fire.Combustion.Damage.MinLevel", 4.0);
		config.addDefault("Abilities.Fire.Combustion.Damage.MaxLevel", 6.0);
		config.addDefault("Abilities.Fire.Combustion.Cooldown.MinLevel", 12500);
		config.addDefault("Abilities.Fire.Combustion.Cooldown.MaxLevel", 10000);
		config.addDefault("Abilities.Fire.Combustion.Range.MinLevel", 50);
		config.addDefault("Abilities.Fire.Combustion.Range.MaxLevel", 80);
		config.addDefault("Abilities.Fire.Combustion.ChargeTime.MinLevel", 1500);
		config.addDefault("Abilities.Fire.Combustion.ChargeTime.MaxLevel", 0);
		config.addDefault("Abilities.Fire.Combustion.Power.MinLevel", 2);
		config.addDefault("Abilities.Fire.Combustion.Power.MaxLevel", 3);
		config.addDefault("Abilities.Fire.Combustion.MisfireModifier.MinLevel", -1);
		config.addDefault("Abilities.Fire.Combustion.MisfireModifier.MaxLevel", -1);
		config.addDefault("Abilities.Fire.Combustion.RegenDelay.MinLevel", 15000);
		config.addDefault("Abilities.Fire.Combustion.RegenDelay.MaxLevel", 15000);

		config.addDefault("Abilities.Fire.FireCombo.FireWave.Damage.MinLevel", 2.0);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Damage.MaxLevel", 4.0);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Cooldown.MinLevel", 20000);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Cooldown.MaxLevel", 16000);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Range.MinLevel", 8);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Range.MaxLevel", 16);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Duration.MinLevel", 5000);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Duration.MaxLevel", 10000);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.MaxHeight.MinLevel", 4);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.MaxHeight.MaxLevel", 8);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Width.MinLevel", 2);
		config.addDefault("Abilities.Fire.FireCombo.FireWave.Width.MaxLevel", 3);

		config.addDefault("Abilities.Water.IceBreath.Damage.MinLevel", 4.0);
		config.addDefault("Abilities.Water.IceBreath.Damage.MaxLevel", 6.0);
		config.addDefault("Abilities.Water.IceBreath.Range.MinLevel", 4);
		config.addDefault("Abilities.Water.IceBreath.Range.MaxLevel", 6);
		config.addDefault("Abilities.Water.IceBreath.Cooldown.MinLevel", 10000);
		config.addDefault("Abilities.Water.IceBreath.Cooldown.MaxLevel", 10000);
		config.addDefault("Abilities.Water.IceBreath.ChargeTime.MinLevel", 2000);
		config.addDefault("Abilities.Water.IceBreath.ChargeTime.MaxLevel", 1000);
		config.addDefault("Abilities.Water.IceBreath.FrostDuration.MinLevel", 3000);
		config.addDefault("Abilities.Water.IceBreath.FrostDuration.MaxLevel", 6000);

		config.addDefault("Abilities.Water.IceCrawl.Damage.MinLevel", 2.0);
		config.addDefault("Abilities.Water.IceCrawl.Damage.MaxLevel", 5.0);
		config.addDefault("Abilities.Water.IceCrawl.Cooldown.MinLevel", 6000);
		config.addDefault("Abilities.Water.IceCrawl.Cooldown.MaxLevel", 4000);
		config.addDefault("Abilities.Water.IceCrawl.Range.MinLevel", 16);
		config.addDefault("Abilities.Water.IceCrawl.Range.MaxLevel", 26);
		config.addDefault("Abilities.Water.IceCrawl.SelectRange.MinLevel", 6);
		config.addDefault("Abilities.Water.IceCrawl.SelectRange.MaxLevel", 8);
		config.addDefault("Abilities.Water.IceCrawl.FreezeDuration.MinLevel", 1000);
		config.addDefault("Abilities.Water.IceCrawl.FreezeDuration.MaxLevel", 2500);
		config.addDefault("Abilities.Water.IceCrawl.IceDuration.MinLevel", 5000);
		config.addDefault("Abilities.Water.IceCrawl.IceDuration.MaxLevel", 8000);

		config.addDefault("Abilities.Water.WaterCombo.IceDrill.Cooldown.MinLevel", 15000);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.Cooldown.MaxLevel", 15000);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.SelectRange.MinLevel", 8);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.SelectRange.MaxLevel", 16);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.MaxLength.MinLevel", 10);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.MaxLength.MaxLevel", 16);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.Duration.MinLevel", 10000);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.Duration.MaxLevel", 15000);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.RegenDelay.MinLevel", 10000);
		config.addDefault("Abilities.Water.WaterCombo.IceDrill.RegenDelay.MaxLevel", 30000);

		config.options().copyDefaults(true);
		scalingConfig.saveConfig();
	}
}
