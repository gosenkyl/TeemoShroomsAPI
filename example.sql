CREATE SCHEMA `teemo_shrooms` ;

USE `teemo_shrooms`;

CREATE TABLE `teemo_shrooms`.`CHAMPION` (
  `id` varchar(45) NOT NULL,
  `key` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  `image` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `teemo_shrooms`.`REFERENCE_DATA` (
  `id` VARCHAR(36) NOT NULL,
  `set_id` VARCHAR(45) NOT NULL,
  `key` VARCHAR(45) NOT NULL,
  `value` VARCHAR(45) NOT NULL,
  `order` INT NULL,
  `active_flag` TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `teemo_shrooms`.`USER` (
  `id` varchar(36) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `last_polled` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO CHAMPION VALUES ('Jax','24','Jax','Grandmaster at Arms','Jax.png');
INSERT INTO CHAMPION VALUES ('Sona','37','Sona','Maven of the Strings','Sona.png');
INSERT INTO CHAMPION VALUES ('Tristana','18','Tristana','the Yordle Gunner','Tristana.png');
INSERT INTO CHAMPION VALUES ('Varus','110','Varus','the Arrow of Retribution','Varus.png');
INSERT INTO CHAMPION VALUES ('Fiora','114','Fiora','the Grand Duelist','Fiora.png');
INSERT INTO CHAMPION VALUES ('Singed','27','Singed','the Mad Chemist','Singed.png');
INSERT INTO CHAMPION VALUES ('TahmKench','223','Tahm Kench','the River King','TahmKench.png');
INSERT INTO CHAMPION VALUES ('Leblanc','7','LeBlanc','the Deceiver','Leblanc.png');
INSERT INTO CHAMPION VALUES ('Thresh','412','Thresh','the Chain Warden','Thresh.png');
INSERT INTO CHAMPION VALUES ('Karma','43','Karma','the Enlightened One','Karma.png');
INSERT INTO CHAMPION VALUES ('Jhin','202','Jhin','the Virtuoso','Jhin.png');
INSERT INTO CHAMPION VALUES ('Rumble','68','Rumble','the Mechanized Menace','Rumble.png');
INSERT INTO CHAMPION VALUES ('Udyr','77','Udyr','the Spirit Walker','Udyr.png');
INSERT INTO CHAMPION VALUES ('LeeSin','64','Lee Sin','the Blind Monk','LeeSin.png');
INSERT INTO CHAMPION VALUES ('Yorick','83','Yorick','the Gravedigger','Yorick.png');
INSERT INTO CHAMPION VALUES ('Kassadin','38','Kassadin','the Void Walker','Kassadin.png');
INSERT INTO CHAMPION VALUES ('Sivir','15','Sivir','the Battle Mistress','Sivir.png');
INSERT INTO CHAMPION VALUES ('MissFortune','21','Miss Fortune','the Bounty Hunter','MissFortune.png');
INSERT INTO CHAMPION VALUES ('Draven','119','Draven','the Glorious Executioner','Draven.png');
INSERT INTO CHAMPION VALUES ('Yasuo','157','Yasuo','the Unforgiven','Yasuo.png');
INSERT INTO CHAMPION VALUES ('Kayle','10','Kayle','The Judicator','Kayle.png');
INSERT INTO CHAMPION VALUES ('Shaco','35','Shaco','the Demon Jester','Shaco.png');
INSERT INTO CHAMPION VALUES ('Renekton','58','Renekton','the Butcher of the Sands','Renekton.png');
INSERT INTO CHAMPION VALUES ('Hecarim','120','Hecarim','the Shadow of War','Hecarim.png');
INSERT INTO CHAMPION VALUES ('Fizz','105','Fizz','the Tidal Trickster','Fizz.png');
INSERT INTO CHAMPION VALUES ('KogMaw','96','Kog''Maw','the Mouth of the Abyss','KogMaw.png');
INSERT INTO CHAMPION VALUES ('Maokai','57','Maokai','the Twisted Treant','Maokai.png');
INSERT INTO CHAMPION VALUES ('Lissandra','127','Lissandra','the Ice Witch','Lissandra.png');
INSERT INTO CHAMPION VALUES ('Jinx','222','Jinx','the Loose Cannon','Jinx.png');
INSERT INTO CHAMPION VALUES ('Urgot','6','Urgot','the Headsman''s Pride','Urgot.png');
INSERT INTO CHAMPION VALUES ('Galio','3','Galio','the Sentinel''s Sorrow','Galio.png');
INSERT INTO CHAMPION VALUES ('Pantheon','80','Pantheon','the Artisan of War','Pantheon.png');
INSERT INTO CHAMPION VALUES ('Talon','91','Talon','the Blade''s Shadow','Talon.png');
INSERT INTO CHAMPION VALUES ('Gangplank','41','Gangplank','the Saltwater Scourge','Gangplank.png');
INSERT INTO CHAMPION VALUES ('Ezreal','81','Ezreal','the Prodigal Explorer','Ezreal.png');
INSERT INTO CHAMPION VALUES ('Gnar','150','Gnar','the Missing Link','Gnar.png');
INSERT INTO CHAMPION VALUES ('Teemo','17','Teemo','the Swift Scout','Teemo.png');
INSERT INTO CHAMPION VALUES ('Annie','1','Annie','the Dark Child','Annie.png');
INSERT INTO CHAMPION VALUES ('Mordekaiser','82','Mordekaiser','the Iron Revenant','Mordekaiser.png');
INSERT INTO CHAMPION VALUES ('Azir','268','Azir','the Emperor of the Sands','Azir.png');
INSERT INTO CHAMPION VALUES ('Kennen','85','Kennen','the Heart of the Tempest','Kennen.png');
INSERT INTO CHAMPION VALUES ('Riven','92','Riven','the Exile','Riven.png');
INSERT INTO CHAMPION VALUES ('Chogath','31','Cho''Gath','the Terror of the Void','Chogath.png');
INSERT INTO CHAMPION VALUES ('Aatrox','266','Aatrox','the Darkin Blade','Aatrox.png');
INSERT INTO CHAMPION VALUES ('Poppy','78','Poppy','Keeper of the Hammer','Poppy.png');
INSERT INTO CHAMPION VALUES ('Illaoi','420','Illaoi','the Kraken Priestess','Illaoi.png');
INSERT INTO CHAMPION VALUES ('Heimerdinger','74','Heimerdinger','the Revered Inventor','Heimerdinger.png');
INSERT INTO CHAMPION VALUES ('Alistar','12','Alistar','the Minotaur','Alistar.png');
INSERT INTO CHAMPION VALUES ('XinZhao','5','Xin Zhao','the Seneschal of Demacia','XinZhao.png');
INSERT INTO CHAMPION VALUES ('Lucian','236','Lucian','the Purifier','Lucian.png');
INSERT INTO CHAMPION VALUES ('Volibear','106','Volibear','the Thunder''s Roar','Volibear.png');
INSERT INTO CHAMPION VALUES ('Sejuani','113','Sejuani','the Winter''s Wrath','Sejuani.png');
INSERT INTO CHAMPION VALUES ('Nidalee','76','Nidalee','the Bestial Huntress','Nidalee.png');
INSERT INTO CHAMPION VALUES ('Garen','86','Garen','The Might of Demacia','Garen.png');
INSERT INTO CHAMPION VALUES ('Leona','89','Leona','the Radiant Dawn','Leona.png');
INSERT INTO CHAMPION VALUES ('Zed','238','Zed','the Master of Shadows','Zed.png');
INSERT INTO CHAMPION VALUES ('Blitzcrank','53','Blitzcrank','the Great Steam Golem','Blitzcrank.png');
INSERT INTO CHAMPION VALUES ('Rammus','33','Rammus','the Armordillo','Rammus.png');
INSERT INTO CHAMPION VALUES ('Velkoz','161','Vel''Koz','the Eye of the Void','Velkoz.png');
INSERT INTO CHAMPION VALUES ('Caitlyn','51','Caitlyn','the Sheriff of Piltover','Caitlyn.png');
INSERT INTO CHAMPION VALUES ('Trundle','48','Trundle','the Troll King','Trundle.png');
INSERT INTO CHAMPION VALUES ('Kindred','203','Kindred','The Eternal Hunters','Kindred.png');
INSERT INTO CHAMPION VALUES ('FiddleSticks','9','Fiddlesticks','the Harbinger of Doom','FiddleSticks.png');
INSERT INTO CHAMPION VALUES ('Quinn','133','Quinn','Demacia''s Wings','Quinn.png');
INSERT INTO CHAMPION VALUES ('Ekko','245','Ekko','the Boy Who Shattered Time','Ekko.png');
INSERT INTO CHAMPION VALUES ('Nami','267','Nami','the Tidecaller','Nami.png');
INSERT INTO CHAMPION VALUES ('Swain','50','Swain','the Master Tactician','Swain.png');
INSERT INTO CHAMPION VALUES ('Taric','44','Taric','the Gem Knight','Taric.png');
INSERT INTO CHAMPION VALUES ('Syndra','134','Syndra','the Dark Sovereign','Syndra.png');
INSERT INTO CHAMPION VALUES ('Skarner','72','Skarner','the Crystal Vanguard','Skarner.png');
INSERT INTO CHAMPION VALUES ('Braum','201','Braum','the Heart of the Freljord','Braum.png');
INSERT INTO CHAMPION VALUES ('Veigar','45','Veigar','the Tiny Master of Evil','Veigar.png');
INSERT INTO CHAMPION VALUES ('Xerath','101','Xerath','the Magus Ascendant','Xerath.png');
INSERT INTO CHAMPION VALUES ('Corki','42','Corki','the Daring Bombardier','Corki.png');
INSERT INTO CHAMPION VALUES ('Nautilus','111','Nautilus','the Titan of the Depths','Nautilus.png');
INSERT INTO CHAMPION VALUES ('Ahri','103','Ahri','the Nine-Tailed Fox','Ahri.png');
INSERT INTO CHAMPION VALUES ('Jayce','126','Jayce','the Defender of Tomorrow','Jayce.png');
INSERT INTO CHAMPION VALUES ('Darius','122','Darius','the Hand of Noxus','Darius.png');
INSERT INTO CHAMPION VALUES ('Tryndamere','23','Tryndamere','the Barbarian King','Tryndamere.png');
INSERT INTO CHAMPION VALUES ('Janna','40','Janna','the Storm''s Fury','Janna.png');
INSERT INTO CHAMPION VALUES ('Elise','60','Elise','the Spider Queen','Elise.png');
INSERT INTO CHAMPION VALUES ('Vayne','67','Vayne','the Night Hunter','Vayne.png');
INSERT INTO CHAMPION VALUES ('Brand','63','Brand','the Burning Vengeance','Brand.png');
INSERT INTO CHAMPION VALUES ('Graves','104','Graves','the Outlaw','Graves.png');
INSERT INTO CHAMPION VALUES ('Soraka','16','Soraka','the Starchild','Soraka.png');
INSERT INTO CHAMPION VALUES ('Karthus','30','Karthus','the Deathsinger','Karthus.png');
INSERT INTO CHAMPION VALUES ('Vladimir','8','Vladimir','the Crimson Reaper','Vladimir.png');
INSERT INTO CHAMPION VALUES ('Zilean','26','Zilean','the Chronokeeper','Zilean.png');
INSERT INTO CHAMPION VALUES ('Katarina','55','Katarina','the Sinister Blade','Katarina.png');
INSERT INTO CHAMPION VALUES ('Shyvana','102','Shyvana','the Half-Dragon','Shyvana.png');
INSERT INTO CHAMPION VALUES ('Warwick','19','Warwick','the Blood Hunter','Warwick.png');
INSERT INTO CHAMPION VALUES ('Ziggs','115','Ziggs','the Hexplosives Expert','Ziggs.png');
INSERT INTO CHAMPION VALUES ('Khazix','121','Kha''Zix','the Voidreaver','Khazix.png');
INSERT INTO CHAMPION VALUES ('Olaf','2','Olaf','the Berserker','Olaf.png');
INSERT INTO CHAMPION VALUES ('TwistedFate','4','Twisted Fate','the Card Master','TwistedFate.png');
INSERT INTO CHAMPION VALUES ('Nunu','20','Nunu','the Yeti Rider','Nunu.png');
INSERT INTO CHAMPION VALUES ('Rengar','107','Rengar','the Pridestalker','Rengar.png');
INSERT INTO CHAMPION VALUES ('Bard','432','Bard','the Wandering Caretaker','Bard.png');
INSERT INTO CHAMPION VALUES ('Irelia','39','Irelia','the Will of the Blades','Irelia.png');
INSERT INTO CHAMPION VALUES ('MonkeyKing','62','Wukong','the Monkey King','MonkeyKing.png');
INSERT INTO CHAMPION VALUES ('Ashe','22','Ashe','the Frost Archer','Ashe.png');
INSERT INTO CHAMPION VALUES ('Kalista','429','Kalista','the Spear of Vengeance','Kalista.png');
INSERT INTO CHAMPION VALUES ('Akali','84','Akali','the Fist of Shadow','Akali.png');
INSERT INTO CHAMPION VALUES ('Vi','254','Vi','the Piltover Enforcer','Vi.png');
INSERT INTO CHAMPION VALUES ('Amumu','32','Amumu','the Sad Mummy','Amumu.png');
INSERT INTO CHAMPION VALUES ('Lulu','117','Lulu','the Fae Sorceress','Lulu.png');
INSERT INTO CHAMPION VALUES ('Morgana','25','Morgana','Fallen Angel','Morgana.png');
INSERT INTO CHAMPION VALUES ('Nocturne','56','Nocturne','the Eternal Nightmare','Nocturne.png');
INSERT INTO CHAMPION VALUES ('Diana','131','Diana','Scorn of the Moon','Diana.png');
INSERT INTO CHAMPION VALUES ('Zyra','143','Zyra','Rise of the Thorns','Zyra.png');
INSERT INTO CHAMPION VALUES ('Viktor','112','Viktor','the Machine Herald','Viktor.png');
INSERT INTO CHAMPION VALUES ('Cassiopeia','69','Cassiopeia','the Serpent''s Embrace','Cassiopeia.png');
INSERT INTO CHAMPION VALUES ('Nasus','75','Nasus','the Curator of the Sands','Nasus.png');
INSERT INTO CHAMPION VALUES ('Twitch','29','Twitch','the Plague Rat','Twitch.png');
INSERT INTO CHAMPION VALUES ('DrMundo','36','Dr. Mundo','the Madman of Zaun','DrMundo.png');
INSERT INTO CHAMPION VALUES ('Orianna','61','Orianna','the Lady of Clockwork','Orianna.png');
INSERT INTO CHAMPION VALUES ('Evelynn','28','Evelynn','the Widowmaker','Evelynn.png');
INSERT INTO CHAMPION VALUES ('RekSai','421','Rek''Sai','the Void Burrower','RekSai.png');
INSERT INTO CHAMPION VALUES ('Lux','99','Lux','the Lady of Luminosity','Lux.png');
INSERT INTO CHAMPION VALUES ('Sion','14','Sion','The Undead Juggernaut','Sion.png');
INSERT INTO CHAMPION VALUES ('MasterYi','11','Master Yi','the Wuju Bladesman','MasterYi.png');
INSERT INTO CHAMPION VALUES ('Ryze','13','Ryze','the Rogue Mage','Ryze.png');
INSERT INTO CHAMPION VALUES ('Malphite','54','Malphite','Shard of the Monolith','Malphite.png');
INSERT INTO CHAMPION VALUES ('Anivia','34','Anivia','the Cryophoenix','Anivia.png');
INSERT INTO CHAMPION VALUES ('Shen','98','Shen','the Eye of Twilight','Shen.png');
INSERT INTO CHAMPION VALUES ('JarvanIV','59','Jarvan IV','the Exemplar of Demacia','JarvanIV.png');
INSERT INTO CHAMPION VALUES ('Malzahar','90','Malzahar','the Prophet of the Void','Malzahar.png');
INSERT INTO CHAMPION VALUES ('Zac','154','Zac','the Secret Weapon','Zac.png');
INSERT INTO CHAMPION VALUES ('Gragas','79','Gragas','the Rabble Rouser','Gragas.png');

INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'kr', 'Korea', 10, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'na', 'Korea', 20, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'br', 'Brazil', 30, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'oce', 'Oceania', 40, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'tr', 'Turkey', 50, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'rus', 'Russia', 60, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'lan', 'Latin America North', 70, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'las', 'Latin America South', 80, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'ene', 'Europe East & Nordic', 90, 1);
INSERT INTO REFERENCE_DATA VALUES (UUID(), 'Server', 'euw', 'Europe West', 100, 1);