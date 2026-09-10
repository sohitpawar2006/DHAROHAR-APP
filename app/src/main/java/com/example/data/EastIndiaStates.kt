package com.example.data

object EastIndiaStates {
    val all: List<IndianState> = listOf(
        IndianState(
            id = "bihar",
            name = "Bihar",
            hindiName = "बिहार",
            capital = "Patna",
            region = "East",
            tagline = "Land of Buddha, Mahavira & Ancient Nalanda",
            description = "The ancient intellectual and spiritual heart of Asia where Gautama Buddha attained Enlightenment at Bodh Gaya, Lord Mahavira preached Jainism, and Nalanda stood as the world's greatest residential university.",
            heroImageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.60f,
            mapY = 0.34f,
            colorHex = 0xFFD97706, // Amber Saffron
            iconicHighlight = "Nalanda University Ruins • Mahabodhi Temple • Litti Chokha",
            danceHighlight = "Bidesia & Jhijhiya Dance",
            musicHighlight = "Maithili Folk & Sohar",
            foodHighlight = "Litti Chokha, Sattu Paratha & Khaja",
            heritageCount = 13,
            places = listOf(
                Place(
                    id = "br_nalanda",
                    name = "Nalanda Mahavihara Ruins",
                    city = "Nalanda",
                    state = "Bihar",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "UNESCO World Heritage site comprising monastic and scholastic ruins dating from the 3rd century BCE to the 13th century CE, hosting 10,000 students from across ancient Asia.",
                    culturalSignificance = "World's premier ancient residential seat of higher learning in philosophy, logic, medicine, and astronomy.",
                    tags = listOf("UNESCO World Heritage", "Ancient University", "Buddhist Heritage"),
                    nearbyAttractions = listOf("Rajgir Ropeway", "Vishwa Shanti Stupa", "Pawapuri"),
                    localFoodRecommendation = "Authentic Silao Ka Khaja"
                ),
                Place(
                    id = "br_bodh_gaya",
                    name = "Mahabodhi Temple Complex",
                    city = "Bodh Gaya",
                    state = "Bihar",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1000&q=80",
                    description = "Magnificent 50-meter-tall brick temple marking the spot where Prince Siddhartha Gautama attained supreme Enlightenment under the sacred Bodhi Tree.",
                    culturalSignificance = "The holiest pilgrimage site for the world's 500 million Buddhists.",
                    tags = listOf("UNESCO World Heritage", "Bodhi Tree", "Spiritual Enlightenment"),
                    nearbyAttractions = listOf("Great Buddha Statue", "Dungeshwari Caves", "Thai Monastery"),
                    localFoodRecommendation = "Hot Litti Chokha with smoked brinjal and roasted tomato"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "br_trad_madhubani",
                    name = "Mithila (Madhubani) Painting",
                    state = "Bihar",
                    category = "Folk Painting",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient ritual mural art practiced by Mithila women using twigs, nibs, and fingers with natural dyes extracted from turmeric, soot, and flowers.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "br_dance_bidesia",
                    name = "Bidesia Folk Theater",
                    state = "Bihar",
                    origin = "Bhojpur Region",
                    description = "Poignant folk dance-drama created by Bhikhari Thakur addressing the social pangs of migrant laborers leaving behind rural families.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Dhoti Kurta, female impersonation attire with traditional kajal",
                    accompaniment = "Harmonium, Dholak, Kartal"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "br_music_maithili",
                    title = "Maithili Vidyapati Songs",
                    region = "Mithilanchal",
                    state = "Bihar",
                    instruments = "Harmonium, Tabla, Dhol",
                    description = "Lyrical verses of 14th-century poet Vidyapati capturing love, seasonal festivals, and worship of Lord Shiva.",
                    audioDuration = "4:10",
                    genre = "Classical Folk",
                    name = "Maithili Folk"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "br_food_litti",
                    name = "Bihari Litti Chokha",
                    state = "Bihar",
                    description = "Whole wheat dough balls stuffed with spiced roasted gram flour (sattu), roasted over charcoal, dipped in melted desi ghee, served with mashed roasted eggplant, potatoes, and tomatoes.",
                    isVeg = true,
                    whereToTry = "Maurya Lok Complex, Patna",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Smoky, Garlic-Ajwain Spiced, Desi Ghee Richness"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "br_rest_bhoj",
                    name = "Bhojpuria Chulha",
                    city = "Patna",
                    state = "Bihar",
                    cuisine = "Traditional Bihari Thali",
                    rating = 4.7f,
                    priceIndicator = "₹",
                    description = "Famous for traditional clay chulha cooked Litti Chokha, Champaran Ahuna Handi Mutton, and Malpua.",
                    mustTryDish = "Litti Chokha with Sarson Machhli"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "br_event_chhath",
                    name = "Mahaparv Chhath Puja",
                    location = "Ganga Ghats Across Bihar",
                    state = "Bihar",
                    dateText = "Kartik Month (Oct/Nov)",
                    category = "Sacred Solar Festival",
                    imageUrl = "https://images.unsplash.com/photo-1561361513-2d000a50f0dc?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient Vedic 4-day festival of pure fasting honoring the Sun God (Surya) and Chhathi Maiya on the banks of rivers."
                )
            ),
            preservationStory = PreservationStory(
                title = "Empowering Mithila Madhubani Artists",
                craftOrTradition = "Mithila Painting Cooperative",
                community = "Jitwarpur & Ranti Village Artists",
                challenge = "Middlemen exploiting village women artists.",
                preservationAction = "GI registration and direct university exhibitions in New Delhi."
            )
        ),
        IndianState(
            id = "jharkhand",
            name = "Jharkhand",
            hindiName = "झारखंड",
            capital = "Ranchi",
            region = "East",
            tagline = "Land of Waterfalls & Tribal Valor",
            description = "Home to lush Chota Nagpur plateaus, roaring Hundru and Dassam waterfalls, centuries of Santhal and Munda tribal folklore, and the sacred pilgrimage of Baidyanath Dham.",
            heroImageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.61f,
            mapY = 0.42f,
            colorHex = 0xFF047857, // Deep Emerald
            iconicHighlight = "Baidyanath Dham • Hundru Falls • Sohrai Art",
            danceHighlight = "Chhau & Santhali Dance",
            musicHighlight = "Karam Sangeet & Mandar Beats",
            foodHighlight = "Dhuska, Rugra, Arsa Roti & Handia",
            heritageCount = 9,
            places = listOf(
                Place(
                    id = "jh_baidyanath",
                    name = "Baba Baidyanath Jyotirlinga Temple",
                    city = "Deoghar",
                    state = "Jharkhand",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "One of the twelve sacred Jyotirlingas, focal point of the legendary Shravani Mela where saffron-clad Kanwariyas walk barefoot for over 100 kilometers.",
                    culturalSignificance = "Ancient shrine where Ravana offered his heads to Lord Shiva, revered for spiritual healing.",
                    tags = listOf("Jyotirlinga", "Shravani Mela", "Pilgrimage"),
                    nearbyAttractions = listOf("Tapovan Caves", "Trikuta Parvat", "Naulakha Temple"),
                    localFoodRecommendation = "Authentic Deoghar Peda made from rich caramelized milk"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "jh_trad_sohrai",
                    name = "Sohrai & Khovar Mural Painting",
                    state = "Jharkhand",
                    category = "Indigenous Wall Art",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Prehistoric cave-linked indigenous mural painting practiced by tribal women using chewed neem twigs and colored mud during harvest and weddings.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "jh_dance_chhau",
                    name = "Seraikella Chhau",
                    state = "Jharkhand",
                    origin = "Seraikella Royal Courts",
                    description = "UNESCO Intangible Cultural Heritage masked martial dance requiring acrobatic leaps and lyrical storytelling without spoken words.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Intricately molded clay and papier-mâché masks depicting gods and demons",
                    accompaniment = "Dhol, Nagara, Shehnai"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "jh_music_karam",
                    title = "Karam Tribal Songs & Mandar",
                    region = "Chota Nagpur",
                    state = "Jharkhand",
                    instruments = "Mandar earthen drum, Nagara, Flute",
                    description = "Sacred harvest songs honoring the Karam tree for community prosperity and sister-brother bonds.",
                    audioDuration = "3:45",
                    genre = "Adivasi Folk",
                    name = "Jharkhand Karam"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "jh_food_dhuska",
                    name = "Dhuska with Ghugni",
                    state = "Jharkhand",
                    description = "Crispy golden deep-fried savory fritters made from soaked rice and chana dal batter, served with spicy black chickpea ghugni and aloo dum.",
                    isVeg = true,
                    whereToTry = "Local street stalls in Ranchi & Jamshedpur",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Crisp, Fluffy inside, Spiced Chickpea Sauce"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "jh_rest_ranchi",
                    name = "Tribal Rasoi",
                    city = "Ranchi",
                    state = "Jharkhand",
                    cuisine = "Authentic Jharkhandi Tribal Dishes",
                    rating = 4.6f,
                    priceIndicator = "₹",
                    description = "Preserves indigenous recipes using forest mushrooms (Rugra), bamboo shoots, and traditional Dhuska.",
                    mustTryDish = "Dhuska with Rugra Curry"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "jh_event_sarhul",
                    name = "Sarhul Flower Festival",
                    location = "Across Jharkhand",
                    state = "Jharkhand",
                    dateText = "Chaitra Month (Spring)",
                    category = "Nature & Forest Worship",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=800&q=80",
                    description = "Worship of the blooming Sal tree flowers by Oraon, Munda, and Ho tribes marking the arrival of the New Year."
                )
            ),
            preservationStory = PreservationStory(
                title = "Documenting Sohrai Mud Murals",
                craftOrTradition = "Sohrai-Khovar Wall Art",
                community = "Hazaribagh Tribal Women",
                challenge = "Modern brick houses replacing traditional mud walls where Sohrai art was painted annually.",
                preservationAction = "Canvas adaptation and railway station beautification murals across India."
            )
        ),
        IndianState(
            id = "west_bengal",
            name = "West Bengal",
            hindiName = "पश्चिम बंगाल",
            capital = "Kolkata",
            region = "East",
            tagline = "City of Joy • Soul of Literature & Durga Puja",
            description = "The cultural powerhouse that birthed the Bengal Renaissance, West Bengal is legendary for grand UNESCO Durga Puja carnivals, Nobel laureate Rabindranath Tagore's songs, and sweet culinary mastery.",
            heroImageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.68f,
            mapY = 0.43f,
            colorHex = 0xFFB91C1C, // Bengal Terracotta Red
            iconicHighlight = "Victoria Memorial • Durga Puja • Sundarbans",
            danceHighlight = "Chhau & Gaudiya Nritya",
            musicHighlight = "Rabindra Sangeet & Baul Mystics",
            foodHighlight = "Macher Jhol, Kosha Mangsho, Mishti Doi & Rasgulla",
            heritageCount = 15,
            places = listOf(
                Place(
                    id = "wb_victoria",
                    name = "Victoria Memorial & Howrah Bridge",
                    city = "Kolkata",
                    state = "West Bengal",
                    imageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=1000&q=80",
                    description = "Magnificent white Makrana marble monument commissioned in memory of Queen Victoria, standing across the Hooghly from the iconic cantilever Howrah Bridge.",
                    culturalSignificance = "Icon of Kolkata's colonial and Renaissance heritage housing rare historic paintings and manuscripts.",
                    tags = listOf("Colonial Heritage", "Marble Memorial", "Howrah Bridge"),
                    nearbyAttractions = listOf("Indian Museum", "Dakshineswar Kali Temple", "College Street"),
                    localFoodRecommendation = "Kolkata Kathi Roll at Nizam's and warm Sondesh"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "wb_trad_patachitra",
                    name = "Bengal Patachitra Scroll Painting",
                    state = "West Bengal",
                    category = "Scroll Painting & Song",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient cloth scrolls painted by hereditary 'Patuas' of Pingla village who sing lyrical ballads as they unfurl their narrative art.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "wb_dance_purulia",
                    name = "Purulia Chhau",
                    state = "West Bengal",
                    origin = "Purulia District",
                    description = "Vigorous acrobatic masked dance depicting the battle of Goddess Durga against Mahishasura, featuring aerial cartwheels.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Towering ornate masks made of clay and papier-mâché adorned with peacock feathers",
                    accompaniment = "Dhamsa giant kettle drum, Dhol, Shehnai"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "wb_music_baul",
                    title = "Baul Mystic Melodies",
                    region = "Birbhum & Santiniketan",
                    state = "West Bengal",
                    instruments = "Ektara (Single-stringed lute), Dubki drum, Dotara",
                    description = "UNESCO Intangible Cultural Heritage mystic songs seeking the 'Moner Manush' (The Person of the Heart).",
                    audioDuration = "4:30",
                    genre = "Mystic Folk",
                    name = "Baul Sangeet"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "wb_food_rasgulla",
                    name = "Bengali Sponge Rasgulla & Mishti Doi",
                    state = "West Bengal",
                    description = "Spongy cottage cheese (Chhena) balls cooked in light sugar syrup, invented by Nobin Chandra Das in 1868, accompanied by caramelized baked yogurt in clay earthen pots.",
                    isVeg = true,
                    whereToTry = "K.C. Das & Balaram Mullick, Kolkata",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Delicately Sweet, Spongy, Caramelized Earthiness"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "wb_rest_6ballygunge",
                    name = "6 Ballygunge Place",
                    city = "Kolkata",
                    state = "West Bengal",
                    cuisine = "Authentic Zamindari Bengali Fine Dining",
                    rating = 4.8f,
                    priceIndicator = "₹₹₹",
                    description = "Set in a restored 100-year-old heritage bungalow, serving century-old recipes culled from royal Bengali kitchens.",
                    mustTryDish = "Daab Chingri (Prawns cooked in tender green coconut)"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "wb_event_durgapuja",
                    name = "Kolkata Durga Puja",
                    location = "Across Kolkata",
                    state = "West Bengal",
                    dateText = "Ashwin Month (Sep/Oct)",
                    category = "UNESCO Intangible Cultural Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1558431382-27e303142255?auto=format&fit=crop&w=800&q=80",
                    description = "World's largest public contemporary art festival with thousands of artistic thematic pandals and dhunuchi dances."
                )
            ),
            preservationStory = PreservationStory(
                title = "Supporting the Clay Idols Sculptors of Kumartuli",
                craftOrTradition = "Clay Idol Sculpting",
                community = "Potters' Colony of Kumartuli, Kolkata",
                challenge = "Ganga silt shortages and rising prices of bamboo armature threatening centuries of idol sculptors.",
                preservationAction = "Safe organic clay subsidization and seasonal artisan export facilitation."
            )
        ),
        IndianState(
            id = "odisha",
            name = "Odisha",
            hindiName = "ओडिशा",
            capital = "Bhubaneswar",
            region = "East",
            tagline = "Soul of Incredible India • Konark & Jagannath Puri",
            description = "Land of the Sun God at Konark, sacred Jagannath Puri temple where the Rath Yatra draws millions, classical Odissi temple dance, and ancient Kalinga maritime silk heritage.",
            heroImageUrl = "https://images.unsplash.com/photo-1599661046289-e31897846e41?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.61f,
            mapY = 0.55f,
            colorHex = 0xFFD97706, // Golden Ochre
            iconicHighlight = "Konark Sun Temple • Puri Jagannath • Odissi Dance",
            danceHighlight = "Odissi Classical Dance & Gotipua",
            musicHighlight = "Odissi Classical Sangeet & Mardala",
            foodHighlight = "Chhena Poda, Dalma, Pakhala Bhata & Rasagola",
            heritageCount = 14,
            places = listOf(
                Place(
                    id = "or_konark",
                    name = "Konark Sun Temple (Black Pagoda)",
                    city = "Konark",
                    state = "Odisha",
                    imageUrl = "https://images.unsplash.com/photo-1599661046289-e31897846e41?auto=format&fit=crop&w=1000&q=80",
                    description = "13th-century UNESCO architectural triumph designed as a colossal stone chariot with 24 carved wheels pulled by seven galloping horses.",
                    culturalSignificance = "Pinnacle of Kalinga architecture, the wheels function as precise sundials reading time to the exact minute.",
                    tags = listOf("UNESCO World Heritage", "Kalinga Architecture", "Stone Sundial"),
                    nearbyAttractions = listOf("Chandrabhaga Beach", "Puri Beach", "Pipili Craft Village"),
                    localFoodRecommendation = "Authentic Chhena Poda roasted cheese dessert"
                ),
                Place(
                    id = "or_puri",
                    name = "Shree Jagannath Temple",
                    city = "Puri",
                    state = "Odisha",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "Sacred 12th-century shrine dedicated to Lord Jagannath, Balabhadra, and Subhadra, home to the Mahaprasad cooked in earthen pots stacked seven high.",
                    culturalSignificance = "One of the holy Char Dhams, site of the world-famous grand Rath Yatra.",
                    tags = listOf("Char Dham", "Rath Yatra", "Mahaprasad"),
                    nearbyAttractions = listOf("Golden Beach", "Chilika Lake", "Raghurajpur Heritage Village"),
                    localFoodRecommendation = "Chhena Jhili from Nimapada"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "or_trad_pattachitra",
                    name = "Raghurajpur Pattachitra on Palm Leaves",
                    state = "Odisha",
                    category = "Heritage Artisan Village",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Heritage crafts village where every household creates intricate mythological paintings on dried palm leaves (Tala Pattachitra) using natural stone colors.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "or_dance_odissi",
                    name = "Odissi Classical Dance",
                    state = "Odisha",
                    origin = "Ancient Temples & Mahari dancers",
                    description = "One of India's oldest surviving classical dance forms, characterized by the Tribhanga (three-bend posture) and lyrical sculpture-like poses.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Sambalpuri or Bomkai silk saree, Odiyanam silver waist belt, silver filigree crown",
                    accompaniment = "Mardala barrel drum, Flute, Manjira, Sitar"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "or_music_odissi",
                    title = "Odissi Classical Mardala Beats",
                    region = "Bhubaneswar & Puri",
                    state = "Odisha",
                    instruments = "Mardala, Flute, Tanpura",
                    description = "Classical musical tradition with independent grammar dating back over 2,000 years to ancient treatises.",
                    audioDuration = "4:45",
                    genre = "Indian Classical",
                    name = "Odissi Sangeet"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "or_food_chhenapoda",
                    name = "Odisha Chhena Poda",
                    state = "Odisha",
                    description = "Traditional dessert made by baking fresh kneaded cottage cheese, sugar, and cardamom wrapped in Sal leaves over burning charcoal until caramelized.",
                    isVeg = true,
                    whereToTry = "Nayagarh sweetmakers & Bhubaneswar shops",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Caramelized Crust, Warm Smoky Cottage Cheese, Cardamom"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "or_rest_dalma",
                    name = "Dalma Odia Cuisine",
                    city = "Bhubaneswar",
                    state = "Odisha",
                    cuisine = "Authentic Odia Temple & Traditional",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Celebrated restaurant serving traditional Dalma (lentils cooked with raw papaya and pumpkin), Pakhala Bhata, and Crab Kalia.",
                    mustTryDish = "Authentic Odia Dalma with Macha Besara"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "or_event_rathyatra",
                    name = "Puri Jagannath Rath Yatra",
                    location = "Grand Road (Bada Danda), Puri",
                    state = "Odisha",
                    dateText = "Ashadha Month (June/July)",
                    category = "World's Oldest Chariot Procession",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=800&q=80",
                    description = "Three colossal decorated wooden chariots carrying the deities pulled by hundreds of thousands of ecstatic devotees."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving Cuttack Tarakasi (Silver Filigree)",
                craftOrTradition = "Cuttack Silver Filigree (Tarakasi)",
                community = "Mahanadi Silversmith Guilds",
                challenge = "Machine-stamped metals threatening 500-year-old fine silver wire weaving.",
                preservationAction = "GI-tag registration and national awards for master artisans."
            )
        )
    )
}
