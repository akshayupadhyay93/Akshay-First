package ratingcart.com.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Top 250");
        listDataHeader.add("Now Showing");
        listDataHeader.add("Coming Soon..");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Aadhaar is a 12 digit individual identification number issued by the Unique Identification Authority of India on behalf of the Government of India.This number will serve as a proof of identity and address, anywhere in India. Aadhaar letter received via India Post and e-Aadhaar downloaded from UIDAI website are equally valid.RBI notification on E-AadhaarOffice Memorandum on E-Aadhaar ValidityAny individual, irrespective of age and gender, who is a resident in India and satisfies the verification process laid down by the UIDAI can enrol for Aadhaar.Each individual needs to enroll only once which is free of cost.Each Aadhaar number will be unique to an individual and will remain valid for life. Aadhaar number will help you provide access to services like banking, mobile phone connections and other Govt and Non-Govt services in due course.Some other information about Aadhaar:Aadhaar will be:Easily verifiable in an online, cost-effective wayUnique and robust enough to eliminate the large number of duplicate and fake identities in government and private databasesA random number generated, devoid of any classification based on caste, creed, religion and geography");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}