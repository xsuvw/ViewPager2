
package com.example.viewpager2.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager2.R;

import java.util.ArrayList;


public class F1 extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View f1 = inflater.inflate(R.layout.fragment_f1, container, false);

        recyclerView = f1.findViewById(R.id.recycleThis);

        ArrayList<Images> images = new ArrayList<>();

        images.add(new Images("https://api.time.com/wp-content/uploads/2020/03/gym-coronavirus.jpg","10 Day Ab Blast, Day 1"));
        images.add(new Images("https://gogetfunding.com/wp-content/uploads/2015/12/4975401/img/gym-with-people-on-machines.jpg","10 Day Ab Blast, Day 2A"));
        images.add(new Images("https://s3-eu-west-1.amazonaws.com/wbm.thumbnail/dissolve/1200/608444.jpg","10 Day Ab Blast, Day 2B"));
        images.add(new Images("https://s3-eu-west-1.amazonaws.com/wbm.thumbnail/dissolve/1200/608448.jpg","10 Day Ab Blast, Day 3A"));
        images.add(new Images("https://s3-eu-west-1.amazonaws.com/wbm.thumbnail/dissolve/1200/608457.jpg","10 Day Ab Blast, Day 3B"));
        images.add(new Images("https://api.time.com/wp-content/uploads/2020/03/gym-coronavirus.jpg","10 Day Ab Blast, Day 4A"));
        images.add(new Images("https://img.etimg.com/thumb/msid-77342362,width-300,imgsize-419941,,resizemode-4,quality-100/gym.jpg","10 Day Ab Blast, Day 4B"));
        images.add(new Images("https://static01.nyt.com/images/2020/01/06/well/04run-gym/04run-gym-superJumbo.jpg","10 Day Ab Blast, Day 5A"));
        images.add(new Images("https://s3-eu-west-1.amazonaws.com/wbm.thumbnail/dissolve/1200/608457.jpg","10 Day Ab Blast, Day 5B"));
        images.add(new Images("https://api.time.com/wp-content/uploads/2020/03/gym-coronavirus.jpg","10 Day Ab Blast, Day 6A"));
        images.add(new Images("https://faithandleadership.com/sites/default/files/field/image/gym-workout_tp.jpg","10 Day Ab Blast, Day 6B"));
        images.add(new Images("https://s3-eu-west-1.amazonaws.com/wbm.thumbnail/dissolve/1200/608444.jpg","10 Day Ab Blast, Day 7A"));

        Adapter adapter = new Adapter(f1.getContext());
        adapter.setImages(images);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(f1.getContext(),2));

        return f1;
    }
}