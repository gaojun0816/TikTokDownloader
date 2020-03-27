package lu.uni.jungao.tiktokdownloader;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideosActivity extends AppCompatActivity {
    private RecyclerView videoRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        Intent i = getIntent();
        List<String> videos = (List<String>) i.getSerializableExtra("videos");
        List<String> thumbnails = (List<String>) i.getSerializableExtra("thumbnails");

        videoRV = findViewById(R.id.video_list);
        videoRV.setHasFixedSize(true);
        videoRV.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        videoRV.setAdapter(new VideosAdapter(thumbnails, videos, this));
    }
}
