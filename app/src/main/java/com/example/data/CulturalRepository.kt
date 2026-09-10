package com.example.data

object CulturalRepository {

    val states: List<IndianState> = NorthIndiaStates.all +
            WestCentralIndiaStates.all +
            EastIndiaStates.all +
            SouthIndiaStates.all +
            NortheastIndiaStates.all

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
        ),
        ReelItem(
            id = "reel_6",
            title = "Floating Phumdis of Loktak Lake",
            creator = "ManipurDiaries",
            creatorAvatar = "🛶",
            location = "Loktak Lake, Moirang",
            state = "Manipur",
            category = "Nature & Heritage",
            caption = "Did you know India has the world's ONLY floating national park? Meet the dancing Sangai deer on floating green islands! 🦌🌿 #Loktak #Manipur",
            hashtags = listOf("#Manipur", "#LoktakLake", "#KeibulLamjao", "#NortheastIndia"),
            likesCount = 22100,
            commentsCount = 512,
            bgGradientColorHex = 0xFF047857
        ),
        ReelItem(
            id = "reel_7",
            title = "Double Decker Living Root Bridge Trek",
            creator = "CloudWanderer",
            creatorAvatar = "🌿",
            location = "Nongriat, Sohra",
            state = "Meghalaya",
            category = "Bio-Engineering",
            caption = "Grown over 200 years from living tree roots by the Khasi tribe! Stronger during monsoons, carrying travelers across roaring rapids. 🌧️🌉",
            hashtags = listOf("#Meghalaya", "#LivingRootBridge", "#Cherrapunji", "#EcoTourism"),
            likesCount = 36700,
            commentsCount = 940,
            bgGradientColorHex = 0xFF065F46
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
        ),
        SavedTrip(
            id = "trip_northeast",
            destination = "Kaziranga & Majuli Island",
            state = "Assam",
            durationDays = 3,
            highlightMonument = "Kaziranga Rhino Sanctuary & Majuli Satras",
            foodToTry = "Parampara Thali with Masor Tenga",
            culturalExperience = "Mask-making Monks & Bihu Dance",
            itinerary = listOf(
                TripDayPlan(
                    dayNumber = 1,
                    morning = "Dawn elephant safari to spot one-horned rhinos in Kaziranga.",
                    afternoon = "Jeep safari through Western bagori zone.",
                    evening = "Assamese cultural dance show and tea tasting.",
                    foodTip = "Masor Tenga at local heritage dhaba."
                ),
                TripDayPlan(
                    dayNumber = 2,
                    morning = "Ferry crossing over Brahmaputra river to Majuli Island.",
                    afternoon = "Visit Samaguri Satra and interact with traditional mask-making monks.",
                    evening = "Sunset Sattriya dance recital at monastery prayer hall.",
                    foodTip = "Fresh river fish with Joha scented rice."
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
        ),
        UserContribution(
            id = "cont_4",
            title = "Living Root Bridges: Bio-Engineering of Meghalaya",
            author = "Rilang Nongrum",
            state = "Meghalaya",
            city = "Nongriat",
            place = "Double Decker Root Bridge",
            category = "Indigenous Knowledge",
            storyText = "Our ancestors trained the roots of rubber fig trees across rivers for decades. These living structures get stronger with age rather than rusting!",
            timeAgo = "5 days ago",
            upvotes = 142,
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
