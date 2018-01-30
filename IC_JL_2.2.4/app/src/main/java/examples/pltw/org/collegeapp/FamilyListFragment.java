package examples.pltw.org.collegeapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wdumas on 4/8/16.
 */
public class FamilyListFragment extends ListFragment {
    private static final String TAG = FamilyListFragment.class.getName();

    private Family mFamily;

    public FamilyListFragment() {
        mFamily = Family.get();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.family_members_title);

        FamilyMemberAdapter adapter = new FamilyMemberAdapter(mFamily.getFamily());
        setListAdapter(adapter);
    }

    private class FamilyMemberAdapter extends ArrayAdapter<FamilyMember> {
        public FamilyMemberAdapter(ArrayList<FamilyMember> family) {
            super(getActivity(), 0, family);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_family_member, null);
            }

            FamilyMember f = getItem(position);

            Log.d(TAG, "The type of FamilyMember at position " + position + " is " + f.getClass().getName());
            TextView nameTextView = (TextView)convertView.findViewById(R.id.family_member_list_item_nameTextView);
            nameTextView.setText(f.toString()); //step 37

            return convertView;
        }
    }

}
