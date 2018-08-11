package mosque.mosque.adapter;

/**
 * Created by martinovela on 8/11/18.
 */


import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

import mosque.mosque.R;

public class listMosqueAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    int flags[];
    double[] latitude;
    double[] longitude;
    LayoutInflater inflter;

    public listMosqueAdapter(Context applicationContext, String[] countryList, int[] flags, double[] latitude, double[] longitude) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        this.latitude = latitude;
        this.longitude = longitude;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return countryList[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_mosque, null);
        TextView mosque_name = (TextView) view.findViewById(R.id.mosque_name);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        mosque_name.setText(countryList[i]);
        icon.setImageResource(flags[i]);
        return view;

    }


}
