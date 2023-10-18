//package com.mympasi
//
//object ResepData {
//
//    private val menuPokok = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val descMakananPokok = arrayOf(
//        "Tempe baik untuk dikonsumsi sejak bayi berusia 6 bulan dan seterusnya. \n" +
//                "   Pasalnya, tempe mengandung ragam nutrisi yang baik untuk tumbuh kembang bayi.\n" +
//                "   Serat dan nutrisi lain dalam makanan ini pun dapat dengan mudah dicerna oleh bayi \n" +
//                "   sehingga aman untuk dikonsumsi sejak bayi memulai masa MPASI-nya.",
//        "Alpukat Mengandung gizi, kalori, serta lemak baik yang aman bagi kesehatan bayi. \n" +
//                "   Buah alpukat kaya akan serat, vitamin A, vitamin C, serta vitamin E yang baik untuk meningkatkan imunitas tubuh. \n" +
//                "   Bila di bandingkan dengan buah lainya, alpukat merupakan buah dengan nilai gizi yang terbaik karena memiliki kandungan protein.",
//        " Wortel Sayuran berwarna oranye ini mengandung serat, vitamin C, kalsium, dan zat besi. \n" +
//                "   Wortel juga mengandung beta karoten yang bersifat antioksidan dan vitamin A yang mengandung kesehatan mata dan kulit, \n" +
//                "   serta pertumbuhan dan ketahanan terhadap infeksi."
//    )
//
//    private val bahanMakananPokok = arrayOf(
//        "   - Tempe\n" +
//                "   - Dada ayam\n" +
//                "   - Bayam\n" +
//                "   - Nasi putih\n" +
//                "   - bawang bombay\n" +
//                "   - bawang putih\n" +
//                "   - bawang merah",
//        "   - 1 Buah alpukat\n" +
//                "   - 1 Potong keju tawar\n" +
//                "   - Olive oi",
//        "   - 350 gr wortel\n" +
//                "   - Air Secukupnya"
//    )
//
//    private val caraMakananPokok = arrayOf(
//        "1. Iris tipis bawang merah, putih dan bombay lalu masak hingga harum\n" +
//                "   2. Masukan potongan kecil tempe dan potongan kecil dada ayam\n" +
//                "   3. Masukan juga potongan daun bayam, masak hingga layu\n" +
//                "   4. Masukan nasi putih secukupnya\n" +
//                "   5. Masukan air hingga semua terendam, tapi jangan terlalu banyak\n" +
//                "   6. Tunggu air hingga sedikit dan nasi sudah ada agak lembek\n" +
//                "   7. Diamkan sebentar hingga dingin\n" +
//                "   8. Blender semua bahan hingga halus\n" +
//                "   9. Saring dan sajikan",
//        "   1. Potong alpukat, buang bijinya, lalu ambil dagingnya dengan menggunakan sendok \n" +
//                "   2. Haluskan alpukat dan keju dengan menggunakan blender\n" +
//                "   3. Tambahkan air, atau ASI, sesuaikan teksturnya\n" +
//                "   4. Tambahkan olive oil secukpnya\n" +
//                "   5. Pure alpukat keju siap dihidangkan",
//        "   1. Kupas dan cuci wortel hingga bersih\n" +
//                "   2. Potong wortel kecil-kecil\n" +
//                "   3. Kukus wortel yang telah di potong dengan panci pengukus dengan air yang telah mendidih.\n" +
//                "      Kukus hingga lunak, kurang lebih selama 15-20 menit. Cara lain, \n" +
//                "      Mama bisa merebus wortel dengan memasukan wortel ke dalam air yang telah mendidih\n" +
//                "   4. Tiriskan wortel yang telah lunak dan masukan ke dalam blender atau ffod processor, \n" +
//                "      tambahkan sedikit air lalu proses hingga sangat halus. \n" +
//                "      Banyaknya air yang ditambhakan dapat disesuaikan dengan kebtuhan bayi.\n" +
//                "   5. Sajikan puree yang masih hangat dan sisanya bisa dibekukan dalam freezer."
//    )
//
//    private val imageMakananPokok = intArrayOf(
//        R.drawable.tempe,
//        R.drawable.wortel,
//        R.drawable.alpukat,
//    )
//
//    private val laukHewani = arrayOf(
//        "Udang",
//        "Daging Sapi"
//    )
//
//    private val descLaukHwani = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val bahanLaukHewani = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val caraHewanHewani = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val laukNabati = arrayOf(
//        "Pure Alpukat Dan Minyak Zaitun",
//        "Puree Pisang dan Kacang hujau",
//        "Tempe dan nasi"
//    )
//
//    private val descLaukNabati = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val bahanLaukNabati = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val caraLaukNabati = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val hidanganSayur = arrayOf(
//        "Pure Labu",
//        "Kentang Halus",
//        "Jagung Manis"
//    )
//
//    private val descHidanganSayur = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val bahanHidanganSayur = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val caraHindanganSayur = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val selingan = arrayOf(
//        "Roti gandum dan alpokat",
//        "Nugget bayam",
//        "Puding jagung"
//    )
//
//    private val descSelingan = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val bahanSelingan = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val caraSelingan = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val buah = arrayOf(
//        "Pisang",
//        "Buah Pepaya",
//        "Buah Naga"
//    )
//
//    private val descBuah = arrayOf(
//        "Manfaat Pisang untuk Bayi. Pisang merupakan buah yang aman untuk perut bayi. \n" +
//                "   Pisang dapat melancarkan pencernaan jika dikonsumsi dalam jumlah yang cukup, tidak berlebihan. \n" +
//                "   Beberapa manfaat pisang untuk bayi yang perlu Ibu tahu antara lain:",
//        " Buah Pepayan bukan hanya lezat untuk dinikmati, tetapi juga kaya akan manfaat kesehatan yang luar biasa. \n" +
//                "   Dari meningkatkan sistem kekebalan tubuh hingga menjaga kesehatan kulit, pepaya telah terbukti menjadi pilihan yang ideal untuk memperkuat kualitas hidup kita.",
//        "Wortel"
//    )
//
//    private val bahanBuah = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//    private val caraBuah = arrayOf(
//        "Tempe",
//        "Alpukat",
//        "Wortel"
//    )
//
//
//    val makananPokok: ArrayList<Resep>
//        get() {
//            val list = arrayListOf<Resep>()
//            for (position in makananPokok.indices) {
//                val resep = Resep()
//                resep.nama = makananPokok[position].toString()
//                resep.desc = descMakananPokok[position]
//                resep.bahan = bahanMakananPokok[position]
//                resep.cara = caraMakananPokok[position]
//                resep.photo = imageMakananPokok[position]
//                list.add(resep)
//            }
//            return list
//        }
//
//
//}