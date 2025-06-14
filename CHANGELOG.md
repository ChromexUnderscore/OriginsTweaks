# OriginsTweaks Changelogs

## [Minecraft 1.20](https://minecraft.fandom.com/wiki/Java_Edition_1.20)

### [Version 1.18 | Minecraft 1.20.1-1.20.4]

#### [Version 1.18.2 - Hotfix Enderian Dodge & Phantom Phasing](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.18.2)

**Fixes**

+ Enderian:
	+ ``Slender Body``:
		+ Fixed an Issue which caused players to teleport to the surface when dodging a projectile in Minecraft 1.20.1 (#60).
+ Phantom:
	+ ``Phasing``:
		+ Fixed an Issue with phasing not properly working in Minecraft 1.20.1 (Thanks ghosthenry and ryo404).
	+ ``Phantomize``:
		+ Fixed an Issue with phantomize not being able to be toggled via Primary Active (Thanks ghosthenry and ryo404).

**Technical Changes**

+ Removed duplicate ``Human`` entry in the Origins Layer (#58).
+ Bumped Version to 1.18.2.

**Dependencies**

+ Minecraft 1.20.1 - 1.20.4
+ Origins Mod [1.10.0](https://modrinth.com/mod/origins/version/1.10.0) - [1.13.0-alpha.4](https://modrinth.com/mod/origins/version/1.13.0-alpha.4+mc.1.20.4)
+ [Fabric API](https://modrinth.com/mod/fabric-api)
+ [Pehkui](https://modrinth.com/mod/pehkui)
+ [Origins: Dietary Delights](https://modrinth.com/datapack/origins-dietary-delights)

#### [Version 1.18.1 - Bugfix Natural Hunter](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.18.1)

**Gameplay Changes**

+ Feline:
	+ ``Natural Hunter``:
		+ Added stair and slab variants of smooth and polished stone blocks to the block tag.

**Fixes**

+ Feline:
	+ ``Natural Hunter``:
		+ Fixed a typo with the wood block condition for claw resharpening.
		+ Fixed inaccurate badge information for claw damage tiers.

**Technical Changes**

+ Updated ``README.md``.
+ Bumped Version to 1.18.1.

**Dependencies**

+ Minecraft 1.20.1 - 1.20.4
+ Origins Mod [1.10.0](https://modrinth.com/mod/origins/version/1.10.0) - [1.13.0-alpha.4](https://modrinth.com/mod/origins/version/1.13.0-alpha.4+mc.1.20.4)
+ [Fabric API](https://modrinth.com/mod/fabric-api)
+ [Pehkui](https://modrinth.com/mod/pehkui)
+ [Origins: Dietary Delights](https://modrinth.com/datapack/origins-dietary-delights)

#### [Version 1.18.0 - 1.20.1 Backport](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.18.0)

**Gameplay Changes**

+ Avian:
	+ Edible Glistering Melons now provide 0.8 saturation, matching similar food items.
        + *(1.20.1 Backport Note)*: The Hoe Harvest bonus and edible Glistering Melons features are not available in this version due to Origins limitations.
+ Enderian
	+	*(1.20.1 Backport Note)*: The Silk Touch ability is not available in this version due to Origins limitations.
        + Projectile dodge now uses the `item.chorus_fruit.teleport` sound event instead of `entity.enderman.teleport`.
+ Phantom
	+ ``Soulbound``:
		+ Boss Soul absorption now triggers when killing entities tagged `c:bosses`, instead of only entities with more than 100 health.

**Technical Changes**

+ Made various internal adjustments to abilities to ensure backwards compatibility with Origins 1.10.0.
+ Utilized Fabric API's Conventional Tags to extend existing tags.
+ Removed unused Mixin configurations.
+ Replaced `origins:type` damage conditions with `origins:name` for backwards compatibility.
+ Removed `name` and `description` keys from origin and power files for backwards compatibility.
+ Added Russian translations (contributed by [tiglakirill7](https://crowdin.com/profile/tiglakirill7)).
+ Supports Minecraft 1.20.1 and Origins Mod v1.10.0.
+ Updated ``fabric.mod.json`` with contributors, updated dependencies and a link to crowdin.
+ Updated ``README.md`` and ``wiki.md``.
+ Bumped Version to 1.18.0.

**Fixes**

+ Shulk
	+ ``Antigravity Pellet``
		+ Fixed identifier of the levitation effect using ``origins:levitation`` instead of ``minecraft:levitation``.

**Dependencies**

+ Minecraft 1.20.1 - 1.20.4
+ Origins Mod [1.10.0](https://modrinth.com/mod/origins/version/1.10.0) - [1.13.0-alpha.4](https://modrinth.com/mod/origins/version/1.13.0-alpha.4+mc.1.20.4)
+ [Fabric API](https://modrinth.com/mod/fabric-api)
+ [Pehkui](https://modrinth.com/mod/pehkui)
+ [Origins: Dietary Delights](https://modrinth.com/datapack/origins-dietary-delights)

### [Version 1.17 | Minecraft 1.20.4]

#### [Version 1.17.2 - Localization Keys & German Translations](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.17.2)

Gameplay Changes

+ Arachnid:
	+ ``Climbing`` and ``Venom``:
		+ Powers now switch using the Secondary Key instead of both being toggled together.
	+ ``Venom``:
		+ Effect Amplifier is now ``1``, increasing the speed of poison ticks.
		+ Poison Indicator now acts as a cooldown of 5 seconds.
+ Avian
	+ ``Green Thumb``:
		+ Glistering Melons now count as snack, meaning they can be consumed faster than normal food items.
+ Blazeborn:
	+ ``Burning Wrath``:
		+ Now also sets targets hit on fire for 8 seconds, while they are on fire themselves.
+ Feline:
	+ ``Natural Hunter``:
		+ Polished Granite, Andesite or Diorite can now be used to sharpen to Stone Tier.
+ Enderian:
	+ Refactored ``Ender Body`` to ``Slender Body`` in parity with the Original Origins Mod Power.
	+ ``Slender Body``:
		+  Projectile dodge now includes all Projectiles.
+ Phantom:
	+ Moved ``Phantomize Energy Drain`` to ``Phantomize`` Power.
	+ ``Phantomize``:
		+ Reduced Soul Energy Drain to 0.5/s.
	+ ``Spectral Wail``:
		+ Sneaking Players will no longer be Highlighted.
+ Shulk:
	+ Readded old Power under the name ``Antigravity Pellet``
		+ Can shoot a shulker bullet on a 40 seconds cooldown using [Secondary].
		+ Sneaking while using this ability inflicts levitation on the shulk instead.

Technical Changes

+ Changed OriginsTweaks Icons to match the base Origins' Icons.
+ Removed ``Dodge Projectile`` Entity Type Tag.
+ Added ``Sharpen Stone`` Block Tag.
+ Reordered some Powers for the in-game Origin Overview.
+ Added Translation Keys to Origins, Powers, Badges and Advancements. (Issue #54)
	+ Due to a limitation with the Origins Mod, some tooltips currently don't have Translation Keys.
+ Updated English (US) translations with proper grammar.
	+ Rewrote various Descriptions and Badges to be more clear and concise.
+ Added English (UK) translations.
	+ Identical to English (US) besides some grammar rules and select words.
+ Added German translations. (Issue #55)
+ Added joke language translations:
	+ Pirate Speak (The Seven Seas)
	+ Shakespearean English (Kingdom of England)
	+ LOLCAT (Kingdom of Cats)
+ Changed all Keybind type Badges to use the Tooltips.
+ Convert Indentation of all Files to use Tabs.
+ Rewrote ``README.md``. (Issue #52)
+ Bumped version to 1.17.2.

#### [Version 1.17.1 - Origin Advancements](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.17.1)

Gameplay Changes

+ Added Advancements for all Origins.
	+ Added 4 Advancements for each [OT] Origin.
	+ Added an Advancement Tab for each [OT] Origin.
+ Avian:
	+ ``Animal Friendship``:
		+ Fixed a bug which caused all animals to spawn particles and trigger the ability cooldown regardless of being untameable.
	+ ``Green Thumb``:
		+ Fixed an Issue with Glistering Melons granting far more saturation than intended.
+ Arachnid:
	+ ``Venom``:
		+ Sneaking no longer restricts inflicting poison.
		+ Changed Chance to inflict poison from 10% to 25%.
+ Elytrian:
	+ ``Aerial Combatant``:
		+	Projectile damage bonus has beed reduced from +100% to +50%.
	+ Readded ``No Wing Render`` Wing option.
+ Feline:
	+ ``Dexterity``:
		+ Merged ``origins:fall_immunity``.
		+ Readded Sprint Jump.
		+ Felines can no longer control the angle of the jump with the camera, and can't cling onto blocks.
		+ A charged jump now executes a high jump, similar to how the sprint jump works.
		+ The strength of the jump can now be controlled with the charge bar, instead of requiring the bar to be full.
	+ ``Natural Hunter``:
		+ Fixed claw damage values to properly pair with swords of the same tier.
+ Blazeborn:
	+ ``Fire Immunity``:
		+ Blazeborn now move faster through lava, and can also swim when submerged.
		+ Lava visibility has been slightly improved in parity of fire resistance potions.
+ Merling:
	+ ``Body Moisture``:
		+ Fixed a bug with any potion restoring moisture.
		+ Water Bottles now have a tooltip informing about the moisture gain when consumed.
		+ Activated Conduits now grant 5 minutes of Conduit Power.
		+ Conduit Power also stops moisture from being lost while active.
+ Phantom:
	+ ``Soulbound``:
		+ Soul Energy gain and particle effect now depends on max health of the mob:
			+ 0.5 - 5 Hearts: 5 Soul Energy.
			+ 5.5 - 10 Hearts: 25 Soul Energy.
			+ 10.5 - 50 Hearts: 50 Soul Energy.
			+ \> 100 Hearts (Boss Mob): Full Soul Energy.
	+ ``Spectral Wail``:
		+ Fixed an Issue with non-living entities being highlighted by the Wail.

Technical Changes

+ Advancement criteria are resolved through sub-powers in ``originstweaks:*_advancements.json`` power files, with exceptions that fit directly into existing powers.
+ Added new entity type tag ``Illager and Allies``.
+ Added Predicates ``In Village``, ``In Monument`` and ``In Yungs Monument`` for use with advancements. 
+ Updated ``README.md``.
+ Bumped version to 1.17.1.

#### [Version 1.17.0 - 1.20.4 Port & New Abilities](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.17.0)

Gameplay Changes

+ Phantom:
	+ Reworked ``Phantom Form``, ``Phasing``, ``Soulbound`` and related abilities:
		+ Phantom Form and Phasing now use a Soul Energy bar instead of draining hunger; which regenerates in human form, by defeating mobs or by absorbing energy from soul fire.
		+ Soul fire and related blocks no longer grant stacking buffs.
		+ Full phasing now prevents sprinting, block selection, item usage, combat, elytra flight and sprint-swimming.
	+ Removed the ability to prevent burning using fire protection.
	+ Added golden tools to Phantom's ``Aurophobia``.
	+ Phantoms no longer tick insomnia, effectively eliminating Phantom (mob) spawns for the Phantom Origin.
	+ Fixed an issue with Phantoms being slowed down on semi full blocks if phantomized but not phasing.
+ Avian:
	+ Added a new Power ``Animal Friendship``
		+ Avians can tame certain animals without items using primary active on a 2 minute cooldown.
		+ Foxes, axolotls and ocelots always trust avians, causing them to not run away and sometimes fighting alongside the avian.
	+ Added a new Power ``Green Thumb``.
		+ Harvesting crops with any hoe increases the yield of the crop.
		+ Carrot crops, melons, oak leaves and dark oak leaves have a chance to drop 1 golden carrot, glistering melon and golden apple, respectively.
		+ Glistering Melons are edible.
		+ Replaces the power ``Heaven's Grace``.
	+ Moved ``Featherweight`` key to secondary.
+ Arachnid:
	+ Added a new Power ``Venom``.
		+ Arachnids have a small chance to inflict 5 seconds of poison on hit.
		+ Shares a toggle with ``Climbing``.
	+ ``Master of Webs``:
		+ Cobweb now drops 9 string.
		+ Removed webbing in exchange for ``Venom``.
		+ Webshot can now pull mobs and players instead pf flinging towards them.
+ Elytrian:
	+ Added a new Power: ``Companion Mounting``.
		+ Allows another player to mount the elytrian.
		+ Pressing the secondary key as elytrian, sneak as passenger, crashing or being hit by a projectile kicks the passenger off.
		+ Ability contributed by AnimGoated.
	+ Changed ``Aerial Combatant`` to require 3 seconds of gliding before receiving a damage bonus. 
	+ ``Aerial Combatant`` now also accounts for ranged combat.
	+ ``Gift of the skies`` now regenerates stamina while jumping (but not gliding).
+ Enderian:
	+ ``Ender Body`` now includes the ability to silk touch blocks while not holding a tool.
+ Feline: 
	+ Added a new Power: ``Dexterity``.
		+ Felines now jump higher regardless of sprinting.
		+ Holding shift when touching a wall allows for clinging onto that block for a few seconds.
		+ Holding sneak charges up a leap if grounded or clinging onto a block, and released by pressing jump.
		+ Multiple leaps in a row without touching the ground will gradually reduce the leap's effectiveness.
	+ ``Natural Hunter``:
		+ Claws can now be sharpened using logs / wool > smooth stone > iron block > diamond block in that order to deal progressively higher damage.
+ Merling:
	+ ``Body Moisture``:
		+ now regenerates moisture when standing in any water instead of needing to fully submerge.
		+ Now also regenerates when standing in rain.
		+ Respawning now fully refills the moisture.

Technical Changes

+ Added a new item tag ``Golden Tools``.
	+ Moved ``Spider Silk`` abilities back into ``Master of Webs``.
+ Phantom:
	+ Split gold related phantom drawbacks back into ``Aurophobia``.
+ Feline:
	+ Fixed Claws ability ignoring armor by changing the modifier from ``set_total`` to ``add_base_early``.
+ Merling:
	+ ``Body Moisture`` now prevents oxigen depletion instead of applying a waterbreathing effect.
+ Enderian:
	+ ``Ender Body``'s Projectle dodge no longer teleports into fluids.
+ Temporarily replaced Keybind variables with strings due to the origins 1.13.0 alpha 4 breaking keybind badges. 
+ Updated Gradle and added up to date files.
+ Updated ``README.md``.
+ Bumped version to 1.17.0.

### [Version 1.16 | Minecraft 1.20.2]

#### [Verion 1.16.5 - Arachnid & Phantom Balance](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.16.5)

Gameplay Changes

+ Fixed Arachnids not being able to hold onto walls while climbing.
+ Balance Changes to Elytrian's ``Gift of the skies`` power:
	+ Lowered overall Stamina cost of launch and ascend.
	+ Armor values ranging from 13 to 19 now allow launch and ascend, but are weaker and less stamina efficient in comparison to 12 armor and below.
+ Arachnid balance changes:
	+ ``Master of Webs`` now requires and returns 9 string.
	+ ``Spider silk``: doubled general silk supply regeneration, removed the ability to restock using string items.
	+ Cooldown only triggers when the webshot hit a target.
+ Fixed phantom's ``Phasing`` ability; phasing now uses a climbing power and phantoms get slowed when phasing.
+ Fixed ``Soulbound`` Tooltips on Golden foods and armor.

Technical Changes

+ Updated ``README.md``.
+ Bumped version to 1.16.5.

#### [Version 1.16.4 - Merling Moisture & Balance Changes](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.16.4)

Gameplay Changes

+ Added a new Merling power: ``Body Moisture``.
	+ Merlings now have a resource bar that provides water breathing for 10 minutes out of water, and 5 minutes in the nether.
	+ Merlings can submerge in water, sit in water cauldrons or drink a bottle of water in order to keep the bar stocked.
+ The Merling's natural spawn is now in Ocean Biomes rather than Deep Ocean Biomes.
+ Merling's dash now grants a 1 second dolphin's grace effect instead of a 3 second effect.
+ Arachnid's power "Arthropod" and "Spider Silk" have been rebalanced.
	+ Arachnid's falldamage calculation now starts after a fall of 16 blocks instead of 30.
	+ close combat webbing now costs 1 Notch of the silk supply instead of 2.
	+ Webshot now has a max range of 16 blocks instead of 32 blocks.
	+ Webshot's forwards velocity has been reduced from 2 to 1, and upwards velocity has been reduced from 0.75 to 0.25.
+ Avian's Heaven's Grace now provides a 25% damage boost to both normal and spectral arrows. Tipped Arrows do not receive a bonus.
+ Arrows and spectral arrows held by avians now have a tooltip displaying the damage bonus Heaven's Grace provides.
+ Elytrians no longer regenerate stamina while gliding.
+ Feline's Claw ability now sets the base melee damage to 5 (2.5 Hearts) regardless of held items, and a 25% melee damage bonus when holding any melee weapon.
+ Feline's Mining speed drawback is now cancelled with pickaxes using any level of efficiency.

Technical Changes

+ Moved OriginsTweaks' Origins to the Origins Layer for better compatibility with other addons or custom Origins.
	+ Added an \[OT] suffix to Origins' Names to differentiate it from the base Origins.
+ Replaced the custom texture by Simraa with the vanilla elytra texture, while providing a template for elytrian wing resourcepacks in the release files.
+ Added new item tag ``melee_weapons``.
+ Rephrased some descriptions.
+ Updated ``README.md``.
+ Bumped version to 1.16.4.

#### [Version 1.16.3 - Hotfix Elytrian Wings](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.16.3)

Gameplay Changes

+ Fixed a bug with the Base Elytrian having the Wing selector instead of the OriginsTweaks Elytrian.

Technical Changes

+ Bumped version to 1.16.3.
+ Changed dependencies of ``minecraft`` and ``origins`` to allow versions greater than the current minor version. Using OriginsTweaks in combination with any alpha build of the Origins Mod will most likely break stuff. Please don't report bugs if you're not using the recommended version of Origins.

#### [Version 1.16.2 - Dietary Delight Compat and OriginsTweaks Opt-In](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.16.2)

Gameplay Changes

+ Merlings now respawn in a deep ocean biome if available.

+ Phantoms now only require any level of fire protection on the helmet slot in order to prevent burning.

+ Burning Wrath cooldown was increased to 60 seconds, and the burn time was reduced to 30 seconds.

+ Carnivore, Vegetarian and Natural Hunter now use ``Origins: Dietary Delight`` tagging to extend mod compatibility.

+ Feline's "Nocturnal" power is no longer disabled when submerged in water.

+ Shulk's "Protective Shell" ability moved to "Sturdy Skin".
	+ Base armor changed to 3.
	+ Up to 7 bonus armor can be gained by pressing sneak for a while, for a total of 10 (5 chestplates)
	+ Armor does not run out over time, but taking a hit over 3 hearts removes 1 bonus armor point and disables buildup for 30 seconds.

+ Phasing vision increased from 10 to 16.

+ "Aurophobia" renamed to "Soulbound"
	+ Added duration stacking saturation and regeneration effects when near soul fire or in a soulsand valley biome.

+ Added a dolphins grace effect for 3 seconds upon activating the merling dash.

+ Changed "Teleportaton" ability to properly prevent suffocation after pearling.

+ Made Changes to "Gift of the Skies".
	+ Launch and ascend now allow using up all remaining stamina points.
	+ Prevent stamina regeneration if it hits 0 while gliding.

Technical Changes

+ Updated Mod to version 1.16.2.

+ Updated Gradle files to match latest fabric example mod.

+ Now uses [Origins: Dietary Delights](https://modrinth.com/datapack/origins-dietary-delights) to standardize dietary tags and add mod compatibility.

+ Improved various tags not replaced by Dietary Delights.

+ Added an options Layer to Elytrian to pick texture and rendering of the Elytra.

+ Rebased all changed powers previously in Origins to OriginsTweaks to allow optional usage of vanilla origins.

+ Added an option layer prior to the Origins Layer to choose wether OriginsTweaks or Origins Mod Origins are pickable for a single player.

#### [Version 1.16.1 - Elytrian and Enderian Changes](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.16.1)

Gameplay Changes

+ Reworked the removed Reflex mechanic; Enderiand now dodge small projectiles in a 5 second cooldown while taking no damage. Added to ``ender_body``.

+ Reworked ``gift_of_the_skies``. Gliding no longer drains stamina, but restores it slowly. Increased stamina cost of launch and ascend. Armor greater than 12 will now prevent launch and ascend instead of increasing stamina cost. Separated launch from ascend and increased cooldown to 10 seconds for launch.

Technical Changes

+ Updated Mod to Version 1.16.1

+ Dependencies changed to require any version of Minecraft 1.20.x and Origins 1.12.x.

+ Removed custom resource indicator for Arachnid's climbing ability, used an community one instead.

+ Removed ``shulker_inventory`` power override, since it changed to be indentical to base origins again.

+ Removed origins spawn and parrot sound effects.

+ Tweaked some conditions to more be more accurate.

+ Added a built-in Resourcepack for replacing Elytrian Wings with the vanilla elytra texture, WIP...

Fixes

+ Removed ``turtle_helmet`` power from merling since it was removed in the last update.

+ Fixed more typos and rephrased some descriptions.

#### [Version 1.16.0 - 1.20.2 Update & Rebalance](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.16.0)

This is a big one.

+ Updated to Minecraft 1.20.2
+ Updated to Origins >= 1.12.
	+ Since power and action types were used that have been added after Origins 1.12, this version unfortunately no longer supports older than Origins 1.12.0 or Minecraft 1.20.2.
+ Changed dependencies to require any version of Fabric API and Pehkui, to avoid issues with future releases of origins and outdated / bugged pehkui releases.
+ Fixed various formatting inconsistencies.
+ Fixed various missing translation keys.
+ Fixed some typos.
+ Merged, moved and rearranged various powers and sub-powers to make origins descriptions less cluttered.
+ Changed ``burn_in_daylight`` to require either or both a netherite helmet and any level of fire resistance on the helmet slot.
+ Extended the time that ``burning_wrath`` sets the player on fire from ``10`` to ``60`` seconds.
+ Added a missing toggle badge to Feline's ``cat_vision``.
+ Switched the shulker inventory keybind from ``secondary_active`` to ``primary_active``.
+ Tweaked ``zora_dash`` velocity numbers and added the power to ``swim_speed``.
+ Fixed the missing cooldown bar for ``throw_ender_pearl`` and restricted it's usage while ``recall beacon`` is active.
+ Added a badge to ``water_breathing`` hinting towards ways to counter this drawback.
+ Removed power ``antigravity_power`` from shulk.
+ Removed the weakness debuff from ``aurophobia``.
+ Removed power ``cloud`` from merling.
+ Removed power ``reflex`` from enderian.
	+ Added a projectile immunity to ``ender_body`` instead.
+ Removed power ``evil_presence`` from avian.
+ Decreased volume for feline's purring sound while asleep.
+ Reduced divergence of ``firecharged_projectiles`` from ``2`` to ``1``.
+ Changed ``heavens_grace`` projectile damage bonus to use ``multiply_base_multiplicative`` instead of ``multiply_total_multiplicative``.
+ Changed ``master_of_webs`` cobweb crafting to use 2 string instead of 9, changed ``string_refill`` accordingly.
+ Split up ``master_of_webs`` into two powers.
	+ ``spider_silk`` now contains the ``webshot`` and ``silk_resource`` (formerly ``string_resource``) sub-powers.
	+ ``webshot`` now grapples towards entities instead of trapping them.
	+ Reintroduced vanilla ``webbing`` sub-power from ``master_of_webs`` in connection to ``silk_resource``.
+ Changed ``protective_shell`` to disable buildup for 3 seconds instead of a complicated break mechanic, and reduced shell damage taken on hit.
+ Removed power ``seventh_sense`` from feline.
+ Changed volume of ``spectral_wail`` to be more accurate with the range of the ability.
+ Removed power ``thermal_lift`` from blazeborn.
+ Removed power ``turtle_helmet`` from merling.

### [Version 1.15 | Minecraft 1.20.0 / 1.20.1]

#### [Version 1.15.4 [Removed Quilt Metadata & Player Suggestions]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.15.4)

+ Removed ``quilt_mod.json`` because quilt natively supports fabric mods (and I'm too stupid to use quilt metadata).
	+ closes #41.
+ Made changes to Merling's Dash ability.
	+ Reduced base dash velocity from 2 to 1.5.
	+ The dash now increases velocity by 0.5 per level of depth strider.

#### [Version 1.15.3 [Quilt Metadata & Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.15.3)

+ Added ``quilt_mod.json`` for quilt metadata.
+ Fixed Enderian's Recall not toggling back off after the player died.
+ Added Description Assets for use within the ``README.md``.
+ Changed ``README.md``.
	+ Used proper header incrementation.
	+ Updated descriptions.
+ Added a toggle to Feline's Cat Vision.
+ Added a 5 seconds invincibility window against suffocation when an enderian teleports via pearl.
+ Negated mining speed penalty when climbing.
+ Increased velocity when using webshot to make it easier to recover from a fall off of a platform such as end islands.
+ Reduced cooldown of webbing entities from 10 to 5 seconds.
+ Mining Cobweb is faster and will now always return cobweb items.

#### [Version 1.15.2 [Arachnid Climbing Fix / Enderian Recall Rewrite]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.15.2)

+ Fixed Arachnid's Climbing ability still acting weird due to it somehow getting mixed up with the webshot keybind
+ Reworked Enderian's Recall ability to work better in Multiplayer.
	+ No longer randomly activates after the resource runs out and cooldown has passed.
	+ Cooldown is now visible using a pink resource bar with an X.
	+ No longer teleports to the nearest recall beacon instead of the user's own beacon.
	+ The Beacon now force loads chunks until teleported back.
		+ This enables teleporting back from any distance.
		+ Also has the neat side effect of a less laggy teleport in Singleplayer.
	+ The Shader effect applied when the ability is used is now togglable with F4.
+ The Reflex ability's Cooldown Resource is now only visible when the Cooldown is active.
+ Fixed a typo in the Terrestria's wood and logs block tag which prevented it from loading.

#### [Version 1.15.1 [Diets Tweaks and Mod Compat]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.15.1)

+ Undone dependency metadata change listed in the previous release's changelog.
+ Updated Pehkui Dependency metadata to support Version 3.3.3 or newer due to it being the only version that supports 1.19.0.
+ Added proper integration with the Mod menu API.
	+ Set Origins as parent for this mod.
	+ Enabled Update Checker.
+ Modified and added new Block tags to make Feline's Claw ability work with earlier versions of Minecraft.
+ Changed diet abilities.
	+ Carnivore no longer has the condition of "origins:meat" to prevent issues with mixed food.
	+ Avians have now a separate item tag for their vegetarian diet.
	+ Foods that are an even mix of vegetarian and carnivore ingredients are ignored by both diets (for example rabbit stew).
+ Added compatibility for Terrestria and Cinderscapes.
	+ Felines can now use (quarter) logs and wood from these mods to resharpen their claws.
	+ Carnivores can't eat Bramble Berries from Cinderscapes.
+ Added compatibility for Farmer's Delight.
	+ Added vegetable based foods to Avian's vegetarian diet.
	+ Added meat based foods to arachnid's carnivore diet.
	+ Mixed foods added by Farmer's Delight are ignored by both diets.
	+ Added foods based off of feline prey such as chicken and fish to feline's saturation buff.
+ Fixed conditions for climbing inside cobwebs for the arachnid as this somehow granted the Arachnid Creative flight (confusion).
+ Reverted change of needing one free hand for the Arachnid's web shot, because this was just annoying to deal with when accidentally picking up stuff.
+ Added a proper name and description for Feline's natural Hunter Ability.
+ Fixed grammar mistakes in ``CHANGELOG.md``.
+ Enderian's Reflex Ability now requires you to sneak to avoid unwanted teleportation, for example when in caves.

#### [Version 1.15.0 [Update to Origins 1.10]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.15.0)

+ Updated Dependency metadata.
	+ Supports Minecraft 1.20.0 and 1.20.1.
	+ Requires Origins 1.10.
	+ Requires Pehkui 3.7.6.
+ Firecharged no longer requires being on fire.
+ Added Cherry Logs, Cherry Wood and Bamboo Blocks to block tag for sharpening feline's claws.
	+ Due to this change this version is unfortunately no longer compatible with versions older than 1.20.0, as unregistered blocks inside block tags will not load the block tag in the first place, breaking the ability.
	+ I may fix this in the next release.
+ Changed Reflex in both nether and non-nether (Bug #35).
	+ In the Overworld and below the nether-roof the Enderian may teleport up at most 16 blocks at a time.
	+ Enderians above the nether-roof (> 128) will always teleport to the bottom regardless of y coordinates.

## [Minecraft 1.19.4](https://minecraft.fandom.com/wiki/Java_Edition_1.19.4)

### [Version 1.14 | Minecraft 1.19.4]

#### [Version 1.14.4 [(Another) Enderian Reflex Hotfix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.14.4)

+ Fixed power Reflex only working in the Nether.
+ Tweaked Reflex's conditions to accept any Projectile instead of Arrows only.
+ Changed Dependencies to accept any version of Minecraft above 1.19.2 and any Version of Origins above 1.6.0

#### [Version 1.14.3b [Port to 1.19.2]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.14.3b)

+ Ported OriginsTweaks 1.14.3 to Minecraft 1.19.2 by request.

#### [Version 1.14.3 [Blazeborn , Elytrian and Feline Changes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.14.3)

+ Removed unnecessary empty lines in ``Main.java``.
+ Updated Version and Pehkui Dependency in ``fabric.mod.json``
+ Removed translations files due to translation keys being broken with badges at the moment.
+ Reordered Arachnid's Powers.
+ Reordered Avian's Powers.
+ Reordered Blazeborn's Powers.
+ Reworked ``origins:burning_wrath``.
	+ Added active sub-power to put the player on fire.
	+ Damage bonus when on fire is 25% more instead of adding 3 health points.
	+ Added lighting campfires and fueling furnaces / brewing stands as sub power.
+ Removed power ``blazing_touch`` as it has been integrated into ``burning_wrath``.
+ Made Shulker Inventory drop when power has been lost, instead of deleting the items.
+ Fixed a bug with ``weak_arms`` not reducing mining speed.
+ Using Pickaxes with Efficiency III or higher now bypasses ``weak_arms`` mining speed and restrictions.
+ Changed name of ``aurophobia`` to ``Mortis``, a reference to the game ``Faith: the unholy trinity``.
+ Added ``minecraft:entity.cat.purreow`` alongside ``minecraft:entity.cat.ambient`` as ambient sound effect.
+ Added a ``minecraft:entity.cat.purr`` sound loop when felines are detected asleep in a bed.
+ Changed ``Firecharged Projectile``.
	+ Renamed from ``Firecharged Projectile`` to ``Firecharged``.
	+ Now requiring being on fire.
+ Restricted Firework Rocket use within ``gift_of_the_skies``.
+ Removed power ``revved_up``.
+ Changed ``sharp_claws``.
	+ resharpening claws now use more accurate sounds depending on block material.
	+ Resharpening using wood (logs / wood) now is twice af effective as fabric (wool / carpet).
+ Power ``thermal_lift`` now requires being on fire.
+ Changed block tag ``natural_stone``.
	+ Now includes:
		+ stone
		+ coal ore
		+ copper ore
		+ iron ore
		+ gold ore
		+ redstone ore
		+ emerald ore
		+ lapis ore
		+ diamond ore
		+ ancient debris
		+ granite
		+ diorite
		+ andesite
		+ sandstone
		+ smooth sandstone
		+ red sandstone
		+ smooth red sandstone
		+ smooth basalt
		+ calcite
		+ block of amethyst
		+ budding amethyst
		+ tuff
		+ dripstone block
		+ netherrack
		+ basalt
		+ magma block
		+ end stone
+ Changed block tag ``sturdy_stone``.
	+ Now includes:
		+ deepslate
		+ reinforced deepslate
		+ deepslate coal ore
		+ deepslate iron ore
		+ deepslate copper ore
		+ deepslate gold ore
		+ deepslate redstone ore
		+ deepslate emerald ore
		+ deepslate lapis ore
		+ deepslate diamond ore
		+ obsidian
		+ crying obsidian
		+ blackstone
		+ gilded blackstone
+ Added Block tag ``pickaxes`` for conditions used in ``weak_arms``.

#### [Version 1.14.2 [Enderian Nether-roof Hotfix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.14.2)

+ Fixed Issue #34, where the Enderian would get stuck on the Nether-roof when dodging arrows.

#### [Version 1.14.1 [Some more fixes that I forgor :skull:]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.14.1)

+ Fixed ``slow_falling`` not working due to it using ``originstweaks:`` identifier instead of ``origins:`` within toggle conditions.
	+ Also changed the keybinding to use primary active.
+ Restricted ``dual_wielding`` to only swing the Offhand and trigger the cool down when 2 identical swords are in off- and mainhand.
+ Changed order of powers for ``avian``.
+ Readded ``heavens_grace``.
	+ Changed Damage modifier to increase total damage by ``25%`` instead of a fixed bonus of ``3.5`` hearts.
+ Tweaked various damage modifiers because I can't read.
+ Changed power ``arthropod_appearance``.
	+ Only Reduces fall damage after 30 blocks by ``27`` instead of resetting it and then reducing it by ``30``.
+ Removed power ``dual_wielding`` due to it being broken as hell.
+ Added power ``evil presence`` to avian.
	+ Provides a resource bar ranging from ``0`` to ``7``, indicating how many undead mobs are nearby.
	+ Grants a 30% damage bonus against undead mobs.
+ Tweaked ``master_of_webs``.
	+ Rearranged badges.
	+ Added Visual effects and sounds when restocking string supply.
	+ Removed loot table for cobwebs returning 9 string as cobwebs won't drop string without a sword.
+ Reworked power ``gift_of_the_skies``.
	+ Renamed power ``originstweaks:flap`` to ``originstweaks:gift_of_the_skies``.
	+ Replaced the Cool down for the launch with a stamina system, used by the Elytra glide, launch and flapping wings abilities.
+ Nerfed power ``spectral_wail``.
	+ Changed conditions for entity glow from ``!=0`` to ``<= 30`` and ``>20`` to only activate for the first 10 seconds of the 30 seconds duration.
+ Fixed power ``recall``.
	+ Fixed a bug where the power would turn itself on randomly.
+ Fixed and nerfed power ``cloud``.
	+ Changed active time from ``5 minutes`` to ``2:30 minutes``.
	+ Fixed a bug where the power would turn itself off immediately after turning it on.
	+ Changed conditions so that the cloud cannot be summoned when in water.

#### [Version 1.14.0 [Balance Changes / Power Reworks]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.14.0)

+ Reworked power ``antigravity_bullet``.
	+ Changed Description to mention a Shulker Bullet rather than an Antigravity Bullet.
	+ Set Projectile speed from ``0.75`` to ``1``.
	+ Set Projectile Divergence to ``0``.
	+ Added NBT tag ``{NoGravity:1}`` to Projectile, making it unaffected by Gravity.
	+ Swapped active keybindings with ``shulker_inventory`` for easier access.
+ Reworked power ``aquadynamic``.
	+ Changed Description to use proper English.
	+ Changed Damage Modifiers to use non-Legacy Operations.
+ Added Parrot Imitations of Origin Ambient Sounds while riding on the Player's shoulder.
+ Reworked power ``arthropod_appearance``.
	+ Changed the Second Badge to describe the power more accurately.
	+ Changed Damage Modifiers to use non-Legacy Operations.
+ Reworked power ``aurophobia``.
	+ Golden Tools no longer deal 125% Damage on Phantoms.
	+ Gold related Blocks no longer inflict Slowness when in 5 Blocks proximity.
+ Reworked power ``blazing_touch``.
	+ Changed basic fire aspect to inflict fire for ``8`` seconds instead of ``20``, equivalent to Fire Aspect II.
	+ Changed Revved fire aspect to inflict fire for ``16`` seconds instead of ``40``, equivalent to Fire Aspect IV.
	+ Restricted both fire aspect powers to only work when the mainhand is empty.
	+ Right-clicking furnaces, campfires and brewing stands while blazing touch is active now fuels / lights these blocks.
+ Reworked power ``firecharged_projectile``.
	+ Changed Cool down for the revved fireball from ``50`` to ``200`` ticks.
+ Reworked power ``flap``.
	+ Nerfed various velocity values in order to balance this power.
+ Removed power ``heavens_grace``.
+ Added power ``master_of_webs`` to origins/powers for ``no_slowdown`` to work properly.
+ Changed Badge in ``master_of_webs``.
	+ Added a notice to use a sword when mining cobweb to get string refunded.
+ Changed power ``recall``.
	+ The bar now fully depletes when toggling it off.
+ Reopened Issue #32 because I managed to reproduce the bug.
+ Fixed a bug with power ``reflex``.
	+ Negative Damage causes arrows to bounce off of the player, fixed by instead setting the total damage to 1.
+ Closed Issue #32 as this bug is now fixed.
+ Added a sound effect to power ``sharp_claws`` when resharpening claws.
+ Balanced power ``thermal lift``.
	+ Changed usage cost to be ``5`` resource unit per tick instead of ``1``.
	+ Changed resource to recharge ``3`` resource units per tick instead of ``5``.
+ Removed power ``toxic_coating`` as Arachnid has too many abilities.
+ Fixed a Bug with ``recall``.
	+ Added a Cool down of 10 seconds between toggling the power off -> on, fixing a new beacon being created upon toggling off.

## [Minecraft 1.19.3](https://minecraft.fandom.com/wiki/Java_Edition_1.19.3)

### [Version 1.13 | Minecraft 1.19.3]

#### [Version 1.13.2 [More Tweaks]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.13.2)

+ Added power ``originstweaks:cloud`` that provides Merlings a temporary Rain Cloud.
+ Power ``originstweaks:turtle_helmet`` has been hidden from the Merling Origin overview.

#### [Version 1.13.1 [Merling Update & Bug Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.13.1)

+ Merlings now can gain air by wearing turtle helmets and bathing in cauldrons.
+ Water Bottles now fully replenish Merling's Air.
+ Turtle helmets slow down air use by ⅞.
+ Removed a condition in all ``<origin>_sounds.json`` files, which crashes the game when Origins Classes is not present.
+ Removed ambient sounds from merling because ``minecraft:entity.cod.ambient`` does not exist (dummy past me).

#### [Version 1.13.0 [Elytrian Rework & Update]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.13.0)

+ Unarchived Project.
+ Updated to 1.19.3.
+ Reworked Elytrian.
+ Moved elytra power to Gift of the Skies, and changed texture for the worn elytra.
+ Moved Launch to Gift of the Skies and increased effectiveness.
+ Added power flap wings to maintain altitude.
+ Removed rocket boost power.
+ Removed restriction for Armor, instead wearing heavy armor weakens both Launch and Wing Flap.
+ Removed .mcfuntion files and integrated the commands into the powers itself.
+ Changed Recipe for crafting Cobweb to use only ``2`` String instead of ``6`` in parity with [ReOrigins](https://modrinth.com/datapack/reorigins).
+ Removed ``minecraft:gilded_blackstone`` from the block tag ``origins:unphasable``.
+ Closed Issue #32. Reason: Can't reproduce.
+ Changed Merling's Trident recipe.
+ Removed Origin Teams.

## [Minecraft 1.19.1](https://minecraft.fandom.com/wiki/Java_Edition_1.19.1)

### [Version 1.12 | Minecraft 1.19]

#### [Version 1.12.2 [Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.12.2)

+ Fixed ``Aurophobia`` not working (#31).
+ Fixed ``Merling`` Trident Power not showing up and not having a name and description in the Origin Overview of Merling.
+ Fixed ``Blazing Touch`` not reducing revving resource when hitting another Entity. (#29).
+ Temporarily removed Orb of Origins Recipe.
+ Removed blur shader when hit by toxic coating.

#### [Version 1.12.1 [Dependency Update]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.12.1)

+ Updated Dependencies to support Pehkui Version 3.4.1.

#### [Version 1.12.0 [1.19 Update]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.12.0)

+ Updated to 1.19.0
+ Removed Arachnid ability to catch entities in cobweb by melee attacks.
+ Added Arachnid Ability to catch entities in cobweb by hitting them with the cobweb grapple.
+ Reworked cool down for grapple, duration depends on whether entity was caught or block was grappled to.
+ Replaced ``execute_command`` actions that execute a ``/playsound`` command with a ``play_sound`` action type.
+ Added a shader for entities hit by a toxic coating arrow.

## [Minecraft 1.18.2](https://minecraft.fandom.com/wiki/Java_Edition_1.18.2)

### [Version 1.11 | Merling Rework]

#### [Version 1.11.2 [Some more fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.11.2)

+ Changed file structure to be used as a proper mod.
+ Removed Coloring of Origins specific teams.
+ Fixed Arachnid's grapple sounds only playing for player ``Chromex_``.
+ Added Logger message upon initialization.
+ refactored main package from `net.chromexunderscore.originstweaks` to `com.chromexunderscore.originstweaks`.

#### [Version 1.11.1 [Some Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.11.1)

+ ``Merling Trident Recipe`` is now hidden, fixing Issue \#25.
+ ``Aquadynamic`` damage multiplier reduced from times ``1.5`` to times ``0.5`` to properly output a 50% increase of damage.

#### [Version 1.11.0 [Merling Rework]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.11.0)

+ Added power ``Zora Dash``
	+ Ability to dash underwater on a cool down
+ Changed power ``Hydro Knowledge``, renamed to ``Aquadynamic``.
	+ Changed damage bonus from ``addition 4`` to ``multiply_total 1.5``
	+ Melee is affected as well now.

### [Version 1.10 | Enderian Buff]

#### [Version 1.10.3 [Fabric Mod]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.3)

+ Migrated from Datapack to Fabric Mod
	+ Changed ``pack.png`` from a lazy wrench pasted onto the Orb of Origins to a pixel-style wrench.
	+ Added ``fabric.mod.json``
	+ Removed ``tellraw`` message upon datapack reload.

#### [Version 1.10.2 [Shulk and Arachnid Nerfs]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.2)

+ Changed `pack_format` from `9` to `10`.
+ `Protective Shell` can now be broken.
	+ -14 Shields when hit (Max Shields are 140)
	+ 5 Seconds Cool down on recharge when hit.
+ `Aurophobia` stacking status effect increases every 5 seconds instead of 1.

#### [Version 1.10.1 [Enderian Buff and Pacify Hostile Mobs]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.1)

+ Added power `Reflex` to Enderian.
	+ Automatically dodges Arrows and negates damage on a Cool down.
+ Changed power `Recall`.
	+ Enderian now shakes while in recall.
+ Hostile Mobs paired on Origin are now passive.
	+ Spiders and Cave Spiders won't attack Arachnid.
	+ Blazes won't attack Blazeborn.
	+ Endermen won't attack Enderians.
	+ Puffer fish and Dolphins won't attack Merling.
	+ Phantoms won't attack Phantom.
	+ Shulkers wont attack Shulk.

#### [Version 1.10.0 [Enderian Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.0)

+ Replaced power ``Slender Body`` with ``Ender Body``.
	+ height, model width, eye height and reach have been changed.
+ Added power ``Recall Beacon`` to Enderian.
	+ Secondary Active summons an AoE Cloud, which acts as a teleportation point. Forces teleport once completely uncharged. 30 seconds usage, up to 60 seconds to charge up fully.

### [Version 1.9 | Avian Buff]

#### [Version 1.9.2 [Another power for Arachnid]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.9.2))

+ Added power ``Toxic Coating`` to Arachnid.
	+ Projectiles fired poison targets on a cool down.
+ Changed power ``Thermal Lift``.
	+ Reduced ``action over time`` loop to prevent lag.

#### [Version 1.9.1 [Feline and Avian Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.9.1))

+ Fixed Feline Power ``Sharp Claws``
	+ Added change resource action.
		+ I forgor :skull:.
+ Fixed Avian Power `Dual Wielding`
	+ Restructured Raycast Action to support the bi-entity action.

#### [Version 1.9.0 [Avian Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.9.0)

+ Added Power `Dual Wielding`.
	+ Ability to hit a second time with an offhand sword on a cool down.
	+ Sword damages when hit entity.
	+ Pets are ignored.
	+ Enchantments and effects are ignored.
+ Changed Active keybinding in power `Slow Falling` from `primary` to `secondary`.

### [Version 1.8 | Feline Buff]

#### [Version 1.8.0 [Feline Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.8.0)

+ Tweaked Power ``Weak Arms``
	+ Set Mining Speed from `25%` to `50%`.
	+ "Sturdy Stones" are now un-mineable unless under effect oof any Strength Potion.
	+ Added Block Tag `orginstweaks:sturdy_stone`.
+ Added Power ``Sharp Claws``
	+ Unarmed Damage dealt is increased.
	+ Sharpness Resource needed in order to apply buff.
	+ Resource can be refilled by right-clicking on any blocks in tag ``originstweaks:resharpen_claws``.
	+ Added Block tag ``originstweaks:resharpen_claws``.
+ Added Power `Seventh Sense`.
	+ Feline Prey in a 16 Block radius will be inflicted glowing for 10 Seconds upon using this ability.
	+ 30 Seconds Cool down
	+ Feline Prey are entities specified in `originstweaks:feline_prey`, such as chickens, rabbits and fish.
	+ Added Entity Type tag `originstweaks:feline_prey`.
+ Added Power `Natural Hunter`.
	+ Food in tag `originstweaks:feline_food` have increased nourishment.
		+ \+ 3 hunger, + 2 Saturation.
	+ Added Item tag `originstweaks:feline_food`.

### [Version 1.7 | Balancing, Mod Support & Fixes]

#### [Version 1.7.2 [Slight Grappling Modifications]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.7.2)

+ Simplified Code for grappling Effects such as `Swing Hand` and using of `String Resource`.
+ Reduced local Z axis grappling power from `2.5` to `2.0` to balance reach buffs.

#### [Version 1.7.1 [More Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.7.1)

+ Fixed ``Blazing Touch``
	+ Removed ability to light candles and candle cakes due to bugs with Origins 1.4.1.
+ Fixed ``Master of Webs``.
	+ Changed power to execute on both Client and Server side to prevent waste of String resource and failure of grappling.
	+ Increased grapple reach to better grapple onto Boss mobs.
	+ Adjusted grapple strength to balance reach.
	+ Increased Refill Cool down using String to suppress Item loss.
	+ Changed fluid handling from `any` to `none` to fix being able to grapple onto Water or Lava.
	+ Fixed inconsistent conditions for effects such as `Swing Hand`, `hit command` and `command along ray`.
+ Replaced function calls in sound powers with actual command to decrease chaos in function folder.
+ Removed block tag `originstweaks:candles`.
	+ (For some reason, it reappeared again even though I'm sure I removed it in the last update?).
+ Fixed Origin Team for Feline.
+ Datapack Load Message now shows Version Number.

#### [Version 1.7.0 [Balancing, Mod Support & Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.7.0)

+ Updated Datapack to 1.18.2.
	+ Changed Pack Format to 9.
+ Removed Block Tag.
	+ Removed ``originstweaks:candle`` due to not being used.
+ Added Support for Charm.
	+ Added Modded Gold Blocks to ``origintweaks:golden_blocks``.
+ Fixed Team System
	+ Added property ``"hidden": true`` to avoid showing up on the Origin info card.
	+ Set ``seeFriendlyInvisibles`` of all Origin Teams to false.
	+ Fixed Issue with VanillaTweaks' Datapack ``AFK Display`` not reapplying Origins Teams after revoking AFK status.
+ Balanced Phantom Power ``Aurophobia``.
	+ Decreased the gold-debuff range from ``10`` to ``5``.
	+ Added Sub-power ``golden_armor``.
		+ Restricts armor in tag ``originstweaks:golden_armor`` to be equipped.
	+ Added Item tag ``originstweaks:golden_armor``.
+ Balanced Shulk power ``Protective Shell``.
	+ Changed Sneak Cool down from ``0 Ticks`` to ``2 ticks``.
+ Balanced Blazeborn Power ``Blazing Touch``.
	+ Increased non-revved Fire Aspect Cool down from ``20 Ticks`` to ``200 Ticks``.
	+ Decreased Revved Cool down from ``10 Ticks`` to ``0 Ticks``.
	+ Added blocks in tags ``minecraft:candles`` and ``minecraft:candle_cakes`` to be lit.
	+ Restrict Item use on Candle Cakes when sneaking to prevent it from being eaten when trying to light the candle.
+ Balanced Elytrian Power `Need for Mobility`
	+ Removed Restriction of equipping Armor higher than Iron Tier.
	+ Restricts usage of Elytra when wearing higher than Iron Tier.
+ Fixed Various Spelling Errors.

## [Minecraft 1.18.1](https://modrinth.com/mod/origins/version/1.3.1)

### [Version 1.6 | Blazeborn Buff]

#### [Version 1.6.3 [Origin Teams and Reload Notification]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.6.3)

+ Added Automatic adding and joining of Origins Teams.
+ Added a ``/tellraw`` message once the Datapack has reloaded.
+ Fixed enderian sounds not working without support of datapack ``Better Enderian``.

#### [Version 1.6.2 [Recipe Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.6.2)

+ Fixed Orb of Origins Recipe
	+ Rebased Folder data/minecraft/crafting to be data/crafting.
+ Fixed Merling Trident Recipe.
	+ Removed Blacksmith Trident.

#### [Version 1.6.1 [Blazeborn Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.6.1)

+ Added Power ``Thermal Lift`` to Blazeborn.
	+ Hover in Midair and move up and down by using jump or sneak.
+ Fixed ``Blazing Touch``
	+ Removed Right-clicking on Block to place power due to being unstable and bugged.
+ Fixes some other small issues
	+ ``originstweaks:candles`` block tag is not a ``.json`` file.
	+ changed some stats for ``Firecharged Projectile`` power.

#### [Version 1.6.0 [Blazeborn Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.6)

+ Added Power ``Blazing Touch`` to Blazeborn.
	+ right-clicking on a Block Places Fire.
	+ Hitting Entities inflicts Fire Aspect V (X While revved up.).
+ Added Power ``Firecharged Projectile``.
	+ Shoot 3 Inaccurate Fireballs with a second cool down (5x 100% Accurate, 1/2 Second Cool down while revved up).
+ Added Power ``Revved up``.
	+ Consume 1 Firecharge for 128 seconds revved up.
	+ Buffs Offensive Abilities when revved.

### [Version 1.5 | Shulk Buff]

#### [Version 1.5.0 [Shulk Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.5)

+ Added Power ``Antigravity Bullet`` to shulk.
	+ Fires a Shulker Bullet upon pressing the Secondary ability key
+ Added Power ``Protective Shell`` to shulk.
	+ Grants 3 stages of resistance upon holding down shift

### [Version 1.4 | Arachnid Buff]

#### [Version 1.4.1 [Arachnid Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.4.1)

+ Set additional velocity on web shoot to be client oriented
+ Set velocity to launch 0.5 upwards and 1.5 forwards
+ Tweaked height to fit under 1 block gaps

#### [Version 1.4.0 [Arachnid Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.4)

+ Modified power ``Climbing``.
	+ Changed power to be activated using ``key.origins.secondary_active`` rather than ``key.origins.primary_active``.
+ Modified power ``MAster of Webs``.
	+ Changed sub-power "webbing" to be dependent on the String Resource.
	+ Added sub-power `Web Shoot`.
	+ Modified sub-power `Web Crafting` to use 6 Strings to craft a Cobweb.
	+ Added sub-power `String Resource`.
	+ Added sub-power `String Regenerate`.
+ Fixed `Arthropod Appearance` to properly calculate fall damage delay and amount.

### [Version 1.3 | Phantom buff]

#### [Version 1.3.2 [Phantom Patch]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.3.2)

+ Modified power ``Burning in Daylight``.
	+ Fixed an Issue with Phantoms burning, even when wearing a Helmet.
+ Modified power `Spectral Wail`.
	+ Fixed an Issue with the Glowing Effect visible to everyone.

#### [Version 1.3.1 [Arachnid Climbing Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.3.1)

+ Added a Hud Render if `origins:climbing` is enabled.

#### [Version 1.3.0 [Phantom Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.3)

+ Added power `Spectral Wail` to Phantom.
	+ Active ability that inflicts 30 seconds of Glowing to entities in 32 Blocks range
+ Added power `Aurophobia` to Phantom.
	+ Gold Debuffs: Golden Food is not edible, Golden Blocks are unphasable and give Debuffs in proximity, Golden Tools deal extra Damage to the Origin.
+ Removed power `Fragile` to balance out the damage modifier caused by `Aurophobia`.

### [Version 1.2 | Elytrian Buffs]

#### [Version 1.2.1 [Merling Blacksmith Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.2.1)

+ Modified power "Merling Trident" to support Blacksmith Buffs.

#### [Version 1.2.0 [Elytrian Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.2)

+ Added power "Elytra Boost" to Elytrian.
	+ Active Ability that gives a small forward boost if activated while gliding; similar to Rockets but weaker.
+ Modified power `Need for Mobility` to support Armor up to Iron Tier.

### [Version 1.1 | Basic Buffs]

#### [Version 1.1.0 [Basic Buffs]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.1)

+ Added power "Arthropod Appearance" to Arachnid.
	+ Height change from 1.8 Blocks to 1.5 blocks.
	+ Modified fall damage start calculating after 30 Blocks, and half the amount.
+ Added power "Merling Trident" to Merling.
	+ Adds a craftable Trident for Merlings.
+ Added power "Heaven's Grace" to Avian.
	+ Spectral arrow deal extra Damage.
+ Added support for datapack "Better Enderian"
+ Added power "Hydro Knowledge" to Merling.
	+ Tridents thrown while submerged in water deal more damage.
+ Modified power `Slow Falling` to have a toggle.

### [Version 1.0 | Base Datapack]

#### [Version 1.0.0 [Base Datapack]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.0)

+ Added Ambience, Hurt, Death and retreat sounds for every Origin.
+ Added Orb of Origin Crafting Recipe.
