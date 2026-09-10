package com.example.data

object CulturalRepository {

    val states: List<IndianState> = listOf(
        IndianState(
            id = "rajasthan",
            name = "Rajasthan",
            hindiName = "राजस्थान",
            capital = "Jaipur",
            region = "West",
            tagline = "Where every fort tells a story",
            description = "The Land of Kings, Rajasthan is a vibrant realm of majestic hill forts, opulent royal palaces, stirring folk melodies, and golden Thar sand dunes.",
            heroImageUrl = "https://images.unsplash.com/photo-1599661046289-e31897846e41?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.28f,
            mapY = 0.38f,
            colorHex = 0xFFE65100, // Saffron orange
            iconicHighlight = "Amber Fort • Ghoomar • Dal Baati Churma",
            danceHighlight = "Ghoomar & Kalbelia",
            musicHighlight = "Manganiyar Folk & Ravanahatha",
            foodHighlight = "Dal Baati Churma & Ker Sangri",
            heritageCount = 14,
            places = listOf(
                Place(
                    id = "rj_amber_fort",
                    name = "Amber Fort",
                    city = "Jaipur",
                    state = "Rajasthan",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "Perched high on the Aravalli hills, Amber Fort blends Hindu and Mughal architecture with the breathtaking Sheesh Mahal (Mirror Palace).",
                    culturalSignificance = "Seat of Kachwaha Rajput rulers, renowned for intricate mirror work reflecting light throughout royal chambers.",
                    tags = listOf("UNESCO World Heritage", "Hill Fort", "Rajput Royalty"),
                    nearbyAttractions = listOf("Jaigarh Fort", "Hawa Mahal", "Jal Mahal"),
                    localFoodRecommendation = "Pyaaz Kachori at Rawat Mishtan Bhandar"
                ),
                Place(
                    id = "rj_city_palace_udaipur",
                    name = "City Palace & Lake Pichola",
                    city = "Udaipur",
                    state = "Rajasthan",
                    imageUrl = "https://images.unsplash.com/photo-1615836245337-f5b9b2303f10?auto=format&fit=crop&w=1000&q=80",
                    description = "A magnificent palace complex towering over the serene Lake Pichola, showcasing Mewar court art and silver craftsmanship.",
                    culturalSignificance = "Historic heart of Mewar bravery, preserving peacock mosaics, silver buggies, and historic armories.",
                    tags = listOf("Lakeside Palace", "Mewar Art", "Architecture"),
                    nearbyAttractions = listOf("Jag Mandir", "Saheliyon Ki Bari", "Bagore Ki Haveli"),
                    localFoodRecommendation = "Authentic Gatte Ki Sabzi with Bajra Roti"
                ),
                Place(
                    id = "rj_mehrangarh",
                    name = "Mehrangarh Fort",
                    city = "Jodhpur",
                    state = "Rajasthan",
                    imageUrl = "https://images.unsplash.com/photo-1504705759706-c5ee715808bb?auto=format&fit=crop&w=1000&q=80",
                    description = "One of India's most colossal forts rising 400 feet above the Blue City, harboring palaces carved from living rock.",
                    culturalSignificance = "Custodian of royal palanquins, turbans, and rare miniature paintings.",
                    tags = listOf("Blue City", "Colossal Fort", "Living Heritage"),
                    nearbyAttractions = listOf("Jaswant Thada", "Umaid Bhawan Palace", "Mandore Gardens"),
                    localFoodRecommendation = "Mirchi Vada with sweet Makhaniya Lassi"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "rj_trad_kathputli",
                    name = "Kathputli String Puppetry",
                    state = "Rajasthan",
                    category = "Endangered Folk Art",
                    imageUrl = "https://images.unsplash.com/photo-1596402184320-417e7178b2cd?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient string puppetry practiced by the Bhat community to narrate historical ballads of hero kings like Amar Singh Rathore.",
                    isEndangered = true,
                    preservationStatus = "Preservation Priority: Active documentation by community keepers"
                ),
                Tradition(
                    id = "rj_trad_blue_pottery",
                    name = "Jaipur Blue Pottery",
                    state = "Rajasthan",
                    category = "Heritage Craft",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Turquoise glazed earthenware crafted without clay, using powdered quartz stone, glass, and natural gum.",
                    isEndangered = false,
                    preservationStatus = "GI Tagged Handicraft"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "rj_dance_ghoomar",
                    name = "Ghoomar",
                    state = "Rajasthan",
                    origin = "Bhil tribe & Rajput Royal Courts",
                    description = "Graceful pirouettes executed by women in shimmering ghagras, displaying elegant arm movements and veil gestures.",
                    imageUrl = "https://images.unsplash.com/photo-1582233479366-6d38bc390a08?auto=format&fit=crop&w=800&q=80",
                    costume = "Swirling pleated Ghagra-Choli with Gold Gota Patti",
                    accompaniment = "Dhol, Nagada, and Manjira"
                ),
                DanceItem(
                    id = "rj_dance_kalbelia",
                    name = "Kalbelia (Snake Charmer Dance)",
                    state = "Rajasthan",
                    origin = "Nomadic Kalbelia community",
                    description = "Sensuous, acrobatic dance mirroring the serpentine movements of cobras, recognized by UNESCO as Intangible Cultural Heritage.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Black embroidered costume adorned with silver mirrors and beads",
                    accompaniment = "Poongi (snake flute) and Dufli percussion"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "rj_music_manganiyar",
                    name = "Manganiyar Ballads & Khartal",
                    title = "Manganiyar Desert Harmonies",
                    region = "Thar Desert",
                    state = "Rajasthan",
                    instruments = "Khartal (wooden castanets), Kamaicha, Morchang",
                    description = "Complex rhythmic folk songs passed down orally through centuries, celebrating seasonal monsoons and desert lore.",
                    audioDuration = "3:45",
                    genre = "Desert Folk Oral Tradition"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "rj_food_dalbaati",
                    name = "Dal Baati Churma",
                    state = "Rajasthan",
                    description = "Hard wheat dumplings baked over cow dung embers, dipped in desi ghee, served with five-lentil Panchmel dal and sweet crushed churma.",
                    isVeg = true,
                    whereToTry = "Chokhi Dhani, Jaipur & Laxmi Mishthan Bhandar",
                    imageUrl = "https://images.unsplash.com/photo-1626777552726-4a6b54c97e46?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Hearty, aromatic ghee, spicy cumin-coriander tempered dal"
                ),
                FoodDish(
                    id = "rj_food_ghevar",
                    name = "Malai Ghevar",
                    state = "Rajasthan",
                    description = "Honeycomb-textured disc made from flour and ghee, soaked in saffron sugar syrup and topped with thick rabdi and pistachios.",
                    isVeg = true,
                    whereToTry = "Rawat Mishthan Bhandar, Jaipur",
                    imageUrl = "https://images.unsplash.com/photo-1599488615731-7e5c2823ff28?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Crispy, syrup-soaked, rich cardamom cream"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "rj_rest_1",
                    name = "1135 AD - Royal Dining",
                    city = "Jaipur",
                    state = "Rajasthan",
                    cuisine = "Royal Rajasthani & Awadhi",
                    rating = 4.8f,
                    priceIndicator = "₹₹₹",
                    description = "Dine like royals atop Amber Fort with gold-leaf walls and live Santoor music.",
                    mustTryDish = "Thal-e-Mewar (Traditional Thali)"
                ),
                RestaurantSpot(
                    id = "rj_rest_2",
                    name = "LMB (Laxmi Mishthan Bhandar)",
                    city = "Jaipur",
                    state = "Rajasthan",
                    cuisine = "Traditional Rajasthani Sweets & Thali",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Iconic Johari Bazaar establishment serving pure ghee delicacies since 1727.",
                    mustTryDish = "Rajasthani Royal Thali & Ghevar"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "rj_event_pushkar",
                    name = "Pushkar Camel & Cultural Fair",
                    location = "Pushkar Lake",
                    state = "Rajasthan",
                    dateText = "November (Kartik Purnima)",
                    category = "Sacred Festival & Livestock Fair",
                    imageUrl = "https://images.unsplash.com/photo-1544735716-392fe2489ffa?auto=format&fit=crop&w=800&q=80",
                    description = "Spectacular congregation of over 50,000 decorated camels, folk dancers, turbans, and sacred ghat prayers."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving the Dying Strings of Kathputli",
                craftOrTradition = "Bhat Community Puppetry & Wood Carving",
                community = "Kathputli Colony, Jaipur & Delhi",
                challenge = "Modern digital entertainment has marginalized hereditary puppeteer families, threatening 1000-year oral ballads.",
                preservationAction = "Digital storytelling archive with school outreach workshops and fair-wage direct artisan performances."
            )
        ),
        IndianState(
            id = "uttar_pradesh",
            name = "Uttar Pradesh",
            hindiName = "उत्तर प्रदेश",
            capital = "Lucknow",
            region = "North",
            tagline = "The Cradle of Civilizations & Sacred Rivers",
            description = "Spanning the sacred Ganges plains, Uttar Pradesh is the land of the timeless Taj Mahal, the ancient ghats of Varanasi, poetic Kathak, and Awadhi culinary splendor.",
            heroImageUrl = "https://images.unsplash.com/photo-1564507592333-c60657eea523?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.46f,
            mapY = 0.38f,
            colorHex = 0xFFB71C1C, // Deep royal red
            iconicHighlight = "Taj Mahal • Kathak • Awadhi Cuisine",
            danceHighlight = "Kathak Classical Dance",
            musicHighlight = "Benaras Gharana & Thumri",
            foodHighlight = "Awadhi Dum Biryani & Galouti Kebab",
            heritageCount = 18,
            places = listOf(
                Place(
                    id = "up_taj_mahal",
                    name = "Taj Mahal",
                    city = "Agra",
                    state = "Uttar Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1564507592333-c60657eea523?auto=format&fit=crop&w=1000&q=80",
                    description = "An ivory-white marble mausoleum on the south bank of Yamuna river, widely considered one of the universally admired masterpieces of world heritage.",
                    culturalSignificance = "Epitome of Mughal architecture and eternal romance, crafted with semi-precious stone inlay (Pietra Dura).",
                    tags = listOf("New 7 Wonders of the World", "UNESCO World Heritage", "Mughal Architecture"),
                    nearbyAttractions = listOf("Agra Fort", "Fatehpur Sikri", "Mehtab Bagh"),
                    localFoodRecommendation = "Agra Petha & Bedmi Puri with Aloo"
                ),
                Place(
                    id = "up_varanasi_ghats",
                    name = "Dashashwamedh Ghat & Ganga Aarti",
                    city = "Varanasi",
                    state = "Uttar Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1561359313-0639aad49ca6?auto=format&fit=crop&w=1000&q=80",
                    description = "The spiritual heart of Kashi, where priests perform synchronous sacred fire rituals with conch shells every twilight.",
                    culturalSignificance = "One of the oldest continuously inhabited cities on earth, central to Hindu philosophy and spiritual liberation.",
                    tags = listOf("Ancient City", "Ganga Aarti", "Spiritual Heritage"),
                    nearbyAttractions = listOf("Kashi Vishwanath Temple", "Sarnath", "Assi Ghat"),
                    localFoodRecommendation = "Banarasi Paan & Malaiyo (Winter Saffron Foam)"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "up_trad_chikankari",
                    name = "Lucknowi Chikankari Embroidery",
                    state = "Uttar Pradesh",
                    category = "Living Heritage Textile",
                    imageUrl = "https://images.unsplash.com/photo-1610030469983-98e550d6193c?auto=format&fit=crop&w=800&q=80",
                    description = "Delicate shadow work embroidery pioneered in the Mughal and Awadhi courts with 32 distinct needle stitches on muslin.",
                    isEndangered = false,
                    preservationStatus = "GI Tagged Intricate Craft"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "up_dance_kathak",
                    name = "Kathak",
                    state = "Uttar Pradesh",
                    origin = "Vedic Storytellers (Kathakas) & Lucknow Gharana",
                    description = "One of India's eight major classical dances, known for crisp footwork (Tatkar), lightning spins (Chakkars), and subtle facial abhinaya.",
                    imageUrl = "https://images.unsplash.com/photo-1547153760-18fc86324498?auto=format&fit=crop&w=800&q=80",
                    costume = "Silk Anarkali or Dhoti with 100+ Ghungroos tied around ankles",
                    accompaniment = "Tabla, Pakhawaj, Sarangi, and Padhant (spoken bols)"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "up_music_thumri",
                    name = "Benaras Thumri & Dadra",
                    title = "Benaras Semi-Classical Thumri",
                    region = "Kashi & Awadh",
                    state = "Uttar Pradesh",
                    instruments = "Shehnai, Sarangi, Tabla",
                    description = "Romantic and devotional lyrical forms expressing deep emotional longing, nurtured along the banks of River Ganga.",
                    audioDuration = "4:12",
                    genre = "Hindustani Semi-Classical"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "up_food_biryani",
                    name = "Awadhi Dum Biryani",
                    state = "Uttar Pradesh",
                    description = "Slow-cooked rice and tender meat marinated in saffron, kewra, and mace, sealed with dough over low charcoal embers.",
                    isVeg = false,
                    whereToTry = "Dastarkhwan & Idris Biryani, Lucknow",
                    imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Subtle, aromatic floral spices, melt-in-mouth rice"
                ),
                FoodDish(
                    id = "up_food_galouti",
                    name = "Galouti Kebab (Cultural Heritage)",
                    state = "Uttar Pradesh",
                    description = "Legendary Nawabi kebab tenderized with 160 aromatic herbs and spices, originally invented for the toothless Nawab Asaf-ud-Daula.",
                    isVeg = false,
                    whereToTry = "Tunday Kababi (Est. 1905), Aminabad, Lucknow",
                    imageUrl = "https://images.unsplash.com/photo-1599488615731-7e5c2823ff28?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Silky texture that literally melts on the tongue"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "up_rest_tunday",
                    name = "Tunday Kababi",
                    city = "Lucknow",
                    state = "Uttar Pradesh",
                    cuisine = "Authentic Awadhi Heritage",
                    rating = 4.9f,
                    priceIndicator = "₹₹",
                    description = "Centuries-old legendary eatery famed across the subcontinent for secret spice blends.",
                    mustTryDish = "Galouti Kebab with Ulte Tawe Ka Paratha"
                ),
                RestaurantSpot(
                    id = "up_rest_kashi",
                    name = "Kashi Chat Bhandar",
                    city = "Varanasi",
                    state = "Uttar Pradesh",
                    cuisine = "Traditional Banarasi Street Chaat",
                    rating = 4.8f,
                    priceIndicator = "₹",
                    description = "Vibrant local institution serving clay kulhad snacks near the sacred temple lanes.",
                    mustTryDish = "Tamatar Chaat & Dahi Chutney Golgappe"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "up_event_kumbh",
                    name = "Maha Kumbh & Dev Deepawali",
                    location = "Prayagraj & Varanasi",
                    state = "Uttar Pradesh",
                    dateText = "Kartik Purnima / Kumbh Cycle",
                    category = "World's Largest Spiritual Gathering",
                    imageUrl = "https://images.unsplash.com/photo-1561359313-0639aad49ca6?auto=format&fit=crop&w=800&q=80",
                    description = "Millions of clay lamps illuminate the crescent banks of the Ganga as pilgrims gather for sacred dips."
                )
            ),
            preservationStory = PreservationStory(
                title = "Conserving the Benarasi Zari Weavers",
                craftOrTradition = "Handloom Kadwa Silk Weaving",
                community = "Ansari Weavers of Varanasi",
                challenge = "Powerloom replication threatens authentic hand-reeled pure silver zari weaving that takes 6 months per saree.",
                preservationAction = "Direct-to-patron traceability and GI protection certifying handwoven heritage loom pieces."
            )
        ),
        IndianState(
            id = "punjab",
            name = "Punjab",
            hindiName = "पंजाब",
            capital = "Chandigarh",
            region = "North",
            tagline = "The Land of Five Rivers & Valiant Hearts",
            description = "Famed for its boundless warmth, golden mustard fields, rich agricultural heritage, and the divine Golden Temple of Amritsar.",
            heroImageUrl = "https://images.unsplash.com/photo-1514222134-b57cbb8ce073?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.35f,
            mapY = 0.22f,
            colorHex = 0xFFF59E0B, // Mustard yellow
            iconicHighlight = "Golden Temple • Bhangra • Makki di Roti",
            danceHighlight = "Bhangra & Giddha",
            musicHighlight = "Sufi Qawwali & Dhol Beats",
            foodHighlight = "Makki di Roti with Sarson da Saag",
            heritageCount = 10,
            places = listOf(
                Place(
                    id = "pb_golden_temple",
                    name = "Sri Harmandir Sahib (Golden Temple)",
                    city = "Amritsar",
                    state = "Punjab",
                    imageUrl = "https://images.unsplash.com/photo-1514222134-b57cbb8ce073?auto=format&fit=crop&w=1000&q=80",
                    description = "Gilded in pure gold leaf in the center of the sacred Amrit Sarovar pool, serving free community meals (Langar) to over 100,000 people daily.",
                    culturalSignificance = "Holiest shrine of Sikhism, embodying universal equality, humility, and selfless service (Seva).",
                    tags = listOf("Spiritual Sanctuary", "World's Largest Kitchen", "Sikh Heritage"),
                    nearbyAttractions = listOf("Jallianwala Bagh", "Wagah Border", "Partition Museum"),
                    localFoodRecommendation = "Amritsari Kulcha with Chole & Sweet Lassi"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "pb_trad_phulkari",
                    name = "Phulkari Folk Embroidery",
                    state = "Punjab",
                    category = "Folk Textile Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1610030469983-98e550d6193c?auto=format&fit=crop&w=800&q=80",
                    description = "Meaning 'flower work', geometric floral embroidery done with unspun silk floss on handspun khaddar cloth.",
                    isEndangered = false,
                    preservationStatus = "Living Punjabi Bridal Heritage"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "pb_dance_bhangra",
                    name = "Bhangra",
                    state = "Punjab",
                    origin = "Baisakhi Harvest Celebrations",
                    description = "High-energy rhythmic celebration characterized by athletic leaps, shoulder shrugs, and joyous cries of 'Haddippa!'.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Vibrant Pagri turban with Turla fan and lungi-kurta",
                    accompaniment = "Barrel dhol, chimta, and algoze flutes"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "pb_music_folk",
                    name = "Punjabi Boliyan & Dhol Tappe",
                    title = "Punjabi Harvest Rhythm",
                    region = "Majha & Malwa",
                    state = "Punjab",
                    instruments = "Dhol, Tumbi, Algoza, Chimta",
                    description = "Infectious beats and couplets expressing love, agrarian hard work, and patriotic valor.",
                    audioDuration = "3:20",
                    genre = "Energetic Folk Rhythm"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "pb_food_saag",
                    name = "Sarson da Saag & Makki di Roti",
                    state = "Punjab",
                    description = "Slow-cooked fresh mustard leaves, bathua, and spinach simmered with ginger, garlic, and white butter, served with cornmeal flatbread.",
                    isVeg = true,
                    whereToTry = "Kesar Da Dhaba, Amritsar & Village Haveli, Jalandhar",
                    imageUrl = "https://images.unsplash.com/photo-1626777552726-4a6b54c97e46?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Earthy greens, rich white butter, sweet jaggery balance"
                ),
                FoodDish(
                    id = "pb_food_kulcha",
                    name = "Amritsari Stuffed Kulcha",
                    state = "Punjab",
                    description = "Layered, flaky tandoor-baked flatbread stuffed with spiced potatoes and cauliflower, crushed by hand and drenched in butter.",
                    isVeg = true,
                    whereToTry = "Bhai Kulwant Singh Kulchian Wale, Amritsar",
                    imageUrl = "https://images.unsplash.com/photo-1601050690597-df0568f70950?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Crisp outer crust, tangy pomegranate seed filling"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "pb_rest_kesar",
                    name = "Kesar Da Dhaba (Est. 1916)",
                    city = "Amritsar",
                    state = "Punjab",
                    cuisine = "Authentic Punjabi Heritage Dhaba",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Historic dhaba celebrated for slow-simmered Mah di Dal that cooks overnight for 12 hours.",
                    mustTryDish = "Dal Makhani with Lachha Paratha & Phirni"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "pb_event_baisakhi",
                    name = "Baisakhi & Hola Mohalla",
                    location = "Anandpur Sahib",
                    state = "Punjab",
                    dateText = "April / March",
                    category = "Harvest & Martial Arts Festival",
                    imageUrl = "https://images.unsplash.com/photo-1514222134-b57cbb8ce073?auto=format&fit=crop&w=800&q=80",
                    description = "Martial display of Gatka sword fights, horse stunts, and mass celebration of Sikh heritage."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving the Tumbi and Rare Algoze Makers",
                craftOrTradition = "Single-String Tumbi & Double-Flute Crafting",
                community = "Malwa Rural Folk Instrument Makers",
                challenge = "Digital synthesizers have replaced organic wooden instruments made from seasoned tunti wood.",
                preservationAction = "Establishing rural instrument artisan guilds with cultural heritage scholarships."
            )
        ),
        IndianState(
            id = "kerala",
            name = "Kerala",
            hindiName = "केरल",
            capital = "Thiruvananthapuram",
            region = "South",
            tagline = "God's Own Country - Nature's Masterpiece",
            description = "A coastal paradise where emerald backwaters meander past coconut palms, Ayurvedic wisdom thrives, and Kathakali dancers bring ancient epics to life.",
            heroImageUrl = "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.38f,
            mapY = 0.88f,
            colorHex = 0xFF00695C, // Peacock teal green
            iconicHighlight = "Backwaters • Kathakali • Onam Sadya",
            danceHighlight = "Kathakali & Mohiniyattam",
            musicHighlight = "Sopana Sangeetham & Chenda Melam",
            foodHighlight = "Appam with Stew & Onam Sadya",
            heritageCount = 12,
            places = listOf(
                Place(
                    id = "kl_alleppey",
                    name = "Alleppey Backwaters & Kettuvallam",
                    city = "Alappuzha",
                    state = "Kerala",
                    imageUrl = "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=1000&q=80",
                    description = "Glide silently through tranquil palm-fringed lagoons on traditional thatched houseboats constructed without a single nail.",
                    culturalSignificance = "Historic spice trade waterways linking village communities with sustainable coir ecosystems.",
                    tags = listOf("Backwaters", "Eco-Heritage", "Houseboat"),
                    nearbyAttractions = listOf("Marari Beach", "Kumarakom Bird Sanctuary", "Vembanad Lake"),
                    localFoodRecommendation = "Karimeen Pollichathu (Pearl Spot baked in banana leaf)"
                ),
                Place(
                    id = "kl_fort_kochi",
                    name = "Fort Kochi & Chinese Fishing Nets",
                    city = "Kochi",
                    state = "Kerala",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "Cantilevered mechanical fishing nets established in the 14th century, set against colonial Portuguese and Dutch synagogues.",
                    culturalSignificance = "Gateway of global spice diplomacy connecting Arabia, China, and Europe for two millennia.",
                    tags = listOf("Historic Port", "Spice Route", "Maritime"),
                    nearbyAttractions = listOf("Mattancherry Palace", "Jew Town", "St. Francis Church"),
                    localFoodRecommendation = "Malabar Parotta with Pepper Stew"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "kl_trad_kalaripayattu",
                    name = "Kalaripayattu Martial Art",
                    state = "Kerala",
                    category = "Ancient Martial Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    description = "One of the oldest fighting systems in existence, integrating flexibility strikes, weapon training, and Ayurvedic pressure points (Marma).",
                    isEndangered = true,
                    preservationStatus = "Cultural Preservation Priority: Kalari Gurukul Documentation"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "kl_dance_kathakali",
                    name = "Kathakali",
                    state = "Kerala",
                    origin = "17th Century Temple Theatres of Travancore",
                    description = "Monumental classical dance-drama featuring elaborate facial paint (Chutti), stylized eye movements (Navarasas), and mythological grandeur.",
                    imageUrl = "https://images.unsplash.com/photo-1582233479366-6d38bc390a08?auto=format&fit=crop&w=800&q=80",
                    costume = "Towering Kireedam crowns, layered skirts, and painted face masks",
                    accompaniment = "Chenda, Maddalam drums, and vocal Sopanam singing"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "kl_music_chenda",
                    name = "Panchavadyam & Chenda Melam",
                    title = "Temple Percussion Symphony",
                    region = "Thrissur & Malabar",
                    state = "Kerala",
                    instruments = "Chenda, Ilathalam, Maddalam, Kombu horn",
                    description = "A thunderous symphony of 100+ percussionists escalating into an ecstatic temple celebration.",
                    audioDuration = "5:10",
                    genre = "Temple Percussion Heritage"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "kl_food_sadya",
                    name = "Onam Grand Sadya",
                    state = "Kerala",
                    description = "A pure vegetarian royal banquet of 26 dishes served on a fresh plantain leaf, including Avial, Olan, Thoran, and Payasam.",
                    isVeg = true,
                    whereToTry = "Mothers Veg Plaza, Thiruvananthapuram",
                    imageUrl = "https://images.unsplash.com/photo-1610057099443-fde8c4d50f91?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Coconut oil, curry leaves, fermented jaggery, raw mango"
                ),
                FoodDish(
                    id = "kl_food_appam",
                    name = "Appam with Vegetable Stew",
                    state = "Kerala",
                    description = "Crispy-edged fermented rice pancake with a soft pillowy center, paired with mild coconut milk vegetable stew.",
                    isVeg = true,
                    whereToTry = "Grand Pavilion, Kochi",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Creamy coconut milk, cinnamon, green cardamom aroma"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "kl_rest_malabar",
                    name = "Paragon Restaurant (Est. 1939)",
                    city = "Kozhikode & Kochi",
                    state = "Kerala",
                    cuisine = "Authentic Malabar & Coastal Heritage",
                    rating = 4.9f,
                    priceIndicator = "₹₹",
                    description = "World-renowned culinary landmark voted among the most legendary restaurants on the globe.",
                    mustTryDish = "Malabar Dum Biryani & Elaneer Payasam (Tender Coconut)"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "kl_event_thrissur",
                    name = "Thrissur Pooram",
                    location = "Vadakkunnathan Temple, Thrissur",
                    state = "Kerala",
                    dateText = "April / May (Medam Month)",
                    category = "Temple Pageant & Kudamattom",
                    imageUrl = "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=800&q=80",
                    description = "The mother of all Poorams, featuring synchronized competitive umbrella displays atop caparisoned elephants."
                )
            ),
            preservationStory = PreservationStory(
                title = "Guarding Aranmula Kannadi Metal Mirrors",
                craftOrTradition = "Aranmula Metal Alloy Mirror Casting",
                community = "Vishwakarma Artisans of Aranmula",
                challenge = "Secret metallurgical formula known only to a few living master craftsmen; glass mirrors threaten survival.",
                preservationAction = "Master-apprentice lineage stipends and GI legal enforcement preventing counterfeit glass."
            )
        ),
        IndianState(
            id = "maharashtra",
            name = "Maharashtra",
            hindiName = "महाराष्ट्र",
            capital = "Mumbai",
            region = "West",
            tagline = "Land of Maratha Valour & Coastal Caves",
            description = "Home to the rock-cut wonders of Ajanta and Ellora, legendary Maratha mountain strongholds, vibrant Ganesh Utsav, and lively Lavani music.",
            heroImageUrl = "https://images.unsplash.com/photo-1570168007204-dfb528c6958f?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.35f,
            mapY = 0.55f,
            colorHex = 0xFFD97706,
            iconicHighlight = "Ajanta Caves • Lavani • Puran Poli",
            danceHighlight = "Lavani & Koli Dance",
            musicHighlight = "Natya Sangeet & Dhol-Tasha",
            foodHighlight = "Puran Poli & Misal Pav",
            heritageCount = 15,
            places = listOf(
                Place(
                    id = "mh_ajanta_ellora",
                    name = "Ajanta & Ellora Caves",
                    city = "Aurangabad (Chhatrapati Sambhajinagar)",
                    state = "Maharashtra",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "Monolithic Kailash Temple carved from a single basalt cliff, alongside 2000-year-old Buddhist rock fresco masterpieces.",
                    culturalSignificance = "Summit of rock-cut sculpture and early mural art celebrating harmony among Buddhist, Hindu, and Jain faiths.",
                    tags = listOf("UNESCO World Heritage", "Monolithic Kailash", "Ancient Murals"),
                    nearbyAttractions = listOf("Bibi Ka Maqbara", "Daulatabad Fort"),
                    localFoodRecommendation = "Naan Qalia & Hurda"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "mh_trad_warli",
                    name = "Warli Tribal Art",
                    state = "Maharashtra",
                    category = "Indigenous Folk Art",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Geometric line paintings using rice paste on red ochre mud walls depicting mother nature and the sacred Tarpa dance.",
                    isEndangered = false,
                    preservationStatus = "GI Tagged Tribal Heritage"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "mh_dance_lavani",
                    name = "Lavani",
                    state = "Maharashtra",
                    origin = "Peshwa Era Maratha Courts",
                    description = "Sensuous, quick-paced rhythmic dance accompanied by the beats of the Dholki, celebrating human romance and social commentary.",
                    imageUrl = "https://images.unsplash.com/photo-1582233479366-6d38bc390a08?auto=format&fit=crop&w=800&q=80",
                    costume = "Nine-yard Nauvari silk saree with traditional Kolhapuri Saaj jewelry",
                    accompaniment = "Dholki, Tuntuna, and Manjira"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "mh_music_dholtasha",
                    name = "Dhol-Tasha & Abhang",
                    title = "Ganesh Utsav Dhol Pathak",
                    region = "Pune & Konkan",
                    state = "Maharashtra",
                    instruments = "Puneri Dhol, Tasha, Zanj",
                    description = "Thunderous syncopated drumming troupes powering Mumbai and Pune streets during festival processions.",
                    audioDuration = "4:05",
                    genre = "Energetic Devotional Percussion"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "mh_food_puranpoli",
                    name = "Puran Poli with Katachi Amti",
                    state = "Maharashtra",
                    description = "Sweet flatbread stuffed with chana dal and jaggery spiced with nutmeg and cardamom, served with spicy strained lentil broth.",
                    isVeg = true,
                    whereToTry = "Aaswad & Prakash Shakahari, Dadar, Mumbai",
                    imageUrl = "https://images.unsplash.com/photo-1626777552726-4a6b54c97e46?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Subtle sweetness balanced by fiery ginger-chili amti"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "mh_rest_aaswad",
                    name = "Aaswad Upahar & Mithai Griha",
                    city = "Mumbai",
                    state = "Maharashtra",
                    cuisine = "Authentic Maharashtrian",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Winner of international culinary awards for its iconic spicy Misal Pav and Thalipeeth.",
                    mustTryDish = "Puneri Misal Pav & Kothimbir Vadi"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "mh_event_ganesh",
                    name = "Ganeshotsav & Lalbaugcha Raja",
                    location = "Mumbai & Pune",
                    state = "Maharashtra",
                    dateText = "Bhadrapada (August / September)",
                    category = "Cultural Unification Festival",
                    imageUrl = "https://images.unsplash.com/photo-1570168007204-dfb528c6958f?auto=format&fit=crop&w=800&q=80",
                    description = "10-day community festival initiated by Lokmanya Tilak, celebrating art, music, and dramatic idol immersions."
                )
            ),
            preservationStory = PreservationStory(
                title = "Documenting Warli Sacred Wall Lore",
                craftOrTradition = "Sacred Chowk Painting by Suvasinis",
                community = "Warli and Malkhar Koli Tribes",
                challenge = "Modern concrete homes lack traditional mud walls where sacred marital drawings were preserved.",
                preservationAction = "Canvas archiving and community guild workshops training younger indigenous youth."
            )
        ),
        IndianState(
            id = "gujarat",
            name = "Gujarat",
            hindiName = "गुजरात",
            capital = "Gandhinagar",
            region = "West",
            tagline = "Land of Colors, White Deserts & Legends",
            description = "A thriving coastal frontier of textile masters, Mahatma Gandhi's Sabarmati, the White Rann of Kutch, and 9 nights of ecstatic Navratri Garba.",
            heroImageUrl = "https://images.unsplash.com/photo-1596402184320-417e7178b2cd?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.22f,
            mapY = 0.48f,
            colorHex = 0xFFC05621,
            iconicHighlight = "Rann of Kutch • Garba • Gujarati Thali",
            danceHighlight = "Garba & Dandiya Raas",
            musicHighlight = "Sugam Sangeet & Dayro",
            foodHighlight = "Dhokla, Khandvi & Undhiyu",
            heritageCount = 11,
            places = listOf(
                Place(
                    id = "gj_rann_kutch",
                    name = "White Rann of Kutch",
                    city = "Dhordo, Kutch",
                    state = "Gujarat",
                    imageUrl = "https://images.unsplash.com/photo-1596402184320-417e7178b2cd?auto=format&fit=crop&w=1000&q=80",
                    description = "World's largest salt marsh desert glowing like liquid silver under the full moon, home to Kutchi embroidery villages.",
                    culturalSignificance = "Salt cradle of nomadic pastoral communities preserving Rogan art, bell making, and Ajrakh block prints.",
                    tags = listOf("White Desert", "Artisan Villages", "Salt Flat"),
                    nearbyAttractions = listOf("Kala Dungar", "Mandvi Beach", "Dholavira Harappan Site"),
                    localFoodRecommendation = "Kutchi Dabeli with roasted peanuts & garlic chutney"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "gj_trad_rogan",
                    name = "Rogan Art of Nirona",
                    state = "Gujarat",
                    category = "Endangered Folk Art",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Painting on fabric using castor oil paste and natural pigments worked with a blunt metal stylus—practiced by only one family on earth.",
                    isEndangered = true,
                    preservationStatus = "Critically Endangered Heritage Craft"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "gj_dance_garba",
                    name = "Garba",
                    state = "Gujarat",
                    origin = "Garbha Deep Temple Devotion",
                    description = "UNESCO Intangible Cultural Heritage: circular dance around a sacred clay lamp, honoring feminine divine energy (Shakti).",
                    imageUrl = "https://images.unsplash.com/photo-1547153760-18fc86324498?auto=format&fit=crop&w=800&q=80",
                    costume = "Chaniya Choli with mirror work, cowrie shells, and silver oxidized ornaments",
                    accompaniment = "Dhol, harmonium, and clapped talis"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "gj_music_dayro",
                    name = "Kutchi Dayro & Santvani",
                    title = "Kathiyawadi Folk Ballad",
                    region = "Saurashtra & Kutch",
                    state = "Gujarat",
                    instruments = "Ektaro, Manjira, Tabla",
                    description = "Nightlong open-air storytelling sessions weaving spiritual philosophy with historical folklore.",
                    audioDuration = "3:55",
                    genre = "Folk Philosophy Discourse"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "gj_food_thali",
                    name = "Grand Gujarati Thali with Undhiyu",
                    state = "Gujarat",
                    description = "Winter vegetable casserole cooked upside down in earthen pots with wild herbs, served with Puri, Shrikhand, and Dal.",
                    isVeg = true,
                    whereToTry = "Agashiye & Vishalla, Ahmedabad",
                    imageUrl = "https://images.unsplash.com/photo-1610057099443-fde8c4d50f91?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Harmonious blend of sweet, sour, salty, and spicy in every bite"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "gj_rest_agashiye",
                    name = "Agashiye (On the Terrace)",
                    city = "Ahmedabad",
                    state = "Gujarat",
                    cuisine = "Royal Gujarati Thali",
                    rating = 4.8f,
                    priceIndicator = "₹₹₹",
                    description = "Set in a 1920s heritage haveli, featuring terrace dining and warm Gujarati hospitality.",
                    mustTryDish = "Undhiyu, Rasawala Khaman & Kesar Shrikhand"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "gj_event_rannutsav",
                    name = "Rann Utsav & Uttarayan (Kite Festival)",
                    location = "Dhordo & Ahmedabad",
                    state = "Gujarat",
                    dateText = "November to February / January 14",
                    category = "Desert Culture & Skies of Kites",
                    imageUrl = "https://images.unsplash.com/photo-1596402184320-417e7178b2cd?auto=format&fit=crop&w=800&q=80",
                    description = "Tens of thousands of kaleidoscopic kites soar over rooftops while desert folk dancers light up Kutch nights."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving the Sole Living Lineage of Rogan Art",
                craftOrTradition = "Castor Oil Fabric Art",
                community = "Khatri Family of Nirona Village",
                challenge = "Labor-intensive 20-day oil boiling process and lack of apprentices almost wiped out the 400-year-old art form.",
                preservationAction = "Establishment of women's training workshops and government gift presentation status."
            )
        ),
        IndianState(
            id = "west_bengal",
            name = "West Bengal",
            hindiName = "पश्चिम बंगाल",
            capital = "Kolkata",
            region = "East",
            tagline = "The Cultural Capital & Sweet Soul of Bengal",
            description = "Cradle of the Bengal Renaissance, Nobel laureates, Rabindrasangeet, terracotta temples of Bishnupur, and the grand spectacle of Durga Puja.",
            heroImageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.65f,
            mapY = 0.48f,
            colorHex = 0xFF7C2D12,
            iconicHighlight = "Victoria Memorial • Durga Puja • Rosogolla",
            danceHighlight = "Chhau & Gaudiya Nritya",
            musicHighlight = "Rabindra Sangeet & Baul Gaan",
            foodHighlight = "Kosha Mangsho, Shorshe Ilish & Sandesh",
            heritageCount = 13,
            places = listOf(
                Place(
                    id = "wb_victoria_memorial",
                    name = "Victoria Memorial & Howrah Bridge",
                    city = "Kolkata",
                    state = "West Bengal",
                    imageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=1000&q=80",
                    description = "Majestic white Makrana marble monument set in sprawling gardens, paired with the iconic cantilevered Howrah Bridge over the Hooghly.",
                    culturalSignificance = "Epicenter of the Bengal literary and philosophical revolution led by Tagore and Vivekananda.",
                    tags = listOf("Colonial Heritage", "Museum", "Hooghly River"),
                    nearbyAttractions = listOf("Dakshineswar Kali Temple", "Indian Museum", "Princep Ghat"),
                    localFoodRecommendation = "Kolkata Kathi Roll at Nizam's & Mishti Doi"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "wb_trad_pattachitra",
                    name = "Bengal Pattachitra & Scroll Ballads",
                    state = "West Bengal",
                    category = "Oral Storytelling & Folk Painting",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Scroll painters (Patuas) who paint narrative scrolls using mineral colors and unroll them while singing self-composed ballads (Pater Gaan).",
                    isEndangered = true,
                    preservationStatus = "Preservation Priority: Intangible Cultural Heritage"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "wb_dance_chhau",
                    name = "Purulia Chhau",
                    state = "West Bengal",
                    origin = "Purulia Martial & Tribal Ballads",
                    description = "Acrobatic martial dance featuring giant colorful papier-mâché masks depicting gods and demons from Hindu epics.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Intricate masks with peacock feathers and tinsel decorations",
                    accompaniment = "Dhol, Dhamsa kettle drums, and Shehnai"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "wb_music_baul",
                    name = "Baul Mystic Songs",
                    title = "Baul Mystic Folk Music",
                    region = "Birbhum & Nadia",
                    state = "West Bengal",
                    instruments = "Ektara, Dotara, Khamak, Dubki",
                    description = "UNESCO Intangible Heritage: soulful wandering minstrel poetry seeking divinity within the human heart.",
                    audioDuration = "4:30",
                    genre = "Mystic Wandering Minstrel"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "wb_food_ilish",
                    name = "Shorshe Ilish & Kosha Mangsho",
                    state = "West Bengal",
                    description = "Hilsa fish cooked in pungent mustard paste and green chilies, or slow-caramelized spiced mutton with fluffy Luchis.",
                    isVeg = false,
                    whereToTry = "6 Ballygunge Place & Oh! Calcutta, Kolkata",
                    imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Sharp mustard zest, mustard oil aroma, rich caramelized onion"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "wb_rest_6bp",
                    name = "6 Ballygunge Place",
                    city = "Kolkata",
                    state = "West Bengal",
                    cuisine = "Centuries-Old Bengali Zamindari",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Housed in a restored 19th-century white townhouse serving authentic recipes preserved from Tagore family cookbooks.",
                    mustTryDish = "Daab Chingri (Prawns in tender coconut) & Baked Sandesh"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "wb_event_durgapuja",
                    name = "Kolkata Durga Puja",
                    location = "Kolkata",
                    state = "West Bengal",
                    dateText = "Ashwin (September / October)",
                    category = "UNESCO Intangible Cultural Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=800&q=80",
                    description = "The world's largest open-air art installation festival, turning entire city avenues into temporary architectural wonders."
                )
            ),
            preservationStory = PreservationStory(
                title = "Safeguarding Bengal's Patua Scroll Singers",
                craftOrTradition = "Pater Gaan Oral Song Tradition",
                community = "Pingla Village Patuas",
                challenge = "Print media and streaming platforms have diminished audience patronage for village scroll storytelling.",
                preservationAction = "Establishing Pingla artisan village as a living interactive community museum."
            )
        ),
        IndianState(
            id = "tamil_nadu",
            name = "Tamil Nadu",
            hindiName = "तमिलनाडु",
            capital = "Chennai",
            region = "South",
            tagline = "Land of Towering Gopurams & Classical Grace",
            description = "Bearer of one of the world's oldest surviving classical languages, majestic Chola bronzes, soaring Dravidian temple towers, and divine Bharatanatyam.",
            heroImageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.44f,
            mapY = 0.82f,
            colorHex = 0xFF831843,
            iconicHighlight = "Meenakshi Temple • Bharatanatyam • Filter Coffee",
            danceHighlight = "Bharatanatyam Classical",
            musicHighlight = "Carnatic Vocal & Nadaswaram",
            foodHighlight = "Crispy Ghee Dosa & Chettinad Pepper Curry",
            heritageCount = 16,
            places = listOf(
                Place(
                    id = "tn_meenakshi",
                    name = "Meenakshi Amman Temple",
                    city = "Madurai",
                    state = "Tamil Nadu",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1000&q=80",
                    description = "Architectural masterpiece featuring 14 towering Gopuram gateways covered in thousands of vibrant polychrome sculptures of deities.",
                    culturalSignificance = "Heart of ancient Tamil Sangam poetry and cultural renaissance dating back over 2,500 years.",
                    tags = listOf("Dravidian Architecture", "Ancient City", "Gopurams"),
                    nearbyAttractions = listOf("Thirumalai Nayakkar Mahal", "Gandhi Memorial Museum"),
                    localFoodRecommendation = "Jigarthanda (Famous Madurai almond gum nectar)"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "tn_trad_thanjavur",
                    name = "Thanjavur Gold Leaf Paintings",
                    state = "Tamil Nadu",
                    category = "Classical Art Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Sacred paintings made on jackfruit wood with limestone gesso relief, adorned with pure 22-karat gold foil and semi-precious gems.",
                    isEndangered = false,
                    preservationStatus = "Chola Royal Heritage Art"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "tn_dance_bharatanatyam",
                    name = "Bharatanatyam",
                    state = "Tamil Nadu",
                    origin = "Ancient Temple Dasi Tradition (Sadir)",
                    description = "Pristine geometry, sculptural poses (Aramandi), sophisticated hand mudras, and expressive eyes narrating sacred devotion.",
                    imageUrl = "https://images.unsplash.com/photo-1547153760-18fc86324498?auto=format&fit=crop&w=800&q=80",
                    costume = "Pleated silk sari fan, temple jewelry, and temple hair braid",
                    accompaniment = "Nattuvangam cymbals, Mridangam, Violin, and Carnatic vocals"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "tn_music_carnatic",
                    name = "Carnatic Classical & Nadaswaram",
                    title = "Carnatic Temple Melody",
                    region = "Kaveri Delta & Chennai",
                    state = "Tamil Nadu",
                    instruments = "Nadaswaram, Thavil, Veena, Mridangam",
                    description = "Rigorous microtonal Ragas and complex mathematical Talas perfected by the Trinity of Carnatic Music.",
                    audioDuration = "4:45",
                    genre = "South Indian Classical"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "tn_food_dosa",
                    name = "Crispy Ghee Roast Dosa & Filter Coffee",
                    state = "Tamil Nadu",
                    description = "Fermented rice and black gram crepe roasted crisp in golden ghee, served with coconut, tomato, and mint chutneys and steaming piping sambar.",
                    isVeg = true,
                    whereToTry = "Murugan Idli Shop & Saravana Bhavan, Chennai",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Tangy fermented crispness, aromatic roasted chicory coffee"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "tn_rest_murugan",
                    name = "Murugan Idli Shop",
                    city = "Madurai & Chennai",
                    state = "Tamil Nadu",
                    cuisine = "South Indian Tiffin Heritage",
                    rating = 4.8f,
                    priceIndicator = "₹",
                    description = "Legendary culinary institution famed for soft-as-cotton mallipoo idlis and four signature chutneys.",
                    mustTryDish = "Podi Idli drenched in Ghee & Degree Filter Coffee"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "tn_event_pongal",
                    name = "Pongal Harvest Festival & Jallikattu",
                    location = "Alanganallur & Thanjavur",
                    state = "Tamil Nadu",
                    dateText = "January (Thai Pongal)",
                    category = "Solar Harvest & Cattle Honor",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=800&q=80",
                    description = "Boiling sweet rice milk in painted clay pots until it overflows with joy, thanking sun, rain, and livestock."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving Ancient Chola Lost-Wax Bronze Casting",
                craftOrTradition = "Swamimalai Bronze Casting",
                community = "Stapathis of Swamimalai",
                challenge = "Modern machine molding threatens the hand-carved beeswax casting guidelines codified in the ancient Shilpa Shastras.",
                preservationAction = "Apprenticeship schools with traditional Sanskrit measurement system preservation."
            )
        ),
        IndianState(
            id = "karnataka",
            name = "Karnataka",
            hindiName = "कर्नाटक",
            capital = "Bengaluru",
            region = "South",
            tagline = "One State, Many Worlds of Stone & Silk",
            description = "From the golden stone ruins of the Vijayanagara Empire at Hampi to the sandalwood scents of royal Mysore Palace.",
            heroImageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b353?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.35f,
            mapY = 0.72f,
            colorHex = 0xFF4338CA,
            iconicHighlight = "Hampi Ruins • Mysore Palace • Mysore Pak",
            danceHighlight = "Yakshagana Dance-Drama",
            musicHighlight = "Carnatic & Haridasa Sahitya",
            foodHighlight = "Bisi Bele Bath & Mysore Pak",
            heritageCount = 14,
            places = listOf(
                Place(
                    id = "ka_hampi",
                    name = "Hampi Monuments & Stone Chariot",
                    city = "Vijayanagara",
                    state = "Karnataka",
                    imageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b353?auto=format&fit=crop&w=1000&q=80",
                    description = "Surreal boulder-strewn landscape sheltering the ruins of the grandest empire of medieval India, including the iconic stone chariot of Vittala Temple.",
                    culturalSignificance = "UNESCO World Heritage site representing the zenith of Vijayanagara architecture and musical stone pillars.",
                    tags = listOf("UNESCO World Heritage", "Ancient Ruins", "Stone Chariot"),
                    nearbyAttractions = listOf("Virupaksha Temple", "Lotus Mahal", "Tungabhadra River"),
                    localFoodRecommendation = "Davangere Benne Dosa (Butter Dosa)"
                ),
                Place(
                    id = "ka_mysore_palace",
                    name = "Mysore Palace (Amba Vilas)",
                    city = "Mysuru",
                    state = "Karnataka",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "Indo-Saracenic royal palace illuminated by nearly 100,000 incandescent light bulbs every Sunday evening.",
                    culturalSignificance = "Seat of the Wodeyar dynasty, home to the golden Howdah used in world-famous Dasara processions.",
                    tags = listOf("Royal Palace", "Dasara Festival", "Stained Glass"),
                    nearbyAttractions = listOf("Chamundi Hills", "Brindavan Gardens", "Somnathpur Temple"),
                    localFoodRecommendation = "Original Melt-in-Mouth Mysore Pak"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ka_trad_channapatna",
                    name = "Channapatna Wooden Lacquerware",
                    state = "Karnataka",
                    category = "Eco-Heritage Toy Craft",
                    imageUrl = "https://images.unsplash.com/photo-1596402184320-417e7178b2cd?auto=format&fit=crop&w=800&q=80",
                    description = "Hand-turned wooden toys coated with non-toxic natural vegetable dyes and lacquer, nicknamed the Toy Town of India.",
                    isEndangered = false,
                    preservationStatus = "GI Tagged Sustainable Craft"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ka_dance_yakshagana",
                    name = "Yakshagana",
                    state = "Karnataka",
                    origin = "Coastal Coastal Karnataka",
                    description = "Dramatic theatrical art combining powerful battle dialogues, towering headdresses (Mundasu), and high-energy spinning jumps.",
                    imageUrl = "https://images.unsplash.com/photo-1582233479366-6d38bc390a08?auto=format&fit=crop&w=800&q=80",
                    costume = "Elaborate multi-winged headgear, chest armor, and painted faces",
                    accompaniment = "Chande drum, Maddale, and Bhagavata lead singer"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ka_music_haridasa",
                    name = "Haridasa Keerthanas & Veena",
                    title = "Mysore Veena Tradition",
                    region = "Mysuru & Dharwad",
                    state = "Karnataka",
                    instruments = "Saraswati Veena, Mridangam, Tambura",
                    description = "Poetic verses composed by saints like Purandara Dasa, Father of Carnatic music, praising universal justice.",
                    audioDuration = "4:15",
                    genre = "Classical Devotional"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ka_food_mysorepak",
                    name = "Royal Mysore Pak",
                    state = "Karnataka",
                    description = "Velvety fudge invented in the royal kitchens of Mysore Palace using chickpea flour, generous desi ghee, and fragrant sugar syrup.",
                    isVeg = true,
                    whereToTry = "Guru Sweets (Descendants of the royal chef), Mysuru",
                    imageUrl = "https://images.unsplash.com/photo-1599488615731-7e5c2823ff28?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Porous, melt-in-the-mouth, golden clarified butter bliss"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ka_rest_guru",
                    name = "Guru Sweet Mart (Est. 1930s)",
                    city = "Mysuru",
                    state = "Karnataka",
                    cuisine = "Authentic Royal Sweets",
                    rating = 4.9f,
                    priceIndicator = "₹₹",
                    description = "Run by descendants of royal sweetmaster Kakasura Madappa, inventor of Mysore Pak.",
                    mustTryDish = "Original Ghee Mysore Pak"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ka_event_dasara",
                    name = "Mysuru Dasara (Nada Habba)",
                    location = "Mysuru Palace Grounds",
                    state = "Karnataka",
                    dateText = "September / October (Navratri)",
                    category = "State Royal Pageant",
                    imageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b353?auto=format&fit=crop&w=800&q=80",
                    description = "Elephant procession carrying the 750-kg solid gold idol of Goddess Chamundeshwari through illuminated boulevards."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving the Ancient Bidriware Silver Inlay",
                craftOrTradition = "Bidri Metal Inlay with Soil from Bidar Fort",
                community = "Artisans of Bidar",
                challenge = "Soil from the 15th-century fort used to oxidize the zinc-copper alloy cannot be replicated artificially.",
                preservationAction = "Material conservation research and direct-to-designer contemporary jewelry adaptations."
            )
        ),
        IndianState(
            id = "assam",
            name = "Assam",
            hindiName = "असम",
            capital = "Dispur",
            region = "Northeast",
            tagline = "The Land of Red River & Blue Hills",
            description = "Sentinel of the Northeast, world capital of golden Muga silk, lush tea gardens overlooking the mighty Brahmaputra, and the sacred rhino sanctuaries.",
            heroImageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.82f,
            mapY = 0.35f,
            colorHex = 0xFF047857,
            iconicHighlight = "Kaziranga • Bihu Dance • Assam Golden Tea",
            danceHighlight = "Rongali Bihu & Sattriya",
            musicHighlight = "Bihu Geet & Tokari",
            foodHighlight = "Khar, Masor Tenga & Pitha",
            heritageCount = 9,
            places = listOf(
                Place(
                    id = "as_kaziranga",
                    name = "Kaziranga National Park",
                    city = "Golaghat & Nagaon",
                    state = "Assam",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1000&q=80",
                    description = "UNESCO World Heritage sanctuary harboring two-thirds of the world's great one-horned rhinoceroses in tall elephant-grass plains.",
                    culturalSignificance = "Triumph of community-led conservation interweaving indigenous Tiwa and Karbi nature guardianship.",
                    tags = listOf("UNESCO World Heritage", "One-Horned Rhino", "Brahmaputra Wetlands"),
                    nearbyAttractions = listOf("Majuli Island", "Kakochang Waterfalls", "Orchid Park"),
                    localFoodRecommendation = "Traditional Assamese Thali with Duck Curry"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "as_trad_muga",
                    name = "Muga Golden Silk Weaving",
                    state = "Assam",
                    category = "Exclusive Geographical Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1610030469983-98e550d6193c?auto=format&fit=crop&w=800&q=80",
                    description = "Naturally golden wild silk produced only in Assam; increases its golden luster with every wash and outlasts human generations.",
                    isEndangered = true,
                    preservationStatus = "Endangered Ecological Craft"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "as_dance_bihu",
                    name = "Bihu Dance",
                    state = "Assam",
                    origin = "Agrarian Spring Festival (Bohag Bihu)",
                    description = "Youthful exuberance celebrating new blossoms and harvests with rapid hand movements and energetic rhythmic hip sways.",
                    imageUrl = "https://images.unsplash.com/photo-1582233479366-6d38bc390a08?auto=format&fit=crop&w=800&q=80",
                    costume = "Muga silk Mekhela Chador with red floral borders and Kopou Phool orchids in hair",
                    accompaniment = "Dhol, Pepa (buffalo horn hornpipe), and Toka bamboo clapper"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "as_music_bihu",
                    name = "Bihu Geet & Pepa Melodies",
                    title = "Spring Awakening of Assam",
                    region = "Brahmaputra Valley",
                    state = "Assam",
                    instruments = "Pepa (buffalo horn), Dhol, Gagana, Xutuli",
                    description = "Soul-stirring folk melodies echoing the rustling tea gardens and springtime courtship.",
                    audioDuration = "3:30",
                    genre = "Agrarian Spring Melody"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "as_food_tenga",
                    name = "Masor Tenga (Tangy Fish Curry)",
                    state = "Assam",
                    description = "Light, refreshing sour fish curry infused with elephant apple (Ou Tenga) or tomatoes and fenugreek, eaten over hot Joha rice.",
                    isVeg = false,
                    whereToTry = "Paradise Restaurant, Guwahati",
                    imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Crisp refreshing sourness, aromatic mustard oil, tender river fish"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "as_rest_paradise",
                    name = "Paradise Restaurant (Est. 1984)",
                    city = "Guwahati",
                    state = "Assam",
                    cuisine = "Authentic Assamese Indigenous Thali",
                    rating = 4.7f,
                    priceIndicator = "₹₹",
                    description = "Pioneers of bringing indigenous tribal Assamese cuisine served on traditional bell-metal (Kanh) plates.",
                    mustTryDish = "Parampara Thali with Masor Tenga & Khar"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "as_event_bihu",
                    name = "Rongali Bihu Festival",
                    location = "Across Assam",
                    state = "Assam",
                    dateText = "Mid-April",
                    category = "New Year & Spring Arrival",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=800&q=80",
                    description = "7 days of feasting, gifting woven Gamosa scarves, and dancing under blooming flowering trees."
                )
            ),
            preservationStory = PreservationStory(
                title = "Saving the Mask-Making Monks of Majuli",
                craftOrTradition = "Mukha (Bamboo-Mud Mask Making)",
                community = "Samaguri Satra Monks, Majuli Island",
                challenge = "Erosion of Majuli river island and synthetic theater props risk wiping out the eco-friendly bamboo and clay mask legacy.",
                preservationAction = "Monastery digital apprenticeships and global university theater collaborations."
            )
        )
    )

    val sampleReels: List<ReelItem> = listOf(
        ReelItem(
            id = "reel_1",
            title = "Twilight Aarti at Varanasi Ghats",
            creator = "AryanSharma_Travels",
            creatorAvatar = "🕉️",
            location = "Dashashwamedh Ghat",
            state = "Uttar Pradesh",
            category = "Rituals",
            caption = "The sound of hundreds of conch shells and sacred fire rising over the Ganges. The peace here is beyond words! 🌅✨ #Dharohar #Varanasi #SpiritualIndia",
            hashtags = listOf("#Varanasi", "#GangaAarti", "#Culture", "#IncredibleIndia"),
            likesCount = 14200,
            commentsCount = 384,
            bgGradientColorHex = 0xFF7C2D12
        ),
        ReelItem(
            id = "reel_2",
            title = "Colors of Desert Ghoomar",
            creator = "MarwarFolkTales",
            creatorAvatar = "💃",
            location = "Amber Fort, Jaipur",
            state = "Rajasthan",
            category = "Dance",
            caption = "Watch the mesmerizing sync of 64 pirouettes in traditional 80-kali ghagras! Preserving Rajasthani folklore. 👑💛 #Ghoomar #Rajasthan #FolkDance",
            hashtags = listOf("#Ghoomar", "#Rajasthan", "#AmberFort", "#FolkArt"),
            likesCount = 28400,
            commentsCount = 712,
            bgGradientColorHex = 0xFFC2410C
        ),
        ReelItem(
            id = "reel_3",
            title = "World's Largest Kitchen - Golden Temple",
            creator = "AmritsarFoodDiaries",
            creatorAvatar = "🍛",
            location = "Golden Temple, Amritsar",
            state = "Punjab",
            category = "Food",
            caption = "Over 100,000 free meals cooked with pure love and devotion every single day. Equality in every bite. 🪔🙏 #Seva #Amritsar #GoldenTemple",
            hashtags = listOf("#Punjab", "#Langar", "#GoldenTemple", "#Seva"),
            likesCount = 45900,
            commentsCount = 1205,
            bgGradientColorHex = 0xFFB45309
        ),
        ReelItem(
            id = "reel_4",
            title = "Kathakali Facial Expressions Breakdown",
            creator = "NatyashastraVibes",
            creatorAvatar = "🎭",
            location = "Fort Kochi",
            state = "Kerala",
            category = "Dance",
            caption = "How Kathakali masters train their eyes to move without blinking for 20 minutes! The 9 Navarasas explained. 🌿👁️ #Kathakali #KeralaHeritage",
            hashtags = listOf("#Kathakali", "#Kerala", "#ClassicalDance", "#Expressions"),
            likesCount = 19300,
            commentsCount = 490,
            bgGradientColorHex = 0xFF065F46
        ),
        ReelItem(
            id = "reel_5",
            title = "Meet the Last Family of Rogan Art",
            creator = "HeritageGuardian",
            creatorAvatar = "🎨",
            location = "Nirona Village, Kutch",
            state = "Gujarat",
            category = "Preservation",
            caption = "Only ONE family in the world still creates this! Watch how boiling castor oil turns into magical paint on silk cloth. 🛡️✨ #SIH26197 #SaveArt",
            hashtags = listOf("#RoganArt", "#Kutch", "#CulturalPreservation", "#EndangeredArt"),
            likesCount = 33800,
            commentsCount = 890,
            bgGradientColorHex = 0xFF4338CA
        )
    )

    val sampleTrips: List<SavedTrip> = listOf(
        SavedTrip(
            id = "trip_jaipur",
            destination = "Jaipur & Amer",
            state = "Rajasthan",
            durationDays = 3,
            highlightMonument = "Amber Fort & Hawa Mahal",
            foodToTry = "Dal Baati Churma & Pyaaz Kachori",
            culturalExperience = "Live Kathputli Show & Chokhi Dhani",
            itinerary = listOf(
                TripDayPlan(
                    dayNumber = 1,
                    morning = "Ascend Amber Fort at sunrise, explore Sheesh Mahal mirror palace.",
                    afternoon = "Visit Jaigarh Fort cannon foundry and stepwells.",
                    evening = "Traditional folk dance & royal dinner at 1135 AD.",
                    foodTip = "Try Pyaaz Kachori at Rawat Mishtan Bhandar."
                ),
                TripDayPlan(
                    dayNumber = 2,
                    morning = "Photograph Hawa Mahal's 953 honeycomb windows.",
                    afternoon = "Explore City Palace museum and Jantar Mantar sundials.",
                    evening = "Stroll Johari Bazaar for blue pottery and lac bangles.",
                    foodTip = "Royal Thali at Laxmi Mishthan Bhandar (LMB)."
                ),
                TripDayPlan(
                    dayNumber = 3,
                    morning = "Visit Nahargarh Fort overlooking the Pink City panorama.",
                    afternoon = "Block printing workshop at Anokhi Museum of Hand Printing.",
                    evening = "Sunset at Jal Mahal lake with hot Kulhad Chai.",
                    foodTip = "Ghevar dessert from sweetmakers of old Jaipur."
                )
            )
        ),
        SavedTrip(
            id = "trip_kerala",
            destination = "Alleppey & Kochi",
            state = "Kerala",
            durationDays = 4,
            highlightMonument = "Backwaters & Mattancherry Palace",
            foodToTry = "Grand Onam Sadya & Appam with Stew",
            culturalExperience = "Kathakali Performance & Kalaripayattu Arena",
            itinerary = listOf(
                TripDayPlan(
                    dayNumber = 1,
                    morning = "Board traditional thatched Kettuvallam houseboat in Alleppey.",
                    afternoon = "Cruise quiet backwater canals past paddy fields.",
                    evening = "Village walk learning coir rope spinning and toddy tapping.",
                    foodTip = "Karimeen Pollichathu prepared fresh onboard."
                ),
                TripDayPlan(
                    dayNumber = 2,
                    morning = "Sunrise bird watching at Kumarakom bird sanctuary.",
                    afternoon = "Travel to Fort Kochi, see 14th-century Chinese Fishing Nets.",
                    evening = "Evening Kathakali makeup and dance drama at cultural center.",
                    foodTip = "Malabar Parotta with spiced pepper stew."
                ),
                TripDayPlan(
                    dayNumber = 3,
                    morning = "Explore Paradesi Synagogue and antique spice markets.",
                    afternoon = "Live martial arts combat at Kadathanadan Kalari Sangham.",
                    evening = "Sunset catamaran ride across Cochin Harbour.",
                    foodTip = "Elaneer Payasam (Tender Coconut dessert)."
                )
            )
        )
    )

    val sampleContributions: List<UserContribution> = listOf(
        UserContribution(
            id = "cont_1",
            title = "My grandmother's 80-year-old brass Puttu maker",
            author = "Ananya Nair",
            state = "Kerala",
            city = "Palakkad",
            place = "Heritage Ancestral Home",
            category = "Traditional Recipe & Utensils",
            storyText = "Passed down across 3 generations, this handcrafted brass vessel steams roasted rice flour and grated coconut using aroma-sealed steam channels. Sharing the recipe so our youth doesn't forget.",
            timeAgo = "2 hours ago",
            upvotes = 42,
            isVerifiedHeritage = true
        ),
        UserContribution(
            id = "cont_2",
            title = "The forgotten stepwell behind Bundi Fort",
            author = "Devendra Singh Rathore",
            state = "Rajasthan",
            city = "Bundi",
            place = "Raniji ki Baori",
            category = "Heritage Site",
            storyText = "Not many tourists know about this 17th-century stepwell carved with over 100 stone avatars of Vishnu. The acoustics here are unbelievable!",
            timeAgo = "1 day ago",
            upvotes = 89,
            isVerifiedHeritage = true
        ),
        UserContribution(
            id = "cont_3",
            title = "The last Dhrupad singer of Bishnupur",
            author = "Subhashish Roy",
            state = "West Bengal",
            city = "Bankura",
            place = "Bishnupur Terracotta Courts",
            category = "Endangered Music",
            storyText = "Recorded a 10-minute audio clip of Pandit Mukherjee singing Raag Bhairav. Dhrupad is one of India's oldest musical lineages and deserves national preservation.",
            timeAgo = "3 days ago",
            upvotes = 115,
            isVerifiedHeritage = true
        )
    )

    fun getStateById(id: String): IndianState? {
        return states.find { it.id.equals(id, ignoreCase = true) }
    }

    fun getAllPlaces(): List<Place> {
        return states.flatMap { it.places }
    }

    fun getAllFoods(): List<FoodDish> {
        return states.flatMap { it.foods }
    }

    fun getAllDances(): List<DanceItem> {
        return states.flatMap { it.dances }
    }

    fun getAllTraditions(): List<Tradition> {
        return states.flatMap { it.traditions }
    }

    fun getAllRestaurants(): List<RestaurantSpot> {
        return states.flatMap { it.restaurants }
    }
}
