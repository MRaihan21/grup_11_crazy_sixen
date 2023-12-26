package com.mympasi.ui.news

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mympasi.Adapter.NewsAdapter
import com.mympasi.Models.News
import com.mympasi.R
import com.mympasi.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null

    private val binding get() = _binding!!

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var newsList: ArrayList<News>
    private lateinit var recyclerView: RecyclerView

    lateinit var img: Array<Int>
    lateinit var title: Array<String>
    lateinit var desc: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView = view.findViewById(R.id.rv_news)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NewsAdapter(newsList){
            val intent = Intent(context, DetailNewsActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }

    private fun dataInitialize() {
        newsList = arrayListOf<News>()

        img = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,

        )
        title = arrayOf(
            "Ingin Menambah Rempah-rempah ke MPASI Bayi? Perhatikan Hal Ini, Moms!",
            "Tips Penuhi Kebutuhan Zat Besi pada MPASI Bayi",
            "Tak Harus Salmon, Ini 7 Jenis Ikan Lokal Bergizi Tinggi untuk MPASI Bayi"
        )

        desc = arrayOf(
            "Saat berusia 6 bulan ke atas, bayi perlu diberi MPASI, karena ASI saja sudah tidak cukup untuk memenuhi kebutuhan nutrisinya. Agar si kecil tidak mudah bosan dengan menu yang diberikan, biasanya ibu selalu memberikan makanan yang tidak hanya lezat dan bernutrisi tinggi, namun juga variatif. Salah satunya dengan memberikan tambahan rempah.\n" +
                    "Tapi, bolehkah rempah ditambahkan pada makanan bayi?\n" +
                    "Dikutip dari Baby Center, orang tua dapat memperkenalkan bumbu dan rempah-rempah ke MPASI ya, Moms. Anda dapat memasukkan rempah-rempah ke MPASI seperti kunyit dan jintan. Bisa juga menambah rempah yang lebih beraroma seperti bawang merah, bawang putih, dan jahe. Semua ini tidak hanya menambah rasa pada makanan, tetapi juga tekstur dan warna.\n" +
                    "Meski boleh memakai rempah-rempah, sebaiknya hindari menggunakan bumbu terlalu banyak selama tahap pengenalan rempah. Sementara untuk rasa pedas, bisa jadi Anda sudah meningkatkan toleransi rasa pedas pada si kecil. Hal itu terjadi karena Anda mengkonsumsi makanan pedas selama menyusui. Meski begitu, bisa juga menunggu hingga bayi berusia setidaknya satu tahun sebelum memberi mereka makanan pedas ya, Moms.\n" +
                    "Apabila Anda berniat memberi makanan dengan rasa rempah yang kuat, sebaiknya mencobanya dengan porsi yang sedikit. Dengan begitu, apabila si kecil mengalami alergi, Anda bisa memahami rempah mana yang membuat mereka tak nyaman.\n",
            "Memasuki usia 6 bulan, bayi membutuhkan gizi yang lebih kompleks. ASI saja tak mampu memenuhi kebutuhan nutrisi bayi, sehingga perlu makan padat atau Makanan Pendamping ASI (MPASI).\n" +
                    "Dokter Spesialis Anak dr. Caessar Pronocitro, Sp.A, M.Sc, menjelaskan, MPASI yang kurang dalam kuantitas dan kualitas dapat menyebabkan anak gagal tumbuh. Jika berlangsung dalam waktu lama akan menjadi pemicu malnutrisi seperti anemia, stunting, dan wasting. Nah, salah satu kunci untuk mencegah malnutrisi tersebut adalah dengan memenuhi kebutuhan zat besi bayi.\n" +
                    "“Pemahaman akan MPASI bergizi makro dan mikro sangatlah penting bagi orang tua, karena pemberian MPASI lengkap dan seimbang dapat berdampak signiﬁkan pada pertumbuhan ﬁsik, kecerdasan, dan produktivitas anak ke depannya,\" kata dr. Caessar dalam keterangan tertulis dari Promina. \n" +
                    "Ia menegaskan, perkembangan otak manusia 80 persen terjadi di masa 1.000 HPK, dan 20 persen sisanya terjadi hingga dewasa.\n" +
                    "Sebagai gambaran, untuk memenuhi 10,7 mg zat besi diperlukan 126 gram hati ayam (4 buah ukuran sedang), 350 gram bayam, 765 gram daging ayam, jumlah ini sangat besar jika dibandingkan dengan kapasitas lambung bayi yang terbatas.\n" +
                    "“MPASI fortiﬁkasi bisa menjadi solusi alternatif karena memiliki gizi lengkap, terukur dan tinggi zat besi, serta telah terbukti bermanfaat bagi perkembangan otak dan pertumbuhan bayi, dan dapat mencegah anemia, stunting, dan wasting. Selain itu, rasa dan tekstur MPASI fortiﬁkasi mudah diterima oleh lidah bayi,”",
            "Konsumsi protein hewani penting untuk tumbuh kembang bayi. Itu lah kenapa, protein hewani sebaiknya selalu ada di menu MPASI bayi. \n" +
                    "Salah satu protein hewani yang punya kandungan gizi tinggi adalah ikan salmon. Selain kaya protein, ikan salmon juga mengandung omega-3, DHA, AHA, yang baik untuk perkembangan otak. Oleh karena itu, salmon juga sering dijadikan bahan untuk membuat Makanan Pendamping ASI (MPASI) maupun berbagai masakan untuk anak.\n" +
                    "Sayangnya, harga ikan salmon relatif mahal. Apalagi yang diimpor dari luar negeri. Padahal banyak ikan lokal Indonesia yang tak kalah bergizi dan harganya jauh lebih murah lho, Moms. Apa saja misalnya?\n" +
                    "Beragam Jenis Ikan Lokal untuk MPASI Bayi \n" +
                    "\n" +
                    "1. Ikan Patin\n" +
                    "Menteri Kelautan dan Perikanan Susi Pudjiastuti menyarankan masyarakat Indonesia untuk lebih memilih ikan patin lokal dibandingkan ikan dori impor asal Vietnam. Sebab ikan patin aman dari bahan kimia pengawet dan harganya lebih terjangkau.\n" +
                    "Ikan patin lokal dan ikan dori memang sangat mirip dari tekstur maupun rasa. Ikan patin mengandung protein(68,6%) dan lemak (5,8%). Pada bagian perut ikan tawar ini juga kaya omega-3.\n" +
                    "\n" +
                    "2.Ikan Lele\n" +
                    "Ikan lele sangat mudah ditemukan di pasar tradisional maupun modern karena budidayanya yang mudah. Harganya pun murah, yakni hanya Rp 25 ribu per kilogram menurut data Info Pangan Jakarta pada 17 Juni 2019.\n" +
                    "Selain mengandung protein, terdapat kalsium, fosfor, seng, magnesium, lemak, dan berbagai vitamin dalam ikan lele. Ikan tawar yang lezat ini juga mengandung asam lemak omega-3. Satu ekor ikan lele mengandung 220 mg omega-3.\n" +
                    "\n" +
                    "3. Ikan Kembung\n" +
                    "Sama seperti salmon, ikan kembung juga kaya asam lemak omega-3 dan DHA, bahkan lebih tinggi. Setiap 100 gram ikan kembung mengandung 2,2 gram omega-3. Oleh karena itu ikan kembung baik diberikan untuk si kecil yang masih dalam masa pertumbuhan.\n" +
                    "Tak hanya kaya protein dan omega-3, ikan kembung juga mengandung kalsium, zat besi, fosfor, vitamin A, B1, D, E dan vitamin C.\n" +
                    "\n" +
                    "4. Ikan Teri\n" +
                    "Pasti jenis ikan satu ini sudah tak asing bagi Anda. Ya Moms, ikan teri umum diolah menjadi ikan asin yang lezat. Meski harganya sangat terjangkau, gizi ikan teri ternyata tak kalah dibandingkan salmon, Moms.\n" +
                    "Ikan teri kaya dengan omega-3, kalsium, protein, vitamin K, magnesium, serta fosfor. Semua gizi tersebut baik untuk tumbuh kembang anak. Jika disajikan untuk bayi atau balita, sebaiknya pilih ikan teri yang belum diasini untuk mencegah kandungan garam berlebih.\n" +
                    "\n" +
                    "5. Ikan Tongkol\n" +
                    "Ikan tongkol mudah ditemukan di pasar tradisional dengan harga terjangkau. Ikan laut ini memang banyak berkembang di Samudera Pasifik, termasuk di perairan Indonesia.\n" +
                    "Ikan tongkol kaya dengan protein, vitamin A, vitamin C, kalsium, zat besi. Sama dengan salmon, ikan tongkol juga mengandung omega-3 dan niacin yang baik untuk kesehatan otak anak-anak maupun dewasa.\n" +
                    "\n" +
                    "6. Ikan Mujair\n" +
                    "Ikan tawar yang lezat ini juga bisa menjadi pilih lauk yang menarik. Biasanya ikan ini diolah menjadi mujair kuah kuning, mujair asam manis, mujair bumbu bali, atau hanya digoreng saja sudah enak, Moms.\n" +
                    "Mujair kaya dengan protein yang baik untuk perkembangan otot, fosfor untuk menguatkan tulang, selenium yang bisa menangkal radikal bebas, dan asam lemak omega-3 yang bagus untuk perkembangan otak.\n" +
                    "\n" +
                    "7. Ikan Tuna Lokal\n" +
                    "zoom-in-white\n" +
                    "Perairan laut Indonesia menghasilkan berton-ton tuna setiap tahun. Ikan tuna lokal sama bergizinya dengan ikan tuna impor. Ikan tuna kaya dengan protein, kalium, vitamin B, dan selenium yang baik untuk memperbaiki sistem imun tubuh, metabolisme dan fungsi kognitif otak."
        )

        for (i in img.indices){
            val news = News(
                img[i],
                title[i],
                desc[i]
            )
            newsList.add(news)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}