/*
 *   Copyright 2016, 2017, 2020 Moros <https://github.com/PrimordialMoros>
 *
 * 	  This file is part of Hyperion.
 *
 *    Hyperion is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    Hyperion is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with Hyperion.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.moros.hyperion.methods;

import me.moros.hyperion.Hyperion;
import me.moros.hyperion.configuration.ConfigManager;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.util.NumberConversions;

public class ScaleMethods {
	private static final double MAX_LEVEL_DIFF = 9; // Usual max level = 10, starting level = 1, diff 10-1 = 9

	public static int getInt(String configKey, long level) {
		ConfigurationSection section = ConfigManager.scalingConfig.getConfig().getConfigurationSection(configKey);
		int def = Hyperion.getPlugin().getConfig().getInt(configKey);
		if (section == null) return def;

		if (section.contains("Level"+level)) return section.getInt("Level"+level);

		int min = section.getInt("MinLevel", def);
		int max = section.getInt("MaxLevel", def);

		if (min == max) return min;

		double factor = (level - 1) / MAX_LEVEL_DIFF;
		return min + NumberConversions.ceil((max - min) * factor);
	}

	public static long getLong(String configKey, long level) {
		ConfigurationSection section = ConfigManager.scalingConfig.getConfig().getConfigurationSection(configKey);
		long def = Hyperion.getPlugin().getConfig().getLong(configKey);
		if (section == null) return def;

		if (section.contains("Level"+level)) return section.getLong("Level"+level);

		long min = section.getLong("MinLevel", def);
		long max = section.getLong("MaxLevel", def);

		if (min == max) return min;

		double factor = (level - 1) / MAX_LEVEL_DIFF;
		return min + (long) ((max - min) * factor);
	}

	public static double getDouble(String configKey, long level) {
		ConfigurationSection section = ConfigManager.scalingConfig.getConfig().getConfigurationSection(configKey);
		double def = Hyperion.getPlugin().getConfig().getDouble(configKey);
		if (section == null) return def;

		if (section.contains("Level"+level)) return section.getDouble("Level"+level);

		double min = section.getDouble("MinLevel", def);
		double max = section.getDouble("MaxLevel", def);

		if (min == max) return min;

		double factor = (level - 1) / MAX_LEVEL_DIFF;
		return min + (max - min) * factor;
	}
}
