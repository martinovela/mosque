package mosque.mosque;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import mosque.mosque.adapter.listMosqueAdapter;

public class listMosqueActivity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int flags[] = {R.drawable.mosque, R.drawable.maps, R.drawable.mosque, R.drawable.maps, R.drawable.mosque, R.drawable.maps};
    double latitude[] = {-6.2453777,-6.2453777,-6.2453777,-6.2453777,-6.2453777,-6.2453777};
    double longitude[] = {106.7954253,106.7954253,106.7954253,106.7954253,106.7954253,106.7954253};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list_mosque);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        listMosqueAdapter mosqueAdapter = new listMosqueAdapter(getApplicationContext(), countryList, flags, latitude, longitude);
        simpleList.setAdapter(mosqueAdapter);
        simpleList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String cities = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(listMosqueActivity.this, cities , Toast.LENGTH_LONG).show();
                        startActivity(new Intent(listMosqueActivity.this, MapsActivity.class));
                    }
                });
    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }


}
