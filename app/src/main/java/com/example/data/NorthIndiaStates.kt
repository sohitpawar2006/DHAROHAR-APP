package com.example.data

object NorthIndiaStates {
    val all: List<IndianState> = listOf(
        IndianState(
            id = "jammu_kashmir",
            name = "Jammu & Kashmir",
            hindiName = "जम्मू और कश्मीर",
            capital = "Srinagar & Jammu",
            region = "North",
            tagline = "Paradise on Earth & Sufi Mysticism",
            description = "Encircled by snow-clad Pir Panjal and Himalayan ranges, Jammu & Kashmir is a treasure of Dal Lake shikaras, Pashmina weaving, papier-mâché, and aromatic Wazwan feasts.",
            heroImageUrl = "https://images.unsplash.com/photo-1595815771614-ade9d652a65d?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.36f,
            mapY = 0.08f,
            colorHex = 0xFF0284C7, // Sky blue
            iconicHighlight = "Dal Lake Shikara • Pashmina Shawls • Rogan Josh",
            danceHighlight = "Rouf & Kud Dance",
            musicHighlight = "Sufiana Kalam & Santoor",
            foodHighlight = "Wazwan, Rogan Josh & Kahwa",
            heritageCount = 12,
            places = listOf(
                Place(
                    id = "jk_dal_lake",
                    name = "Dal Lake & Floating Gardens",
                    city = "Srinagar",
                    state = "Jammu & Kashmir",
                    imageUrl = "https://images.unsplash.com/photo-1595815771614-ade9d652a65d?auto=format&fit=crop&w=1000&q=80",
                    description = "Famed jewel of Srinagar adorned with ornate wooden houseboats, shikara gondolas, and dawn floating vegetable markets.",
                    culturalSignificance = "Living water heritage engineered by Mughal emperors with Shalimar and Nishat terrace gardens overlooking the waters.",
                    tags = listOf("Floating Markets", "Mughal Heritage", "Scenic Valley"),
                    nearbyAttractions = listOf("Shalimar Bagh", "Nishat Bagh", "Hazratbal Shrine"),
                    localFoodRecommendation = "Authentic saffron Kahwa with crushed almonds"
                ),
                Place(
                    id = "jk_vaishno_devi",
                    name = "Mata Vaishno Devi Shrine",
                    city = "Katra",
                    state = "Jammu & Kashmir",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "Sacred holy cave temple dedicated to Goddess Vaishno Devi in the Trikuta Mountains, drawing millions of pilgrims every year.",
                    culturalSignificance = "One of India's oldest spiritual pilgrimage centers deeply revered in Hindu theology.",
                    tags = listOf("Spiritual Yatra", "Trikuta Caves", "Pilgrimage"),
                    nearbyAttractions = listOf("Bhairon Temple", "Ardhkuwari Cave", "Ban Ganga"),
                    localFoodRecommendation = "Traditional Rajma Chawal with Desi Ghee at Katra"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "jk_trad_pashmina",
                    name = "Sozni & Kani Pashmina Weaving",
                    state = "Jammu & Kashmir",
                    category = "Textile Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Spun from delicate Changthangi goat underdown, woven on traditional handlooms with intricate wooden needles into timeless royal shawls.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "jk_dance_rouf",
                    name = "Rouf Folk Dance",
                    state = "Jammu & Kashmir",
                    origin = "Kashmir Valley",
                    description = "Graceful spring and Eid celebration dance performed by women facing each other in two interlinked rows moving to rhythmic verses.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Embroidered Pheran robe, Kasaba headdress, silver ornaments",
                    accompaniment = "Tumbaknari drum and choral chanting"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "jk_music_santoor",
                    title = "Sufiana Kalam & Santoor",
                    region = "Kashmir Valley",
                    state = "Jammu & Kashmir",
                    instruments = "100-stringed Santoor, Sehtar, Saaz-e-Kashmir",
                    description = "Choral devotional Sufi melodies passed down from master to disciple expressing mystical union with the divine.",
                    audioDuration = "4:45",
                    genre = "Sufi Classical",
                    name = "Sufiana Kalam"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "jk_food_wazwan",
                    name = "Kashmiri Rogan Josh",
                    state = "Jammu & Kashmir",
                    description = "Slow-simmered tender meat spiced with Kashmiri dried chilies, fennel, and maval cockscomb flower extract.",
                    isVeg = false,
                    whereToTry = "Ahdoos, Lal Chowk, Srinagar",
                    imageUrl = "https://images.unsplash.com/photo-1545247181-516773cae754?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Aromatic, Warm Spiced, Rich Gravy"
                ),
                FoodDish(
                    id = "jk_food_kahwa",
                    name = "Kashmiri Kahwa",
                    state = "Jammu & Kashmir",
                    description = "Traditional green tea brewed in a copper Samovar with green cardamom, cinnamon, saffron strands, and slivered almonds.",
                    isVeg = true,
                    whereToTry = "Chai Jaai, Srinagar",
                    imageUrl = "https://images.unsplash.com/photo-1576092768241-dec231879fc3?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Fragrant, Saffron-infused, Sweet & Warming"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "jk_rest_ahdoos",
                    name = "Ahdoos Since 1918",
                    city = "Srinagar",
                    state = "Jammu & Kashmir",
                    cuisine = "Traditional 36-course Wazwan",
                    rating = 4.8f,
                    priceIndicator = "₹₹₹",
                    description = "Over a century old culinary institution resting by the Jhelum River serving authentic Wazwan prepared by hereditary Wazas.",
                    mustTryDish = "Gushtaba, Rista & Kashmiri Dum Aloo"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "jk_event_tulip",
                    name = "Srinagar Tulip Festival",
                    location = "Indira Gandhi Memorial Tulip Garden",
                    state = "Jammu & Kashmir",
                    dateText = "April 1 – 20",
                    category = "Floral & Cultural Fair",
                    imageUrl = "https://images.unsplash.com/photo-1526772662000-3f88f10405ff?auto=format&fit=crop&w=800&q=80",
                    description = "Over 1.5 million blooming tulips framed by the Zabarwan range celebrating Kashmiri folk craft and cuisine."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving Kani Shawl Handloom Craft",
                craftOrTradition = "Kani Needle Weaving",
                community = "Kanihama Village Weavers",
                challenge = "Industrial jacquard replicas were undercutting authentic hand-spun Kani shawls requiring 6 to 18 months per piece.",
                preservationAction = "GI-tag enforcement and digital artisan direct-to-patron cooperatives."
            )
        ),
        IndianState(
            id = "ladakh",
            name = "Ladakh",
            hindiName = "लद्दाख",
            capital = "Leh & Kargil",
            region = "North",
            tagline = "Land of High Mountain Passes & Buddhist Gompas",
            description = "A high-altitude desert moonscape blessed with centuries-old cliffside Buddhist monasteries, vibrant Cham mask dances, and turquoise glacial lakes.",
            heroImageUrl = "https://images.unsplash.com/photo-1581793745862-99fde7fa73d2?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.44f,
            mapY = 0.08f,
            colorHex = 0xFFEAB308, // Gold / Ochre
            iconicHighlight = "Pangong Tso • Hemis Monastery • Cham Mask Dance",
            danceHighlight = "Cham Monastic Mask Dance",
            musicHighlight = "Tibetan Horns & Buddhist Chanting",
            foodHighlight = "Thukpa, Momos & Butter Tea (Gur Gur Chai)",
            heritageCount = 10,
            places = listOf(
                Place(
                    id = "la_hemis",
                    name = "Hemis Gompa & Museum",
                    city = "Leh",
                    state = "Ladakh",
                    imageUrl = "https://images.unsplash.com/photo-1581793745862-99fde7fa73d2?auto=format&fit=crop&w=1000&q=80",
                    description = "The largest and richest Buddhist monastery in Ladakh, home to sacred thangka paintings and historic monastic courtyard rituals.",
                    culturalSignificance = "Drukpa Kagyu lineage headquarters dating to the 11th century, preserving precious ancient manuscripts.",
                    tags = listOf("Buddhist Gompa", "High Altitude", "Ancient Heritage"),
                    nearbyAttractions = listOf("Thiksey Monastery", "Shey Palace", "Stok Palace"),
                    localFoodRecommendation = "Steaming hot handmade Tingmo bread with stew"
                ),
                Place(
                    id = "la_pangong",
                    name = "Pangong Tso Lake",
                    city = "Changthang",
                    state = "Ladakh",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "Surreal endorheic lake at 14,270 ft that shifts shades from cerulean blue to emerald green, surrounded by barren mountains.",
                    culturalSignificance = "Traditional pastoral grounds of the Changpa nomadic shepherds who rear rare Pashmina goats.",
                    tags = listOf("Glacial Lake", "Changpa Heritage", "Natural Wonder"),
                    nearbyAttractions = listOf("Chang La Pass", "Tangtse Village", "Spangmik"),
                    localFoodRecommendation = "Yak butter tea with roasted barley Tsampa"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "la_trad_thangka",
                    name = "Ladakhi Thangka Silk Painting",
                    state = "Ladakh",
                    category = "Sacred Art",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Sacred Buddhist geometric scrolls painted with natural mineral pigments on cotton and framed in brocade silk.",
                    isEndangered = true,
                    preservationStatus = "Monastery Archives"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "la_dance_cham",
                    name = "Cham Mask Dance",
                    state = "Ladakh",
                    origin = "Hemis & Thiksey Gompas",
                    description = "Sacred ceremonial dance performed by lamas wearing vivid masks portraying wrathful deities to banish negative energies.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Silk robes, ceremonial wooden masks, tantric hand emblems",
                    accompaniment = "Dungchen long horns, cymbals, gyaling oboes"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "la_music_chant",
                    title = "Monastic Tantric Chants",
                    region = "Leh Valley",
                    state = "Ladakh",
                    instruments = "Dungchen (Long alpine horn), Nga drum, Rolmo cymbals",
                    description = "Deep harmonic throat-intoned chanting echoing across cold Himalayan plateaus.",
                    audioDuration = "5:10",
                    genre = "Sacred Monastic Chant",
                    name = "Ladakhi Chant"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "la_food_thukpa",
                    name = "Ladakhi Thukpa",
                    state = "Ladakh",
                    description = "Hearty noodle soup simmered in fragrant vegetable or mutton broth topped with hand-pulled noodles and local wild mountain herbs.",
                    isVeg = true,
                    whereToTry = "The Tibetan Kitchen, Leh",
                    imageUrl = "https://images.unsplash.com/photo-1569718212165-3a8278d5f624?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Comforting, Mild Spiced, Hearty Warmth"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "la_rest_tibetan",
                    name = "The Tibetan Kitchen",
                    city = "Leh",
                    state = "Ladakh",
                    cuisine = "Ladakhi & Himalayan Tibetan",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Cozy garden dining serving traditional Gyako hotpots, mutton momos, and apricot crumbles in old Leh.",
                    mustTryDish = "Tibetan Gyako Hotpot & Shaphaley"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "la_event_hemis",
                    name = "Hemis Tsechu Festival",
                    location = "Hemis Monastery Courtyard",
                    state = "Ladakh",
                    dateText = "June / July (Tenth Lunar Day)",
                    category = "Monastic Celebration",
                    imageUrl = "https://images.unsplash.com/photo-1581793745862-99fde7fa73d2?auto=format&fit=crop&w=800&q=80",
                    description = "Annual celebration commemorating the birth of Guru Padmasambhava with vibrant two-day Cham dances."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving Ancient Wooden Monasteries",
                craftOrTradition = "Mud-brick & Juniper Architecture",
                community = "Alchi & Hemis Restoration Guilds",
                challenge = "Unseasonal rain caused by climate shift threatens centuries-old unfired mud-brick walls and miniature wall murals.",
                preservationAction = "Natural lime mortar weatherproofing and 3D digital archival scans."
            )
        ),
        IndianState(
            id = "himachal_pradesh",
            name = "Himachal Pradesh",
            hindiName = "हिमाचल प्रदेश",
            capital = "Shimla & Dharamshala",
            region = "North",
            tagline = "Devbhoomi • Land of Gods & Apple Orchards",
            description = "Nestled amidst deodar-forested valleys and craggy Dhauladhar ranges, Himachal is famed for wooden pagoda temples, Kangra miniature paintings, and spirited Nati community dances.",
            heroImageUrl = "https://images.unsplash.com/photo-1597074866923-dc0589150358?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.40f,
            mapY = 0.16f,
            colorHex = 0xFF10B981, // Emerald Green
            iconicHighlight = "Shimla Ridge • Kangra Paintings • Kullu Nati",
            danceHighlight = "Kullu Nati Dance (Guinness World Record)",
            musicHighlight = "Pahari Jhoori & Dhol-Nagada",
            foodHighlight = "Himachali Dham, Siddu & Babru",
            heritageCount = 11,
            places = listOf(
                Place(
                    id = "hp_viceregal_lodge",
                    name = "Viceregal Lodge & Ridge",
                    city = "Shimla",
                    state = "Himachal Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1597074866923-dc0589150358?auto=format&fit=crop&w=1000&q=80",
                    description = "Grand Jacobethan stone manor on Observatory Hill surrounded by manicured lawns, pivotal to India's modern history.",
                    culturalSignificance = "Historic seat of British Raj summer government, now home to the Indian Institute of Advanced Study.",
                    tags = listOf("Colonial Architecture", "Heritage Hilltop", "Summer Capital"),
                    nearbyAttractions = listOf("The Ridge", "Jakhoo Temple", "Mall Road"),
                    localFoodRecommendation = "Siddu filled with crushed poppy seeds and ghee"
                ),
                Place(
                    id = "hp_kangra_fort",
                    name = "Kangra Fort",
                    city = "Kangra",
                    state = "Himachal Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "One of India's oldest forts built by the Katoch dynasty overlooking the Banganga River, dating back to the Mahabharata era.",
                    culturalSignificance = "Ancient bastion of the Trigarta Kingdom guarding ancient rock carvings and Jain-Hindu temples.",
                    tags = listOf("Ancient Fort", "Katoch Dynasty", "Himalayan Citadel"),
                    nearbyAttractions = listOf("Brajeshwari Temple", "Masrur Rock Cut Temples", "Dharamshala"),
                    localFoodRecommendation = "Authentic Kangri Dham with Madra"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "hp_trad_kangra",
                    name = "Kangra Miniature Painting",
                    state = "Himachal Pradesh",
                    category = "Pahari Folk Art",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Delicate poetic miniature paintings born under Raja Sansar Chand, depicting lyrical Radha-Krishna motifs with fine natural stone hues.",
                    isEndangered = true,
                    preservationStatus = "Master Artists Training"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "hp_dance_nati",
                    name = "Kullu Nati",
                    state = "Himachal Pradesh",
                    origin = "Kullu Valley",
                    description = "Gentle swirling circle dance where thousands of village folk clasp hands and sway rhythmically to hill pipes and dhol beats.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Woolen Chola coat, Kullu woven cap with monal crest, Pattoo shawl",
                    accompaniment = "Dhol, Nagara, Narsingha (Curved trumpet), Shehnai"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "hp_music_jhoori",
                    title = "Pahari Jhoori & Folk Ballads",
                    region = "Chamba & Kangra",
                    state = "Himachal Pradesh",
                    instruments = "Shehnai, Dholak, Karnal horn",
                    description = "Melancholic love ballads capturing the whispering winds of deodar forests.",
                    audioDuration = "3:50",
                    genre = "Himalayan Folk",
                    name = "Pahari Ballad"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "hp_food_dham",
                    name = "Himachali Kangri Dham",
                    state = "Himachal Pradesh",
                    description = "Traditional festive vegetarian feast cooked exclusively by hereditary 'Botis' in heavy brass pots without onions or garlic.",
                    isVeg = true,
                    whereToTry = "Heritage village kitchens, Kangra & Chamba",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Yogurt-based Madra, Sweet-sour Mahni, Spiced Lentils"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "hp_rest_himachali",
                    name = "Himachali Rasoi",
                    city = "Shimla",
                    state = "Himachal Pradesh",
                    cuisine = "Authentic Himachali Traditional",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Intimate eatery on Middle Bazaar preserving ancient recipes like Siddu, Sepu Badi, and Kangri Madra.",
                    mustTryDish = "Kangri Dham Thali & Ghee Siddu"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "hp_event_dussehra",
                    name = "Kullu Dussehra",
                    location = "Dhalpur Maidan, Kullu",
                    state = "Himachal Pradesh",
                    dateText = "October (Starts on Vijayadashami)",
                    category = "International Heritage Festival",
                    imageUrl = "https://images.unsplash.com/photo-1597074866923-dc0589150358?auto=format&fit=crop&w=800&q=80",
                    description = "Seven-day royal fair where over 200 local deities arrive on palanquins to pay homage to Lord Raghunath."
                )
            ),
            preservationStory = PreservationStory(
                title = "Safeguarding the Pahari Miniature School",
                craftOrTradition = "Kangra Painting Guilds",
                community = "Kangra Arts Promotion Society",
                challenge = "Loss of wild mineral stone pigments and rare squirrel-hair paintbrushes.",
                preservationAction = "Reviving traditional brush-making workshops and apprenticeships in Dharamshala."
            )
        ),
        IndianState(
            id = "punjab",
            name = "Punjab",
            hindiName = "पंजाब",
            capital = "Chandigarh",
            region = "North",
            tagline = "Land of Five Rivers, Valour & Seva",
            description = "The vibrant granary of India, Punjab is celebrated worldwide for the Golden Temple in Amritsar, thunderous Bhangra beats, handcrafted Phulkari embroidery, and legendary culinary generosity.",
            heroImageUrl = "https://images.unsplash.com/photo-1514222134-b57cbb8ce073?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.34f,
            mapY = 0.19f,
            colorHex = 0xFFD97706, // Amber Gold
            iconicHighlight = "Golden Temple • Bhangra • Makki Di Roti",
            danceHighlight = "Bhangra & Giddha",
            musicHighlight = "Tumbi, Dhol & Boliyan",
            foodHighlight = "Makki Di Roti, Sarson Da Saag & Amritsari Kulcha",
            heritageCount = 10,
            places = listOf(
                Place(
                    id = "pb_golden_temple",
                    name = "Sri Harmandir Sahib (Golden Temple)",
                    city = "Amritsar",
                    state = "Punjab",
                    imageUrl = "https://images.unsplash.com/photo-1514222134-b57cbb8ce073?auto=format&fit=crop&w=1000&q=80",
                    description = "Spiritual epicentre of Sikhism clad in gold leaf, resting in the center of the sacred Amrit Sarovar lake with all four doors open to all faiths.",
                    culturalSignificance = "Home of the world's largest community kitchen (Langar) feeding 100,000 pilgrims daily regardless of creed.",
                    tags = listOf("Spiritual Sanctum", "Golden Sanctum", "Langar Seva"),
                    nearbyAttractions = listOf("Jallianwala Bagh", "Partition Museum", "Wagah Border"),
                    localFoodRecommendation = "Amritsari Kulcha with Chole and churned Lassi"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "pb_trad_phulkari",
                    name = "Phulkari Floral Embroidery",
                    state = "Punjab",
                    category = "Textile Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Hand-embroidered flower needlecraft worked entirely from the reverse side of handspun Khaddar using vibrant untwisted silk floss.",
                    isEndangered = false,
                    preservationStatus = "Active Craft Heritage"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "pb_dance_bhangra",
                    name = "Bhangra",
                    state = "Punjab",
                    origin = "Majha & Malwa Regions",
                    description = "Exuberant harvest celebration dance featuring energetic leaps, shoulder twirls, and acrobatic joy.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Chhadra lungi, brightly dyed Kurta, embellished Pagri turban with Turla fan",
                    accompaniment = "Dhol, Tumbi single-string, Chimta tongs"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "pb_music_folk",
                    title = "Tumbi & Heer Ranjha Folk Ballads",
                    region = "Malwa",
                    state = "Punjab",
                    instruments = "Tumbi, Algoze (Double flute), Dhol",
                    description = "Rousing acoustic story ballads recounting love folklore and saint-poet verses.",
                    audioDuration = "3:40",
                    genre = "Punjabi Folk",
                    name = "Punjabi Boliyan"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "pb_food_saag",
                    name = "Sarson Da Saag & Makki Di Roti",
                    state = "Punjab",
                    description = "Slow-cooked fresh mustard greens whipped with maize flour, served piping hot with yellow cornbread, white homemade butter, and jaggery.",
                    isVeg = true,
                    whereToTry = "Rural Punjabi dhabas & Kesar Da Dhaba",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Earthy, Rich, Wholesome Winter Comfort"
                ),
                FoodDish(
                    id = "pb_food_kulcha",
                    name = "Crispy Amritsari Kulcha",
                    state = "Punjab",
                    description = "Clay tandoor baked multi-layered leavened bread stuffed with spiced potatoes and onions, topped with melted desi ghee.",
                    isVeg = true,
                    whereToTry = "Bhai Kulwant Singh Kulchian Wale, Amritsar",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Crispy, Flaky, Tangy Spiced"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "pb_rest_kesar",
                    name = "Kesar Da Dhaba Since 1916",
                    city = "Amritsar",
                    state = "Punjab",
                    cuisine = "Authentic Punjabi Vegetarian",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Legendary dhaba serving slow-cooked 12-hour Dal Makhani in clay handis, frequented by generations of food lovers.",
                    mustTryDish = "Kesar Dal Makhani with Laccha Paratha"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "pb_event_baisakhi",
                    name = "Baisakhi Spring Harvest",
                    location = "Amritsar & Anandpur Sahib",
                    state = "Punjab",
                    dateText = "April 13 / 14",
                    category = "Harvest & Faith",
                    imageUrl = "https://images.unsplash.com/photo-1514222134-b57cbb8ce073?auto=format&fit=crop&w=800&q=80",
                    description = "Celebration of golden wheat harvest and the founding of the Khalsa Panth in 1699 with martial Gatka demonstrations."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving Punjabi Folk Instruments",
                craftOrTradition = "Algoze (Twin Wooden Flutes)",
                community = "Folk Bard Communities of Malwa",
                challenge = "Electronic synthesizers have drastically reduced the demand for hand-carved twin flutes played with circular breathing.",
                preservationAction = "Workshops and state academies honoring master players with living heritage pensions."
            )
        ),
        IndianState(
            id = "haryana",
            name = "Haryana",
            hindiName = "हरियाणा",
            capital = "Chandigarh",
            region = "North",
            tagline = "Cradle of Vedic Civilization & Epic Mahabharata",
            description = "Land where the Gita was sung at Kurukshetra, Haryana possesses deep agricultural roots, lively Saang folk theater, and delicious rustic dairy traditions.",
            heroImageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.37f,
            mapY = 0.23f,
            colorHex = 0xFFF59E0B, // Amber
            iconicHighlight = "Kurukshetra Brahma Sarovar • Saang Theater • Murthal Parathas",
            danceHighlight = "Phag & Dhamal Dance",
            musicHighlight = "Ragini & Sarangi",
            foodHighlight = "Bajra Khichdi, Kachri Ki Sabzi & Murthal Parathas",
            heritageCount = 9,
            places = listOf(
                Place(
                    id = "hr_kurukshetra",
                    name = "Brahma Sarovar & Jyotisar",
                    city = "Kurukshetra",
                    state = "Haryana",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "Sacred water tank believed to be created by Lord Brahma, alongside Jyotisar where Lord Krishna delivered the Bhagavad Gita.",
                    culturalSignificance = "Epic battlefield of the Mahabharata and center of Vedic philosophical discourse.",
                    tags = listOf("Bhagavad Gita", "Sacred Sarovar", "Mahabharata"),
                    nearbyAttractions = listOf("Sheikh Chilli Tomb", "Panorama & Science Centre", "Sthaneshwar Temple"),
                    localFoodRecommendation = "Hot Bajra Khichdi with fresh Chhachh"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "hr_trad_saang",
                    name = "Saang Folk Open-Air Theater",
                    state = "Haryana",
                    category = "Folk Theater",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    description = "Centuries-old village verse-theater narrating heroic tales and moral allegories without formal stages.",
                    isEndangered = true,
                    preservationStatus = "State Cultural Grants"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "hr_dance_phag",
                    name = "Phag Dance",
                    state = "Haryana",
                    origin = "Rural Haryana",
                    description = "Lively seasonal spring dance performed by farmers celebrating good crop yield around the festival of Holi.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Ghaggri skirt, matching chunder, bright turbans",
                    accompaniment = "Tasha, Nagada, Dholak"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "hr_music_ragini",
                    title = "Haryanvi Ragini Verses",
                    region = "Rohtak & Sonipat",
                    state = "Haryana",
                    instruments = "Sarangi, Harmonium, Chimta",
                    description = "High-pitched lyrical verse singing narrating tales of Lakhmi Chand and folk wisdom.",
                    audioDuration = "4:15",
                    genre = "Haryanvi Folk",
                    name = "Ragini"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "hr_food_bajra",
                    name = "Bajra Khichdi with Desi Ghee",
                    state = "Haryana",
                    description = "Wholesome pearl millet porridge slowly simmered with green moong dal, served with home-churned butter and lassi.",
                    isVeg = true,
                    whereToTry = "Traditional rural hearths & dhabas",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Nutty, Earthy, Hearty Farm Comfort"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "hr_rest_amrik",
                    name = "Amrik Sukhdev Dhaba",
                    city = "Murthal",
                    state = "Haryana",
                    cuisine = "Tandoori Parathas & North Indian",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "World-renowned highway food haven famous for butter-drenched tandoori aloo-pyaaz parathas served with white butter.",
                    mustTryDish = "Murthal Stuffed Paratha with Sweet Lassi"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "hr_event_surajkund",
                    name = "Surajkund International Crafts Mela",
                    location = "Surajkund, Faridabad",
                    state = "Haryana",
                    dateText = "February 1 – 15",
                    category = "Handicrafts & Cultural Fair",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Largest crafts fair in the world showcasing rural craft masters, folk performers, and indigenous culinary traditions."
                )
            ),
            preservationStory = PreservationStory(
                title = "Documenting the Bards of Lakhmi Chand",
                craftOrTradition = "Oral Ragini Storytelling",
                community = "Rural Haryana Folk Troupe",
                challenge = "Western electronic beats overshadowing poetic storytelling.",
                preservationAction = "Digital audio digitization and village youth scholarships."
            )
        ),
        IndianState(
            id = "delhi",
            name = "Delhi (NCT)",
            hindiName = "दिल्ली",
            capital = "New Delhi",
            region = "North",
            tagline = "Heart of India • City of Seven Historic Citadels",
            description = "The capital of India for nearly a millennium, Delhi is a living historical mosaic where grand Mughal citadels, Sufi shrines, colonial avenues, and world-famous street food bazaars converge.",
            heroImageUrl = "https://images.unsplash.com/photo-1587474260584-136574528ed5?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.39f,
            mapY = 0.24f,
            colorHex = 0xFFDC2626, // Crimson Red
            iconicHighlight = "Qutub Minar • Red Fort • Chandni Chowk Food",
            danceHighlight = "Kathak (Delhi Gharana)",
            musicHighlight = "Nizamuddin Qawwali & Classical Khayal",
            foodHighlight = "Dilli Ki Chaat, Butter Chicken & Chole Bhature",
            heritageCount = 15,
            places = listOf(
                Place(
                    id = "dl_qutub_minar",
                    name = "Qutub Minar Complex",
                    city = "New Delhi",
                    state = "Delhi (NCT)",
                    imageUrl = "https://images.unsplash.com/photo-1587474260584-136574528ed5?auto=format&fit=crop&w=1000&q=80",
                    description = "A towering 73-meter victory minaret of fluted red sandstone and marble, built starting in 1192 CE alongside the rust-resistant 4th-century Iron Pillar.",
                    culturalSignificance = "UNESCO World Heritage site exemplifying early Indo-Islamic architectural innovation and ancient metallurgy.",
                    tags = listOf("UNESCO World Heritage", "Victory Minaret", "Ancient Metallurgy"),
                    nearbyAttractions = listOf("Mehrauli Archaeological Park", "Lotus Temple", "Hauz Khas"),
                    localFoodRecommendation = "Mughlai Kebab rolls at Khan Chacha"
                ),
                Place(
                    id = "dl_red_fort",
                    name = "Red Fort (Lal Qila)",
                    city = "Old Delhi",
                    state = "Delhi (NCT)",
                    imageUrl = "https://images.unsplash.com/photo-1592635196078-9fdc757f27f4?auto=format&fit=crop&w=1000&q=80",
                    description = "Monumental red sandstone fortress palace constructed by Emperor Shah Jahan in 1648, symbolic heart of India's independence.",
                    culturalSignificance = "Seat of the Mughal Empire housing the Diwan-i-Aam, Diwan-i-Khas, and venue for the Prime Minister's Independence Day address.",
                    tags = listOf("UNESCO World Heritage", "Mughal Empire", "National Symbol"),
                    nearbyAttractions = listOf("Jama Masjid", "Chandni Chowk", "Raj Ghat"),
                    localFoodRecommendation = "Parathe Wali Gali stuffed tandoori parathas"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "dl_trad_qawwali",
                    name = "Sufi Qawwali at Nizamuddin Dargah",
                    state = "Delhi (NCT)",
                    category = "Sacred Music Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    description = "Centuries of 700-year-old unbroken Thursday evening Sufi musical assemblies pioneered by Hazrat Amir Khusro.",
                    isEndangered = false,
                    preservationStatus = "Living Spiritual Tradition"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "dl_dance_kathak",
                    name = "Kathak (Delhi Gharana)",
                    state = "Delhi (NCT)",
                    origin = "Mughal Imperial Courts",
                    description = "Classical storytelling dance defined by complex footwork, swift pirouettes (chakkars), and courtly grace.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Anarkali frock, churidar, heavy ghungroos bells",
                    accompaniment = "Tabla, Sarangi, Pakhawaj, Padant recitation"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "dl_music_khusro",
                    title = "Chhap Tilak & Amir Khusro Qawwali",
                    region = "Nizamuddin Basti",
                    state = "Delhi (NCT)",
                    instruments = "Harmonium, Dholak, Clapping unison",
                    description = "Ecstatic devotional poetry honoring Hazrat Nizamuddin Auliya.",
                    audioDuration = "5:40",
                    genre = "Sufi Qawwali",
                    name = "Delhi Qawwali"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "dl_food_chaat",
                    name = "Old Delhi Dahi Bhalla & Papdi Chaat",
                    state = "Delhi (NCT)",
                    description = "Lentil dumplings soaked in thick sweet yogurt, topped with crispy wafers, mint chutney, saunth tamarind sauce, and roasted cumin.",
                    isVeg = true,
                    whereToTry = "Natraj Dahi Bhalla Corner, Chandni Chowk",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Tangy, Creamy, Sweet-Savory Burst"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "dl_rest_karim",
                    name = "Karim's Since 1913",
                    city = "Old Delhi",
                    state = "Delhi (NCT)",
                    cuisine = "Royal Mughal Court Cuisine",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Founded by Haji Karimuddin, royal chef of the last Mughal court, famous worldwide for mutton burra kebabs and nihari.",
                    mustTryDish = "Mutton Burra Kebab & Shahi Nihari"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "dl_event_phoolwalon",
                    name = "Phool Walon Ki Sair",
                    location = "Mehrauli, New Delhi",
                    state = "Delhi (NCT)",
                    dateText = "Mid-November",
                    category = "Communal Harmony Festival",
                    imageUrl = "https://images.unsplash.com/photo-1587474260584-136574528ed5?auto=format&fit=crop&w=800&q=80",
                    description = "Mughal-era festival of flower-sellers offering floral fans (pankhas) to both Sufi saint Qutbuddin Bakhtiyar Kaki and Yogmaya temple."
                )
            ),
            preservationStory = PreservationStory(
                title = "Restoring Humayun's Tomb Garden Complex",
                craftOrTradition = "Charbagh Waterway Architecture",
                community = "Aga Khan Trust for Culture & ASI",
                challenge = "Restoring historical water channels and stone screens using authentic lime mortar and sandstone carving techniques.",
                preservationAction = "Global award-winning revival training generational stonemasons."
            )
        ),
        IndianState(
            id = "uttarakhand",
            name = "Uttarakhand",
            hindiName = "उत्तराखंड",
            capital = "Dehradun & Gairsain",
            region = "North",
            tagline = "Devbhoomi • Abode of the Gods & Holy Rivers",
            description = "Where the sacred Ganga and Yamuna originate amidst eternal glaciers, Uttarakhand is the spiritual sanctuary of the Char Dham, Yoga capitals, and rhythmic Chholiya warrior dances.",
            heroImageUrl = "https://images.unsplash.com/photo-1589802829985-817e51171b92?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.44f,
            mapY = 0.21f,
            colorHex = 0xFF0D9488, // Teal
            iconicHighlight = "Kedarnath Temple • Rishikesh Yoga • Chholiya Dance",
            danceHighlight = "Chholiya Sword Dance",
            musicHighlight = "Garhwali & Kumaoni Jagar",
            foodHighlight = "Kafuli, Chainsoo, Bhatt Ki Churkani & Bal Mithai",
            heritageCount = 11,
            places = listOf(
                Place(
                    id = "uk_kedarnath",
                    name = "Kedarnath Temple",
                    city = "Rudraprayag",
                    state = "Uttarakhand",
                    imageUrl = "https://images.unsplash.com/photo-1589802829985-817e51171b92?auto=format&fit=crop&w=1000&q=80",
                    description = "Ancient stone temple at 11,755 ft dedicated to Lord Shiva, framed by the majestic snowbound Kedarnath peak.",
                    culturalSignificance = "One of the twelve Jyotirlingas, believed to be originally built by the Pandavas and revived by Adi Shankaracharya.",
                    tags = listOf("Jyotirlinga", "Char Dham", "Himalayan Sanctuary"),
                    nearbyAttractions = listOf("Bhairavnath Temple", "Gandhi Sarovar", "Gaurikund"),
                    localFoodRecommendation = "Warm Pahadi Chainsoo with hot rice"
                ),
                Place(
                    id = "uk_rishikesh",
                    name = "Rishikesh Yoga Capital & Triveni Ghat",
                    city = "Rishikesh",
                    state = "Uttarakhand",
                    imageUrl = "https://images.unsplash.com/photo-1600585154340-be6161a56a0c?auto=format&fit=crop&w=1000&q=80",
                    description = "World Yoga Capital where the emerald Ganges flows down from the Himalayas onto the plains.",
                    culturalSignificance = "Historic meditation haven of Vedic rishis, ashrams, and the evening Maha Aarti.",
                    tags = listOf("Yoga Heritage", "Sacred Ghats", "Spiritual River"),
                    nearbyAttractions = listOf("Lakshman Jhula", "Beatles Ashram", "Haridwar"),
                    localFoodRecommendation = "Fresh Ayurvedic Satvik Thali at Chotiwala"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "uk_trad_aipan",
                    name = "Aipan Ritual Floor & Wall Art",
                    state = "Uttarakhand",
                    category = "Ritual Folk Art",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Traditional Kumaoni auspicious geometric designs painted using white rice flour paste (Biswar) over brick-red clay background (Geru).",
                    isEndangered = false,
                    preservationStatus = "GI Tagged Cultural Revival"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "uk_dance_chholiya",
                    name = "Chholiya Sword Dance",
                    state = "Uttarakhand",
                    origin = "Kumaon Hills",
                    description = "Over a thousand-year-old warrior martial dance performed with real swords and brass shields to ward off evil spirits.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "White Churidar-Chola, red belt, colorful turbans, brass jewelry",
                    accompaniment = "Turi horn, Ransingha curved trumpet, Dhol, Damau"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "uk_music_jagar",
                    title = "Jagar Ritual Invocations",
                    region = "Garhwal & Kumaon",
                    state = "Uttarakhand",
                    instruments = "Hurka drum, Thali brass plate",
                    description = "Ancient musical ritual invoking ancestral spirits and regional deities.",
                    audioDuration = "4:30",
                    genre = "Ritual Ballad",
                    name = "Uttarakhand Jagar"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "uk_food_kafuli",
                    name = "Pahadi Kafuli & Bal Mithai",
                    state = "Uttarakhand",
                    description = "Nutritious slow-simmered green curry made of wild spinach and fenugreek thickened with rice paste, followed by Almora's brown fudge Bal Mithai coated in sugar pearls.",
                    isVeg = true,
                    whereToTry = "Kumaoni local family kitchens & Almora sweets",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Earthy Greens, Iron-rich, Sweet Roasted Mawa"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "uk_rest_chotiwala",
                    name = "Chotiwala Since 1958",
                    city = "Rishikesh",
                    state = "Uttarakhand",
                    cuisine = "Pure Vegetarian Himalayan Satvik",
                    rating = 4.6f,
                    priceIndicator = "₹₹",
                    description = "Iconic riverside dining institution in Swargashram serving delicious satvik thalis with views of the Ganga.",
                    mustTryDish = "Garhwali Thali with Koda Roti & Jhangora Kheer"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "uk_event_ganga_aarti",
                    name = "Haridwar & Rishikesh Ganga Aarti",
                    location = "Har Ki Pauri, Haridwar",
                    state = "Uttarakhand",
                    dateText = "Every Sunset",
                    category = "Sacred River Ritual",
                    imageUrl = "https://images.unsplash.com/photo-1600585154340-be6161a56a0c?auto=format&fit=crop&w=800&q=80",
                    description = "Breathtaking evening assembly where thousands of flaming diyas float on the sacred river to chanting Vedic mantras."
                )
            ),
            preservationStory = PreservationStory(
                title = "Empowering Women Artisans of Aipan Art",
                craftOrTradition = "Aipan Sacred Geometry",
                community = "Kumaon Artisan Collective",
                challenge = "Printed synthetic posters replacing hand-painted home thresholds.",
                preservationAction = "State GI tagging and women-led artisanal craft studios in Almora."
            )
        ),
        IndianState(
            id = "uttar_pradesh",
            name = "Uttar Pradesh",
            hindiName = "उत्तर प्रदेश",
            capital = "Lucknow",
            region = "North",
            tagline = "Cradle of Indian Philosophy & Awadhi Splendour",
            description = "The spiritual and cultural heartland of northern India, blessed with the Taj Mahal, eternal Varanasi ghats on the sacred Ganga, classical Kathak dance, and exquisite Awadhi royal gastronomy.",
            heroImageUrl = "https://images.unsplash.com/photo-1564507592333-c60657eea523?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.48f,
            mapY = 0.33f,
            colorHex = 0xFFC2410C, // Terracotta Red
            iconicHighlight = "Taj Mahal • Varanasi Ghats • Awadhi Cuisine",
            danceHighlight = "Kathak (Lucknow & Banaras Gharanas)",
            musicHighlight = "Benaras Thumri & Shehnai",
            foodHighlight = "Awadhi Dum Biryani, Galouti Kebab & Banarasi Paan",
            heritageCount = 16,
            places = listOf(
                Place(
                    id = "up_taj_mahal",
                    name = "Taj Mahal",
                    city = "Agra",
                    state = "Uttar Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1564507592333-c60657eea523?auto=format&fit=crop&w=1000&q=80",
                    description = "An ivory-white marble mausoleum on the southern bank of the Yamuna River, hailed as the jewel of Muslim art in India.",
                    culturalSignificance = "Commissioned in 1632 by Mughal Emperor Shah Jahan, featuring intricate Pietra Dura marble inlay work.",
                    tags = listOf("UNESCO World Heritage", "Wonder of the World", "Mughal Art"),
                    nearbyAttractions = listOf("Agra Fort", "Fatehpur Sikri", "Mehtab Bagh"),
                    localFoodRecommendation = "Petha from Panchhi Petha Agra"
                ),
                Place(
                    id = "up_varanasi_ghats",
                    name = "Varanasi Ghats & Kashi Vishwanath",
                    city = "Varanasi",
                    state = "Uttar Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1561361513-2d000a50f0dc?auto=format&fit=crop&w=1000&q=80",
                    description = "One of the world's oldest continuously inhabited cities, where 84 stone ghats step down to the holy Ganga.",
                    culturalSignificance = "Spiritual nucleus of Hindu philosophy, music, and liberation (Moksha).",
                    tags = listOf("Ancient City", "Ganga Aarti", "Spiritual Heart"),
                    nearbyAttractions = listOf("Dashashwamedh Ghat", "Sarnath", "Assi Ghat"),
                    localFoodRecommendation = "Kachori Jalebi breakfast and Banarasi Meetha Paan"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "up_trad_chikankari",
                    name = "Lucknawi Chikankari Needlecraft",
                    state = "Uttar Pradesh",
                    category = "Textile Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Delicate shadow work embroidery practiced for centuries in the royal courts of Awadh, utilizing 32 distinct hand-stitch patterns.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "up_dance_kathak",
                    name = "Kathak",
                    state = "Uttar Pradesh",
                    origin = "Temples & Awadh Courts",
                    description = "One of eight classical dances of India, famous for rhythmic footwork accompanied by hundred ankle bells (ghungroos).",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Silk angrakha coat, tight churidar, heavy brass ankle bells",
                    accompaniment = "Tabla, Sarangi, Pakhawaj, Bols"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "up_music_thumri",
                    title = "Benaras Thumri & Dadra",
                    region = "Purvanchal",
                    state = "Uttar Pradesh",
                    instruments = "Shehnai, Tabla, Harmonium, Tanpura",
                    description = "Sensuous semi-classical musical genre capturing poetic yearning and devotion to Krishna.",
                    audioDuration = "4:20",
                    genre = "Semi-Classical",
                    name = "Benaras Thumri"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "up_food_biryani",
                    name = "Awadhi Dum Biryani",
                    state = "Uttar Pradesh",
                    description = "Fragrant basmati rice and marinated meat sealed in a clay handi with dough and gently slow-cooked over coal embers.",
                    isVeg = false,
                    whereToTry = "Dastarkhwan & Idrees Biryani, Lucknow",
                    imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Subtle, Saffron-scented, Kewra infused"
                ),
                FoodDish(
                    id = "up_food_galouti",
                    name = "Galouti Kebab",
                    state = "Uttar Pradesh",
                    description = "Melt-in-mouth minced kebab spiced with 160 aromatic herbs, invented for the toothless Nawab Asaf-ud-Daula.",
                    isVeg = false,
                    whereToTry = "Tunday Kababi, Chowk, Lucknow",
                    imageUrl = "https://images.unsplash.com/photo-1599488615731-7e5c2823ff28?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Velvety texture, Warm spices, Cardamom smoke"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "up_rest_tunday",
                    name = "Tunday Kababi Since 1905",
                    city = "Lucknow",
                    state = "Uttar Pradesh",
                    cuisine = "Awadhi Royal Kebabs",
                    rating = 4.9f,
                    priceIndicator = "₹₹",
                    description = "Historic family run legend in Chowk serving the world's softest spiced galouti kebabs with Ulte Tawe Ka Paratha.",
                    mustTryDish = "Galouti Kebab with Sheermal"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "up_event_kumbh",
                    name = "Prayagraj Kumbh Mela",
                    location = "Triveni Sangam, Prayagraj",
                    state = "Uttar Pradesh",
                    dateText = "Cyclic (Next Maha Kumbh)",
                    category = "UNESCO Intangible Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1561361513-2d000a50f0dc?auto=format&fit=crop&w=800&q=80",
                    description = "The largest peaceful gathering of humanity on earth at the holy confluence of Ganga, Yamuna, and mythical Saraswati."
                )
            ),
            preservationStory = PreservationStory(
                title = "Saving the Heritage Wooden Loom Weavers of Varanasi",
                craftOrTradition = "Pure Katan Silk & Zari Weaving",
                community = "Mubarakpur & Varanasi Weaver Guilds",
                challenge = "Synthetic Chinese threads and electric power looms threaten hand-punched jacquard master craftsmen.",
                preservationAction = "Geographical Indication certification and direct weaver artisan collectives."
            )
        )
    )
}
