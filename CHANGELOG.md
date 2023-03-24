# OriginsTweaks Changelogs

## [1.19.3](https://minecraft.fandom.com/wiki/Java_Edition_1.19.3)

### [Version 1.13 [1.19.3 Update / Unarchive of Project / Elytrian Rework]]

#### [Version 1.13.1 [Draft]]

+ Merlings now can gain air by wearing turtle helmets and bathing in cauldrons.
+ Water Bottles now fully replenish Merling's Air.
+ Turtle helmets slow down air use by ⅞.
+ Removed a condition in all ``<origin>_sounds.json`` files, which crashes the game when Origins Classes is present.
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

## [1.19.1](https://minecraft.fandom.com/wiki/Java_Edition_1.19.1)

### [Version 1.12 [1.19 Update]]

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
+ Reworked cooldown for grapple, duration depends on whether entity was caught or block was grappled to.
+ Replaced ``execute_command`` actions that execute a ``/playsound`` command with a ``play_sound`` action type.
+ Added a shader for entities hit by a toxic coating arrow.

## [1.18.2](https://minecraft.fandom.com/wiki/Java_Edition_1.18.2)

### [Version 1.11 [Merling Rework]]

#### [Version 1.11.2 [Some more fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.11.2)

+ Changed file structure to be used as a proper mod.
+ Removed Coloring of Origins specific teams.
+ Fixed Arachnid's grapple sounds only playing for Chromex_.
+ Added Logger message upon initialization.
+ refactored main package from `net.chromexunderscore.originstweaks` to `com.chromexunderscore.originstweaks`.

#### [Version 1.11.1 [Some Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.11.1)

+ ``Merling Trident Recipe`` is now hidden, fixing Issue \#25.
+ ``Aquadynamic`` damage multiplier reduced from times ``1.5`` to times ``0.5`` to properly output a 50% increase of damage.

#### [Version 1.11.0 [Merling Rework]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.11.0)

+ Added power ``Zora Dash``
  + Ability to dash underwater on a cooldown
+ Changed power ``Hydro Knowledge``, renamed to ``Aquadynamic``.
  + Changed damage bonus from from ``addition 4`` to ``multiply_total 1.5``
  + Melee is affected as well now.

### [Version 1.10 [Enderian Buff]]

#### [Version 1.10.3 [Fabric Mod]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.3)

+ Migrated from Datapack to Fabric Mod
  + Changed ``pack.png`` from a lazy wrench pasted onto the Orb of Origins to a pixel-style wrench.
  + Added ``fabric.mod.json``
  + Removed ``tellraw`` message upon datapack reload.

#### [Version 1.10.2 [Shulk and Arachnid Nerfs]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.2)

+ Changed `pack_format` from `9` to `10`.
+ `Protective Shell` can now be broken.
  + -14 Shields when hit (Max Shields are 140)
  + 5 Seconds Cooldown on recharge when hit.
+ `Aurophobia` stacking status effect increases every 5 seconds instead of 1.

#### [Version 1.10.1 [Enderian Buff and Pacify Hostile Mobs]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.1)

+ Added power `Reflex` to Enderian.
  + Automatically dodges Arrows and negates damage on a Cooldown.
+ Changed power `Recall`.
  + Enderian now shakes while in recall.
+ Hostile Mobs paired on Origin are now passive.
  + Spiders and Cave Spiders won't attack Arachnid.
  + Blazes won't attack Blazeborn.
  + Endermen won't attack Enderians.
  + Pufferfish and Dolphins won't attack Merling.
  + Phantoms won't attack Phantom.
  + Shulkers wont attack Shulk.

#### [Version 1.10.0 [Enderian Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.10.0)

+ Replaced power ``Slender Body`` with ``Ender Body``.
  + height, model width, eye height and reach have been changed.
+ Added power ``Recall Beacon`` to Enderian.
  + Secondary Active summons an AoE Cloud, which acts as a teleportation point. Forces teleport once completely decharged. 30 seconds usage, up to 60 seconds to charge up fully.

### [Version 1.9 [Avian Buff]]

#### [Version 1.9.2 [Another power for Arachnid]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.9.2))

+ Added power ``Toxic Coating`` to Arachnid.
  + Projectiles fired poison targets on a cooldown.
+ Changed power ``Thermal Lift``.
  + Reduced ``action over time`` loop to prevent lag.

#### [Version 1.9.1 [Feline and Avian Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.9.1))

+ Fixed Feline Power ``Sharp Claws``
  + Added change resource action.
    + I forgor :skull:.
+ Fixed Avian Power `Dual Wielding`
  + Restructured Raycast Action to make the bientity action supported.

#### [Version 1.9.0 [Avian Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.9.0)

+ Added Power `Dual Wielding`.
  + Ability to hit a second time with a offhand sword on a cooldown.
  + Sword damages when hit entity.
  + Pets are ignored.
  + Enchantments and effects are ignored.
+ Changed Active keybinding in power `Slow Falling` from `primary` to `secondary`.

### [Version 1.8 [Feline Buff]]

#### [Version 1.8.0 [Feline Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.8.0)

+ Tweaked Power ``Weak Arms``
  + Set Mining Speed from `25%` to `50%`.
  + "Sturdy Stones" are now unmineable unless under effect oof any Strength Potion.
  + Added Block Tag `orginstweaks:sturdy_stone`.
+ Added Power ``Sharp Claws``
  + Unarmed Damage dealt is increased.
  + Sharpness Resource needed in order to apply buff.
  + Resource can be refilled by right clicking on any blocks in tag ``originstweaks:resharpen_claws``.
  + Added Block tag ``originstweaks:resharpen_claws``.
+ Added Power `Seventh Sense`.
  + Huntable Animals in a 16 Block radius will be inflicted glowing for 10 Seconds upon using this ability.
  + 30 Seconds Cooldown
  + Huntable Animals are entities specified in `originstweaks:feline_prey`.
  + Added Entity Type tag `originstweaks:feline_prey`.
+ Added Power `Natural Hunter`.
  + Food in tag `originstweaks:feline_food` have increased nourishment.
    + \+ 3 hunger, + 2 Saturation.
  + Added Item tag `originstweaks:feline_food`.

### [Version 1.7 [Balancing, Mod Support & Fixes]]

#### [Version 1.7.2 [Slight Grappling Modifications]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.7.2)

+ Simplifed Code for grappling Effects such as `Swing Hand` and using of `String Resource`.
+ Reduced local Z axis grappling power from `2.5` to `2.0` to balance reach buffs.

#### [Version 1.7.1 [More Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.7.1)

+ Fixed ``Blazing Touch``
  + Removed ability to light candles and candle cakes due to bugs with Origins 1.4.1.
+ Fixed ``Master of Webs``.
  + Changed power to execute on both Client and Server side to prevent waste of String resource and failure of grappling.
  + Increased grapple reach to better grapple onto Boss mobs.
  + Adjusted grapple strenght to balance reach.
  + Increased Refill Cooldown using String to supress Item loss.
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
  + Added Subpower ``golden_armor``.
    + Restricts armor in tag ``originstweaks:golden_armor`` to be equipped.
  + Added Item tag ``originstweaks:golden_armor``.
+ Balanced Shulk power ``Protective Shell``.
  + Changed Sneak Cooldown from ``0 Ticks`` to ``2 ticks``.
+ Balanced Blazeborn Power ``Blazing Touch``.
  + Increased non-revved Fire Aspect Cooldown from ``20 Ticks`` to ``200 Ticks``.
  + Decreased Revved Cooldown from ``10 Ticks`` to ``0 Ticks``.
  + Added blocks in tags ``minecraft:candles`` and ``minecraft:candle_cakes`` to be lit.
  + Restrict Item use on Candle Cakes when sneaking to prevent it from being eaten when trying to light the candle.
+ Balanced Elytrian Power `Need for Mobility`
  + Removed Restriction of equipping Armor higher than Iron Tier.
  + Restricts usage of Elytra when wearing higher than Iron Tier.
+ Fixed Various Spelling Errors.

## [1.18.1](https://modrinth.com/mod/origins/version/1.3.1)

### [Version 1.6 [Blazeborn Buff]]

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
  + Removed Right clicking on Block to place power due to being unstable and bugged.
+ Fixes some other small issues
  + ``originstweaks:candles`` block tag is not a ``.json`` file.
  + changed some stats for ``Firecharged Projectile`` power.

#### [Version 1.6.0 [Blazeborn Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.6)

+ Added Power ``Blazing Touch`` to Blazeborn.
  + right clicking on a Block Places Fire.
  + Hitting Entities inflicts Fire Aspect V (X While revved up.).
+ Added Power ``Firecharged Projectile``.
  + Shoot 3 Inaccurate Fireballs with a second cooldown (5x 100% Accurate, 1/2 Second Cooldown while revved up).
+ Added Power ``Revved up``.
  + Consume 1 Firecharge for 128 seconds revved up.
  + Buffs Offensive Abilities when revved.

### [Version 1.5 [Shulk Buff]]

#### [Version 1.5.0 [Shulk Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.5)

+ Added Power ``Antigravity Bullet`` to shulk.
  + Fires a Shulker Bullet upon pressing the Secondary ability key
+ Added Power ``Protective Shell`` to shulk.
  + Grants 3 stages of resistance upon holding down shift

### [Version 1.4 [Arachnid Buff]]

#### [Version 1.4.1 [Arachnid Fixes]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.4.1)

+ Set additional velocity on web shoot to be client oriented
+ Set velocity to launch 0.5 upwards and 1.5 forwards
+ Tweaked height to fit under 1 block gaps

#### [Version 1.4.0 [Arachnid Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.4)

+ Modified power ``Climbing``.
  + Changed power to be activated using ``key.origins.secondary_active`` rather than ``key.origins.primary_active``.
+ Modified power ``MAster of Webs``.
  + Changed subpower "webbing" to be dependant on the String Resource.
  + Added subpower `Web Shoot`.
  + Modified subpower `Web Crafting` to use 6 Strings to craft a Cobweb.
  + Added subpower `String Resource`.
  + Added subpower `String Regenerate`.
+ Fixed `Arthropod Appearance` to properly calculate falldamage delay and amount.

### [Version 1.3 [Phantom buff]]

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

### [Version 1.2 [Elytrian Buffs]]

#### [Version 1.2.1 [Merling Blacksmith Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.2.1)

+ Modified power "Merling Trident" to support Blacksmith Buffs.

#### [Version 1.2.0 [Elytrian Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.2)

+ Added power "Elytra Boost" to Elytrian.
  + Active Ability that gives a small forward boost if activated while gliding; similar to Rockets but weaker.
+ Modified power `Need for Mobility` to support Armor up to Iron Tier.

### [Version 1.1 [Basic Buffs]]

#### [Version 1.1.0 [Basic Buffs]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.1)

+ Added power "Arthropod Appearance" to Arachnid.
  + Height change from 1.8 Blocks to 1.5 blocks.
  + Modified fall damage start calculatin after 30 Blocks, and half the amount.
+ Added power "Merling Trident" to Merling.
  + Adds a craftable Trident for Merlings.
+ Added power "Heaven's Grace" to Avian.
  + Spectral arrow deal extra Damage.
+ Added support for datapack "Better Enderian"
+ Added power "Hydro Knowledge" to Merling.
  + Tridents thrown while submerged in water deal more damage.
+ Modified power `Slow Falling` to have a toggle.

### [Version 1.0 [Base Datapack]]

#### [Version 1.0.0 [Base Datapack]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.0)

+ Added Ambience, Hurt, Death and retreat sounds for every Origin.
+ Added Orb of Origin Crafting Recipe.
