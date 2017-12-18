package jalanechrissia.rivera.com.prelimoutputspotify

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView

/**
 * Created by Jalane Chrissia on 16/12/2017.
 */
class DataAdapter(val songList: ArrayList<Song>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val song: Song = songList[position]
        holder?.textViewTitle?.text = song.title
        holder?.textViewSinger?.text = song.singer

        holder?.linearLayout?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View) {



//                val intent = Intent(v.context, FullRecipe::class.java)
//                intent.putExtra(Pass.RECIPE, recipe)
//                v.context.startActivity(intent)
            }
        })
    }

    override fun getItemCount(): Int {
        return songList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewTitle = itemView.findViewById<TextView>(R.id.txtTitle) as TextView
        val textViewSinger = itemView.findViewById<TextView>(R.id.txtSinger) as TextView
        val linearLayout = itemView.findViewById<FrameLayout>(R.id.LinearLayout) as FrameLayout
    }

}