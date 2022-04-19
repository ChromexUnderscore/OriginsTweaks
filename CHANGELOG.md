# OriginsTweaks Changelogs

## [1.18.2](https://modrinth.com/mod/origins/version/1.4.1)

### [Version 1.7 [Balancing, Mod Support & Fixes]]

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

#### [Version 1.5.0 [Shulker Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.5)

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
  + Added subpower "web_shoot".
  + Modified subpower "web_crafting" to use 6 Strings to craft a Cobweb.
  + Added subpower "string_resource".
  + Added subpower "string_regenerate".
+ Fixed "Arthropod Appearance" to properly calculate falldamage delay and amount.

### [Version 1.3 [Phantom buff]]

#### [Version 1.3.2 [Phantom Patch]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.3.2)

+ Modified power ``Burning in Daylight``.
  + Fixed an Issue with Phantoms burning, even when wearing a Helmet.
+ Modified power `Spectral Wail`.
  + Fixed an Issue with the Glowing Effect visible to everyone.

#### [Version 1.3.1 [Arachnid Climbing Fix]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.3.1)

+ Added a Hud Render if `origins:climbing` is enabled.

#### [Version 1.3.0 [Phantom Buff]](https://github.com/ChromexUnderscore/OriginsTweaks/releases/tag/1.3)

+ Added power "Spectral Wail" to Phantom.
  + Active ability that inflicts 30 seconds of Glowing to entities in 32 Blocks range
+ Added power "Aurophobia" to Phantom.
  + Gold Debuffs: Golden Food is not edible, Golden Blocks are unphasable and give Debuffs in proximity, Golden Tools deal extra Damage to the Origin.
+ Removed power "Fragile" to balance out the damage modifier caused by "Aurophobia".

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
