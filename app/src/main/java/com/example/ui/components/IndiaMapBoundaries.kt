package com.example.ui.components

import androidx.compose.ui.geometry.Offset

data class StateBoundaryGeo(
    val id: String,
    val name: String,
    val hindiName: String,
    val shortName: String,
    val labelX: Float,
    val labelY: Float,
    val region: String,
    val colorHex: Long,
    val points: List<Offset>
)

object IndiaMapBoundaries {

    val allBoundaries: List<StateBoundaryGeo> = listOf(
        // NORTH INDIA
        StateBoundaryGeo(
            id = "ladakh",
            name = "Ladakh",
            hindiName = "लद्दाख",
            shortName = "LA",
            labelX = 0.44f,
            labelY = 0.09f,
            region = "North",
            colorHex = 0xFFEAB308,
            points = listOf(
                Offset(0.38f, 0.04f),
                Offset(0.45f, 0.05f),
                Offset(0.49f, 0.10f),
                Offset(0.47f, 0.14f),
                Offset(0.42f, 0.13f),
                Offset(0.39f, 0.08f)
            )
        ),
        StateBoundaryGeo(
            id = "jammu_kashmir",
            name = "Jammu & Kashmir",
            hindiName = "जम्मू-कश्मीर",
            shortName = "JK",
            labelX = 0.35f,
            labelY = 0.11f,
            region = "North",
            colorHex = 0xFF0284C7,
            points = listOf(
                Offset(0.31f, 0.09f),
                Offset(0.38f, 0.04f),
                Offset(0.39f, 0.08f),
                Offset(0.41f, 0.13f),
                Offset(0.36f, 0.16f),
                Offset(0.30f, 0.14f)
            )
        ),
        StateBoundaryGeo(
            id = "himachal_pradesh",
            name = "Himachal",
            hindiName = "हिमाचल",
            shortName = "HP",
            labelX = 0.41f,
            labelY = 0.17f,
            region = "North",
            colorHex = 0xFF0D9488,
            points = listOf(
                Offset(0.36f, 0.16f),
                Offset(0.41f, 0.13f),
                Offset(0.45f, 0.15f),
                Offset(0.47f, 0.17f),
                Offset(0.44f, 0.21f),
                Offset(0.39f, 0.20f),
                Offset(0.36f, 0.18f)
            )
        ),
        StateBoundaryGeo(
            id = "punjab",
            name = "Punjab",
            hindiName = "पंजाब",
            shortName = "PB",
            labelX = 0.30f,
            labelY = 0.21f,
            region = "North",
            colorHex = 0xFFF59E0B,
            points = listOf(
                Offset(0.26f, 0.18f),
                Offset(0.36f, 0.18f),
                Offset(0.35f, 0.24f),
                Offset(0.29f, 0.25f),
                Offset(0.25f, 0.21f)
            )
        ),
        StateBoundaryGeo(
            id = "uttarakhand",
            name = "Uttarakhand",
            hindiName = "उत्तराखंड",
            shortName = "UK",
            labelX = 0.48f,
            labelY = 0.21f,
            region = "North",
            colorHex = 0xFF059669,
            points = listOf(
                Offset(0.44f, 0.18f),
                Offset(0.50f, 0.17f),
                Offset(0.54f, 0.21f),
                Offset(0.48f, 0.25f),
                Offset(0.44f, 0.22f)
            )
        ),
        StateBoundaryGeo(
            id = "haryana",
            name = "Haryana",
            hindiName = "हरियाणा",
            shortName = "HR",
            labelX = 0.35f,
            labelY = 0.25f,
            region = "North",
            colorHex = 0xFF10B981,
            points = listOf(
                Offset(0.32f, 0.23f),
                Offset(0.38f, 0.21f),
                Offset(0.41f, 0.24f),
                Offset(0.40f, 0.28f),
                Offset(0.33f, 0.28f),
                Offset(0.31f, 0.25f)
            )
        ),
        StateBoundaryGeo(
            id = "delhi",
            name = "Delhi",
            hindiName = "दिल्ली",
            shortName = "DL",
            labelX = 0.40f,
            labelY = 0.258f,
            region = "North",
            colorHex = 0xFFDC2626,
            points = listOf(
                Offset(0.385f, 0.245f),
                Offset(0.415f, 0.245f),
                Offset(0.415f, 0.270f),
                Offset(0.385f, 0.270f)
            )
        ),
        StateBoundaryGeo(
            id = "uttar_pradesh",
            name = "Uttar Pradesh",
            hindiName = "उत्तर प्रदेश",
            shortName = "UP",
            labelX = 0.49f,
            labelY = 0.30f,
            region = "North",
            colorHex = 0xFFC2410C,
            points = listOf(
                Offset(0.41f, 0.24f),
                Offset(0.48f, 0.23f),
                Offset(0.56f, 0.26f),
                Offset(0.60f, 0.32f),
                Offset(0.56f, 0.37f),
                Offset(0.47f, 0.36f),
                Offset(0.42f, 0.33f),
                Offset(0.38f, 0.28f)
            )
        ),

        // WEST & CENTRAL INDIA
        StateBoundaryGeo(
            id = "rajasthan",
            name = "Rajasthan",
            hindiName = "राजस्थान",
            shortName = "RJ",
            labelX = 0.25f,
            labelY = 0.32f,
            region = "West",
            colorHex = 0xFFF97316,
            points = listOf(
                Offset(0.16f, 0.26f),
                Offset(0.26f, 0.22f),
                Offset(0.32f, 0.27f),
                Offset(0.36f, 0.31f),
                Offset(0.33f, 0.39f),
                Offset(0.27f, 0.41f),
                Offset(0.19f, 0.37f),
                Offset(0.14f, 0.31f)
            )
        ),
        StateBoundaryGeo(
            id = "gujarat",
            name = "Gujarat",
            hindiName = "गुजरात",
            shortName = "GJ",
            labelX = 0.18f,
            labelY = 0.45f,
            region = "West",
            colorHex = 0xFFD97706,
            points = listOf(
                Offset(0.12f, 0.38f),
                Offset(0.24f, 0.39f),
                Offset(0.26f, 0.46f),
                Offset(0.22f, 0.53f),
                Offset(0.15f, 0.51f),
                Offset(0.11f, 0.44f)
            )
        ),
        StateBoundaryGeo(
            id = "madhya_pradesh",
            name = "Madhya Pradesh",
            hindiName = "मध्य प्रदेश",
            shortName = "MP",
            labelX = 0.42f,
            labelY = 0.415f,
            region = "Central",
            colorHex = 0xFF854D0E,
            points = listOf(
                Offset(0.33f, 0.36f),
                Offset(0.46f, 0.35f),
                Offset(0.53f, 0.38f),
                Offset(0.51f, 0.48f),
                Offset(0.40f, 0.48f),
                Offset(0.33f, 0.42f)
            )
        ),
        StateBoundaryGeo(
            id = "maharashtra",
            name = "Maharashtra",
            hindiName = "महाराष्ट्र",
            shortName = "MH",
            labelX = 0.35f,
            labelY = 0.545f,
            region = "West",
            colorHex = 0xFFEA580C,
            points = listOf(
                Offset(0.23f, 0.51f),
                Offset(0.38f, 0.48f),
                Offset(0.49f, 0.49f),
                Offset(0.46f, 0.60f),
                Offset(0.32f, 0.62f),
                Offset(0.26f, 0.57f)
            )
        ),
        StateBoundaryGeo(
            id = "goa",
            name = "Goa",
            hindiName = "गोवा",
            shortName = "GA",
            labelX = 0.282f,
            labelY = 0.645f,
            region = "West",
            colorHex = 0xFF0284C7,
            points = listOf(
                Offset(0.265f, 0.625f),
                Offset(0.30f, 0.625f),
                Offset(0.295f, 0.665f),
                Offset(0.265f, 0.665f)
            )
        ),
        StateBoundaryGeo(
            id = "chhattisgarh",
            name = "Chhattisgarh",
            hindiName = "छत्तीसगढ़",
            shortName = "CG",
            labelX = 0.535f,
            labelY = 0.485f,
            region = "Central",
            colorHex = 0xFF16A34A,
            points = listOf(
                Offset(0.50f, 0.40f),
                Offset(0.57f, 0.41f),
                Offset(0.58f, 0.54f),
                Offset(0.51f, 0.57f),
                Offset(0.49f, 0.48f)
            )
        ),

        // EAST INDIA
        StateBoundaryGeo(
            id = "bihar",
            name = "Bihar",
            hindiName = "बिहार",
            shortName = "BR",
            labelX = 0.64f,
            labelY = 0.33f,
            region = "East",
            colorHex = 0xFFD97706,
            points = listOf(
                Offset(0.59f, 0.30f),
                Offset(0.69f, 0.30f),
                Offset(0.71f, 0.36f),
                Offset(0.67f, 0.38f),
                Offset(0.59f, 0.36f)
            )
        ),
        StateBoundaryGeo(
            id = "jharkhand",
            name = "Jharkhand",
            hindiName = "झारखंड",
            shortName = "JH",
            labelX = 0.62f,
            labelY = 0.405f,
            region = "East",
            colorHex = 0xFF059669,
            points = listOf(
                Offset(0.58f, 0.37f),
                Offset(0.66f, 0.37f),
                Offset(0.67f, 0.43f),
                Offset(0.61f, 0.45f),
                Offset(0.57f, 0.42f)
            )
        ),
        StateBoundaryGeo(
            id = "west_bengal",
            name = "West Bengal",
            hindiName = "पश्चिम बंगाल",
            shortName = "WB",
            labelX = 0.69f,
            labelY = 0.40f,
            region = "East",
            colorHex = 0xFF2563EB,
            points = listOf(
                Offset(0.68f, 0.29f),
                Offset(0.72f, 0.29f),
                Offset(0.71f, 0.37f),
                Offset(0.73f, 0.43f),
                Offset(0.68f, 0.47f),
                Offset(0.65f, 0.43f),
                Offset(0.67f, 0.37f)
            )
        ),
        StateBoundaryGeo(
            id = "odisha",
            name = "Odisha",
            hindiName = "ओडिशा",
            shortName = "OD",
            labelX = 0.64f,
            labelY = 0.495f,
            region = "East",
            colorHex = 0xFFDC2626,
            points = listOf(
                Offset(0.61f, 0.44f),
                Offset(0.70f, 0.44f),
                Offset(0.66f, 0.55f),
                Offset(0.59f, 0.55f),
                Offset(0.58f, 0.48f)
            )
        ),

        // NORTHEAST INDIA
        StateBoundaryGeo(
            id = "sikkim",
            name = "Sikkim",
            hindiName = "सिक्किम",
            shortName = "SK",
            labelX = 0.70f,
            labelY = 0.265f,
            region = "Northeast",
            colorHex = 0xFF0D9488,
            points = listOf(
                Offset(0.68f, 0.24f),
                Offset(0.72f, 0.24f),
                Offset(0.72f, 0.29f),
                Offset(0.68f, 0.29f)
            )
        ),
        StateBoundaryGeo(
            id = "assam",
            name = "Assam",
            hindiName = "असम",
            shortName = "AS",
            labelX = 0.80f,
            labelY = 0.34f,
            region = "Northeast",
            colorHex = 0xFF059669,
            points = listOf(
                Offset(0.75f, 0.31f),
                Offset(0.86f, 0.30f),
                Offset(0.88f, 0.34f),
                Offset(0.83f, 0.37f),
                Offset(0.74f, 0.36f)
            )
        ),
        StateBoundaryGeo(
            id = "arunachal_pradesh",
            name = "Arunachal",
            hindiName = "अरुणाचल",
            shortName = "AR",
            labelX = 0.86f,
            labelY = 0.25f,
            region = "Northeast",
            colorHex = 0xFF0284C7,
            points = listOf(
                Offset(0.76f, 0.24f),
                Offset(0.85f, 0.21f),
                Offset(0.94f, 0.23f),
                Offset(0.95f, 0.29f),
                Offset(0.88f, 0.29f),
                Offset(0.81f, 0.27f)
            )
        ),
        StateBoundaryGeo(
            id = "meghalaya",
            name = "Meghalaya",
            hindiName = "मेघालय",
            shortName = "ML",
            labelX = 0.78f,
            labelY = 0.39f,
            region = "Northeast",
            colorHex = 0xFF0D9488,
            points = listOf(
                Offset(0.74f, 0.37f),
                Offset(0.82f, 0.37f),
                Offset(0.82f, 0.41f),
                Offset(0.74f, 0.41f)
            )
        ),
        StateBoundaryGeo(
            id = "nagaland",
            name = "Nagaland",
            hindiName = "नागालैंड",
            shortName = "NL",
            labelX = 0.90f,
            labelY = 0.345f,
            region = "Northeast",
            colorHex = 0xFFDC2626,
            points = listOf(
                Offset(0.88f, 0.32f),
                Offset(0.93f, 0.32f),
                Offset(0.92f, 0.37f),
                Offset(0.87f, 0.37f)
            )
        ),
        StateBoundaryGeo(
            id = "manipur",
            name = "Manipur",
            hindiName = "मणिपुर",
            shortName = "MN",
            labelX = 0.885f,
            labelY = 0.41f,
            region = "Northeast",
            colorHex = 0xFF9333EA,
            points = listOf(
                Offset(0.86f, 0.38f),
                Offset(0.92f, 0.38f),
                Offset(0.91f, 0.44f),
                Offset(0.86f, 0.44f)
            )
        ),
        StateBoundaryGeo(
            id = "mizoram",
            name = "Mizoram",
            hindiName = "मिज़ोरम",
            shortName = "MZ",
            labelX = 0.85f,
            labelY = 0.475f,
            region = "Northeast",
            colorHex = 0xFFD97706,
            points = listOf(
                Offset(0.83f, 0.44f),
                Offset(0.88f, 0.44f),
                Offset(0.87f, 0.51f),
                Offset(0.82f, 0.51f)
            )
        ),
        StateBoundaryGeo(
            id = "tripura",
            name = "Tripura",
            hindiName = "त्रिपुरा",
            shortName = "TR",
            labelX = 0.805f,
            labelY = 0.445f,
            region = "Northeast",
            colorHex = 0xFFEA580C,
            points = listOf(
                Offset(0.78f, 0.42f),
                Offset(0.83f, 0.42f),
                Offset(0.82f, 0.47f),
                Offset(0.78f, 0.47f)
            )
        ),

        // SOUTH INDIA
        StateBoundaryGeo(
            id = "telangana",
            name = "Telangana",
            hindiName = "तेलंगाना",
            shortName = "TG",
            labelX = 0.435f,
            labelY = 0.615f,
            region = "South",
            colorHex = 0xFF0284C7,
            points = listOf(
                Offset(0.39f, 0.57f),
                Offset(0.48f, 0.57f),
                Offset(0.49f, 0.65f),
                Offset(0.40f, 0.66f),
                Offset(0.37f, 0.62f)
            )
        ),
        StateBoundaryGeo(
            id = "andhra_pradesh",
            name = "Andhra Pradesh",
            hindiName = "आंध्र प्रदेश",
            shortName = "AP",
            labelX = 0.49f,
            labelY = 0.69f,
            region = "South",
            colorHex = 0xFFD97706,
            points = listOf(
                Offset(0.46f, 0.58f),
                Offset(0.57f, 0.56f),
                Offset(0.54f, 0.72f),
                Offset(0.43f, 0.74f),
                Offset(0.44f, 0.67f),
                Offset(0.49f, 0.65f)
            )
        ),
        StateBoundaryGeo(
            id = "karnataka",
            name = "Karnataka",
            hindiName = "कर्नाटक",
            shortName = "KA",
            labelX = 0.34f,
            labelY = 0.69f,
            region = "South",
            colorHex = 0xFFC2410C,
            points = listOf(
                Offset(0.29f, 0.61f),
                Offset(0.37f, 0.60f),
                Offset(0.40f, 0.67f),
                Offset(0.39f, 0.76f),
                Offset(0.32f, 0.77f),
                Offset(0.29f, 0.68f)
            )
        ),
        StateBoundaryGeo(
            id = "kerala",
            name = "Kerala",
            hindiName = "केरल",
            shortName = "KL",
            labelX = 0.345f,
            labelY = 0.835f,
            region = "South",
            colorHex = 0xFF059669,
            points = listOf(
                Offset(0.32f, 0.77f),
                Offset(0.365f, 0.77f),
                Offset(0.375f, 0.88f),
                Offset(0.345f, 0.89f),
                Offset(0.32f, 0.83f)
            )
        ),
        StateBoundaryGeo(
            id = "tamil_nadu",
            name = "Tamil Nadu",
            hindiName = "तमिलनाडु",
            shortName = "TN",
            labelX = 0.415f,
            labelY = 0.84f,
            region = "South",
            colorHex = 0xFFDC2626,
            points = listOf(
                Offset(0.38f, 0.75f),
                Offset(0.46f, 0.74f),
                Offset(0.45f, 0.86f),
                Offset(0.38f, 0.94f),
                Offset(0.36f, 0.88f)
            )
        ),
        StateBoundaryGeo(
            id = "puducherry",
            name = "Puducherry",
            hindiName = "पुडुचेरी",
            shortName = "PY",
            labelX = 0.47f,
            labelY = 0.80f,
            region = "South",
            colorHex = 0xFF0D9488,
            points = listOf(
                Offset(0.455f, 0.785f),
                Offset(0.485f, 0.785f),
                Offset(0.485f, 0.815f),
                Offset(0.455f, 0.815f)
            )
        ),

        // ISLAND TERRITORIES
        StateBoundaryGeo(
            id = "andaman_nicobar",
            name = "A&N Islands",
            hindiName = "अंडमान-निकोबार",
            shortName = "AN",
            labelX = 0.88f,
            labelY = 0.81f,
            region = "East",
            colorHex = 0xFF0284C7,
            points = listOf(
                Offset(0.85f, 0.72f),
                Offset(0.91f, 0.72f),
                Offset(0.91f, 0.91f),
                Offset(0.85f, 0.91f)
            )
        ),
        StateBoundaryGeo(
            id = "lakshadweep",
            name = "Lakshadweep",
            hindiName = "लक्षद्वीप",
            shortName = "LD",
            labelX = 0.24f,
            labelY = 0.835f,
            region = "South",
            colorHex = 0xFF059669,
            points = listOf(
                Offset(0.21f, 0.77f),
                Offset(0.27f, 0.77f),
                Offset(0.27f, 0.90f),
                Offset(0.21f, 0.90f)
            )
        )
    )

    // Ray-casting point-in-polygon algorithm
    fun isPointInPolygon(px: Float, py: Float, points: List<Offset>, w: Float, h: Float): Boolean {
        var inside = false
        var j = points.size - 1
        for (i in points.indices) {
            val xi = points[i].x * w
            val yi = points[i].y * h
            val xj = points[j].x * w
            val yj = points[j].y * h
            val intersect = ((yi > py) != (yj > py)) && (px < (xj - xi) * (py - yi) / (yj - yi) + xi)
            if (intersect) inside = !inside
            j = i
        }
        return inside
    }
}
