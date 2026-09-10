package com.example.data

object SouthIndiaStates {
    val all: List<IndianState> = listOf(
        IndianState(
            id = "andhra_pradesh",
            name = "Andhra Pradesh",
            hindiName = "आंध्र प्रदेश",
            capital = "Amaravati",
            region = "South",
            tagline = "Land of Kuchipudi & Sacred Tirumala Hills",
            description = "Famed for the sacred hilltop shrine of Lord Venkateswara at Tirupati, classical Kuchipudi dance, centuries-old Kalamkari block-printing, and fiery Andhra spice curries.",
            heroImageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.48f,
            mapY = 0.68f,
            colorHex = 0xFFD97706, // Amber Saffron
            iconicHighlight = "Tirupati Balaji • Lepakshi Temple • Kuchipudi",
            danceHighlight = "Kuchipudi Classical Dance",
            musicHighlight = "Carnatic Annamacharya Keerthanas",
            foodHighlight = "Gongura Pachadi, Pesarattu & Andhra Meals",
            heritageCount = 13,
            places = listOf(
                Place(
                    id = "ap_tirupati",
                    name = "Tirumala Venkateswara Temple",
                    city = "Tirupati",
                    state = "Andhra Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=1000&q=80",
                    description = "One of the most visited and wealthiest religious sanctuaries on earth, perched atop the seven holy peaks of Seshachalam Hills.",
                    culturalSignificance = "Sacred shrine of Lord Balaji (Kaliyuga Varada) known for the GI-tagged Tirupati Laddu Prasadam.",
                    tags = listOf("Holy Hills", "Tirumala Balaji", "Dravidian Architecture"),
                    nearbyAttractions = listOf("Kapila Theertham", "Chandragiri Fort", "Sri Kalahasti"),
                    localFoodRecommendation = "Authentic Tirupati Laddu & Tamarind Pulihora"
                ),
                Place(
                    id = "ap_lepakshi",
                    name = "Veerabhadra Temple (Lepakshi)",
                    city = "Lepakshi, Anantapur",
                    state = "Andhra Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "16th-century Vijayanagara architectural wonder famed for its miraculous hanging stone pillar and massive monolithic Nandi bull.",
                    culturalSignificance = "Treasury of Vijayanagara ceiling frescoes illustrating epic scenes from the Ramayana and Mahabharata.",
                    tags = listOf("Vijayanagara Empire", "Hanging Pillar", "Monolithic Nandi"),
                    nearbyAttractions = listOf("Penukonda Fort", "Belum Caves"),
                    localFoodRecommendation = "Ragi Sangati with Natu Kodi Pulusu"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ap_trad_kalamkari",
                    name = "Srikalahasti & Machilipatnam Kalamkari",
                    state = "Andhra Pradesh",
                    category = "Natural Dye Textile Art",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Hand-painted cotton textile art drawn with a sharp bamboo reed pen (Kalam) using fermented jaggery and mineral dyes.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ap_dance_kuchipudi",
                    name = "Kuchipudi Classical Dance",
                    state = "Andhra Pradesh",
                    origin = "Kuchipudi Village, Krishna District",
                    description = "Classical dance drama blending brisk rhythmic footwork with Tarangam—dancing atop the sharp rim of a brass plate while balancing a water pot.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Pleated Dharmavaram silk costume, metallic waist belt, traditional braided Rakodi",
                    accompaniment = "Mridangam, Veena, Flute, Natuvangam cymbals"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ap_music_annamacharya",
                    title = "Annamacharya Carnatic Sankeertanas",
                    region = "Rayalaseema",
                    state = "Andhra Pradesh",
                    instruments = "Veena, Mridangam, Tambura",
                    description = "15th-century devotional compositions by saint Annamayya praising Lord Venkateswara engraved on copper plates.",
                    audioDuration = "4:40",
                    genre = "Carnatic Devotional",
                    name = "Annamayya Kirtana"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ap_food_gongura",
                    name = "Andhra Gongura Pachadi & Pesarattu",
                    state = "Andhra Pradesh",
                    description = "Tart sorrel leaves ground with red chilies and garlic into a fiery chutney, paired with green gram moong dal crepes stuffed with upma.",
                    isVeg = true,
                    whereToTry = "Traditional mess eateries across Vijayawada & Vizag",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Tangy Sorrel, Spicy Chili Punch, Crispy Dosa Crust"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ap_rest_subbayya",
                    name = "Subbayya Gari Hotel Since 1955",
                    city = "Kakinada & Visakhapatnam",
                    state = "Andhra Pradesh",
                    cuisine = "Authentic Andhra Banana Leaf Butta Bhojanam",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Legendary hospitable dining where servers lavish guests with Gunpowder podi, hot ghee, Gongura chutney, and 20 side dishes.",
                    mustTryDish = "Butta Bhojanam (Basket Meals) with Panasa Pottu Biryani"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ap_event_brahmotsavam",
                    name = "Tirumala Srivari Brahmotsavam",
                    location = "Tirumala Temple Hills",
                    state = "Andhra Pradesh",
                    dateText = "September / October (9 Days)",
                    category = "Grand Temple Chariot Festival",
                    imageUrl = "https://images.unsplash.com/photo-1626014303757-656447750849?auto=format&fit=crop&w=800&q=80",
                    description = "Nine-day mega festival where Lord Venkateswara is carried in procession on celestial golden vahanas (Garuda, Hanuman, Lion)."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving Handloom Mangalagiri & Uppada Jamdani",
                craftOrTradition = "Uppada Jamdani Silk Weaving",
                community = "Uppada Coastal Weavers",
                challenge = "Complex geometric counting without mechanical jacquards requires weeks per saree.",
                preservationAction = "Handloom cluster digital cooperatives and fair-price guarantees."
            )
        ),
        IndianState(
            id = "telangana",
            name = "Telangana",
            hindiName = "तेलंगाना",
            capital = "Hyderabad",
            region = "South",
            tagline = "City of Pearls • Nizam Splendour & Kakatiya Legacy",
            description = "Confluence of Kakatiya stone glory and Nizam royal opulence, Telangana is world-famous for the iconic Charminar, Golconda acoustic fortress, aromatic Hyderabadi Dum Biryani, and UNESCO Ramappa Temple.",
            heroImageUrl = "https://images.unsplash.com/photo-1572445271230-a78b5944a659?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.45f,
            mapY = 0.59f,
            colorHex = 0xFF9333EA, // Regal Purple
            iconicHighlight = "Charminar • Golconda Fort • Hyderabadi Biryani",
            danceHighlight = "Perini Shivatandavam Dance",
            musicHighlight = "Dakhni Ghazals & Oggu Katha",
            foodHighlight = "Hyderabadi Dum Biryani, Haleem & Mirchi Ka Salan",
            heritageCount = 13,
            places = listOf(
                Place(
                    id = "ts_charminar",
                    name = "Charminar & Laad Bazaar",
                    city = "Hyderabad",
                    state = "Telangana",
                    imageUrl = "https://images.unsplash.com/photo-1572445271230-a78b5944a659?auto=format&fit=crop&w=1000&q=80",
                    description = "1591 CE monumental arch with four grand minarets commissioned by Sultan Muhammad Quli Qutb Shah, encircled by centuries-old lacquer bangle markets.",
                    culturalSignificance = "Global emblem of Hyderabad's Indo-Islamic Qutb Shahi architecture and cosmopolitan history.",
                    tags = listOf("Iconic Monument", "Qutb Shahi", "Pearl & Lacquer Markets"),
                    nearbyAttractions = listOf("Mecca Masjid", "Chowmahalla Palace", "Salar Jung Museum"),
                    localFoodRecommendation = "Irani Chai with Osmania Biscuits at Nimrah Cafe"
                ),
                Place(
                    id = "ts_ramappa",
                    name = "Kakatiya Rudreshwara (Ramappa) Temple",
                    city = "Palampet, Mulugu",
                    state = "Telangana",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "UNESCO World Heritage 13th-century temple built with floating lightweight bricks and adorned with exquisitely carved black basalt dancers.",
                    culturalSignificance = "Named after its master sculptor Ramappa—a rare honor in world heritage—mastering earthquake-resistant sandbox technology.",
                    tags = listOf("UNESCO World Heritage", "Kakatiya Sculptures", "Floating Bricks"),
                    nearbyAttractions = listOf("Warangal Fort", "Thousand Pillar Temple", "Ramappa Lake"),
                    localFoodRecommendation = "Sarva Pindi savory rice pancake"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ts_trad_bidri",
                    name = "Bidriware Inlaid Silver Craft",
                    state = "Telangana",
                    category = "Metallo-Artisan Craft",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Gunmetal alloy of zinc and copper inlaid with pure silver wire sheets, blackened using soil from historic fort ramparts.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ts_dance_perini",
                    name = "Perini Shivatandavam",
                    state = "Telangana",
                    origin = "Kakatiya Dynasty Temples",
                    description = "Ancient warrior dance performed by male dancers to invoke Lord Shiva before marching into battle, reconstructed from temple stone sculptures.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Silk dhoti, rudraksha rosaries, heavy brass ankle bells",
                    accompaniment = "Resonant bronze bell, Mridangam, Conch shell"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ts_music_oggu",
                    title = "Oggu Katha Folk Narratives",
                    region = "Northern Telangana",
                    state = "Telangana",
                    instruments = "Oggu (Jagged drum), Brass cymbals",
                    description = "Thrilling pastoral narrative performance praising Mallanna and Renuka Yellamma.",
                    audioDuration = "4:20",
                    genre = "Narrative Folk Ballad",
                    name = "Oggu Katha"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ts_food_biryani",
                    name = "Authentic Hyderabadi Dum Biryani",
                    state = "Telangana",
                    description = "Raw marinated meat layered with half-cooked basmati rice, caramelized onions (birista), saffron milk, mint, and sealed with dough in a heavy copper handi over coal.",
                    isVeg = false,
                    whereToTry = "Paradise, Shadab & Cafe Bahar, Hyderabad",
                    imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Fragrant Saffron, Peppery Spices, Tender Meat"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ts_rest_shadab",
                    name = "Hotel Shadab Since 1990",
                    city = "Near Charminar, Hyderabad",
                    state = "Telangana",
                    cuisine = "Authentic Hyderabadi Nizam Feast",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Vibrant bustling institution serving legendary Mutton Biryani, Haleem during Ramadan, and sweet Double Ka Meetha.",
                    mustTryDish = "Kachhi Gosht Dum Biryani with Mirchi Ka Salan"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ts_event_bathukamma",
                    name = "Bathukamma Floral Festival",
                    location = "Across Telangana",
                    state = "Telangana",
                    dateText = "Navratri Season (Sep/Oct)",
                    category = "State Flower Festival",
                    imageUrl = "https://images.unsplash.com/photo-1572445271230-a78b5944a659?auto=format&fit=crop&w=800&q=80",
                    description = "Women arrange concentric stacks of seasonal wildflowers (Gunugu, Thangedu) in conical tiers, dancing around them in song."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving the Ancient Perini Shivatandavam",
                craftOrTradition = "Perini Dance Reconstruction",
                community = "Nataraja Ramakrishna Academy",
                challenge = "Complete extinction following the fall of the Kakatiyas until revived by deciphering Ramappa temple friezes.",
                preservationAction = "State universities introducing full accredited degree courses."
            )
        ),
        IndianState(
            id = "karnataka",
            name = "Karnataka",
            hindiName = "कर्नाटक",
            capital = "Bengaluru",
            region = "South",
            tagline = "One State, Many Worlds • Hampi & Mysore Splendor",
            description = "From the surreal boulder ruins of the Vijayanagara Empire at Hampi and the illuminated palaces of Mysore to vibrant Yakshagana folk theater and rich coffee plantations of Coorg.",
            heroImageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.36f,
            mapY = 0.72f,
            colorHex = 0xFFD97706, // Amber Saffron
            iconicHighlight = "Hampi Stone Chariot • Mysore Palace • Yakshagana",
            danceHighlight = "Yakshagana & Dollu Kunitha",
            musicHighlight = "Carnatic Purandara Dasa Kritis",
            foodHighlight = "Bisi Bele Bath, Mysore Pak, Neer Dosa & Filter Coffee",
            heritageCount = 15,
            places = listOf(
                Place(
                    id = "ka_hampi",
                    name = "Hampi Vijayanagara Ruins & Stone Chariot",
                    city = "Hampi, Vijayanagara",
                    state = "Karnataka",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1000&q=80",
                    description = "UNESCO World Heritage capital of the Vijayanagara Empire strewn with monumental palaces, musical pillars at Vittala Temple, and the iconic stone chariot.",
                    culturalSignificance = "One of the largest and richest medieval metropolitan cities in the world during the 15th century.",
                    tags = listOf("UNESCO World Heritage", "Stone Chariot", "Vijayanagara Ruins"),
                    nearbyAttractions = listOf("Virupaksha Temple", "Matanga Hill", "Tungabhadra River"),
                    localFoodRecommendation = "Authentic banana-leaf South Indian meals with Bele Saaru"
                ),
                Place(
                    id = "ka_mysore_palace",
                    name = "Mysore Palace (Amba Vilas)",
                    city = "Mysuru",
                    state = "Karnataka",
                    imageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b7ec?auto=format&fit=crop&w=1000&q=80",
                    description = "Spectacular Indo-Saracenic royal seat of the Wadiyar dynasty, illuminated by nearly 100,000 lightbulbs on festive evenings.",
                    culturalSignificance = "Host of the world-famous 400-year-old Mysore Dasara Jumboo Savari procession.",
                    tags = listOf("Royal Palace", "Wadiyar Dynasty", "Mysore Dasara"),
                    nearbyAttractions = listOf("Chamundi Hill", "Brindavan Gardens", "Somnathpur Temple"),
                    localFoodRecommendation = "Melt-in-mouth Mysore Pak from Guru Sweet Mart"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ka_trad_sandalwood",
                    name = "Mysore Sandalwood & Rosewood Inlay",
                    state = "Karnataka",
                    category = "Royal Woodcraft",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Carving fragrant genuine Santalum album sandalwood into figurines and intricate inlaid rosewood tabletops.",
                    isEndangered = true,
                    preservationStatus = "State Monitored Reserves"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ka_dance_yakshagana",
                    name = "Yakshagana",
                    state = "Karnataka",
                    origin = "Coastal & Malenadu Karnataka",
                    description = "Vibrant traditional theater dance combining dramatic facial makeup, towering headgear (Muguta), martial acrobatics, and impromptu dialogues.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Towering Kedage headgear, layered red-black-gold skirts, painted face masks",
                    accompaniment = "Chande drum, Maddale drum, Tala finger cymbals"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ka_music_purandara",
                    title = "Purandara Dasa Kritis",
                    region = "Across Karnataka",
                    state = "Karnataka",
                    instruments = "Tambura, Mridangam, Chipla",
                    description = "Lyrical devotional songs by the 'Pithamaha' (Father) of Carnatic music.",
                    audioDuration = "4:35",
                    genre = "Carnatic Classical",
                    name = "Dasa Sahitya"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ka_food_bisibele",
                    name = "Bisi Bele Bath & Mysore Pak",
                    state = "Karnataka",
                    description = "Spicy, wholesome rice, toor dal, and vegetable stew simmered with a 30-spice blend, tamarind, and desi ghee, followed by the heavenly besan-ghee fudge Mysore Pak.",
                    isVeg = true,
                    whereToTry = "MTR (Mavalli Tiffin Room), Bengaluru",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Warm Spiced, Tamarind Tang, Melt-in-Mouth Sweetness"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ka_rest_mtr",
                    name = "Mavalli Tiffin Room (MTR) Since 1924",
                    city = "Lalbagh, Bengaluru",
                    state = "Karnataka",
                    cuisine = "Authentic Kannada Brahmin Tiffins",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Centenary culinary benchmark that invented the Rava Idli during WWII grain shortages, serving rich pure-ghee tiffins.",
                    mustTryDish = "Rava Idli with Ghee and Filter Coffee"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ka_event_dasara",
                    name = "Mysuru Dasara (Jumboo Savari)",
                    location = "Mysore Palace to Bannimantap",
                    state = "Karnataka",
                    dateText = "Vijayadashami Day (October)",
                    category = "State Royal Festival (Nada Habba)",
                    imageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b7ec?auto=format&fit=crop&w=800&q=80",
                    description = "Lead elephant carries the 750-kilogram golden howdah holding Goddess Chamundeshwari through cheering royal crowds."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving All-Night Yakshagana Mela Troupes",
                craftOrTradition = "Yakshagana All-Night Theater",
                community = "Coastal Karnataka Mela Troupes (Mandarthi, Dharmasthala)",
                challenge = "Modern urban lifestyles shortening all-night performances into abbreviated formats.",
                preservationAction = "Yakshagana Kalaranga digital archives and traditional gurukuls."
            )
        ),
        IndianState(
            id = "tamil_nadu",
            name = "Tamil Nadu",
            hindiName = "तमिलनाडु",
            capital = "Chennai",
            region = "South",
            tagline = "Land of Living Chola Temples & Bharatanatyam",
            description = "Home to one of the world's oldest surviving classical languages, majestic towering temple Gopurams at Madurai and Thanjavur, sublime Bharatanatyam dance, and Carnatic music.",
            heroImageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.44f,
            mapY = 0.85f,
            colorHex = 0xFFB91C1C, // Deep Temple Crimson
            iconicHighlight = "Meenakshi Temple • Brihadeeswarar • Bharatanatyam",
            danceHighlight = "Bharatanatyam Classical Dance",
            musicHighlight = "Carnatic Music & Nadaswaram",
            foodHighlight = "Crispy Masala Dosa, Chettinad Chicken, Idli & Filter Kaapi",
            heritageCount = 16,
            places = listOf(
                Place(
                    id = "tn_meenakshi",
                    name = "Madurai Meenakshi Amman Temple",
                    city = "Madurai",
                    state = "Tamil Nadu",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1000&q=80",
                    description = "Ancient Dravidian temple city featuring 14 monumental Gopurams sculpted with thousands of vibrant polychrome gods and demons, centering the Hall of 1000 Pillars.",
                    culturalSignificance = "Historic heart of Tamil Sangam literature and spiritual center of Pandyan rulers.",
                    tags = listOf("Dravidian Architecture", "Gopuram Towers", "Madurai Heritage"),
                    nearbyAttractions = listOf("Thirumalai Nayakkar Palace", "Gandhi Memorial Museum"),
                    localFoodRecommendation = "Madurai Jigarthanda cold almond gum drink"
                ),
                Place(
                    id = "tn_thanjavur",
                    name = "Brihadeeswarar Temple (Big Temple)",
                    city = "Thanjavur",
                    state = "Tamil Nadu",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "1000-year-old UNESCO World Heritage Chola masterpiece built by Raja Raja Chola I with an 80-tonne monolithic granite Vimana dome.",
                    culturalSignificance = "A pinnacle of pure granite engineering where the main tower's shadow never touches the ground at solar noon.",
                    tags = listOf("UNESCO World Heritage", "Great Living Chola Temple", "Granite Marvel"),
                    nearbyAttractions = listOf("Thanjavur Maratha Palace", "Saraswathi Mahal Library"),
                    localFoodRecommendation = "Thanjavur Ashoka Halwa"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "tn_trad_kanchipuram",
                    name = "Kanchipuram Pure Mulberry Silk Weaving",
                    state = "Tamil Nadu",
                    category = "Royal Silk Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Handwoven sarees using three individual shuttles with pure mulberry silk and silver-dipped gold zari border joints (Korvai).",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                ),
                Tradition(
                    id = "tn_trad_tanjore",
                    name = "Tanjore Gold Leaf Painting",
                    state = "Tamil Nadu",
                    category = "Classical Art",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Sacred wooden panel art embellished with 22-carat gold foil, precious gemstones, and embossed gesso relief.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "tn_dance_bharatanatyam",
                    name = "Bharatanatyam",
                    state = "Tamil Nadu",
                    origin = "Temples of Tamil Nadu (Sadir Natyam)",
                    description = "Oldest classical dance tradition of India based on Bharata Muni's Natya Shastra, featuring precise geometric postures (Aramandi), eye movements, and expressive mudras.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Pleated Kanchipuram silk costume that fans out in Aramandi, temple jewelry, ankle bells",
                    accompaniment = "Mridangam, Nattuvangam, Carnatic vocal, Violin, Flute"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "tn_music_carnatic",
                    title = "Margazhi Carnatic Kutcheri",
                    region = "Chennai & Thanjavur",
                    state = "Tamil Nadu",
                    instruments = "Veena, Mridangam, Ghatam, Kanjira, Violin",
                    description = "Complex mathematical Raga and Tala system refined over centuries in temple concerts.",
                    audioDuration = "5:20",
                    genre = "Classical Carnatic",
                    name = "Carnatic Kutcheri"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "tn_food_dosa",
                    name = "Crispy Ghee Podi Dosa & Filter Kaapi",
                    state = "Tamil Nadu",
                    description = "Golden crisp fermented rice and urad dal crepe smeared with gun-powder podi and melted ghee, served with coconut chutney, tomato chutney, and piping hot brass tumbler filter coffee.",
                    isVeg = true,
                    whereToTry = "Murugan Idli Shop & Saravana Bhavan, Chennai",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Crispy, Buttery Podi Spice, Frothy Chicory Aroma"
                ),
                FoodDish(
                    id = "tn_food_chettinad",
                    name = "Chettinad Pepper Chicken",
                    state = "Tamil Nadu",
                    description = "Spicy dish prepared with freshly dry-roasted coriander seeds, black peppercorns, star anise, kalpasi (stone flower), and curry leaves.",
                    isVeg = false,
                    whereToTry = "The Bangala, Karaikudi, Chettinad",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Aromatic Roasted Spice, Fiery Black Pepper Punch"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "tn_rest_bangala",
                    name = "The Bangala Since 1910",
                    city = "Karaikudi, Chettinad",
                    state = "Tamil Nadu",
                    cuisine = "Authentic Chettiar Mansion Dining",
                    rating = 4.9f,
                    priceIndicator = "₹₹₹",
                    description = "Restored heritage Chettinad mansion serving 7-course banana leaf feasts following ancestral spice blends.",
                    mustTryDish = "Chettinad Kozhi Varuval & Vellai Paniyaram"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "tn_event_pongal",
                    name = "Pongal Harvest Festival & Jallikattu",
                    location = "Across Tamil Nadu & Alanganallur",
                    state = "Tamil Nadu",
                    dateText = "Mid-January (Thai Pongal)",
                    category = "Harvest & Sun Celebration",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=800&q=80",
                    description = "Four-day festival boiling fresh harvest rice and jaggery in clay pots until overflowing ('Pongalo Pongal!')."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving Chola Lost-Wax Bronze Sculptures of Swamimalai",
                craftOrTradition = "Swamimalai Bronze Casting",
                community = "Hereditary Sthapathis of Swamimalai",
                challenge = "Strict adherence to Shilpa Shastras measurements threatened by commercial brass stamping.",
                preservationAction = "GI certification and traditional bronze casting gurukuls."
            )
        ),
        IndianState(
            id = "kerala",
            name = "Kerala",
            hindiName = "केरल",
            capital = "Thiruvananthapuram",
            region = "South",
            tagline = "God's Own Country • Backwaters, Kathakali & Ayurveda",
            description = "Fringed by tropical Arabian Sea coastlines and emerald Western Ghats, Kerala is famous for tranquil backwaters, theatrical Kathakali facial mime, ancient Kalaripayattu martial arts, and Onam feast sadya.",
            heroImageUrl = "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.38f,
            mapY = 0.87f,
            colorHex = 0xFF059669, // Lush Palm Green
            iconicHighlight = "Alleppey Backwaters • Kathakali • Grand Onam Sadya",
            danceHighlight = "Kathakali & Mohiniyattam",
            musicHighlight = "Sopana Sangeetham & Chenda Melam",
            foodHighlight = "Appam with Stew, Karimeen Pollichathu & Onam Sadya",
            heritageCount = 15,
            places = listOf(
                Place(
                    id = "kl_alleppey",
                    name = "Alleppey Backwaters & Kettuvallam Houseboats",
                    city = "Alappuzha",
                    state = "Kerala",
                    imageUrl = "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=1000&q=80",
                    description = "Vast network of interconnected brackish lagoons, canals, and lakes fringed with coconut palms where thatched kettuvallam houseboats gently drift.",
                    culturalSignificance = "Historic spice trade waterways engineered with traditional coir-sewn wooden boats built without a single nail.",
                    tags = listOf("Backwaters", "Kettuvallam Houseboats", "Scenic Nature"),
                    nearbyAttractions = listOf("Marari Beach", "Kumarakom", "Vembanad Lake"),
                    localFoodRecommendation = "Fresh Karimeen Pollichathu wrapped in banana leaf"
                ),
                Place(
                    id = "kl_fort_kochi",
                    name = "Fort Kochi & Chinese Fishing Nets",
                    city = "Kochi",
                    state = "Kerala",
                    imageUrl = "https://images.unsplash.com/photo-1593693397690-362cb9666ec2?auto=format&fit=crop&w=1000&q=80",
                    description = "Historic seaside town blending Portuguese, Dutch, British, and Jewish heritage, famous for cantilevered 14th-century Chinese Fishing Nets (Cheena Vala).",
                    culturalSignificance = "Gateway of the ancient Malabar Spice Route where Vasco da Gama was buried.",
                    tags = listOf("Spice Route", "Chinese Fishing Nets", "Colonial Fort"),
                    nearbyAttractions = listOf("Mattancherry Dutch Palace", "Paradesi Synagogue", "Jew Town"),
                    localFoodRecommendation = "Malabar Parotta with tender beef/vegetable roast"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "kl_trad_kalaripayattu",
                    name = "Kalaripayattu Martial Art",
                    state = "Kerala",
                    category = "Ancient Martial Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    description = "Regarded as the mother of all Asian martial arts, combining yogic flexibility, Ayurvedic pressure points (Marma), and weapon combat.",
                    isEndangered = false,
                    preservationStatus = "Active Heritage Training"
                ),
                Tradition(
                    id = "kl_trad_aranmula",
                    name = "Aranmula Kannadi Metal Mirrors",
                    state = "Kerala",
                    category = "Ancient Metallurgy",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Front-reflecting handmade mirrors cast from a secret bronze-tin alloy without glass, made exclusively by a few families in Aranmula.",
                    isEndangered = true,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "kl_dance_kathakali",
                    name = "Kathakali",
                    state = "Kerala",
                    origin = "Malabar Temples",
                    description = "Majestic classical dance-drama celebrated for vivid green facial makeup (Paccha), monumental headgear, and expressive Navarasa eye movements.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Layered voluminous skirts, wooden crown (Kiritam), Paccha makeup, bell attachments",
                    accompaniment = "Chenda drum, Maddalam, Chengila gong, Ilathalam cymbals"
                ),
                DanceItem(
                    id = "kl_dance_theyyam",
                    name = "Theyyam Ritual Dance",
                    state = "Kerala",
                    origin = "North Malabar Temples & Sacred Groves",
                    description = "Living ritual dance where performers transform into living deities, featuring towering fiery headgear and body paint.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Towering headdresses made of areca nut palms, coconut leaves, body paint",
                    accompaniment = "Thunderous Chenda drums and folk incantations"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "kl_music_chendamelam",
                    title = "Panchari Melam & Chenda",
                    region = "Thrissur Temples",
                    state = "Kerala",
                    instruments = "Chenda drums, Kurumkuzhal horn, Kuzhithalam",
                    description = "Overwhelming rhythmic percussion symphony featuring hundreds of drummers playing in synchronization.",
                    audioDuration = "5:10",
                    genre = "Temple Percussion",
                    name = "Chenda Melam"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "kl_food_sadya",
                    name = "Grand Onam Sadya",
                    state = "Kerala",
                    description = "Elaborate vegetarian banquet of 26 dishes served on a fresh plantain leaf, including Avial, Sambar, Olan, Thoran, and Payasam.",
                    isVeg = true,
                    whereToTry = "Traditional heritage homes & Grand Hotel, Kochi",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Coconut oil aroma, Tangy curd, Sweet banana payasam"
                ),
                FoodDish(
                    id = "kl_food_appam",
                    name = "Appam with Vegetable Ishtu",
                    state = "Kerala",
                    description = "Crispy-edged fermented rice batter bowl pancake with a soft pillowy center, served with fragrant coconut milk stew spiced with ginger and green chilies.",
                    isVeg = true,
                    whereToTry = "Dhe Puttu & Kashi Art Cafe, Kochi",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Delicate Sweetness, Creamy Coconut Milk, Mild Spices"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "kl_rest_malabar",
                    name = "Paragon Restaurant Since 1939",
                    city = "Kozhikode & Kochi",
                    state = "Kerala",
                    cuisine = "Legendary Malabar Moplah & Coastal",
                    rating = 4.9f,
                    priceIndicator = "₹₹",
                    description = "Consistently ranked among the top 10 most legendary restaurants in the world for its iconic Malabar Biryani.",
                    mustTryDish = "Kozhikode Mutton Dum Biryani & Fish Moilee"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "kl_event_thrissur",
                    name = "Thrissur Pooram",
                    location = "Vadakkunnathan Temple, Thrissur",
                    state = "Kerala",
                    dateText = "Medam Month (April/May)",
                    category = "Mother of All Poorams",
                    imageUrl = "https://images.unsplash.com/photo-1602216056096-3b40cc0c9944?auto=format&fit=crop&w=800&q=80",
                    description = "Rival temple factions line up 30 majestic caparisoned elephants exchanging colorful parasols (Kudamattom) to 250 chenda drummers."
                )
            ),
            preservationStory = PreservationStory(
                title = "Passing Down the Secret Alloy of Aranmula Mirrors",
                craftOrTradition = "Aranmula Metal Mirror Casting",
                community = "Aranmula Vishwakarma Guild",
                challenge = "Secret metallurgical ratio passed only by word-of-mouth within a handful of master craftsmen.",
                preservationAction = "GI tagging and state-sponsored apprentice workshop centers."
            )
        ),
        IndianState(
            id = "puducherry",
            name = "Puducherry (UT)",
            hindiName = "पुडुचेरी",
            capital = "Puducherry",
            region = "South",
            tagline = "The French Riviera of the East & Auroville",
            description = "A peaceful coastal union territory featuring tree-lined boulevards, pastel mustard-colored French colonial villas, serene Aurobindo Ashram, and the universal experimental city of Auroville.",
            heroImageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.47f,
            mapY = 0.82f,
            colorHex = 0xFF0284C7, // French Riviera Blue
            iconicHighlight = "White Town French Quarter • Matrimandir Auroville • Promenade Beach",
            danceHighlight = "Garadi Folk Dance",
            musicHighlight = "French Chansons & Carnatic Fusion",
            foodHighlight = "Franco-Tamil Creole, Baguettes & Croissants",
            heritageCount = 9,
            places = listOf(
                Place(
                    id = "py_matrimandir",
                    name = "Matrimandir at Auroville",
                    city = "Auroville, Puducherry",
                    state = "Puducherry (UT)",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "Golden metallic sphere regarded as the 'soul of the city' in Auroville, an international township dedicated to peace, sustainable living, and human unity.",
                    culturalSignificance = "Architectural marvel housing the world's largest optically-worked glass globe concentrating sunlight for silent meditation.",
                    tags = listOf("Universal City", "Matrimandir Sphere", "Peace & Unity"),
                    nearbyAttractions = listOf("Sri Aurobindo Ashram", "Promenade Beach", "White Town"),
                    localFoodRecommendation = "Organic wood-fired sourdough pizza and artisanal cheese"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "py_trad_handmade_paper",
                    name = "Sri Aurobindo Handmade Paper",
                    state = "Puducherry (UT)",
                    category = "Eco-Artisan Craft",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Eco-friendly handmade cotton rag paper crafted without felling trees, decorated with real pressed petals and marbling.",
                    isEndangered = false,
                    preservationStatus = "Active Eco Craft"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "py_dance_garadi",
                    name = "Garadi Dance",
                    state = "Puducherry (UT)",
                    origin = "Puducherry Folk Tradition",
                    description = "Lively folk dance depicting the battle of the Vanaras (monkey warriors) celebrating Lord Rama's victory over Ravana.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Monkey-like makeup, colorful flags, iron rings on ankles (Anjali)",
                    accompaniment = "Thappu drums and brass bells"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "py_music_creole",
                    title = "Franco-Tamil Acoustic Harmony",
                    region = "White Town",
                    state = "Puducherry (UT)",
                    instruments = "Acoustic Guitar, Flute, Mridangam",
                    description = "Soothing acoustic fusion mirroring Puducherry's dual heritage.",
                    audioDuration = "3:30",
                    genre = "World Fusion",
                    name = "Puducherry Serenade"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "py_food_creole",
                    name = "Pondicherry Creole Fish Curry",
                    state = "Puducherry (UT)",
                    description = "Unique Franco-Tamil culinary synthesis blending coconut milk, mild mustard seeds, vinegar, and fennel, eaten with fresh French baguette.",
                    isVeg = false,
                    whereToTry = "Maison Perumal & Carte Blanche, White Town",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Mild Coconut Cream, Herb-scented, Subtle Tang"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "py_rest_coromandel",
                    name = "Coromandel Cafe",
                    city = "White Town, Puducherry",
                    state = "Puducherry (UT)",
                    cuisine = "French Patisserie & Heritage Cafe",
                    rating = 4.8f,
                    priceIndicator = "₹₹₹",
                    description = "Housed in a pink French colonial villa, renowned for flaky butter croissants, cold brews, and coastal salads.",
                    mustTryDish = "Pain au Chocolat & Creole Seafood Skillet"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "py_event_international_yoga",
                    name = "International Yoga Festival",
                    location = "Promenade Beach, Puducherry",
                    state = "Puducherry (UT)",
                    dateText = "January 4 – 7",
                    category = "Spiritual & Wellness",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=800&q=80",
                    description = "Hundreds of yogis assemble by the Bay of Bengal sunrise for asanas, chanting, and classical Carnatic sessions."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving White Town's Franco-Tamil Architecture",
                craftOrTradition = "Colonial Lime Plaster Facades",
                community = "INTACH Puducherry Chapter",
                challenge = "Commercial conversions threatening high-ceilinged colonial verandahs and wrought-iron balconies.",
                preservationAction = "Strict architectural conservation heritage guidelines."
            )
        )
    )
}
