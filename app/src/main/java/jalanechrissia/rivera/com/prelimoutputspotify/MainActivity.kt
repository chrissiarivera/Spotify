package jalanechrissia.rivera.com.prelimoutputspotify

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    val isFragmentLoaded = true
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val songs = ArrayList<Song>()

        songs.add(Song(
                "Feels",
                "Calvin Harris ft. Pharrell Williams, Katy Perry, Big Sean"
        ))
        songs.add(Song(
                "I like me better",
                "Lauv"
        ))
        songs.add(Song(
                "ILYSB",
                "Lany"
        ))
        songs.add(Song(
                "Young dumb & broke",
                "Khalid"
        ))
        songs.add(Song(
                "Location",
                "Khalid"
        ))
        songs.add(Song(
                "Havana",
                "Camila Cabello"
        ))
        songs.add(Song(
                "Symphony",
                "Clean Bandit"
        ))
        songs.add(Song(
                "Wild Thoughts",
                "DJ Khaled ft. Rihanna, Bryson Tiller"
        ))
        songs.add(Song(
                "One Dance",
                "Drake"
        ))
        songs.add(Song(
                "New Rules",
                "Dua Lipa"
        ))
        songs.add(Song(
                "Mama",
                "Jonas Blue ft. William Singe"
        ))
        songs.add(Song(
                "Clap Snap",
                "Icona Pop"
        ))
        songs.add(Song(
                "Oye",
                "Gloria Estefan"
        ))
        songs.add(Song(
                "Heroes",
                "Alesso ft. Tove Lo"
        ))
        songs.add(Song(
                "Closer",
                "The Chainsmokers ft. Halsey"
        ))
        songs.add(Song(
                "Fight Song",
                "Rachel Platten"
        ))
        songs.add(Song(
                "Fireball",
                "Pitbull ft. John Ryan"
        ))
        songs.add(Song(
                "Give your heart a break",
                "Demi Lovato"
        ))
        songs.add(Song(
                "Grow up",
                "Cher Lloyd"
        ))
        songs.add(Song(
                "Hide Away",
                "Daya"
        ))
        songs.add(Song(
                "King of Anything",
                "Sara Bareilles"
        ))
        songs.add(Song(
                "Secret Love Song",
                "Little Mix"
        ))
        songs.add(Song(
                "Love Myself",
                "Hailee Steinfeld"
        ))

        val adapter = DataAdapter(songs)
        recyclerView!!.adapter = adapter
        recyclerView!!.addItemDecoration(DividerItemDecoration(recyclerView.getContext(), LinearLayoutManager.VERTICAL))

    }
}
