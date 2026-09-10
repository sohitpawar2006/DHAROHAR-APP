package com.example.data

object WestCentralIndiaStates {
    val all: List<IndianState> = listOf(
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
            mapY = 0.33f,
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
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "rj_trad_kathputli",
                    name = "Kathputli String Puppetry",
                    state = "Rajasthan",
                    category = "Folk Theater",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    description = "Ancient musical puppet theater carved from mango wood and dressed in bright Rajasthani textiles.",
                    isEndangered = true,
                    preservationStatus = "Urgent Documentation Needed"
                ),
                Tradition(
                    id = "rj_trad_blue_pottery",
                    name = "Jaipur Blue Pottery",
                    state = "Rajasthan",
                    category = "Craft Heritage",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Glazed turquoise and cobalt blue pottery made without clay using ground quartz stone, Fuller's earth, and natural gum.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "rj_dance_ghoomar",
                    name = "Ghoomar",
                    state = "Rajasthan",
                    origin = "Bhil Tribe & Rajput Courts",
                    description = "Graceful pirouetting dance where women twirl in circular flowing rhythms, billowing their vivid 80-kali flared skirts.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Embroidered Ghagra, Choli, and translucent Odhani veil with Kundan jewelry",
                    accompaniment = "Dhol, Dholak, and Manjira cymbals"
                ),
                DanceItem(
                    id = "rj_dance_kalbelia",
                    name = "Kalbelia (Snake Charmer Dance)",
                    state = "Rajasthan",
                    origin = "Thar Desert Nomads",
                    description = "Acrobatic swirling movements emulating the serpentine dance of the cobra, recognized by UNESCO as Intangible Cultural Heritage.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Black flowing skirts embroidered with silver mirrors and ribbon stitches",
                    accompaniment = "Poongi (Gourd reed pipe), Dafli, and Khanjari"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "rj_music_manganiyar",
                    title = "Kesariya Balam (Padharo Mhare Des)",
                    region = "Marwar & Thar Desert",
                    state = "Rajasthan",
                    instruments = "Kamaicha (Bowed lute), Khartal (Wooden castanets), Dholak",
                    description = "Iconic Rajasthani welcoming ballad sung by hereditary Manganiyar court bards.",
                    audioDuration = "4:32",
                    genre = "Desert Folk",
                    name = "Manganiyar Folk"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "rj_food_dalbaati",
                    name = "Dal Baati Churma",
                    state = "Rajasthan",
                    description = "Hard wheat rolls baked over cow-dung cake embers, dipped in desi ghee, paired with panchmel spiced dal and sweet jaggery churma.",
                    isVeg = true,
                    whereToTry = "Chokhi Dhani, Jaipur",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Ghee-rich, Spiced Panchmel, Sweet Cardamom Churma"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "rj_rest_1",
                    name = "1135 AD at Amber Fort",
                    city = "Jaipur",
                    state = "Rajasthan",
                    cuisine = "Royal Rajputana Cuisine",
                    rating = 4.8f,
                    priceIndicator = "₹₹₹",
                    description = "Opulent silver-gilt dining hall overlooking Amber Fort's ramparts, serving heritage royal Rajput recipes.",
                    mustTryDish = "Laal Maas with Bajra Roti"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "rj_event_pushkar",
                    name = "Pushkar Camel Fair",
                    location = "Pushkar Dunes",
                    state = "Rajasthan",
                    dateText = "Kartik Purnima (Nov)",
                    category = "Dune Fair & Livestock",
                    imageUrl = "https://images.unsplash.com/photo-1599661046289-e31897846e41?auto=format&fit=crop&w=800&q=80",
                    description = "Thousands of camel breeders gather with livestock dressed in colorful pom-poms alongside sacred holy lake dips."
                )
            ),
            preservationStory = PreservationStory(
                title = "Reviving the Dying Sounds of the Kamaicha",
                craftOrTradition = "Kamaicha 17-Stringed Bowed Lute",
                community = "Manganiyar Musicians of Barmer",
                challenge = "Only 3 master craftsmen remain who know how to carve the body from seasoned mango wood and goat hide.",
                preservationAction = "Establishment of rural apprentice schools and live audio digitization archives."
            )
        ),
        IndianState(
            id = "gujarat",
            name = "Gujarat",
            hindiName = "गुजरात",
            capital = "Gandhinagar",
            region = "West",
            tagline = "Jewel of Western India • Land of Garba & Gandhi",
            description = "Cradle of the Harappan civilization at Lothal and Dholavira, Gujarat sparkles with the Great White Rann of Kutch, 9-night Navratri Garba celebrations, and vibrant textile wizardry.",
            heroImageUrl = "https://images.unsplash.com/photo-1596401057633-54a8fe8ef647?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.22f,
            mapY = 0.45f,
            colorHex = 0xFFD97706, // Amber
            iconicHighlight = "Rann of Kutch • Modhera Sun Temple • Navratri Garba",
            danceHighlight = "Garba & Dandiya Raas",
            musicHighlight = "Sugam Sangeet & Dayro",
            foodHighlight = "Gujarati Thali, Khaman Dhokla, Undhiyu & Jalebi Fafda",
            heritageCount = 13,
            places = listOf(
                Place(
                    id = "gj_rann_kutch",
                    name = "Great Rann of Kutch",
                    city = "Dhordo, Kutch",
                    state = "Gujarat",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "One of the largest salt deserts in the world, glowing like silver under full-moon nights during the Rann Utsav.",
                    culturalSignificance = "Home to Kutch nomadic tribes producing legendary Rogan art, Ajrakh block prints, and mirror-work embroidery.",
                    tags = listOf("Salt Desert", "Rann Utsav", "Tribal Crafts"),
                    nearbyAttractions = listOf("Kala Dungar", "Mandvi Beach", "Dholavira"),
                    localFoodRecommendation = "Kutchi Dabeli with roasted peanuts and pomegranate"
                ),
                Place(
                    id = "gj_modhera",
                    name = "Modhera Sun Temple",
                    city = "Mehsana",
                    state = "Gujarat",
                    imageUrl = "https://images.unsplash.com/photo-1596401057633-54a8fe8ef647?auto=format&fit=crop&w=1000&q=80",
                    description = "11th-century Solanki architectural marvel designed so the equinox sun rays illuminate the sanctum's inner deity.",
                    culturalSignificance = "Features Surya Kund, a colossal stepwell pool surrounded by 108 miniature carved shrines.",
                    tags = listOf("Solanki Dynasty", "Stepwell Pool", "Astronomy"),
                    nearbyAttractions = listOf("Rani Ki Vav Patan", "Patan Patola Museum"),
                    localFoodRecommendation = "Surati Ghari and warm Khakhra"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "gj_trad_rogan",
                    name = "Rogan Castor-Oil Fabric Art",
                    state = "Gujarat",
                    category = "Ancient Textile Craft",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Painting with boiled castor oil and natural pigments using a small metal stylus, preserved by only one Khatri family in Nirona village.",
                    isEndangered = true,
                    preservationStatus = "Critical Preservation"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "gj_dance_garba",
                    name = "Garba & Dandiya Raas",
                    state = "Gujarat",
                    origin = "Ancient Shakti worship",
                    description = "UNESCO Intangible Cultural Heritage circle dance celebrating the divine feminine energy with rhythmic clapping and spinning.",
                    imageUrl = "https://images.unsplash.com/photo-1518709268805-4e9042af9f23?auto=format&fit=crop&w=800&q=80",
                    costume = "Chaniya Choli adorned with abhala mirror work and silver jewelry",
                    accompaniment = "Dhol, Shehnai, synchronized claps and singing"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "gj_music_dayro",
                    title = "Saurashtra Lok Dayro",
                    region = "Kathiawar & Kutch",
                    state = "Gujarat",
                    instruments = "Manjira, Harmonium, Dholak",
                    description = "Midnight storytelling folk music gatherings sharing heroic ballads of regional bards.",
                    audioDuration = "4:40",
                    genre = "Folk Dayro",
                    name = "Saurashtra Dayro"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "gj_food_dhokla",
                    name = "Khaman Dhokla & Fafda Jalebi",
                    state = "Gujarat",
                    description = "Steamed fermented gram flour cakes tempered with mustard seeds and green chilies, eaten with crispy crunchy besan fafda.",
                    isVeg = true,
                    whereToTry = "Das Khaman & Chandravilas, Ahmedabad",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Spongy, Sweet-Tangy, Mustard crunch"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "gj_rest_vishalla",
                    name = "Vishalla Village Restaurant",
                    city = "Ahmedabad",
                    state = "Gujarat",
                    cuisine = "Authentic Gujarati Village Thali",
                    rating = 4.8f,
                    priceIndicator = "₹₹",
                    description = "Rustic mud-hut open-air setting with lantern light, folk music, and an ancient museum of utensils (Vechaar).",
                    mustTryDish = "Grand Gujarati Thali with Rotla and Ghee-Jaggery"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "gj_event_navratri",
                    name = "Navratri Mahotsav (9 Nights)",
                    location = "Across Gujarat (Vadodara & Ahmedabad)",
                    state = "Gujarat",
                    dateText = "Ashwin Month (Sep/Oct)",
                    category = "World's Longest Dance Festival",
                    imageUrl = "https://images.unsplash.com/photo-1596401057633-54a8fe8ef647?auto=format&fit=crop&w=800&q=80",
                    description = "Millions of dancers swirling in unison under starlit nights honoring Goddess Durga."
                )
            ),
            preservationStory = PreservationStory(
                title = "Saving Double Ikkat Patan Patola Silk",
                craftOrTradition = "Patan Patola Silk Weaving",
                community = "Salvi Weaver Family, Patan",
                challenge = "Months of meticulous yarn tie-dyeing math required before a single shuttle is thrown.",
                preservationAction = "Patola Heritage Museum documentation and master workshops."
            )
        ),
        IndianState(
            id = "maharashtra",
            name = "Maharashtra",
            hindiName = "महाराष्ट्र",
            capital = "Mumbai",
            region = "West",
            tagline = "Land of Maratha Valor, Ajanta-Ellora & Ganpati Bappa",
            description = "Steeped in the historic legacy of Chhatrapati Shivaji Maharaj, Maharashtra boasts UNESCO rock-cut cave marvels at Ajanta & Ellora, rhythmic Lavani dances, and majestic Sahyadri hill citadels.",
            heroImageUrl = "https://images.unsplash.com/photo-1570168007204-dfb528c6958f?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.35f,
            mapY = 0.56f,
            colorHex = 0xFFDC2626, // Saffron Crimson
            iconicHighlight = "Ajanta & Ellora Caves • Gateway of India • Ganesh Chaturthi",
            danceHighlight = "Lavani & Koli Dance",
            musicHighlight = "Natya Sangeet & Powada Ballads",
            foodHighlight = "Misal Pav, Puran Poli & Vada Pav",
            heritageCount = 15,
            places = listOf(
                Place(
                    id = "mh_ellora_caves",
                    name = "Kailasa Temple at Ellora Caves",
                    city = "Aurangabad (Chhatrapati Sambhajinagar)",
                    state = "Maharashtra",
                    imageUrl = "https://images.unsplash.com/photo-1582510003544-4d00b7f74220?auto=format&fit=crop&w=1000&q=80",
                    description = "The world's largest monolithic rock-cut structure, carved top-to-bottom from a single colossal basalt cliff in the 8th century.",
                    culturalSignificance = "Rashtrakuta architectural miracle featuring 34 monasteries and temples spanning Hindu, Buddhist, and Jain faiths.",
                    tags = listOf("UNESCO World Heritage", "Monolithic Miracle", "Ancient Architecture"),
                    nearbyAttractions = listOf("Ajanta Caves", "Bibi Ka Maqbara", "Daulatabad Fort"),
                    localFoodRecommendation = "Naan Qalia with hot saffron tea"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "mh_trad_paithani",
                    name = "Paithani Silk & Peacock Borders",
                    state = "Maharashtra",
                    category = "Royal Textile Craft",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Handwoven royal sarees woven with real gold and silver zari, featuring ornate peacock and lotus border motifs.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "mh_dance_lavani",
                    name = "Lavani",
                    state = "Maharashtra",
                    origin = "Peshwa Courts & Solapur",
                    description = "High-energy rhythm-driven dance combining sensuous expressions with rapid footwork to the beat of the Dholki.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Nauvari (9-yard) silk saree, pearl nath (nose ring), glass bangles",
                    accompaniment = "Dholki drum, Manjira, Tuntuna"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "mh_music_powada",
                    title = "Maratha Powada Heroic Ballad",
                    region = "Sahyadri Hills",
                    state = "Maharashtra",
                    instruments = "Daf drum, Tuntuna, Majira",
                    description = "Rousing heroic musical verse narrating the battles and wisdom of Chhatrapati Shivaji Maharaj.",
                    audioDuration = "3:55",
                    genre = "Heroic Ballad",
                    name = "Powada"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "mh_food_misalpav",
                    name = "Kolhapuri Misal Pav",
                    state = "Maharashtra",
                    description = "Fiery sprouted moth-bean curry laced with 'Kat' gravy, farsan crunch, chopped onions, and lemon, eaten with buttery pav.",
                    isVeg = true,
                    whereToTry = "Phadtare Misal, Kolhapur & Aaswad, Mumbai",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Spicy, Tangy, Crunchy Texture"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "mh_rest_aaswad",
                    name = "Aaswad Since 1986",
                    city = "Dadar, Mumbai",
                    state = "Maharashtra",
                    cuisine = "Authentic Maharashtrian Vegetarian",
                    rating = 4.8f,
                    priceIndicator = "₹",
                    description = "Award-winning restaurant opposite Shiv Sena Bhavan, famous for the world's best vegetarian Misal Pav and Puran Poli.",
                    mustTryDish = "Misal Pav & Kothimbir Vadi"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "mh_event_ganesh",
                    name = "Ganesh Chaturthi Mahotsav",
                    location = "Lalbaugcha Raja, Mumbai & Pune",
                    state = "Maharashtra",
                    dateText = "Bhadrapada Month (Aug/Sep)",
                    category = "Community Public Festival",
                    imageUrl = "https://images.unsplash.com/photo-1570168007204-dfb528c6958f?auto=format&fit=crop&w=800&q=80",
                    description = "10-day grand festival of Lord Ganesha popularized by Lokmanya Tilak, culminating in oceanic immersion processions."
                )
            ),
            preservationStory = PreservationStory(
                title = "Conserving the 2000-Year-Old Ajanta Buddhist Murals",
                craftOrTradition = "Ajanta Mineral Tempera Painting",
                community = "Archaeological Survey of India & Conservation Chemists",
                challenge = "Moisture, bat excreta, and light exposure degrading Jataka tale frescoes painted on mud-straw plaster.",
                preservationAction = "Microclimate sensors, LED fiber lighting, and high-resolution gigapixel digital archiving."
            )
        ),
        IndianState(
            id = "goa",
            name = "Goa",
            hindiName = "गोवा",
            capital = "Panaji",
            region = "West",
            tagline = "Pearl of the Orient • Portuguese Heritage & Konkan Shores",
            description = "A sun-drenched coastal state with Portuguese colonial mansions, centuries-old churches, susegad beach life, vibrant Shigmo festivals, and spicy vindaloo cuisine.",
            heroImageUrl = "https://images.unsplash.com/photo-1512343879784-a960bf40e7f2?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.31f,
            mapY = 0.69f,
            colorHex = 0xFF0284C7, // Ocean Blue
            iconicHighlight = "Basilica of Bom Jesus • Fontainhas Latin Quarter • Bebinca",
            danceHighlight = "Fugdi & Dekhnni Dance",
            musicHighlight = "Goan Mando & Konkani Cantaram",
            foodHighlight = "Goan Fish Curry, Bebinca & Xacuti",
            heritageCount = 10,
            places = listOf(
                Place(
                    id = "ga_bom_jesus",
                    name = "Basilica of Bom Jesus",
                    city = "Old Goa",
                    state = "Goa",
                    imageUrl = "https://images.unsplash.com/photo-1512343879784-a960bf40e7f2?auto=format&fit=crop&w=1000&q=80",
                    description = "16th-century UNESCO World Heritage church holding the sacred relics of St. Francis Xavier, an architectural masterpiece of Baroque design.",
                    culturalSignificance = "One of the oldest churches in India and a landmark of Asian Christianity.",
                    tags = listOf("UNESCO World Heritage", "Baroque Church", "Old Goa"),
                    nearbyAttractions = listOf("Se Cathedral", "Church of St. Cajetan", "Fontainhas"),
                    localFoodRecommendation = "Authentic multi-layered Bebinca dessert"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "ga_trad_feni",
                    name = "Cashew Feni Distillation",
                    state = "Goa",
                    category = "Intangible Heritage Drink",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "Traditional pot-still distillation of fermented cashew apple juice in earthen pots (Bhatti), granted GI status.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "ga_dance_fugdi",
                    name = "Fugdi Konkan Dance",
                    state = "Goa",
                    origin = "Goan Konkan Villages",
                    description = "Joyful women's folk dance performed during Dhalo and Ganesh festivals, dancing in pairs and clapping rapidly.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Bright Kashti saree, fresh jasmine flower veni in hair",
                    accompaniment = "Ghumot earthen pot drum and foot rhythm"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "ga_music_mando",
                    title = "Goan Mando Ballad",
                    region = "Ilhas & Salcete",
                    state = "Goa",
                    instruments = "Violin, Ghumot, Guitar",
                    description = "Graceful Konkani-Portuguese courtship song blending Western harmonies with Indian lyricism.",
                    audioDuration = "3:30",
                    genre = "Konkani Folk",
                    name = "Goan Mando"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "ga_food_fishcurry",
                    name = "Goan Fish Curry & Poee",
                    state = "Goa",
                    description = "Kingfish steak simmered in coconut milk gravy flavored with sour Kokum, fresh ground coriander seeds, and Kashmiri red chilies.",
                    isVeg = false,
                    whereToTry = "Fisherman's Wharf & Vinayak Family Restaurant",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Tangy Kokum, Creamy Coconut, Spicy Kick"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "ga_rest_mum",
                    name = "Mum's Kitchen",
                    city = "Panaji",
                    state = "Goa",
                    cuisine = "Homestyle Goan Catholic & Hindu",
                    rating = 4.7f,
                    priceIndicator = "₹₹₹",
                    description = "Dedicated to reviving endangered home-recipes gathered from Goan grandmothers across rural talukas.",
                    mustTryDish = "Pork Vindaloo & Crab Xec Xec"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "ga_event_shigmo",
                    name = "Shigmo Spring Festival",
                    location = "Panaji, Mapusa, Margao",
                    state = "Goa",
                    dateText = "March (Phalguna)",
                    category = "Goan Hindu Carnival",
                    imageUrl = "https://images.unsplash.com/photo-1512343879784-a960bf40e7f2?auto=format&fit=crop&w=800&q=80",
                    description = "14-day celebration of spring with street parades, vibrant mythological floats, and Romtamel warrior dancing."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving the Latin Quarter of Fontainhas",
                craftOrTradition = "Portuguese Heritage Architecture",
                community = "Panaji Heritage Foundation",
                challenge = "Rapid modernization threatening 18th-century tiled villas with red-tiled roofs and oyster-shell windows.",
                preservationAction = "Conservation zoning and heritage walking trail initiatives."
            )
        ),
        IndianState(
            id = "madhya_pradesh",
            name = "Madhya Pradesh",
            hindiName = "मध्य प्रदेश",
            capital = "Bhopal",
            region = "Central",
            tagline = "The Heart of Incredible India • Khajuraho & Tigers",
            description = "Lying at the center of the nation, Madhya Pradesh preserves world-renowned temple art at Khajuraho, the ancient Great Stupa of Sanchi, Bhimbetka's prehistoric rock shelters, and sacred Jyotirlingas along the holy Narmada River.",
            heroImageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b7ec?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.43f,
            mapY = 0.44f,
            colorHex = 0xFF7C3AED, // Royal Purple
            iconicHighlight = "Khajuraho Temples • Sanchi Stupa • Ujjain Mahakal",
            danceHighlight = "Matki & Grida Folk Dance",
            musicHighlight = "Dhrupad (Gwalior Gharana)",
            foodHighlight = "Indori Poha Jalebi, Bhutte Ka Kees & Dal Bafla",
            heritageCount = 14,
            places = listOf(
                Place(
                    id = "mp_khajuraho",
                    name = "Khajuraho Group of Monuments",
                    city = "Chhatarpur",
                    state = "Madhya Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b7ec?auto=format&fit=crop&w=1000&q=80",
                    description = "UNESCO World Heritage temples built by the Chandela dynasty between 950 and 1050 CE, celebrated for intricate sandstone sculptures celebrating human life and spiritual union.",
                    culturalSignificance = "Pinnacle of medieval Nagara temple architecture honoring Shaivism, Vaishnavism, and Jainism.",
                    tags = listOf("UNESCO World Heritage", "Nagara Architecture", "Chandela Dynasty"),
                    nearbyAttractions = listOf("Kandariya Mahadeva", "Raneh Falls", "Panna National Park"),
                    localFoodRecommendation = "Hot Poha Jalebi with Sev"
                ),
                Place(
                    id = "mp_sanchi",
                    name = "Great Stupa of Sanchi",
                    city = "Raisen",
                    state = "Madhya Pradesh",
                    imageUrl = "https://images.unsplash.com/photo-1590050752117-238cb0fb12b1?auto=format&fit=crop&w=1000&q=80",
                    description = "The oldest stone structure in India commissioned by Emperor Ashoka in the 3rd century BCE, enshrining sacred relics of the Buddha.",
                    culturalSignificance = "Four magnificent stone Torana gateways carved with Jataka tales, defining early Buddhist art.",
                    tags = listOf("UNESCO World Heritage", "Ashoka Maurya", "Buddhist Sanctuary"),
                    nearbyAttractions = listOf("Udayagiri Caves", "Bhimbetka", "Bhopal Lake"),
                    localFoodRecommendation = "Dal Bafla cooked with pure desi ghee"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "mp_trad_gond",
                    name = "Gond Tribal Canvas Painting",
                    state = "Madhya Pradesh",
                    category = "Indigenous Art",
                    imageUrl = "https://images.unsplash.com/photo-1579783900882-c0d3dad7b119?auto=format&fit=crop&w=800&q=80",
                    description = "Vibrant tribal art using dots, lines, and dashes to narrate folktales of sacred animals, Mahua trees, and forest spirits.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                ),
                Tradition(
                    id = "mp_trad_chanderi",
                    name = "Chanderi Handloom Weaving",
                    state = "Madhya Pradesh",
                    category = "Royal Textile Weaving",
                    imageUrl = "https://images.unsplash.com/photo-1606760227091-3dd870d97f1d?auto=format&fit=crop&w=800&q=80",
                    description = "Sheer gossamer fabric woven with fine cotton and pure silk yarn accented by zari, patronized since the Scindia dynasty.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "mp_dance_matki",
                    name = "Matki Dance",
                    state = "Madhya Pradesh",
                    origin = "Malwa Plateau",
                    description = "Community dance where women balance multiple brass and earthen pots on their heads while dancing to the Dhol beat.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "Lugda saree, silver hasli necklace, balanced water pots",
                    accompaniment = "Dhol, Dholak, local folksongs"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "mp_music_dhrupad",
                    title = "Gwalior Dhrupad & Tansen Legacy",
                    region = "Gwalior & Ujjain",
                    state = "Madhya Pradesh",
                    instruments = "Rudra Veena, Pakhawaj, Tanpura",
                    description = "The most ancient surviving classical musical tradition of northern India, perfected by legendary court musician Tansen.",
                    audioDuration = "5:15",
                    genre = "Ancient Classical Dhrupad",
                    name = "Gwalior Dhrupad"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "mp_food_poha",
                    name = "Indori Poha & Sev Jalebi",
                    state = "Madhya Pradesh",
                    description = "Steamed flattened rice spiced with fennel seeds and turmeric, topped with ratlami sev, pomegranate pearls, and fresh coriander, served with piping hot saffron jalebi.",
                    isVeg = true,
                    whereToTry = "Sarafa Bazaar & Chappan Dukan, Indore",
                    imageUrl = "https://images.unsplash.com/photo-1589301760014-d929f3979dbc?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Tangy Jeeravan, Crispy Sev, Sweet Saffron Jalebi"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "mp_rest_sarafa",
                    name = "Sarafa Midnight Night Market",
                    city = "Indore",
                    state = "Madhya Pradesh",
                    cuisine = "Legendary Central Indian Street Food",
                    rating = 4.9f,
                    priceIndicator = "₹",
                    description = "By day a bustling jewelry bazaar, by night turning into India's most famous street food hub serving Bhutte Ka Kees, Garadu, and Joshi Dahi Bada.",
                    mustTryDish = "Bhutte Ka Kees & Flying Dahi Bada"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "mp_event_khajuraho",
                    name = "Khajuraho Dance Festival",
                    location = "Chitragupta Temple, Khajuraho",
                    state = "Madhya Pradesh",
                    dateText = "February (7 Days)",
                    category = "Classical Dance Festival",
                    imageUrl = "https://images.unsplash.com/photo-1600100397608-f010f443b7ec?auto=format&fit=crop&w=800&q=80",
                    description = "Week-long celebration where India's greatest classical dance maestros perform against floodlit 1000-year-old temples."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving the Prehistoric Bhimbetka Rock Caves",
                craftOrTradition = "Stone Age Ochre Wall Art",
                community = "Tribal Custodians of Raisen & ASI",
                challenge = "Weathering and human moisture impacting 30,000-year-old ochre animal paintings.",
                preservationAction = "Non-invasive laser documentation and elevated boardwalks."
            )
        ),
        IndianState(
            id = "chhattisgarh",
            name = "Chhattisgarh",
            hindiName = "छत्तीसगढ़",
            capital = "Raipur",
            region = "Central",
            tagline = "Rice Bowl of India • Bastar Crafts & Sacred Forests",
            description = "Rich in ancient tribal heritage, lush Sal forests, and the horseshoe Chitrakote 'Niagara of India' falls, Chhattisgarh is celebrated for Dhokra lost-wax bronze metalwork, Kosa silk, and the 75-day Bastar Dussehra.",
            heroImageUrl = "https://images.unsplash.com/photo-1599661046289-e31897846e41?auto=format&fit=crop&w=1200&q=80",
            mapX = 0.54f,
            mapY = 0.49f,
            colorHex = 0xFF059669, // Forest Green
            iconicHighlight = "Chitrakote Falls • Bastar Dhokra Art • Bastar Dussehra",
            danceHighlight = "Panthi & Raut Nacha",
            musicHighlight = "Pandavani (Teejan Bai Ballads)",
            foodHighlight = "Chila, Fara, Bafauri & Angakar Roti",
            heritageCount = 9,
            places = listOf(
                Place(
                    id = "cg_chitrakote",
                    name = "Chitrakote Waterfalls",
                    city = "Jagdalpur, Bastar",
                    state = "Chhattisgarh",
                    imageUrl = "https://images.unsplash.com/photo-1506197603052-3cc9c3a201bd?auto=format&fit=crop&w=1000&q=80",
                    description = "Widest waterfall in India spanning nearly 300 meters on the Indravati River, nicknamed the 'Niagara of India'.",
                    culturalSignificance = "Sacred natural site for Maria and Muria indigenous communities.",
                    tags = listOf("Niagara of India", "Indravati River", "Natural Wonder"),
                    nearbyAttractions = listOf("Tirathgarh Falls", "Kanger Ghati National Park", "Bastar Palace"),
                    localFoodRecommendation = "Authentic rice flour Fara with green coriander chutney"
                )
            ),
            traditions = listOf(
                Tradition(
                    id = "cg_trad_dhokra",
                    name = "Bastar Bell Metal (Dhokra)",
                    state = "Chhattisgarh",
                    category = "Ancient Metallurgical Art",
                    imageUrl = "https://images.unsplash.com/photo-1578749556568-bc2c40e68b61?auto=format&fit=crop&w=800&q=80",
                    description = "4,000-year-old non-ferrous lost-wax casting technique traced back to the Mohenjo-daro Dancing Girl.",
                    isEndangered = false,
                    preservationStatus = "GI Tag Protected"
                )
            ),
            dances = listOf(
                DanceItem(
                    id = "cg_dance_panthi",
                    name = "Panthi Dance",
                    state = "Chhattisgarh",
                    origin = "Satnami Community",
                    description = "Dynamic spiritual dance featuring acrobatic human pyramids celebrating the teachings of Guru Ghasidas.",
                    imageUrl = "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=800&q=80",
                    costume = "White Dhoti, white turban, brass ghungroos",
                    accompaniment = "Mandar drum, Jhanj cymbals"
                )
            ),
            music = listOf(
                MusicItem(
                    id = "cg_music_pandavani",
                    title = "Pandavani Musical Epics",
                    region = "Bastar & Durg",
                    state = "Chhattisgarh",
                    instruments = "Tambura with bells, Kartal",
                    description = "Passionate enactment of Mahabharata tales popularized worldwide by Padmavibhushan Teejan Bai.",
                    audioDuration = "4:50",
                    genre = "Folk Epic Theater",
                    name = "Pandavani"
                )
            ),
            foods = listOf(
                FoodDish(
                    id = "cg_food_fara",
                    name = "Chhattisgarhi Fara & Chila",
                    state = "Chhattisgarh",
                    description = "Steamed dumplings made of leftover cooked rice and rice flour tempered with sesame seeds, mustard, and green chilies.",
                    isVeg = true,
                    whereToTry = "Traditional rural tribal kitchens & Raipur haats",
                    imageUrl = "https://images.unsplash.com/photo-1546833999-b9f581a1996d?auto=format&fit=crop&w=800&q=80",
                    flavorProfile = "Savory, Crispy crust, Lightly spiced"
                )
            ),
            restaurants = listOf(
                RestaurantSpot(
                    id = "cg_rest_gadh",
                    name = "Gadh Kalva Traditional Kitchen",
                    city = "Raipur",
                    state = "Chhattisgarh",
                    cuisine = "Authentic Chhattisgarhi Folk Food",
                    rating = 4.6f,
                    priceIndicator = "₹",
                    description = "Cultural center preserving ancestral tribal dishes like Dubki Kadhi, Lal Bhaji, and Bafauri.",
                    mustTryDish = "Dubki Kadhi with Fara"
                )
            ),
            events = listOf(
                CulturalEvent(
                    id = "cg_event_dussehra",
                    name = "Bastar Dussehra (75 Days)",
                    location = "Danteshwari Temple, Jagdalpur",
                    state = "Chhattisgarh",
                    dateText = "July to October (Longest in the world)",
                    category = "Tribal Goddess Celebration",
                    imageUrl = "https://images.unsplash.com/photo-1599661046289-e31897846e41?auto=format&fit=crop&w=800&q=80",
                    description = "World's longest festival, celebrating Goddess Danteshwari with a massive two-tiered wooden chariot pulled by hundreds of tribal devotees."
                )
            ),
            preservationStory = PreservationStory(
                title = "Preserving Bastar Lost-Wax Casting Guilds",
                craftOrTradition = "Dhokra Metal Sculpture",
                community = "Ghadwa Artisan Community",
                challenge = "Soaring brass scrap prices leading artisans to migrate to unskilled urban construction.",
                preservationAction = "Raw material subsidization and direct artisan market linkages."
            )
        )
    )
}
