# OriginsTweaks

Reworks the Base Origins abilities from the [Origins Mod](https://modrinth.com/mod/origins) and adds new ones.

<a href="https://modrinth.com/mod/originstweaks"><img src="https://img.shields.io/badge/Available_on-Modrinth-%2300AF5C?logo=modrinth&logoColor=%2300AF5C"></a>
<a href="https://github.com/ChromexUnderscore/OriginsTweaks"><img src="https://img.shields.io/badge/Available_on-GitHub-%23181717?logo=github&logoColor=%23181717"></a>

<img src=https://img.shields.io/badge/Required_Mods-gray>
<a href="https://modrinth.com/mod/origins"><img src="https://img.shields.io/badge/Origins-lightblue"></a>
<a href="https://modrinth.com/mod/pehkui"><img src="https://img.shields.io/badge/Pehkui-lightgray"></a>
<a href="https://modrinth.com/datapack/origins-dietary-delights"><img src="https://img.shields.io/badge/Origins%20Dietary%20Delights-green"></a>


## Changes and Additions

**[OM]** Tags mark changes to Powers from the Origins Mod.

**[OT]** Tags mark New Powers added by OriginsTweaks.

<details><summary>Avian</summary>

#### Featherweight [OM]

+ Uses the [Secondary] Key as toggle instead of Sneaking.

#### Animal Friendship [OT]

+ Tameable Animals can be tamed and certain animals will trust and fight for the Avian. 
	+ Activated with the [Primary] Key.
	+ Cooldown: 2 Minutes.
	+ Tameable: Wolves, Cats, Parrots, Horses, Donkeys, Mules, Llamas.
	+ Trusting: Axolotls, Foxes, Ocelots.

#### Green Thumb [OT]

+ Harvesting crops with a Hoe increases the amount of items dropped and have a chance to drop gold variants.
	+ Bonus drop ratio is equivalent to Fortune II and stacks.
	+ Gold Crops have a 50% chance of dropping one per block harvested.
	+ Glistering Melons are edible and provide 6 Hunger points and 4 Saturation points.
	
</details>

<details><summary>Arachnid</summary>


#### Master of Webs [OM]

+ Adds a webshot ability.
	+ Fired using the [Primary] Key.
	+ 7 Charges, which regenerate over 30 seconds.
	+ Grapples towards blocks and mobs hit in a range of 16 blocks.
+ Can no longer catch mobs in a web on hit.
+ Cobweb is crafted out of 9 string instead of 2.
	+ Cobweb Mining while sneaking is faster and always drops 9 strings.

#### Venom [OT]

+ Arachnids have a chance to inflict a poison effect on melee attack.
	+ Melee attacks have a 25% chance to inflict Poison II for 5 seconds.
		+ Cooldown: 5 seconds
	+ This replaces close combat Webbing.
+ Climbing and Venom abilities can be switched with the [Secondary] Key.

#### Climbing [OM]

+ Climbing no longer slows down mining speed.
+ Climbing and Venom abilities can be switched with the [Secondary] Key.

#### Arthropod [OM]

+ Arachnids are only 1.5 blocks tall and can fit into 1-block gaps when sneaking.
+ Fall damage is only taken after a fall greater than 16 Blocks.

</details>

<details><summary>Elytrian</summary>

#### Gift of the Skies [OM]

+ Elytrians can launch from the ground or ascend while gliding.
	+ Activate using [Primary] Key:
		+ While grounded to launch ~20 Blocks into the air.
		+ While gliding to ascend up to 7 Blocks upwards.
	+ Elytrians have limited stamina used for launching and ascending.
		+ Rest on the ground or sleep to refill stamina.
	+ Heavy Armor (13+ Armor) weakens effects of the ability and costs more stamina.
	+ 20 Armor or higher prevents launch and ascend.

#### Aerial Combatant [OM]

+ Now only activates after gliding for at least 3 Seconds.
+ Melee Attacks gain a 2x damage increase.
+ Ranged Attacks gain a 1.5x damage increase.

#### Companion Mounting [OT]

+ Players can right click an elytrian to mount them.
	+ Pressing the [Secondary] Key kicks off the passenger. 
	+ Passengers also get kicked off if the elytrian crashes into terrain or is hit by a projectile.
+ Ability contributed by AnimGoated.

#### Elytra Options [OT]

+ Elytrians can pick between vanilla elytra rendering, a custom wing texture exclusive to their Elytra or no wing rendering.
	+ A template for custom wings is appended in modrinth and github releases.

</details>

<details><summary>Shulk</summary>

#### Sturdy Skin 

+ Shulks have a base armor of 3. 
+ Sneaking grants up to 7 bonus defense, for a total of 10 Natural Armor Points.
	+ 1 bonus defense is lost and buildup is disabled for 30 seconds when taking a heavy hit (> 3 Hearts).

</details>

<details><summary>Feline</summary>

#### Natural Hunter [OT]

+ Felines deal increased melee damage when not using any tools, but have to regularly resharpen their claws.
	+ Resharpen by using certain blocks in order:
		+ Wood, Logs, Wool or Carpet for Wood Tier.
		+ Smooth Stone, Polished Granite, -Andesite  or -Diorite for Stone Tier.
		+ Iron Block for Iron Tier.
		+ Diamond Block for Diamond Tier.
	+ Claw Tiers will deal damage relative to their sword counterparts, but attack faster and inflict less knockback making them effective in combos.
+ Food made from Fish is more nourishing.
	+ Hunger increased by 3 points.
	+ Saturation increased by 2 points.

#### Acrobatics [OM]

+ Felines have a chargeable high jump.
	+ Hold [Sneak] to charge the jump, press [Jump] to high jump.
		+ Can jump 2 to 6 blocks, depending on charge level, and add some forwards momentum.
		+ Cooldown: 3 seconds.
		+ Charge can be held for a few seconds after releasing [Sneak].

#### Weak Arms [OM]

+ Breaking stone blocks is half as fast and some tough stone blocks can't be broken when not under the effect of strength or using a pickaxe with efficiency.
	+ stone blocks include:
		+ Stone
		+ Coal Ore
		+ Copper Ore
		+ Iron Ore
		+ Gold Ore
		+ Redstone Ore
		+ Emerald Ore
		+ Lapis Ore
		+ Diamond Ore
		+ Ancient Debris
		+ Granite
		+ Diorite
		+ Andesite
		+ Sandstone
		+ Smooth Sandstone
		+ Red Sandstone
		+ Smooth Red Sandstone
		+ Smooth Basalt
		+ Calcite
		+ Block of Amethyst
		+ Budding Amethyst
		+ Tuff
		+ Dripstone Block
		+ Netherrack
		+ Basalt
		+ Magma Block
		+ End Stone

	+ Tough stone blocks include:
		+ Deepslate
		+ Reinforced Deepslate
		+ Deepslate Coal Ore
		+ Deepslate Iron Ore
		+ Deepslate Copper Ore
		+ Deepslate Gold Ore
		+ Deepslate Redstone Ore
		+ Deepslate Emerald Ore
		+ Deepslate Lapis Ore
		+ Deepslate Diamond Ore
		+ Obsidian
		+ Crying Obsidian
		+ Blackstone
		+ Gilded Blackstone

#### Nocturnal [OM]

+ Night Vision can be toggled with [Secondary].

</details>

<details><summary>Enderian</summary>

#### Teleportation [OM]

+ Teleporting via pearl grants an invincibility window against suffocation.

#### Slender Body [OM]

+ You are 2.5 Blocks tall and can reach 50% further.
+ Enderians will dodge projectiles.
	+ Cooldown: 5 seconds. 
	+ Teleports onto a random block within 8 blocks radius that is not air, bedrock or a fluid source block.

</details> 

<details><summary>Merling</summary>

#### Moisture
+ Merlings now have a body moisture resource which prevents drying out for a while.
	+ Body Moisture has 600 Units, which last for 10 minutes in The Overworld and The End, and 5 Minutes in The Nether.
	+ You can regain Moisture by stepping in water, standing in a water cauldron or drinking a bottle of water.
		+ Bottles of Water will refill 60 Units of Moisture.
+ Conduit Power lasts longer and delays drying out.
	+ Conduit Power will be extended to 5 Minutes when near an activated conduit and underwater.
	+ Conduit Power will prevent the Moisture bar from expiring while it's active.

#### Aquadynamic [OT]
+ Merlings can [craft tridents](https://cdn.modrinth.com/data/FRBxogjw/images/2d0819e26f5afce6716b9584f21c022b9175bc86.png).
+ Melee and Ranged attacks with Tridents deal more damage if the Merling is underwater.

#### Fins [OM]
+ Merlings can dash underwater while swimming.
	+ Cooldown: 5 seconds.
	+ This effect stacks with depth strider enchantments.

#### Aquatic [OM]
+ Merling's Natural Spawn point is located in ocean biomes.

</details>

<details><summary>Blazeborn</summary>

#### Burning Wrath [OM]

+ Press [Primary] to set yourself on fire.
	+ Lasts for 30 seconds.
	+ Can light Campfires or Fuel Furnei and Brewing stands while on fire.

#### Firecharged Projectile [OT]

+ Shoot a burst of Fireballs with [Secondary].
	+ Fires 3 Fireballs with no gravity. 
	+ Cooldown: 10 Seconds

#### Fire Immunity [OM]
+ Move slightly faster through lava
+ Improved Lava Vision comparable to the Fire Resistance Effect.
+ Can swim if submerged.

</details>

<details><summary>Phantom</summary>

#### Soulbound [OT]

+ Adds a Soul Energy Gauge needed to use certain abilities.
	+ Has 100 Units and regenerates within 50 Seconds.
	+ Additional Soul Energy will be regenerated when near Soulfire.
	+ Can also be recharged by killing mobs, with the amount of Soul Energy gained varying with the max health of the mob.
		+ 0.5 - 5 Hearts: 5 Soul Energy.
		+ 5.5 - 10 Hearts: 25 Soul Energy.
		+ 10.5 - 50 Health: 50 Soul Energy.
		+ 50+ Health (Usually Boss Mobs): Full Soul Energy.

#### Phantom Form [OM]

+ Removed Hunger requirements in exchange for Soul Energy.
	+ Phantom Form drains 0.5 Soul Energy per second.

#### Phase [OM]

+ Phasing up and down is now smoother, without halting at every block.
+ Phasing restricts several actions.
	+ Partial Phasing prevents sprinting, swimming and flying.
	+ Fully Phasing prevents attacking and interacting with blocks.
+ Drains 1.5 Soul Energy per second.

#### Spectral Wail [OT]

+ Can highlight living mobs using a Glowing Effect.
	+ Activate with the [Secondary] Key.
	+ Highlight Living Mobs in a 32 Block Radius.
	+ Last for 10 Seconds.
	+ Cooldown: 30 Seconds.

#### Aurophobia

+ Golden items and blocks have a repelling effect on phantoms.
	+ Can't eat Golden Apples, Enchanted Golden Apples or Golden Carrots.
	+ Can't wear golden Armor.
	+ Golden tools prevent mining and certain interactions with blocks.
	+ Can't phase through pure golden blocks.

</details>

## Built-in Mod Compat

+ Wood Types from [Terrestria](https://modrinth.com/mod/terrestria).
+ Wood Types from [Cinderscapes](https://modrinth.com/mod/cinderscapes).
+ Monuments from [Yung's Better Ocean Monuments](https://modrinth.com/mod/yungs-better-ocean-monuments).
+ Using [Overgrown's Origins: Dietary Delights](https://modrinth.com/datapack/origins-dietary-delights) to provide tagging of various modded foods.

## Bugs, Suggestions and Contribution

Found a bug, want to suggest a feature or mod compatibility?
Want to help in the Development of OriginsTweaks or add translations for a language you speak?
Have any other questions?

[Join OriginsTweaks on Discord](https://discord.gg/Su7tqDmUTu) | [Open an Issue on GitHub](https://github.com/ChromexUnderscore/OriginsTweaks/issues)
