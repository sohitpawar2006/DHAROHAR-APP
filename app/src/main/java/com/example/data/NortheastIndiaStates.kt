package com.example.data

object NortheastIndiaStates {
    val all: List<IndianState> = listOf(
        IndianState(
            id = "sikkim",
            name = "Sikkim",
            hindiName = "सिक्किम",
            capital = "Gangtok",
            region = "Northeast",
            tagline = "In the Shadow of Kangchenjunga • Buddhist Sanctum",
            description = "Nestled beneath Mt. Kangchenjunga, Sikkim is India's first 100% organic state, graced by sacred high-altitude alpine lakes, golden-roofed Buddhist monasteries, and vibrant Tibetan mask dances.",
            heroImageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.69f,
            mapY = 0.28f,
            colorHex = 0xFF0D9488, // Himalayan Jade Teal
            iconicHighlight = "Rumtek Monastery • Tsomgo Lake • Singhi Chham Dance",
            danceHighlight = "Singhi Chham (Snow Lion Dance)",
            musicHighlight = "Lepcha & Bhutia Folk Flutes",
            foodHighlight = "Steamed Momos, Thukpa, Gundruk & Kinema",
            heritageCount = 11,
            places = listOf(
                Place(
                    id = "sk_rumtek",
                    name = "Rumtek Dharma Chakra Centre",
                    city = "Rumtek, Gangtok",
                    state = "Sikkim",
                    imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=1000&q=80",
                    description = "Magnificent Tibetan Buddhist monastery seat of the Karma Kagyu lineage, housing priceless sacred golden stupas, thangkas, and murals.",
                    culturalSignificance = "Rebuilt in the 1960s by the 16th Karmapa, replicating the ancient Tsurphu Monastery of Tibet.",
                    tags = listOf("Kagyu Monastery", "Golden Stupa", "Tibetan Heritage"),
                    nearbyAttractions = listOf("Gangtok Ropeway", "Enchey Monastery", "Nathu La Pass"),
                    localFoodRecommendation = "Authentic pan-fried pork or cheese Momos with fiery Dalle Khursani chili sauce"
                ),
                Place(
                    id = "sk_tsomgo",
                    name = "Tsomgo (Changu) Lake",
                    city = "East Sikkim",
                    state = "Sikkim",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "Sacred glacial lake perched at 12,310 ft that reflects the surrounding snow-capped peaks, changing color across the seasons.",
                    culturalSignificance = "Revered as sacred by Buddhist lamas who traditionally studied the water colors to forecast the year ahead.",
                    tags = listOf("Sacred Alpine Lake", "Yak Rides", "Himalayan Pass"),
                    nearbyAttractions = listOf("Baba Harbhajan Singh Mandir", "Nathu La", "Kyongnosla"),
                    localFoodRecommendation = "Hot bowl of vegetable Thukpa with local fermented cheese"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "sk_trad_carpet",
                    name = "Sikkimese Hand-Knotted Woolen Carpets",
                    state = "Sikkim",
                    category = "High-Altitude Handloom",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Woven on vertical wooden frame looms using pure Tibetan highland sheep wool dyed with natural plant extracts.",
                    isEndangered = false,
                    preservationStatus = "Directorate of Handicrafts Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "sk_dance_singhi",
                    name = "Singhi Chham (Snow Lion Dance)",
                    state = "Sikkim",
                    origin = "Bhutia Culture",
                    description = "Vibrant mythical dance depicting the majestic Snow Lion, the protector deity of Kangchenjunga and symbol of bravery.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Furry white Snow Lion body costume with turquoise mane and expressive wooden mask",
                    accompaniment = "Cymbals, monastic horns (Gyaling), double-headed drums"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "sk_music_lepcha",
                    title = "Lepcha Mountain Folk Songs",
                    region = "Dzongu & North Sikkim",
                    state = "Sikkim",
                    instruments = "Palit (Bamboo flute), Tungbuk (Strummed lute)",
                    description = "Gentle acoustic hymns celebrating sacred mountains, rivers, and butterflies composed by the indigenous Lepcha tribe.",
                    audioDuration = "3:40",
                    genre = "Indigenous Mountain Melody",
                    name = "Lepcha Melodies"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "sk_food_momos",
                    name = "Sikkimese Momos & Gundruk Soup",
                    state = "Sikkim",
                    description = "Hand-pinched steamed dumplings filled with spiced organic vegetables or meat, accompanied by Gundruk fermented mustard-leaf soup and fiery fiery Dalle paste.",
                    isVeg = true,
                    whereToTry = "Taste of Tibet & Roll House, MG Marg, Gangtok",
                    imageUrl = "https://images.unsplash.com/photo-1569718212165-3a8278d5f624?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Juicy Steamed Parcel, Sour Fermented Broth, Scintillating Chili"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "sk_rest_taste",
                    name = "Taste of Tibet",
                    city = "MG Marg, Gangtok",
                    state = "Sikkim",
                    cuisine = "Authentic Tibetan & Himalayan Sikkimese",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Beloved institution on pedestrian MG Marg serving the juiciest steamed momos, Thenthuk, and butter tea.",
                    mustTryDish = "Sha Phaley with Dalle Chutney"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "sk_event_losar",
                    name = "Losar (Tibetan New Year)",
                    location = "Rumtek & Pemayangtse Monasteries",
                    state = "Sikkim",
                    dateText = "February / March",
                    category = "Monastic New Year",
                    imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=800&q=80",
                    description = "15-day celebration with special monastic Cham dances, prayer flags hoisted on mountain ridges, and feasting."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving Indigenous Lepcha Script & Lepcha Handloom",
                craftOrTradition = "Lepcha Backstrap Weaving",
                community = "Dzongu Lepcha Reserve Elders",
                challenge = "Erosion of tribal language and traditional cotton backstrap looms by fast fashion.",
                preservationAction = "Tribal cultural preservation schools and organic eco-tourism."
            )
        ),
        IndianState(
            id = "assam",
            name = "Assam",
            hindiName = "असम",
            capital = "Dispur",
            region = "Northeast",
            tagline = "Land of the Red River & Blue Hills • Bihu & Tea",
            description = "Bisected by the mighty Brahmaputra River, Assam is world-renowned for golden Muga silk, the one-horned rhinoceros sanctuary of Kaziranga, sweet tea estates, and spirited Bihu dances.",
            heroImageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.82f,
            mapY = 0.33f,
            colorHex = 0xFF15803D, // Lush Tea Green
            iconicHighlight = "Kaziranga Rhino Sanctuary • Kamakhya Temple • Rongali Bihu",
            danceHighlight = "Rongali Bihu & Sattriya Classical Dance",
            musicHighlight = "Bihu Geet & Tokari Geet",
            foodHighlight = "Masor Tenga, Khaar, Pitha & Assam CTC Tea",
            heritageCount = 14,
            places = listOf(
                Place(
                    id = "as_kaziranga",
                    name = "Kaziranga National Park",
                    city = "Golaghat & Nagaon",
                    state = "Assam",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1000&q=80",
                    description = "UNESCO World Heritage wildlife haven harboring two-thirds of the world's great one-horned rhinoceroses in tall elephant grass floodplains.",
                    culturalSignificance = "Global conservation triumph celebrated in Assamese folklore, music, and royal Ahom chronicles.",
                    tags = listOf("UNESCO World Heritage", "One-Horned Rhino", "Brahmaputra Floodplains"),
                    nearbyAttractions = listOf("Majuli Island", "Hoollongapar Gibbon Sanctuary", "Tea Gardens"),
                    localFoodRecommendation = "Assamese Duck Curry with Ash Gourd (Kumura)"
                ),
                Place(
                    id = "as_kamakhya",
                    name = "Maa Kamakhya Temple",
                    city = "Guwahati",
                    state = "Assam",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "Ancient Shakti Peetha atop Nilachal Hill with distinct beehive-shaped Shikhara, dedicated to the mother goddess.",
                    culturalSignificance = "One of India's oldest and most sacred centers of Tantric worship and the annual Ambubachi Mela.",
                    tags = listOf("Shakti Peetha", "Nilachal Hill", "Ambubachi"),
                    nearbyAttractions = listOf("Umananda River Island", "Brahmaputra Ropeway"),
                    localFoodRecommendation = "Masor Tenga (Tangy Fish Curry) with Joha Rice"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "as_trad_muga",
                    name = "Golden Muga & Eri Silk Handloom",
                    state = "Assam",
                    category = "Royal Silk Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Luminous natural golden silk produced exclusively in Assam by the semi-domesticated silkworm Antheraea assamensis, lasting generations.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "as_dance_bihu",
                    name = "Bihu Folk Dance",
                    state = "Assam",
                    origin = "Brahmaputra Valley",
                    description = "Celebration of youth and harvest characterized by rapid hand movements, joyful swaying of hips, and exuberant footwork.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Muga silk Mekhela Chador with red floral borders, Kopou Phool (orchid) in hair",
                    accompaniment = "Dhol (drum), Pepa (buffalo-horn pipe), Gogona, Taal"
                ),
                DanceItem(
                    id = "as_dance_sattriya",
                    name = "Sattriya Classical Dance",
                    state = "Assam",
                    origin = "Majuli Island Sattras (Monasteries)",
                    description = "500-year-old classical dance drama created by saint-reformer Mahapurush Srimanta Sankardev depicting devotional Vaishnava themes.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "White and gold Pat silk attire, Kanchi waist ornament, Assamese jewelry",
                    accompaniment = "Khol (earthen drum), Bor-taal cymbals, Flute"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "as_music_pepa",
                    title = "Bihu Geet & Pepa Melodies",
                    region = "Upper Assam",
                    state = "Assam",
                    instruments = "Pepa (Buffalo horn), Dhol, Tokari (Folk lute)",
                    description = "High-spirited, lilting spring harvest love songs echoing across golden paddy fields.",
                    audioDuration = "4:15",
                    genre = "Spring Harvest Folk",
                    name = "Bihu Sangeet"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "as_food_masor_tenga",
                    name = "Masor Tenga with Joha Rice",
                    state = "Assam",
                    description = "Light and refreshing sour freshwater fish curry made with outenga (elephant apple) or tomatoes, tempered with fenugreek and mustard oil.",
                    isVeg = false,
                    whereToTry = "Paradise Restaurant & Khorikaa, Guwahati",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Delicately Sour, Herbaceous, Mustard Oil Fragrance"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "as_rest_paradise",
                    name = "Paradise Restaurant Since 1984",
                    city = "Silpukhuri, Guwahati",
                    state = "Assam",
                    cuisine = "Authentic Assamese Indigenous Thali",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Pioneers of bringing indigenous Assamese cuisine served on traditional bell-metal (Kanh) plates.",
                    mustTryDish = "Parampara Thali with Masor Tenga & Khar"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "as_event_rongali",
                    name = "Rongali (Bohag) Bihu Festival",
                    location = "Across Assam",
                    state = "Assam",
                    dateText = "Mid-April (7 Days)",
                    category = "New Year & Spring Arrival",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=800&q=80",
                    description = "Seven days of cattle bathing (Goru Bihu), gifting handwoven Gamosa scarves, and dancing under blooming orchids."
                )
            ),
            preservationStory = PreservationStory(
                title = "Saving the Mask-Making Monks of Majuli",
                craftOrTradition = "Mukha (Bamboo-Mud Mask Making)",
                community = "Samaguri Satra Monks, Majuli Island",
                challenge = "Erosion of Majuli river island and synthetic theater props risking ancient mask legacy.",
                preservationAction = "Monastery digital apprenticeships and international museum collaborations."
            )
        ),
        IndianState(
            id = "arunachal_pradesh",
            name = "Arunachal Pradesh",
            hindiName = "अरुणाचल प्रदेश",
            capital = "Itanagar",
            region = "Northeast",
            tagline = "Land of the Dawn-Lit Mountains • Tawang & Ziro",
            description = "The first Indian soil greeted by the morning sun, Arunachal is an untouched frontier of dramatic Himalayan peaks, the magnificent 17th-century Tawang Monastery, 26 distinct indigenous tribes, and pristine alpine valleys.",
            heroImageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.87f,
            mapY = 0.26f,
            colorHex = 0xFF0284C7, // Alpine Glacial Blue
            iconicHighlight = "Tawang Monastery • Sela Pass • Ziro Valley Apatani",
            danceHighlight = "Bardo Chham & Aji Lamu Dance",
            musicHighlight = "Indigenous Folk Chants & Bamboo Flutes",
            foodHighlight = "Lukter, Thukpa, Zan & Bamboo Shoot fry",
            heritageCount = 10,
            places = listOf(
                Place(
                    id = "ar_tawang",
                    name = "Tawang Monastery (Galden Namgyal Lhatse)",
                    city = "Tawang",
                    state = "Arunachal Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=1000&q=80",
                    description = "The largest Buddhist monastery in India and second largest in the world, founded in 1681 CE at 10,000 ft overlooking the Tawang Chu valley.",
                    culturalSignificance = "Birthplace of the 6th Dalai Lama, housing an 18-foot gilded Buddha statue and thousands of ancient block-printed scriptures.",
                    tags = listOf("Largest Indian Monastery", "Gelugpa Buddhism", "High Altitude"),
                    nearbyAttractions = listOf("Sela Pass & Lake", "Madhuri (Sangetsar) Lake", "Urgelling"),
                    localFoodRecommendation = "Steaming Zan millet porridge with roasted meat and wild chilies"
                ),
                Place(
                    id = "ar_ziro",
                    name = "Ziro Valley & Apatani Cultural Landscape",
                    city = "Ziro, Lower Subansiri",
                    state = "Arunachal Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "Stunning valley home to the Apatani tribe, world-renowned for their unique eco-friendly fish-and-paddy co-cultivation and bamboo groves.",
                    culturalSignificance = "UNESCO tentative list site recognized for pioneering harmonious co-existence with nature and facial tattoo traditions.",
                    tags = listOf("Apatani Heritage", "Paddy-cum-Pisciculture", "Ziro Music Festival"),
                    nearbyAttractions = listOf("Tarin Fish Farm", "Kardo Shiva Lingam", "Talley Valley"),
                    localFoodRecommendation = "Pike Pila with smoked pork and tender bamboo shoots"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ar_trad_thangka",
                    name = "Monpa Handmade Daphne Paper & Wood Carving",
                    state = "Arunachal Pradesh",
                    category = "Monastic Craft",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient chemical-free paper made from the inner bark of the wild Daphne shrub (Sukso), used for centuries to print Buddhist prayers.",
                    isEndangered = true,
                    preservationStatus = "Khadi & Village Industries Revival"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ar_dance_bardo",
                    name = "Bardo Chham Folk Dance",
                    state = "Arunachal Pradesh",
                    origin = "Sherdukpen Community",
                    description = "Vibrant mask dance portraying the victory of good forces over evil animal spirits throughout the 12 calendar months.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Bright animal masks representing birds, stags, and monkeys, flowing silk coats",
                    accompaniment = "Nagada drum and bronze cymbals"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ar_music_monpa",
                    title = "Monpa High Mountain Chants",
                    region = "Tawang & West Kameng",
                    state = "Arunachal Pradesh",
                    instruments = "Cymbals, Monastic long horns, Bamboo flute",
                    description = "Sacred monastic choral chants reverberating across mountain passes.",
                    audioDuration = "4:40",
                    genre = "Sacred Himalayan",
                    name = "Arunachal Chants"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ar_food_lukter",
                    name = "Arunachali Lukter & Chura Sabzi",
                    state = "Arunachal Pradesh",
                    description = "Spiced combination of pounded dry meat flakes tossed with fiery Raja Mircha chilies, alongside fermented yak-milk cheese (Churpi) curry with greens.",
                    isVeg = false,
                    whereToTry = "Traditional homestays in Tawang & Ziro",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Pungent Fermented Cheese, Smoky Dried Meat, Extreme Heat"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ar_rest_dragon",
                    name = "Dragon Restaurant",
                    city = "Old Market, Tawang",
                    state = "Arunachal Pradesh",
                    cuisine = "Authentic Monpa & Tibetan",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Warm wood-paneled culinary favorite offering hearty noodle bowls, steaming momos, and hot butter tea.",
                    mustTryDish = "Kothey Momos with Butter Tea"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ar_event_torgya",
                    name = "Torgya Monastic Festival",
                    location = "Tawang Monastery Courtyard",
                    state = "Arunachal Pradesh",
                    dateText = "January (3 Days)",
                    category = "Monastic Defense Festival",
                    imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=800&q=80",
                    description = "Three-day celebration featuring elaborate sacred mask dances to chase away destructive forces and pray for prosperity."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving Daphne Handmade Paper at Tawang",
                craftOrTradition = "Monpa Daphne Paper Making",
                community = "Mukto Village Artisans",
                challenge = "Almost went extinct when cheap mill paper flooded monasteries.",
                preservationAction = "KVIC revived factory center employing local tribal youth."
            )
        ),
        IndianState(
            id = "meghalaya",
            name = "Meghalaya",
            hindiName = "मेघालय",
            capital = "Shillong",
            region = "Northeast",
            tagline = "Abode of Clouds • Living Root Bridges & Waterfalls",
            description = "Where rainfall creates wonders: world-famous centuries-old bio-engineered Living Root Bridges, Asia's cleanest village at Mawlynnong, deep limestone caves, and a rich matrilineal Khasi, Garo, and Jaintia tribal heritage.",
            heroImageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.78f,
            mapY = 0.37f,
            colorHex = 0xFF047857, // Raincloud Emerald
            iconicHighlight = "Double Decker Living Root Bridge • Nohkalikai Falls • Dawki Crystal River",
            danceHighlight = "Shad Suk Mynsiem & Wangala 100 Drums",
            musicHighlight = "Khasi Folk Ballads & Shillong Rock",
            foodHighlight = "Jadoh, Dohkhlieh, Tungrymbai & Pumaloi",
            heritageCount = 12,
            places = listOf(
                Place(
                    id = "ml_root_bridges",
                    name = "Cherrapunji Double Decker Living Root Bridge",
                    city = "Nongriat, Sohra",
                    state = "Meghalaya",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "A bio-engineering marvel grown by Khasi tribes by guiding the aerial roots of Ficus elastica trees across roaring mountain streams over centuries.",
                    culturalSignificance = "UNESCO World Heritage tentative list, growing stronger with every monsoon rather than deteriorating.",
                    tags = listOf("Bio-Engineering", "Living Root Bridges", "Ficus Elastica"),
                    nearbyAttractions = listOf("Nohkalikai Falls", "Mawsmai Cave", "Seven Sisters Falls"),
                    localFoodRecommendation = "Jadoh with hot peppered pork/vegetable curry"
                ),
                Place(
                    id = "ml_dawki",
                    name = "Dawki & Umngot River",
                    city = "Dawki, West Jaintia Hills",
                    state = "Meghalaya",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1000&q=80",
                    description = "Crystal-clear emerald river so transparent that wooden fishing boats appear suspended mid-air above the pebbled riverbed.",
                    culturalSignificance = "Ancient trading crossing between India and Bangladesh celebrating community river regattas.",
                    tags = listOf("Crystal River", "Boating", "Natural Wonder"),
                    nearbyAttractions = listOf("Mawlynnong Cleanest Village", "Krang Suri Falls"),
                    localFoodRecommendation = "Fried river fish with steaming local red rice"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ml_trad_matrilineal",
                    name = "Matrilineal Clan Heritage & Sacred Groves",
                    state = "Meghalaya",
                    category = "Indigenous Social Fabric",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "One of the world's few surviving matrilineal societies where lineage and ancestral property pass down from mother to youngest daughter (Khadduh).",
                    isEndangered = false,
                    preservationStatus = "Living Societal Culture"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ml_dance_wangala",
                    name = "Wangala (100 Drums Festival Dance)",
                    state = "Meghalaya",
                    origin = "Garo Hills",
                    description = "Post-harvest thanksgiving dance honoring Misi Saljong, where 100 long cylindrical drums beat together in thunderous rhythm.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Dakmanda woven wrap, Kotip feathered turban headgear",
                    accompaniment = "Kram long wooden drums, buffalo-horn flutes, brass gongs"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ml_music_khasi",
                    title = "Duitara & Khasi Folk Songs",
                    region = "Khasi Hills",
                    state = "Meghalaya",
                    instruments = "Duitara (Two-stringed lute), Ka Bom drum, Flute",
                    description = "Melodious acoustic string music recounting oral ancestral legends and monsoon rains.",
                    audioDuration = "3:50",
                    genre = "Khasi Acoustic Folk",
                    name = "Khasi Duitara"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ml_food_jadoh",
                    name = "Khasi Jadoh with Dohkhlieh",
                    state = "Meghalaya",
                    description = "Aromatic short-grained red rice cooked with fragrant meat broth, bay leaves, ginger, black sesame seeds, and mild hill spices.",
                    isVeg = false,
                    whereToTry = "Trattoria & Police Bazar Khasi Stalls, Shillong",
                    imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Savory, Black Sesame Earthiness, Tender Simmered Rice"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ml_rest_trattoria",
                    name = "Trattoria Khasi Kitchen",
                    city = "Police Bazar, Shillong",
                    state = "Meghalaya",
                    cuisine = "Authentic Khasi Tribal Comfort Food",
                    rating = 4.8f,
                    priceIndicator = "₹",
                    description = "Tiny no-frills culinary jewel in Police Bazar, revered by locals for genuine Jadoh, Dohneiiong (pork with black sesame), and Tungrymbai.",
                    mustTryDish = "Jadoh with Dohneiiong"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ml_event_shadsuk",
                    name = "Shad Suk Mynsiem (Dance of Joyful Hearts)",
                    location = "Weiking Ground, Shillong",
                    state = "Meghalaya",
                    dateText = "April (Spring)",
                    category = "Thanksgiving Festival",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=800&q=80",
                    description = "Annual thanksgiving dance where maiden dancers in solid silver crowns and colorful silk dresses circle gracefully around male warriors."
                )
            ),
            preservationStory = PreservationStory(
                title = "Protecting the Living Root Bridges of Sohra",
                craftOrTradition = "Ficus Elastica Root Guilding",
                community = "Nongriat & Kudeng Rim Villagers",
                challenge = "Tourism foot-traffic and metal replacements threatening slow century-long root growth.",
                preservationAction = "UNESCO World Heritage nomination and indigenous community guardianship."
            )
        ),
        IndianState(
            id = "nagaland",
            name = "Nagaland",
            hindiName = "नागालैंड",
            capital = "Kohima",
            region = "Northeast",
            tagline = "Land of Festivals • Hornbill & Brave Naga Warriors",
            description = "A rugged hill country of 16 distinct tribes, each with intricate handloom shawls, warrior heritage, and the world-famous annual Hornbill Festival celebrated in the heritage village of Kisama.",
            heroImageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.89f,
            mapY = 0.34f,
            colorHex = 0xFFDC2626, // Crimson Naga Shawl
            iconicHighlight = "Hornbill Festival • Dzukou Valley • Khonoma Green Village",
            danceHighlight = "Chang Lo & Naga Warrior Victory Dance",
            musicHighlight = "Naga Choral Harmony & Log Drums",
            foodHighlight = "Smoked Pork with Fermented Bamboo Shoot & Axone",
            heritageCount = 11,
            places = listOf(
                Place(
                    id = "nl_kisama",
                    name = "Kisama Naga Heritage Village",
                    city = "Kohima",
                    state = "Nagaland",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=1000&q=80",
                    description = "Living open-air museum preserving authentic traditional Morung communal dormitories, carved wooden pillars, and war drums representing every Naga tribe.",
                    culturalSignificance = "Epicenter of the Hornbill Festival ('Festival of Festivals') held every December.",
                    tags = listOf("Hornbill Village", "Morung Dormitories", "Tribal Union"),
                    nearbyAttractions = listOf("Kohima War Cemetery", "Dzukou Valley", "Khonoma"),
                    localFoodRecommendation = "Smoked pork with Raja Mircha and fermented bamboo shoot"
                ),
                Place(
                    id = "nl_khonoma",
                    name = "Khonoma Green Village",
                    city = "Kohima District",
                    state = "Nagaland",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "Asia's first green village, famed for its fierce historical resistance against British colonial expansion and community ban on logging and hunting.",
                    culturalSignificance = "Angami Naga warrior village with 700-year-old carved stone forts and stepped terraced organic cultivation.",
                    tags = listOf("First Green Village", "Angami Tribe", "Terrace Farming"),
                    nearbyAttractions = listOf("Tragopan Sanctuary", "Dzukou Valley Trek"),
                    localFoodRecommendation = "Steamed sticky rice cakes with Axone chutney"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "nl_trad_shawls",
                    name = "Naga Tribal Shawl Weaving",
                    state = "Nagaland",
                    category = "Identity Textile Art",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Woven on backstrap body-tension looms, the color and geometric motifs denote the wearer's specific tribe, valor, and social status.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "nl_dance_warrior",
                    name = "Naga Warrior Victory Dance",
                    state = "Nagaland",
                    origin = "Naga Tribal Communities",
                    description = "Powerful rhythmic war dance celebrating victory, featuring synchronized leaps, brandishing spears and dao swords with guttural war cries.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Hornbill feather headdresses, boar-tusk neckpieces, red wool kilts, brass armbands",
                    accompaniment = "Giant carved hollow log drums (Sungkong) and unison choral chants"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "nl_music_choral",
                    title = "Naga Polyphonic Choral Harmony",
                    region = "Kohima & Phek",
                    state = "Nagaland",
                    instruments = "Acoustic Guitar, Log Drums, Flute",
                    description = "Stunning four-part polyphonic harmonies blending traditional tribal chants with Western choral precision.",
                    audioDuration = "4:30",
                    genre = "Polyphonic Choral",
                    name = "Naga Choral"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "nl_food_smoked_pork",
                    name = "Smoked Meat with Axone & Raja Mircha",
                    state = "Nagaland",
                    description = "Slow wood-smoke cured meat simmered with fermented soybeans (Axone), crushed ghost pepper (Bhut Jolokia/Raja Mircha), and local wild herbs.",
                    isVeg = false,
                    whereToTry = "Morung stalls at Kisama & Naga kitchens in Kohima",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Intense Smoky Aroma, Deep Umami Fermentation, Fiery Heat"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "nl_rest_dzu",
                    name = "Dzüvürü Naga Kitchen",
                    city = "Kohima",
                    state = "Nagaland",
                    cuisine = "Authentic Naga Indigenous Fare",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Warm authentic Naga dining serving tender smoked pork with bamboo shoot, Galho (savory sticky rice porridge), and Axone chutney.",
                    mustTryDish = "Pork with Axone & Galho"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "nl_event_hornbill",
                    name = "Hornbill Festival (Festival of Festivals)",
                    location = "Kisama Heritage Village, Kohima",
                    state = "Nagaland",
                    dateText = "December 1 – 10",
                    category = "Pan-Naga Mega Festival",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    description = "Ten-day mega event where all 16 Naga tribes showcase traditional dances, indigenous games, crafts, music, and chili-eating contests."
                )
            ),
            preservationStory = PreservationStory(
                title = "Documenting the Hollow Log Drums of Nagaland",
                craftOrTradition = "Village Log Drum Carving",
                community = "Konyak & Ao Naga Elders",
                challenge = "Logging bans and Westernization leading to fewer craftsmen capable of felling and hollowing monumental community log drums.",
                preservationAction = "Audio acoustic mapping and tribal digital archives."
            )
        ),
        IndianState(
            id = "manipur",
            name = "Manipur",
            hindiName = "मणिपुर",
            capital = "Imphal",
            region = "Northeast",
            tagline = "Jewel of India • Loktak Lake & Classical Raas Leela",
            description = "Famed as the birthplace of modern Polo (Sagol Kangjei), Manipur is home to the world's only floating national park on Loktak Lake, ethereal Manipuri Classical Dance, and the historic all-women's market of Ima Keithel.",
            heroImageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.88f,
            mapY = 0.40f,
            colorHex = 0xFF7C3AED, // Royal Orchid Purple
            iconicHighlight = "Loktak Floating Phumdis • Ima Keithel Market • Classical Raas Leela",
            danceHighlight = "Manipuri Classical Dance & Pung Cholom",
            musicHighlight = "Pena Bowed Lute & Nat Sankirtana",
            foodHighlight = "Kangshoi, Eromba, Singju & Black Rice Kheer (Chak-hao)",
            heritageCount = 12,
            places = listOf(
                Place(
                    id = "mn_loktak",
                    name = "Loktak Lake & Keibul Lamjao",
                    city = "Moirang, Bishnupur",
                    state = "Manipur",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1000&q=80",
                    description = "The largest freshwater lake in Northeast India, famed for circular floating biomass islands called 'Phumdis' and the world's only floating national park sheltering the endangered Sangai dancing deer.",
                    culturalSignificance = "Sacred lake in Meitei cosmology, vital source of fishing and cultural folklore.",
                    tags = listOf("Freshwater Lake", "Floating Phumdis", "Sangai Deer Sanctuary"),
                    nearbyAttractions = listOf("INA Memorial Moirang", "Sendra Island", "Kangla Fort"),
                    localFoodRecommendation = "Spicy Eromba with mashed fish and fermented bamboo shoot"
                ),
                Place(
                    id = "mn_ima_keithel",
                    name = "Ima Keithel (Mother's Market)",
                    city = "Imphal",
                    state = "Manipur",
                    imageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=1000&q=80",
                    description = "500-year-old market run entirely by over 5,000 married women, making it the largest all-female marketplace in the world.",
                    culturalSignificance = "Historic symbol of female leadership, political activism, and economic empowerment in Manipur.",
                    tags = listOf("All-Women Market", "500-Year Heritage", "Textiles & Produce"),
                    nearbyAttractions = listOf("Kangla Fort", "Govindaji Temple", "Polo Ground"),
                    localFoodRecommendation = "Crisp spicy Singju cabbage salad and Chak-hao Kheer"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "mn_trad_thang_ta",
                    name = "Thang-Ta Martial Art",
                    state = "Manipur",
                    category = "Martial Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient Meitei sword (Thang) and spear (Ta) martial art integrating physical agility with breath control and spiritual energy.",
                    isEndangered = false,
                    preservationStatus = "National Heritage Sport"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "mn_dance_raas",
                    name = "Manipuri Classical Raas Leela",
                    state = "Manipur",
                    origin = "Meitei Royal Courts",
                    description = "Sublime classical dance characterized by fluid, gliding, serpentine movements depicting the eternal spiritual love of Radha and Krishna.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Kumil cylindrical stiff mirrored skirt, translucent white veil, shimmering velvet blouse",
                    accompaniment = "Pung drum, Pena fiddle, Kartal, Flute"
                ),
                DanceItem(
                    id = "mn_dance_pung_cholom",
                    name = "Pung Cholom (Drum Dance)",
                    state = "Manipur",
                    origin = "Nat Sankirtana tradition",
                    description = "UNESCO-recognized visual spectacle where male dancers play the Pung drum while performing acrobatics and high leaps in mid-air.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Snow-white Dhoti and folded turban, carrying the slung Pung drum",
                    accompaniment = "Synchronized drum beats and vocal chants"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "mn_music_pena",
                    title = "Pena Traditional Bowed Melodies",
                    region = "Imphal Valley",
                    state = "Manipur",
                    instruments = "Pena (Bowed coconut-shell lute with metal bells on bow)",
                    description = "The soul instrument of Manipur used to invoke deities in Lai Haraoba festivals.",
                    audioDuration = "4:10",
                    genre = "Sacred Classical Folk",
                    name = "Manipuri Pena"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "mn_food_chakhao",
                    name = "Chak-hao Kheer (Black Rice Pudding)",
                    state = "Manipur",
                    description = "Royal purple-hued sweet pudding made from aromatic GI-tagged Manipuri indigenous black rice simmered in whole milk, cardamom, and toasted nuts.",
                    isVeg = true,
                    whereToTry = "Luxmi Kitchen, Imphal",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Nutty, Rich Creamy Milk, Striking Purple Color"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "mn_rest_luxmi",
                    name = "Luxmi Kitchen Since 1952",
                    city = "Imphal",
                    state = "Manipur",
                    cuisine = "Authentic Meitei Heritage Thali",
                    rating = 4.8f,
                    priceIndicator = "₹",
                    description = "Iconic family kitchen serving comprehensive Meitei thalis featuring 15 dishes including Sareng fish, Kangshoi, and Chak-hao.",
                    mustTryDish = "Full Meitei Traditional Thali"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "mn_event_sangai",
                    name = "Manipur Sangai Festival",
                    location = "Hapta Kangjeibung & Loktak Lake",
                    state = "Manipur",
                    dateText = "November 21 – 30",
                    category = "State Cultural Showcase",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=800&q=80",
                    description = "Ten-day mega celebration showcasing Manipuri classical dances, indigenous Polo matches, and handlooms."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving the Pena Instrument Players",
                craftOrTradition = "Pena Instrument Craft & Recital",
                community = "Hana-Pena Hereditary Bards",
                challenge = "Modern amplification replacing the soft delicate tones of coconut-shell Pena lutes.",
                preservationAction = "UNESCO Nat Sankirtana inscription and university archives."
            )
        ),
        IndianState(
            id = "mizoram",
            name = "Mizoram",
            hindiName = "मिज़ोरम",
            capital = "Aizawl",
            region = "Northeast",
            tagline = "Land of Rolling Hills • Cheraw Bamboo Dance & Peace",
            description = "A peaceful mountainous state perched above the clouds with 21 hill ranges, pristine waterfalls, cliff-hugging bamboo villages, and the world-famous synchronized Cheraw Bamboo Dance.",
            heroImageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.85f,
            mapY = 0.46f,
            colorHex = 0xFF0284C7, // Blue Mountain Mist
            iconicHighlight = "Vantawng Falls • Cheraw Bamboo Dance • Reiek Tlang",
            danceHighlight = "Cheraw (Bamboo Dance) & Khuallam",
            musicHighlight = "Mizo Traditional Gongs & Choral Hymns",
            foodHighlight = "Bai, Vawksa Rep, Koat Pitha & Sawhchiar",
            heritageCount = 10,
            places = listOf(
                Place(
                    id = "mz_vantawng",
                    name = "Vantawng Waterfalls",
                    city = "Thenzawl, Serchhip",
                    state = "Mizoram",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "Highest two-tiered waterfall in Mizoram plummeting 750 feet amidst impenetrable bamboo forests and rocky ravines.",
                    culturalSignificance = "Named after Vantawnga, a legendary Mizo swimmer praised in oral folklore.",
                    tags = listOf("Highest Waterfall", "Lush Bamboo", "Thenzawl Handloom"),
                    nearbyAttractions = listOf("Thenzawl Deer Park", "Tuirihiau Falls"),
                    localFoodRecommendation = "Mizo Bai cooked with tender bamboo shoots and mustard leaves"
                ),
                Place(
                    id = "mz_reiek",
                    name = "Reiek Tlang & Heritage Village",
                    city = "Aizawl District",
                    state = "Mizoram",
                    imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=1000&q=80",
                    description = "Dramatic rocky peak at 5,000 ft providing panoramic views across Bangladesh plains, alongside an authentic preserved traditional Mizo village.",
                    culturalSignificance = "Showcases traditional chieftain (Lal) huts, bachelor dormitories (Zawlbuk), and weapon armories.",
                    tags = listOf("Mizo Heritage Village", "Panoramic Ridge", "Trekking"),
                    nearbyAttractions = listOf("Aizawl City View", "Solomon's Temple"),
                    localFoodRecommendation = "Vawksa Rep (Smoked meat stir-fried with mustard leaves)"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "mz_trad_puan",
                    name = "Mizo Puan Handloom Weaving",
                    state = "Mizoram",
                    category = "Textile Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Traditional handwoven wrap skirts (Puanchei, Ngotekherh) woven with bold black, red, and white geometric checks on loin looms.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "mz_dance_cheraw",
                    name = "Cheraw (Bamboo Dance)",
                    state = "Mizoram",
                    origin = "Ancient Mizo Harvest Rituals",
                    description = "One of India's most famous dances where dancers step in and out of clapping horizontal bamboo staves in rapid mathematical sync without faltering.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Puanchei woven skirt, Kawrchei blouse, Vakiria bamboo-feather crown",
                    accompaniment = "Clapping bamboo poles, brass gongs (Darmang)"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "mz_music_gong",
                    title = "Mizo Traditional Darkhhuang Gongs",
                    region = "Aizawl & Lunglei",
                    state = "Mizoram",
                    instruments = "Darkhhuang (Brass gong set), Khuang (Drum), Rawchhem",
                    description = "Resonant deep-toned brass gong melodies echoing from ridge to ridge during festivals.",
                    audioDuration = "3:40",
                    genre = "Traditional Gong Music",
                    name = "Mizo Darkhhuang"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "mz_food_bai",
                    name = "Mizo Bai & Vawksa Rep",
                    state = "Mizoram",
                    description = "Nutritious stew of seasonal vegetables, pork fat or fermented pork, bamboo shoots, and local greens seasoned with Chingal (wood-ash alkaline water).",
                    isVeg = false,
                    whereToTry = "Chopstyx & David's Kitchen, Aizawl",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Subtle Alkaline Depth, Herbaceous Greens, Pure Fresh Produce"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "mz_rest_chopstyx",
                    name = "Chopstyx Restaurant",
                    city = "Chanmari, Aizawl",
                    state = "Mizoram",
                    cuisine = "Authentic Mizo & Northeast Asian",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Favorite hangout in Aizawl overlooking rolling mist-clad valleys, famous for traditional Mizo Bai and Sawhchiar rice porridge.",
                    mustTryDish = "Mizo Pork Bai with Sawhchiar"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "mz_event_chapchar",
                    name = "Chapchar Kut Spring Festival",
                    location = "Lammual (Jungle Ground), Aizawl",
                    state = "Mizoram",
                    dateText = "First Friday of March",
                    category = "Grand Post-Harvest Celebration",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=800&q=80",
                    description = "The biggest festival in Mizoram celebrating after the clearing of jhum forests with mass Cheraw dancing and feasting."
                )
            ),
            preservationStory = PreservationStory(
                title = "Safeguarding the 5 GI-Tagged Mizo Puan Weaves",
                craftOrTradition = "Loin Loom Puan Weaving",
                community = "Mizoram Handloom Weavers Apex Society",
                challenge = "Industrial synthetic jacquards trying to replicate Puanchei hand-woven textures.",
                preservationAction = "Strict GI enforcement and digital certification barcodes."
            )
        ),
        IndianState(
            id = "tripura",
            name = "Tripura",
            hindiName = "त्रिपुरा",
            capital = "Agartala",
            region = "Northeast",
            tagline = "Land of Water Palaces & Unakoti Rock Wonders",
            description = "Famed for the floating royal palace of Neermahal in the middle of Rudrasagar Lake, 1200-year-old rock-cut Shiva bas-reliefs at Unakoti, bamboo handicraft mastery, and the graceful Hojagiri balancing dance.",
            heroImageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.80f,
            mapY = 0.44f,
            colorHex = 0xFFEA580C, // Coral Terracotta
            iconicHighlight = "Neermahal Water Palace • Unakoti Rock Sculptures • Ujjayanta Palace",
            danceHighlight = "Hojagiri Balancing Dance",
            musicHighlight = "Tripuri Sarinda & Kham Drum",
            foodHighlight = "Mui Borok, Chakhwi, Berma & Mosdeng Serma",
            heritageCount = 11,
            places = listOf(
                Place(
                    id = "tr_unakoti",
                    name = "Unakoti Rock-Cut Carvings",
                    city = "Kailashahar, Unakoti",
                    state = "Tripura",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "Mysterious 7th–9th century Shaivite rock relief sanctuary deep in the forest featuring 'one less than a crore' colossal stone faces of Shiva.",
                    culturalSignificance = "Pinnacle of medieval rock sculpture, home to the 30-foot central rock face of Unakotiswara Kal Bhairava.",
                    tags = listOf("Rock-Cut Wonder", "Shiva Sanctuary", "Unakoti Heritage"),
                    nearbyAttractions = listOf("Ujjayanta Palace", "Jampui Hills"),
                    localFoodRecommendation = "Chakhwi cooked with tender bamboo shoots and pork/jackfruit"
                ),
                Place(
                    id = "tr_neermahal",
                    name = "Neermahal (Water Palace)",
                    city = "Melaghar",
                    state = "Tripura",
                    imageUrl = "https://images.unsplash.com/photo-1615836245337-f5b9b2303f10?auto=format&fit=crop&w=1000&q=80",
                    description = "Spectacular royal summer residence built in 1930 by King Bir Bikram Kishore Manikya in the exact center of the vast Rudrasagar Lake.",
                    culturalSignificance = "One of only two water palaces in all of India, blending Hindu and Mughal architectural styles.",
                    tags = listOf("Water Palace", "Rudrasagar Lake", "Manikya Dynasty"),
                    nearbyAttractions = listOf("Tripura Sundari Temple", "Sepahijala Wildlife Sanctuary"),
                    localFoodRecommendation = "Spicy Berma fish chutney with fresh green vegetables"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "tr_trad_bamboo",
                    name = "Tripura Bamboo & Cane Screen Craft",
                    state = "Tripura",
                    category = "Eco Handicraft",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Splitting bamboo into paper-thin flexible strands to weave delicate window screens, lamps, and miniature umbrellas.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "tr_dance_hojagiri",
                    name = "Hojagiri Dance",
                    state = "Tripura",
                    origin = "Reang (Bru) Community",
                    description = "Incredible acrobatic balancing dance where women balance earthen pitchers (Kalash) or lit oil lamps on their heads while balancing bottles on brass plates.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Rignai and Risa handwoven wrap, silver coin necklaces (Rangbat)",
                    accompaniment = "Kham drum, Sumui (bamboo flute)"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "tr_music_sarinda",
                    title = "Tripuri Sarinda Folk Melodies",
                    region = "Tripura Hills",
                    state = "Tripura",
                    instruments = "Sarinda (Three-stringed bowed lute), Kham drum",
                    description = "Haunting bowed melodies evoking the whispering bamboo forests and love folklore.",
                    audioDuration = "3:30",
                    genre = "Indigenous Folk",
                    name = "Tripura Sarinda"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "tr_food_chakhwi",
                    name = "Tripuri Chakhwi with Berma",
                    state = "Tripura",
                    description = "Traditional dish prepared with tender bamboo shoots, jackfruit seeds, green papaya, and dried fermented fish (Berma) flavored with baking soda and fresh chilies.",
                    isVeg = false,
                    whereToTry = "Heritage Park Cafe & local family kitchens, Agartala",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Pungent Fermented Berma, Crisp Bamboo Shoot, Earthy Mild Broth"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "tr_rest_kurry",
                    name = "Kurry Club Agartala",
                    city = "Agartala",
                    state = "Tripura",
                    cuisine = "Authentic Tripuri & Bengali Fusion",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Popular dining venue celebrating local Tripuri tribal delicacies including Mui Borok and fresh bamboo curries.",
                    mustTryDish = "Chakhwi with Steamed Rice"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "tr_event_kharchi",
                    name = "Kharchi Puja (Worship of Fourteen Gods)",
                    location = "Chaturdash Devata Temple, Old Agartala",
                    state = "Tripura",
                    dateText = "July (Ashadha Month)",
                    category = "State Royal Celebration",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=800&q=80",
                    description = "Seven-day royal festival where fourteen presiding deities of Tripura are bathed in the sacred Saidra River amid chanting."
                )
            ),
            preservationStory = PreservationStory(
                title = "Conserving the Monolithic Rock Carvings of Unakoti",
                craftOrTradition = "Rock-Cut Bas Relief Preservation",
                community = "Archaeological Survey of India & Kailashahar Locals",
                challenge = "Tropical rainwater runoff and moss erosion wearing down soft sandstone faces of Shiva.",
                preservationAction = "Chemical bio-coating and drainage channels diverting hill runoff."
            )
        )
    )
}
