package com.example.data

data class IndianState(
    val id: String,
    val name: String,
    val hindiName: String,
    val capital: String,
    val region: String,
    val tagline: String,
    val description: String,
    val heroImageUrl: String,
    val mapX: Float, // Normalized X position on schematic map (0f..1f)
    val mapY: Float, // Normalized Y position on schematic map (0f..1f)
    val colorHex: Long,
    val iconicHighlight: String,
    val danceHighlight: String,
    val musicHighlight: String,
    val foodHighlight: String,
    val heritageCount: Int,
    val places: List<Place>,
    val traditions: List<Tradition>,
    val dances: List<DanceItem>,
    val music: List<MusicItem>,
    val foods: List<FoodDish>,
    val restaurants: List<RestaurantSpot>,
    val events: List<CulturalEvent>,
    val preservationStory: PreservationStory
)

data class Place(
    val id: String,
    val name: String,
    val city: String,
    val state: String,
    val imageUrl: String,
    val description: String,
    val culturalSignificance: String,
    val tags: List<String>,
    val rating: Float = 4.9f,
    val nearbyAttractions: List<String> = emptyList(),
    val localFoodRecommendation: String = ""
)

data class Tradition(
    val id: String,
    val name: String,
    val state: String,
    val category: String, // e.g. "Folk Art", "Textile Heritage", "Oral Craft"
    val imageUrl: String,
    val description: String,
    val isEndangered: Boolean = false,
    val preservationStatus: String = "Active Documentation"
)

data class DanceItem(
    val id: String,
    val name: String,
    val state: String,
    val origin: String,
    val description: String,
    val imageUrl: String,
    val costume: String,
    val accompaniment: String
)

data class MusicItem(
    val id: String,
    val title: String,
    val region: String,
    val state: String,
    val instruments: String,
    val description: String,
    val audioDuration: String,
    val genre: String,
    val name: String = ""
)

data class FoodDish(
    val id: String,
    val name: String,
    val state: String,
    val description: String,
    val isVeg: Boolean,
    val whereToTry: String,
    val imageUrl: String,
    val flavorProfile: String
)

data class RestaurantSpot(
    val id: String,
    val name: String,
    val city: String,
    val state: String,
    val cuisine: String,
    val rating: Float,
    val priceIndicator: String, // "₹", "₹₹", "₹₹₹"
    val description: String,
    val mustTryDish: String,
    val isSampleData: Boolean = true
)

data class CulturalEvent(
    val id: String,
    val name: String,
    val location: String,
    val state: String,
    val dateText: String,
    val category: String,
    val imageUrl: String,
    val description: String
)

data class PreservationStory(
    val title: String,
    val craftOrTradition: String,
    val community: String,
    val challenge: String,
    val preservationAction: String
)

data class ReelItem(
    val id: String,
    val title: String,
    val creator: String,
    val creatorAvatar: String,
    val location: String,
    val state: String,
    val category: String,
    val caption: String,
    val hashtags: List<String>,
    val likesCount: Int,
    val commentsCount: Int,
    val isLiked: Boolean = false,
    val isSaved: Boolean = false,
    val bgGradientColorHex: Long = 0xFF831843
)

data class SavedTrip(
    val id: String,
    val destination: String,
    val state: String,
    val durationDays: Int,
    val highlightMonument: String,
    val foodToTry: String,
    val culturalExperience: String,
    val itinerary: List<TripDayPlan>
)

data class TripDayPlan(
    val dayNumber: Int,
    val morning: String,
    val afternoon: String,
    val evening: String,
    val foodSpot: String = "",
    val foodTip: String = ""
)

data class UserContribution(
    val id: String,
    val title: String,
    val author: String,
    val state: String,
    val city: String,
    val place: String,
    val category: String,
    val storyText: String,
    val timeAgo: String,
    val upvotes: Int = 12,
    val isVerifiedHeritage: Boolean = true
)
