package id.ac.polbeng.robiyatuladawiyahhasibuan.viewdata2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import id.ac.polbeng.robiyatuladawiyahhasibuan.viewdata2.databinding.ActivityListviewBinding
import java.util.Arrays
class ListviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var dataArray: Array<String> =
            resources.getStringArray(R.array.jurusan)
        Arrays.sort(dataArray)
        var adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, dataArray)
        binding.listView.adapter = adapter
    }
}